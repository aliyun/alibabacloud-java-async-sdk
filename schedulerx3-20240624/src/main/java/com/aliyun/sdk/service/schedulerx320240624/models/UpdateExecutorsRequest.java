// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link UpdateExecutorsRequest} extends {@link RequestModel}
 *
 * <p>UpdateExecutorsRequest</p>
 */
public class UpdateExecutorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkerType")
    private String workerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Workers")
    private String workers;

    private UpdateExecutorsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.workerType = builder.workerType;
        this.workers = builder.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExecutorsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return workerType
     */
    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * @return workers
     */
    public String getWorkers() {
        return this.workers;
    }

    public static final class Builder extends Request.Builder<UpdateExecutorsRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private String workerType; 
        private String workers; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExecutorsRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.workerType = request.workerType;
            this.workers = request.workers;
        } 

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The Cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-a1804a3226d</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The Worker type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        public Builder workerType(String workerType) {
            this.putBodyParameter("WorkerType", workerType);
            this.workerType = workerType;
            return this;
        }

        /**
         * <p>A JSON-formatted string that contains a list of Workers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
         */
        public Builder workers(String workers) {
            this.putBodyParameter("Workers", workers);
            this.workers = workers;
            return this;
        }

        @Override
        public UpdateExecutorsRequest build() {
            return new UpdateExecutorsRequest(this);
        } 

    } 

}
