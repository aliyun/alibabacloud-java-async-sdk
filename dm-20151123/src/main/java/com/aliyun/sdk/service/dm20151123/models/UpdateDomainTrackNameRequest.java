// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainTrackNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainTrackNameRequest</p>
 */
public class UpdateDomainTrackNameRequest extends Request {
    @Query
    @NameInMap("CnameTrackRecord")
    @Validation(required = true)
    private String cnameTrackRecord;

    @Query
    @NameInMap("DomainId")
    @Validation(required = true)
    private Integer domainId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateDomainTrackNameRequest(Builder builder) {
        super(builder);
        this.cnameTrackRecord = builder.cnameTrackRecord;
        this.domainId = builder.domainId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainTrackNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnameTrackRecord
     */
    public String getCnameTrackRecord() {
        return this.cnameTrackRecord;
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

    public static final class Builder extends Request.Builder<UpdateDomainTrackNameRequest, Builder> {
        private String cnameTrackRecord; 
        private Integer domainId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainTrackNameRequest response) {
            super(response);
            this.cnameTrackRecord = response.cnameTrackRecord;
            this.domainId = response.domainId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CnameTrackRecord.
         */
        public Builder cnameTrackRecord(String cnameTrackRecord) {
            this.putQueryParameter("CnameTrackRecord", cnameTrackRecord);
            this.cnameTrackRecord = cnameTrackRecord;
            return this;
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
        public UpdateDomainTrackNameRequest build() {
            return new UpdateDomainTrackNameRequest(this);
        } 

    } 

}
