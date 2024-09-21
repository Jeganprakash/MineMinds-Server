package com.mineminds.server.entity

//import com.fasterxml.jackson.annotation.JsonBackReference
//import com.fasterxml.jackson.annotation.JsonManagedReference
//import jakarta.persistence.CascadeType
//import jakarta.persistence.Entity
//import jakarta.persistence.FetchType
//import jakarta.persistence.GeneratedValue
//import jakarta.persistence.GenerationType
//import jakarta.persistence.Id
//import jakarta.persistence.JoinColumn
//import jakarta.persistence.ManyToOne
//import jakarta.persistence.OneToMany
//import org.aspectj.weaver.patterns.TypePatternQuestions.Question

//@Entity
//data class Level(
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long = 0,
//
//    val name: String,
//
//    val description: String,
//
//    val points: Int,
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "courseId")
//    @JsonBackReference
//    val course: Course? = null,
//
//    @OneToMany(mappedBy = "level", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
//    @JsonManagedReference
//    val questions: List<Question> = mutableListOf()
//)
