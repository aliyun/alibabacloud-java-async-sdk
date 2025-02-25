// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyElasticityAssuranceAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticityAssuranceAutoRenewAttributeRequest</p>
 */
public class ModifyElasticityAssuranceAutoRenewAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    private String renewalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyElasticityAssuranceAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticityAssuranceAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
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

    public static final class Builder extends Request.Builder<ModifyElasticityAssuranceAutoRenewAttributeRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String renewalStatus; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticityAssuranceAutoRenewAttributeRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RenewalStatus.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
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
        public ModifyElasticityAssuranceAutoRenewAttributeRequest build() {
            return new ModifyElasticityAssuranceAutoRenewAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyElasticityAssuranceAutoRenewAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyElasticityAssuranceAutoRenewAttributeRequest</p>
     */
    public static class PrivatePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private java.util.List<String> id;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public java.util.List<String> getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> id; 

            /**
             * Id.
             */
            public Builder id(java.util.List<String> id) {
                this.id = id;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
}
