// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssignCertificateCountRequest} extends {@link RequestModel}
 *
 * <p>AssignCertificateCountRequest</p>
 */
public class AssignCertificateCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertTotalCount")
    private Integer certTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private AssignCertificateCountRequest(Builder builder) {
        super(builder);
        this.certTotalCount = builder.certTotalCount;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignCertificateCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certTotalCount
     */
    public Integer getCertTotalCount() {
        return this.certTotalCount;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<AssignCertificateCountRequest, Builder> {
        private Integer certTotalCount; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(AssignCertificateCountRequest request) {
            super(request);
            this.certTotalCount = request.certTotalCount;
            this.id = request.id;
        } 

        /**
         * CertTotalCount.
         */
        public Builder certTotalCount(Integer certTotalCount) {
            this.putQueryParameter("CertTotalCount", certTotalCount);
            this.certTotalCount = certTotalCount;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public AssignCertificateCountRequest build() {
            return new AssignCertificateCountRequest(this);
        } 

    } 

}
