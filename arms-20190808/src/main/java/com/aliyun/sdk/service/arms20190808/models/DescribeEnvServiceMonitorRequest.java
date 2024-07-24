// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvServiceMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvServiceMonitorRequest</p>
 */
public class DescribeEnvServiceMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMonitorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMonitorName;

    private DescribeEnvServiceMonitorRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.serviceMonitorName = builder.serviceMonitorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvServiceMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceMonitorName
     */
    public String getServiceMonitorName() {
        return this.serviceMonitorName;
    }

    public static final class Builder extends Request.Builder<DescribeEnvServiceMonitorRequest, Builder> {
        private String environmentId; 
        private String namespace; 
        private String regionId; 
        private String serviceMonitorName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvServiceMonitorRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
            this.serviceMonitorName = request.serviceMonitorName;
        } 

        /**
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The namespace where the ServiceMonitor resides.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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

        /**
         * The name of the ServiceMonitor.
         */
        public Builder serviceMonitorName(String serviceMonitorName) {
            this.putQueryParameter("ServiceMonitorName", serviceMonitorName);
            this.serviceMonitorName = serviceMonitorName;
            return this;
        }

        @Override
        public DescribeEnvServiceMonitorRequest build() {
            return new DescribeEnvServiceMonitorRequest(this);
        } 

    } 

}
