// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAutoCcListCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoCcListCountRequest</p>
 */
public class DescribeAutoCcListCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    private DescribeAutoCcListCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.queryType = builder.queryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoCcListCountRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    public static final class Builder extends Request.Builder<DescribeAutoCcListCountRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String queryType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoCcListCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.queryType = request.queryType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeInstanceIds</strong> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mode of how an IP address is added to the whitelist or blacklist. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: manually added</li>
         * <li><strong>auto</strong>: automatically added</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        @Override
        public DescribeAutoCcListCountRequest build() {
            return new DescribeAutoCcListCountRequest(this);
        } 

    } 

}
