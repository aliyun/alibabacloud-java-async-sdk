// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceRequest</p>
 */
public class UpgradeDBInstanceRequest extends Request {
    @Query
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceGroupCount")
    @Validation(required = true)
    private String DBInstanceGroupCount;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpgradeDBInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceGroupCount
     */
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public static final class Builder extends Request.Builder<UpgradeDBInstanceRequest, Builder> {
        private String DBInstanceClass; 
        private String DBInstanceGroupCount; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceRequest response) {
            super(response);
            this.DBInstanceClass = response.DBInstanceClass;
            this.DBInstanceGroupCount = response.DBInstanceGroupCount;
            this.DBInstanceId = response.DBInstanceId;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.regionId = response.regionId;
        } 

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * DBInstanceGroupCount.
         */
        public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
            this.putQueryParameter("DBInstanceGroupCount", DBInstanceGroupCount);
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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

        @Override
        public UpgradeDBInstanceRequest build() {
            return new UpgradeDBInstanceRequest(this);
        } 

    } 

}
