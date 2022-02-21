// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListCertificatesRequest</p>
 */
public class ListCertificatesRequest extends Request {
    @Query
    @NameInMap("Issuer")
    private String issuer;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 200)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Subject")
    private String subject;

    private ListCertificatesRequest(Builder builder) {
        super(builder);
        this.issuer = builder.issuer;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.subject = builder.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    public static final class Builder extends Request.Builder<ListCertificatesRequest, Builder> {
        private String issuer; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String subject; 

        private Builder() {
            super();
        } 

        private Builder(ListCertificatesRequest response) {
            super(response);
            this.issuer = response.issuer;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.status = response.status;
            this.subject = response.subject;
        } 

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.putQueryParameter("Issuer", issuer);
            this.issuer = issuer;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        @Override
        public ListCertificatesRequest build() {
            return new ListCertificatesRequest(this);
        } 

    } 

}
