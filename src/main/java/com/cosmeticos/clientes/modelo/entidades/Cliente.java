package com.cosmeticos.clientes.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    Long id_cliente;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "correo")
    String correo;
    @Column(name = "telefono")
    String telefono;
}
