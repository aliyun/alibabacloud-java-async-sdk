// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyVsDomainOwnerRequest} extends {@link RequestModel}
 *
 * <p>VerifyVsDomainOwnerRequest</p>
 */
public class VerifyVsDomainOwnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyType;

    private VerifyVsDomainOwnerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyVsDomainOwnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<VerifyVsDomainOwnerRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(VerifyVsDomainOwnerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.verifyType = request.verifyType;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * VerifyType.
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public VerifyVsDomainOwnerRequest build() {
            return new VerifyVsDomainOwnerRequest(this);
        } 

    } 

}
