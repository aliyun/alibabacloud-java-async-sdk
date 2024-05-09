// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationStateRequest} extends {@link RequestModel}
 *
 * <p>GetIntegrationStateRequest</p>
 */
public class GetIntegrationStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Integration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetIntegrationStateRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.integration = builder.integration;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationStateRequest create() {
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
     * @return integration
     */
    public String getIntegration() {
        return this.integration;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetIntegrationStateRequest, Builder> {
        private String clusterId; 
        private String integration; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetIntegrationStateRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.integration = request.integration;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Integration.
         */
        public Builder integration(String integration) {
            this.putQueryParameter("Integration", integration);
            this.integration = integration;
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
        public GetIntegrationStateRequest build() {
            return new GetIntegrationStateRequest(this);
        } 

    } 

}
