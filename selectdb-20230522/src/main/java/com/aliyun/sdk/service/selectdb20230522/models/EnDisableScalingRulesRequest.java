// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link EnDisableScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>EnDisableScalingRulesRequest</p>
 */
public class EnDisableScalingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRulesEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean scalingRulesEnable;

    private EnDisableScalingRulesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dbInstanceId = builder.dbInstanceId;
        this.product = builder.product;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingRulesEnable = builder.scalingRulesEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnDisableScalingRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingRulesEnable
     */
    public Boolean getScalingRulesEnable() {
        return this.scalingRulesEnable;
    }

    public static final class Builder extends Request.Builder<EnDisableScalingRulesRequest, Builder> {
        private String clusterId; 
        private String dbInstanceId; 
        private String product; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Boolean scalingRulesEnable; 

        private Builder() {
            super();
        } 

        private Builder(EnDisableScalingRulesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dbInstanceId = request.dbInstanceId;
            this.product = request.product;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingRulesEnable = request.scalingRulesEnable;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-nwy3jv1oa02-be</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the scheduled scaling policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scalingRulesEnable(Boolean scalingRulesEnable) {
            this.putQueryParameter("ScalingRulesEnable", scalingRulesEnable);
            this.scalingRulesEnable = scalingRulesEnable;
            return this;
        }

        @Override
        public EnDisableScalingRulesRequest build() {
            return new EnDisableScalingRulesRequest(this);
        } 

    } 

}
