// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateK8sApplicationConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sApplicationConfigRequest</p>
 */
public class UpdateK8sApplicationConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuLimit")
    private String cpuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuRequest")
    private String cpuRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorageLimit")
    private String ephemeralStorageLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorageRequest")
    private String ephemeralStorageRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpuLimit")
    private String mcpuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpuRequest")
    private String mcpuRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryLimit")
    private String memoryLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryRequest")
    private String memoryRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
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
         * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23bf94d9-****-4994-9917-616a827aa777</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the cluster. You can query the cluster ID by calling the ListCluster operation. For more information, see <a href="https://help.aliyun.com/document_detail/411844.html">ListCluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>9c28bbb9-****-44b3-b953-54ef8a2d0be2</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running. The value 0 indicates that no limit is set on CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuLimit(String cpuLimit) {
            this.putQueryParameter("CpuLimit", cpuLimit);
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. The value 0 indicates that no limit is set on CPU cores.</p>
         * <blockquote>
         * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuRequest(String cpuRequest) {
            this.putQueryParameter("CpuRequest", cpuRequest);
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder ephemeralStorageLimit(String ephemeralStorageLimit) {
            this.putQueryParameter("EphemeralStorageLimit", ephemeralStorageLimit);
            this.ephemeralStorageLimit = ephemeralStorageLimit;
            return this;
        }

        /**
         * <p>The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
         * <blockquote>
         * <p>You must set this parameter together with the EphemeralStorageLimit parameter. Make sure that the value of this parameter does not exceed that of the EphemeralStorageLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ephemeralStorageRequest(String ephemeralStorageRequest) {
            this.putQueryParameter("EphemeralStorageRequest", ephemeralStorageRequest);
            this.ephemeralStorageRequest = ephemeralStorageRequest;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed. The value 0 indicates that no limit is set on CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mcpuLimit(String mcpuLimit) {
            this.putQueryParameter("McpuLimit", mcpuLimit);
            this.mcpuLimit = mcpuLimit;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores required. Unit: cores. The value 0 indicates that no limit is set on CPU cores.</p>
         * <blockquote>
         * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder mcpuRequest(String mcpuRequest) {
            this.putQueryParameter("McpuRequest", mcpuRequest);
            this.mcpuRequest = mcpuRequest;
            return this;
        }

        /**
         * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value 0 indicates that no limit is set on the memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memoryLimit(String memoryLimit) {
            this.putQueryParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * <p>The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.</p>
         * <blockquote>
         * <p>You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder memoryRequest(String memoryRequest) {
            this.putQueryParameter("MemoryRequest", memoryRequest);
            this.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * <p>The timeout period of the change process. Valid values: 1 to 1800. Default value: 600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
