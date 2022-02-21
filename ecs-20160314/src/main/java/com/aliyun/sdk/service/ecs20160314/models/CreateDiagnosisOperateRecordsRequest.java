// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosisOperateRecordsRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosisOperateRecordsRequest</p>
 */
public class CreateDiagnosisOperateRecordsRequest extends Request {
    @Query
    @NameInMap("ErrorCode")
    @Validation(required = true)
    private String errorCode;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("NewInstanceType")
    private String newInstanceType;

    @Query
    @NameInMap("NewZoneId")
    private String newZoneId;

    @Query
    @NameInMap("OperateRecordType")
    @Validation(required = true)
    private String operateRecordType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

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

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDiagnosisOperateRecordsRequest(Builder builder) {
        super(builder);
        this.errorCode = builder.errorCode;
        this.instanceType = builder.instanceType;
        this.newInstanceType = builder.newInstanceType;
        this.newZoneId = builder.newZoneId;
        this.operateRecordType = builder.operateRecordType;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceRegionId = builder.sourceRegionId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosisOperateRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return newInstanceType
     */
    public String getNewInstanceType() {
        return this.newInstanceType;
    }

    /**
     * @return newZoneId
     */
    public String getNewZoneId() {
        return this.newZoneId;
    }

    /**
     * @return operateRecordType
     */
    public String getOperateRecordType() {
        return this.operateRecordType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosisOperateRecordsRequest, Builder> {
        private String errorCode; 
        private String instanceType; 
        private String newInstanceType; 
        private String newZoneId; 
        private String operateRecordType; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceRegionId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosisOperateRecordsRequest response) {
            super(response);
            this.errorCode = response.errorCode;
            this.instanceType = response.instanceType;
            this.newInstanceType = response.newInstanceType;
            this.newZoneId = response.newZoneId;
            this.operateRecordType = response.operateRecordType;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceRegionId = response.sourceRegionId;
            this.zoneId = response.zoneId;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NewInstanceType.
         */
        public Builder newInstanceType(String newInstanceType) {
            this.putQueryParameter("NewInstanceType", newInstanceType);
            this.newInstanceType = newInstanceType;
            return this;
        }

        /**
         * NewZoneId.
         */
        public Builder newZoneId(String newZoneId) {
            this.putQueryParameter("NewZoneId", newZoneId);
            this.newZoneId = newZoneId;
            return this;
        }

        /**
         * OperateRecordType.
         */
        public Builder operateRecordType(String operateRecordType) {
            this.putQueryParameter("OperateRecordType", operateRecordType);
            this.operateRecordType = operateRecordType;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDiagnosisOperateRecordsRequest build() {
            return new CreateDiagnosisOperateRecordsRequest(this);
        } 

    } 

}
