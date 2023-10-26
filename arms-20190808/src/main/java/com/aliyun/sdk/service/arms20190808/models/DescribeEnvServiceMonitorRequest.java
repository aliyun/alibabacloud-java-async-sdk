// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvServiceMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvServiceMonitorRequest</p>
 */
public class DescribeEnvServiceMonitorRequest extends Request {
    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceMonitorName")
    @Validation(required = true)
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
         * Environment instance ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The name of the namespace.
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
         * ServiceMonitor name.
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
