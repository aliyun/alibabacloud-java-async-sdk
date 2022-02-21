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
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAutoCcListCountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAutoCcListCountRequest, Builder> {
        private String instanceId; 
        private String queryType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoCcListCountRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.queryType = response.queryType;
            this.regionId = response.regionId;
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
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAutoCcListCountRequest build() {
            return new DescribeAutoCcListCountRequest(this);
        } 

    } 

}
