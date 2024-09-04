package com.Apartments.apartments.services;

import com.Apartments.apartments.entity.Apartment;
import com.Apartments.apartments.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class ApartmentService implements  ApartmentRepository
{

    private ApartmentRepository repo;
    @Autowired
    public ApartmentService( ApartmentRepository repo)
    {
        this.repo=repo;
    }

    public <S extends Apartment> S save(S entity) {

        return repo.save(entity);
    }


    @Override
    public <S extends Apartment> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Apartment> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    public List<Apartment> findAll() {

        return repo.findAll();
    }

    @Override
    public List<Apartment> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Apartment entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Apartment> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Apartment> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Apartment> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Apartment> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Apartment getOne(Integer integer) {
        return null;
    }

    @Override
    public Apartment getById(Integer integer) {
        return null;
    }

    @Override
    public Apartment getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Apartment> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Apartment> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Apartment> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Apartment> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Apartment> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Apartment> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Apartment, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<Apartment> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Apartment> findAll(Pageable pageable) {
        return null;
    }
}
