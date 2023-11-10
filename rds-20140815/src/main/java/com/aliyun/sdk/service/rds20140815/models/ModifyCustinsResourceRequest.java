// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustinsResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustinsResourceRequest</p>
 */
public class ModifyCustinsResourceRequest extends Request {
    @Query
    @NameInMap("AdjustDeadline")
    private String adjustDeadline;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("IncreaseRatio")
    private String increaseRatio;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("RestoreOriginalSpecification")
    private String restoreOriginalSpecification;

    @Query
    @NameInMap("TargetValue")
    @Validation(maximum = 999999)
    private Integer targetValue;

    private ModifyCustinsResourceRequest(Builder builder) {
        super(builder);
        this.adjustDeadline = builder.adjustDeadline;
        this.DBInstanceId = builder.DBInstanceId;
        this.increaseRatio = builder.increaseRatio;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.restoreOriginalSpecification = builder.restoreOriginalSpecification;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustinsResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustDeadline
     */
    public String getAdjustDeadline() {
        return this.adjustDeadline;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return increaseRatio
     */
    public String getIncreaseRatio() {
        return this.increaseRatio;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return restoreOriginalSpecification
     */
    public String getRestoreOriginalSpecification() {
        return this.restoreOriginalSpecification;
    }

    /**
     * @return targetValue
     */
    public Integer getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder extends Request.Builder<ModifyCustinsResourceRequest, Builder> {
        private String adjustDeadline; 
        private String DBInstanceId; 
        private String increaseRatio; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String restoreOriginalSpecification; 
        private Integer targetValue; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustinsResourceRequest request) {
            super(request);
            this.adjustDeadline = request.adjustDeadline;
            this.DBInstanceId = request.DBInstanceId;
            this.increaseRatio = request.increaseRatio;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.restoreOriginalSpecification = request.restoreOriginalSpecification;
            this.targetValue = request.targetValue;
        } 

        /**
         * The deadline for the modification.
         */
        public Builder adjustDeadline(String adjustDeadline) {
            this.putQueryParameter("AdjustDeadline", adjustDeadline);
            this.adjustDeadline = adjustDeadline;
            return this;
        }

        /**
         * The instance ID. You can call the [DescribeDBInstances](~~26232~~) operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The increase rate.
         */
        public Builder increaseRatio(String increaseRatio) {
            this.putQueryParameter("IncreaseRatio", increaseRatio);
            this.increaseRatio = increaseRatio;
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
         * The resource type.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The original value. This parameter must be specified when **ResourceType** is set to **instance**.
         */
        public Builder restoreOriginalSpecification(String restoreOriginalSpecification) {
            this.putQueryParameter("RestoreOriginalSpecification", restoreOriginalSpecification);
            this.restoreOriginalSpecification = restoreOriginalSpecification;
            return this;
        }

        /**
         * The target value. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can contain up to three decimal places.
         */
        public Builder targetValue(Integer targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public ModifyCustinsResourceRequest build() {
            return new ModifyCustinsResourceRequest(this);
        } 

    } 

}
