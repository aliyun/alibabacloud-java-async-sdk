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
    @com.aliyun.core.annotation.NameInMap("CaIdentifier")
    private String caIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertTotalCount")
    private Integer certTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private AssignCertificateCountRequest(Builder builder) {
        super(builder);
        this.caIdentifier = builder.caIdentifier;
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
     * @return caIdentifier
     */
    public String getCaIdentifier() {
        return this.caIdentifier;
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
        private String caIdentifier; 
        private Integer certTotalCount; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(AssignCertificateCountRequest request) {
            super(request);
            this.caIdentifier = request.caIdentifier;
            this.certTotalCount = request.certTotalCount;
            this.id = request.id;
        } 

        /**
         * <p>The identifier of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1f0167b4-ee84-XXX-49bc4d39fa68</p>
         */
        public Builder caIdentifier(String caIdentifier) {
            this.putQueryParameter("CaIdentifier", caIdentifier);
            this.caIdentifier = caIdentifier;
            return this;
        }

        /**
         * <p>The total number of certificate records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder certTotalCount(Integer certTotalCount) {
            this.putQueryParameter("CertTotalCount", certTotalCount);
            this.certTotalCount = certTotalCount;
            return this;
        }

        /**
         * <p>The ID of the data source to which the certificate belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>33285</p>
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
