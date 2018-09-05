package com.company.canoolibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "CANOOLIBRARY_BOOK")
@Entity(name = "canoolibrary$Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = 4237457393481499645L;

    @Column(name = "TITLE", length = 500)
    protected String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "ISSUE_DATE")
    protected Date issueDate;

    @Lob
    @Column(name = "EXCERPT")
    protected String excerpt;

    @Column(name = "ISBN")
    protected String isbn;



    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }


}