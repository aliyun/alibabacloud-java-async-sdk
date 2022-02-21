// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecommissionHostComponentRequest} extends {@link RequestModel}
 *
 * <p>DecommissionHostComponentRequest</p>
 */
public class DecommissionHostComponentRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentName")
    @Validation(required = true)
    private String componentName;

    @Query
    @NameInMap("HostInstanceId")
    @Validation(required = true)
    private String hostInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("TimeoutSeconds")
    @Validation(required = true)
    private Long timeoutSeconds;

    private DecommissionHostComponentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.hostInstanceId = builder.hostInstanceId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecommissionHostComponentRequest create() {
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
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return hostInstanceId
     */
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return timeoutSeconds
     */
    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder extends Request.Builder<DecommissionHostComponentRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private String hostInstanceId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 
        private Long timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(DecommissionHostComponentRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.componentName = response.componentName;
            this.hostInstanceId = response.hostInstanceId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceName = response.serviceName;
            this.timeoutSeconds = response.timeoutSeconds;
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
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * HostInstanceId.
         */
        public Builder hostInstanceId(String hostInstanceId) {
            this.putQueryParameter("HostInstanceId", hostInstanceId);
            this.hostInstanceId = hostInstanceId;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Long timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public DecommissionHostComponentRequest build() {
            return new DecommissionHostComponentRequest(this);
        } 

    } 

}
