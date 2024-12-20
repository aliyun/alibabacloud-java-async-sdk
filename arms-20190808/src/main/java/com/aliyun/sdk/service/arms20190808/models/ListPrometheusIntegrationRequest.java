// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListPrometheusIntegrationRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusIntegrationRequest</p>
 */
public class ListPrometheusIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListPrometheusIntegrationRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.integrationType = builder.integrationType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusIntegrationRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListPrometheusIntegrationRequest, Builder> {
        private String clusterId; 
        private String integrationType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusIntegrationRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.integrationType = request.integrationType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the Prometheus instance. Only aliyun-cs and ecs instances are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c77f6f2397ea74672872acf5e31374a27</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The integration type. Valid values: kafka, mysql, redis, snmp, emr, nubela, and tidb.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka, mysql, redis, snmp, emr, nubela, and tidb</p>
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
        public ListPrometheusIntegrationRequest build() {
            return new ListPrometheusIntegrationRequest(this);
        } 

    } 

}
