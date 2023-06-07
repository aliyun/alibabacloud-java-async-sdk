// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorAgentStatusesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudMonitorAgentStatusesRequest</p>
 */
public class DescribeCloudMonitorAgentStatusesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCloudMonitorAgentStatusesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMonitorAgentStatusesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudMonitorAgentStatusesRequest, Builder> {
        private String clientToken; 
        private String instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudMonitorAgentStatusesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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

        @Override
        public DescribeCloudMonitorAgentStatusesRequest build() {
            return new DescribeCloudMonitorAgentStatusesRequest(this);
        } 

    } 

}
