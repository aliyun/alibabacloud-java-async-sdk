// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyDiskTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskTypeRequest</p>
 */
public class ModifyDiskTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPerformanceLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPerformanceLevel;

    private ModifyDiskTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoPay = builder.autoPay;
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.targetDiskType = builder.targetDiskType;
        this.targetPerformanceLevel = builder.targetPerformanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    /**
     * @return targetDiskType
     */
    public String getTargetDiskType() {
        return this.targetDiskType;
    }

    /**
     * @return targetPerformanceLevel
     */
    public String getTargetPerformanceLevel() {
        return this.targetPerformanceLevel;
    }

    public static final class Builder extends Request.Builder<ModifyDiskTypeRequest, Builder> {
        private String regionId; 
        private Boolean autoPay; 
        private String instanceId; 
        private String nodeGroupId; 
        private String promotionOptionNo; 
        private String targetDiskType; 
        private String targetPerformanceLevel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoPay = request.autoPay;
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
            this.promotionOptionNo = request.promotionOptionNo;
            this.targetDiskType = request.targetDiskType;
            this.targetPerformanceLevel = request.targetPerformanceLevel;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically purchase (pay for) all products specified in the Products parameter. Valid values:</p>
         * <ul>
         * <li>true: Automatic payment is enabled.</li>
         * <li>false: Automatic payment is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The compute group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3d5ce6454354****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * <p>The target disk type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>essd</p>
         */
        public Builder targetDiskType(String targetDiskType) {
            this.putQueryParameter("TargetDiskType", targetDiskType);
            this.targetDiskType = targetDiskType;
            return this;
        }

        /**
         * <p>The target disk performance level.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pl2</p>
         */
        public Builder targetPerformanceLevel(String targetPerformanceLevel) {
            this.putQueryParameter("TargetPerformanceLevel", targetPerformanceLevel);
            this.targetPerformanceLevel = targetPerformanceLevel;
            return this;
        }

        @Override
        public ModifyDiskTypeRequest build() {
            return new ModifyDiskTypeRequest(this);
        } 

    } 

}
