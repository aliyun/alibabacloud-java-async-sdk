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
 * {@link DescribeRCInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCInstanceTypesRequest</p>
 */
public class DescribeRCInstanceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private java.util.List<String> instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeRCInstanceTypesRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.engine = builder.engine;
        this.instanceType = builder.instanceType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceType
     */
    public java.util.List<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRCInstanceTypesRequest, Builder> {
        private String commodityCode; 
        private String engine; 
        private java.util.List<String> instanceType; 
        private String instanceTypeFamily; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCInstanceTypesRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.engine = request.engine;
            this.instanceType = request.instanceType;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The commodity code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_customprepaid_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The database engine. Set the value to MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The instance types.</p>
         */
        public Builder instanceType(java.util.List<String> instanceType) {
            String instanceTypeShrink = shrink(instanceType, "InstanceType", "simple");
            this.putQueryParameter("InstanceType", instanceTypeShrink);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The instance family. You can call the <strong>DescribeRCInstanceTypeFamilies</strong> operation to query the instance families of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>gn8.cm</p>
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRCInstanceTypesRequest build() {
            return new DescribeRCInstanceTypesRequest(this);
        } 

    } 

}
