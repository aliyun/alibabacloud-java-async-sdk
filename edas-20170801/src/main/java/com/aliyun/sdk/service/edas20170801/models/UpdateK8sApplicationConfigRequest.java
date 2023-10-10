// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sApplicationConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sApplicationConfigRequest</p>
 */
public class UpdateK8sApplicationConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CpuLimit")
    private String cpuLimit;

    @Query
    @NameInMap("CpuRequest")
    private String cpuRequest;

    @Query
    @NameInMap("EphemeralStorageLimit")
    private String ephemeralStorageLimit;

    @Query
    @NameInMap("EphemeralStorageRequest")
    private String ephemeralStorageRequest;

    @Query
    @NameInMap("McpuLimit")
    private String mcpuLimit;

    @Query
    @NameInMap("McpuRequest")
    private String mcpuRequest;

    @Query
    @NameInMap("MemoryLimit")
    private String memoryLimit;

    @Query
    @NameInMap("MemoryRequest")
    private String memoryRequest;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private UpdateK8sApplicationConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.cpuLimit = builder.cpuLimit;
        this.cpuRequest = builder.cpuRequest;
        this.ephemeralStorageLimit = builder.ephemeralStorageLimit;
        this.ephemeralStorageRequest = builder.ephemeralStorageRequest;
        this.mcpuLimit = builder.mcpuLimit;
        this.mcpuRequest = builder.mcpuRequest;
        this.memoryLimit = builder.memoryLimit;
        this.memoryRequest = builder.memoryRequest;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sApplicationConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    /**
     * @return cpuRequest
     */
    public String getCpuRequest() {
        return this.cpuRequest;
    }

    /**
     * @return ephemeralStorageLimit
     */
    public String getEphemeralStorageLimit() {
        return this.ephemeralStorageLimit;
    }

    /**
     * @return ephemeralStorageRequest
     */
    public String getEphemeralStorageRequest() {
        return this.ephemeralStorageRequest;
    }

    /**
     * @return mcpuLimit
     */
    public String getMcpuLimit() {
        return this.mcpuLimit;
    }

    /**
     * @return mcpuRequest
     */
    public String getMcpuRequest() {
        return this.mcpuRequest;
    }

    /**
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return memoryRequest
     */
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<UpdateK8sApplicationConfigRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private String cpuLimit; 
        private String cpuRequest; 
        private String ephemeralStorageLimit; 
        private String ephemeralStorageRequest; 
        private String mcpuLimit; 
        private String mcpuRequest; 
        private String memoryLimit; 
        private String memoryRequest; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sApplicationConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.cpuLimit = request.cpuLimit;
            this.cpuRequest = request.cpuRequest;
            this.ephemeralStorageLimit = request.ephemeralStorageLimit;
            this.ephemeralStorageRequest = request.ephemeralStorageRequest;
            this.mcpuLimit = request.mcpuLimit;
            this.mcpuRequest = request.mcpuRequest;
            this.memoryLimit = request.memoryLimit;
            this.memoryRequest = request.memoryRequest;
            this.timeout = request.timeout;
        } 

        /**
         * The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](~~423162~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the cluster. You can query the cluster ID by calling the ListCluster operation. For more information, see [ListCluster](~~411844~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed for each application instance when the application is running. The value 0 indicates that no limit is set on CPU cores.
         */
        public Builder cpuLimit(String cpuLimit) {
            this.putQueryParameter("CpuLimit", cpuLimit);
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. The value 0 indicates that no limit is set on CPU cores.
         * <p>
         * 
         * > You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.
         */
        public Builder cpuRequest(String cpuRequest) {
            this.putQueryParameter("CpuRequest", cpuRequest);
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.
         */
        public Builder ephemeralStorageLimit(String ephemeralStorageLimit) {
            this.putQueryParameter("EphemeralStorageLimit", ephemeralStorageLimit);
            this.ephemeralStorageLimit = ephemeralStorageLimit;
            return this;
        }

        /**
         * The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.
         * <p>
         * 
         * > You must set this parameter together with the EphemeralStorageLimit parameter. Make sure that the value of this parameter does not exceed that of the EphemeralStorageLimit parameter.
         */
        public Builder ephemeralStorageRequest(String ephemeralStorageRequest) {
            this.putQueryParameter("EphemeralStorageRequest", ephemeralStorageRequest);
            this.ephemeralStorageRequest = ephemeralStorageRequest;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed. The value 0 indicates that no limit is set on CPU cores.
         */
        public Builder mcpuLimit(String mcpuLimit) {
            this.putQueryParameter("McpuLimit", mcpuLimit);
            this.mcpuLimit = mcpuLimit;
            return this;
        }

        /**
         * The minimum number of CPU cores required. Unit: cores. The value 0 indicates that no limit is set on CPU cores.
         * <p>
         * 
         * > You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.
         */
        public Builder mcpuRequest(String mcpuRequest) {
            this.putQueryParameter("McpuRequest", mcpuRequest);
            this.mcpuRequest = mcpuRequest;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value 0 indicates that no limit is set on the memory size.
         */
        public Builder memoryLimit(String memoryLimit) {
            this.putQueryParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.
         * <p>
         * 
         * > You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.
         */
        public Builder memoryRequest(String memoryRequest) {
            this.putQueryParameter("MemoryRequest", memoryRequest);
            this.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * The timeout period of the change process. Valid values: 1 to 1800. Default value: 600. Unit: seconds.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateK8sApplicationConfigRequest build() {
            return new UpdateK8sApplicationConfigRequest(this);
        } 

    } 

}
