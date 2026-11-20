// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateServiceInstanceTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceInstanceTokenRequest</p>
 */
public class CreateServiceInstanceTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerName")
    private String workerName;

    private CreateServiceInstanceTokenRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.actionType = builder.actionType;
        this.workerName = builder.workerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceInstanceTokenRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return workerName
     */
    public String getWorkerName() {
        return this.workerName;
    }

    public static final class Builder extends Request.Builder<CreateServiceInstanceTokenRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceName; 
        private String actionType; 
        private String workerName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceInstanceTokenRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.actionType = request.actionType;
            this.workerName = request.workerName;
        } 

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deepseekv3_3</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deepseekv3-3-7b56869574-44nq9</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The type of URL to retrieve. Valid values:</p>
         * <ul>
         * <li><strong>WorkBench</strong>: Logs on to the container through the Workbench page.</li>
         * <li><strong>WebShell</strong>: Logs on to the container through a WebSocket URL. This value is not supported for processor-type services or services created before June 2026.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WorkBench</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The name of the service worker. You can call the ListServiceContainers operation to obtain the worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker0</p>
         */
        public Builder workerName(String workerName) {
            this.putQueryParameter("WorkerName", workerName);
            this.workerName = workerName;
            return this;
        }

        @Override
        public CreateServiceInstanceTokenRequest build() {
            return new CreateServiceInstanceTokenRequest(this);
        } 

    } 

}
