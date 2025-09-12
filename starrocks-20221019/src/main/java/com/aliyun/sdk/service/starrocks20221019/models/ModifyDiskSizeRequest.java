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
 * {@link ModifyDiskSizeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskSizeRequest</p>
 */
public class ModifyDiskSizeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FastMode")
    private Boolean fastMode;

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
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65000)
    private Integer target;

    private ModifyDiskSizeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fastMode = builder.fastMode;
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskSizeRequest create() {
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
     * @return fastMode
     */
    public Boolean getFastMode() {
        return this.fastMode;
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
     * @return target
     */
    public Integer getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ModifyDiskSizeRequest, Builder> {
        private String regionId; 
        private Boolean fastMode; 
        private String instanceId; 
        private String nodeGroupId; 
        private String promotionOptionNo; 
        private Integer target; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskSizeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fastMode = request.fastMode;
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
            this.promotionOptionNo = request.promotionOptionNo;
            this.target = request.target;
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
         * FastMode.
         */
        public Builder fastMode(Boolean fastMode) {
            this.putQueryParameter("FastMode", fastMode);
            this.fastMode = fastMode;
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
         * <p>The warehouse ID.</p>
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
         * PromotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * <p>The disk size to which you want to change to. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder target(Integer target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ModifyDiskSizeRequest build() {
            return new ModifyDiskSizeRequest(this);
        } 

    } 

}
