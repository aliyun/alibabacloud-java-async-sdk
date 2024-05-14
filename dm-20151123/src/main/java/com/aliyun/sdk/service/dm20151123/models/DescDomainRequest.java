// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescDomainRequest} extends {@link RequestModel}
 *
 * <p>DescDomainRequest</p>
 */
public class DescDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireRealTimeDnsRecords")
    private Boolean requireRealTimeDnsRecords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.ownerId = builder.ownerId;
        this.requireRealTimeDnsRecords = builder.requireRealTimeDnsRecords;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public Integer getDomainId() {
        return this.domainId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requireRealTimeDnsRecords
     */
    public Boolean getRequireRealTimeDnsRecords() {
        return this.requireRealTimeDnsRecords;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescDomainRequest, Builder> {
        private Integer domainId; 
        private Long ownerId; 
        private Boolean requireRealTimeDnsRecords; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.ownerId = request.ownerId;
            this.requireRealTimeDnsRecords = request.requireRealTimeDnsRecords;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * DomainId.
         */
        public Builder domainId(Integer domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
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
         * RequireRealTimeDnsRecords.
         */
        public Builder requireRealTimeDnsRecords(Boolean requireRealTimeDnsRecords) {
            this.putQueryParameter("RequireRealTimeDnsRecords", requireRealTimeDnsRecords);
            this.requireRealTimeDnsRecords = requireRealTimeDnsRecords;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescDomainRequest build() {
            return new DescDomainRequest(this);
        } 

    } 

}
