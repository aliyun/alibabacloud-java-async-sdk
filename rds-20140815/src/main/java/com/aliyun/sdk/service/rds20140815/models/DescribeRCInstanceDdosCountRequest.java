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
 * {@link DescribeRCInstanceDdosCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCInstanceDdosCountRequest</p>
 */
public class DescribeRCInstanceDdosCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeRCInstanceDdosCountRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceDdosCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
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

    public static final class Builder extends Request.Builder<DescribeRCInstanceDdosCountRequest, Builder> {
        private String ddosRegionId; 
        private String instanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCInstanceDdosCountRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * <p>The type of the asset that is assigned a public IP address. Fixed value: <strong>ecs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The ID of the region in which the RDS Custom instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRCInstanceDdosCountRequest build() {
            return new DescribeRCInstanceDdosCountRequest(this);
        } 

    } 

}
