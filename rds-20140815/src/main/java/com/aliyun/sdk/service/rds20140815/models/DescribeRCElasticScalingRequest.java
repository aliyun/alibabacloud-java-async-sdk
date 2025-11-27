// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCElasticScalingRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCElasticScalingRequest</p>
 */
public class DescribeRCElasticScalingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportCase")
    private String supportCase;

    private DescribeRCElasticScalingRequest(Builder builder) {
        super(builder);
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.supportCase = builder.supportCase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCElasticScalingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return supportCase
     */
    public String getSupportCase() {
        return this.supportCase;
    }

    public static final class Builder extends Request.Builder<DescribeRCElasticScalingRequest, Builder> {
        private String instanceChargeType; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 
        private String supportCase; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCElasticScalingRequest request) {
            super(request);
            this.instanceChargeType = request.instanceChargeType;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
            this.supportCase = request.supportCase;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SupportCase.
         */
        public Builder supportCase(String supportCase) {
            this.putQueryParameter("SupportCase", supportCase);
            this.supportCase = supportCase;
            return this;
        }

        @Override
        public DescribeRCElasticScalingRequest build() {
            return new DescribeRCElasticScalingRequest(this);
        } 

    } 

}
