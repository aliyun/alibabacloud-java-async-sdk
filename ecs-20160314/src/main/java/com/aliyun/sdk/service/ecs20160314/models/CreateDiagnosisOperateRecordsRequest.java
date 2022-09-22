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
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDiagnosisOperateRecordsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosisOperateRecordsRequest, Builder> {
        private String sourceRegionId; 
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
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosisOperateRecordsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.errorCode = request.errorCode;
            this.instanceType = request.instanceType;
            this.newInstanceType = request.newInstanceType;
            this.newZoneId = request.newZoneId;
            this.operateRecordType = request.operateRecordType;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
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
