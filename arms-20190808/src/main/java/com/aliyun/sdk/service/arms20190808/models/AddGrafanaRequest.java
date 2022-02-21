// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGrafanaRequest} extends {@link RequestModel}
 *
 * <p>AddGrafanaRequest</p>
 */
public class AddGrafanaRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Integration")
    @Validation(required = true)
    private String integration;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddGrafanaRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.integration = builder.integration;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGrafanaRequest create() {
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

    public static final class Builder extends Request.Builder<AddGrafanaRequest, Builder> {
        private String clusterId; 
        private String integration; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddGrafanaRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.integration = response.integration;
            this.regionId = response.regionId;
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
        public AddGrafanaRequest build() {
            return new AddGrafanaRequest(this);
        } 

    } 

}
