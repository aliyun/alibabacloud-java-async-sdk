// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusIntegrationRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusIntegrationRequest</p>
 */
public class AddPrometheusIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddPrometheusIntegrationRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.integrationType = builder.integrationType;
        this.param = builder.param;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusIntegrationRequest create() {
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
     * @return integrationType
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddPrometheusIntegrationRequest, Builder> {
        private String clusterId; 
        private String integrationType; 
        private String param; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusIntegrationRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.integrationType = request.integrationType;
            this.param = request.param;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the Prometheus instance. Only a Prometheus instance for Container Service or a Prometheus instance for ECS is supported.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the integration.
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * The configurations of the exporter. The value is a JSON string.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddPrometheusIntegrationRequest build() {
            return new AddPrometheusIntegrationRequest(this);
        } 

    } 

}
