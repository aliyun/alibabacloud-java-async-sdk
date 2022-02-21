// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnoseRequest</p>
 */
public class CreateDiagnoseRequest extends Request {
    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("DiagnoseAction")
    private String diagnoseAction;

    @Query
    @NameInMap("DiagnoseErrorCode")
    private String diagnoseErrorCode;

    @Query
    @NameInMap("DiagnoseProduct")
    private String diagnoseProduct;

    @Query
    @NameInMap("DiagnoseRequestId")
    private String diagnoseRequestId;

    @Query
    @NameInMap("DiagnoseRequestParams")
    private String diagnoseRequestParams;

    @Query
    @NameInMap("DiagnoseResponse")
    private String diagnoseResponse;

    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("ExpireTime")
    private String expireTime;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceTypeName")
    private String instanceTypeName;

    @Query
    @NameInMap("IzNo")
    private String izNo;

    @Query
    @NameInMap("Mark")
    private String mark;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Type")
    private Integer type;

    private CreateDiagnoseRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.diagnoseAction = builder.diagnoseAction;
        this.diagnoseErrorCode = builder.diagnoseErrorCode;
        this.diagnoseProduct = builder.diagnoseProduct;
        this.diagnoseRequestId = builder.diagnoseRequestId;
        this.diagnoseRequestParams = builder.diagnoseRequestParams;
        this.diagnoseResponse = builder.diagnoseResponse;
        this.diskCategory = builder.diskCategory;
        this.expireTime = builder.expireTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceTypeName = builder.instanceTypeName;
        this.izNo = builder.izNo;
        this.mark = builder.mark;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnoseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return diagnoseAction
     */
    public String getDiagnoseAction() {
        return this.diagnoseAction;
    }

    /**
     * @return diagnoseErrorCode
     */
    public String getDiagnoseErrorCode() {
        return this.diagnoseErrorCode;
    }

    /**
     * @return diagnoseProduct
     */
    public String getDiagnoseProduct() {
        return this.diagnoseProduct;
    }

    /**
     * @return diagnoseRequestId
     */
    public String getDiagnoseRequestId() {
        return this.diagnoseRequestId;
    }

    /**
     * @return diagnoseRequestParams
     */
    public String getDiagnoseRequestParams() {
        return this.diagnoseRequestParams;
    }

    /**
     * @return diagnoseResponse
     */
    public String getDiagnoseResponse() {
        return this.diagnoseResponse;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceTypeName
     */
    public String getInstanceTypeName() {
        return this.instanceTypeName;
    }

    /**
     * @return izNo
     */
    public String getIzNo() {
        return this.izNo;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDiagnoseRequest, Builder> {
        private Integer amount; 
        private String diagnoseAction; 
        private String diagnoseErrorCode; 
        private String diagnoseProduct; 
        private String diagnoseRequestId; 
        private String diagnoseRequestParams; 
        private String diagnoseResponse; 
        private String diskCategory; 
        private String expireTime; 
        private String instanceChargeType; 
        private String instanceTypeName; 
        private String izNo; 
        private String mark; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnoseRequest response) {
            super(response);
            this.amount = response.amount;
            this.diagnoseAction = response.diagnoseAction;
            this.diagnoseErrorCode = response.diagnoseErrorCode;
            this.diagnoseProduct = response.diagnoseProduct;
            this.diagnoseRequestId = response.diagnoseRequestId;
            this.diagnoseRequestParams = response.diagnoseRequestParams;
            this.diagnoseResponse = response.diagnoseResponse;
            this.diskCategory = response.diskCategory;
            this.expireTime = response.expireTime;
            this.instanceChargeType = response.instanceChargeType;
            this.instanceTypeName = response.instanceTypeName;
            this.izNo = response.izNo;
            this.mark = response.mark;
            this.networkType = response.networkType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.type = response.type;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * DiagnoseAction.
         */
        public Builder diagnoseAction(String diagnoseAction) {
            this.putQueryParameter("DiagnoseAction", diagnoseAction);
            this.diagnoseAction = diagnoseAction;
            return this;
        }

        /**
         * DiagnoseErrorCode.
         */
        public Builder diagnoseErrorCode(String diagnoseErrorCode) {
            this.putQueryParameter("DiagnoseErrorCode", diagnoseErrorCode);
            this.diagnoseErrorCode = diagnoseErrorCode;
            return this;
        }

        /**
         * DiagnoseProduct.
         */
        public Builder diagnoseProduct(String diagnoseProduct) {
            this.putQueryParameter("DiagnoseProduct", diagnoseProduct);
            this.diagnoseProduct = diagnoseProduct;
            return this;
        }

        /**
         * DiagnoseRequestId.
         */
        public Builder diagnoseRequestId(String diagnoseRequestId) {
            this.putQueryParameter("DiagnoseRequestId", diagnoseRequestId);
            this.diagnoseRequestId = diagnoseRequestId;
            return this;
        }

        /**
         * DiagnoseRequestParams.
         */
        public Builder diagnoseRequestParams(String diagnoseRequestParams) {
            this.putQueryParameter("DiagnoseRequestParams", diagnoseRequestParams);
            this.diagnoseRequestParams = diagnoseRequestParams;
            return this;
        }

        /**
         * DiagnoseResponse.
         */
        public Builder diagnoseResponse(String diagnoseResponse) {
            this.putQueryParameter("DiagnoseResponse", diagnoseResponse);
            this.diagnoseResponse = diagnoseResponse;
            return this;
        }

        /**
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceTypeName.
         */
        public Builder instanceTypeName(String instanceTypeName) {
            this.putQueryParameter("InstanceTypeName", instanceTypeName);
            this.instanceTypeName = instanceTypeName;
            return this;
        }

        /**
         * IzNo.
         */
        public Builder izNo(String izNo) {
            this.putQueryParameter("IzNo", izNo);
            this.izNo = izNo;
            return this;
        }

        /**
         * Mark.
         */
        public Builder mark(String mark) {
            this.putQueryParameter("Mark", mark);
            this.mark = mark;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDiagnoseRequest build() {
            return new CreateDiagnoseRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
