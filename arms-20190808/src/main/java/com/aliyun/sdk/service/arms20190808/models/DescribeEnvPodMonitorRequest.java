// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvPodMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvPodMonitorRequest</p>
 */
public class DescribeEnvPodMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodMonitorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String podMonitorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeEnvPodMonitorRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.namespace = builder.namespace;
        this.podMonitorName = builder.podMonitorName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvPodMonitorRequest create() {
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
     * @return podMonitorName
     */
    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEnvPodMonitorRequest, Builder> {
        private String environmentId; 
        private String namespace; 
        private String podMonitorName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvPodMonitorRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.namespace = request.namespace;
            this.podMonitorName = request.podMonitorName;
            this.regionId = request.regionId;
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
         * The namespace where the PodMonitor resides.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The name of the PodMonitor.
         */
        public Builder podMonitorName(String podMonitorName) {
            this.putQueryParameter("PodMonitorName", podMonitorName);
            this.podMonitorName = podMonitorName;
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
        public DescribeEnvPodMonitorRequest build() {
            return new DescribeEnvPodMonitorRequest(this);
        } 

    } 

}
