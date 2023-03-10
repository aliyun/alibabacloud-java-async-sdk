// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcListCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoCcListCountRequest</p>
 */
public class DescribeAutoCcListCountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("QueryType")
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
         * The ID of the instance.
         * <p>
         * 
         * > You can call the **DescribeInstanceIds** operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The mode of how an IP address is added to the whitelist or blacklist. Valid values:
         * <p>
         * 
         * *   **manual**: manually added
         * *   **auto**: automatically added
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
