// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

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
 * {@link AppendAllDataToTaskRequest} extends {@link RequestModel}
 *
 * <p>AppendAllDataToTaskRequest</p>
 */
public class AppendAllDataToTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OpenDatasetProxyAppendDataRequest body;

    private AppendAllDataToTaskRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendAllDataToTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return body
     */
    public OpenDatasetProxyAppendDataRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AppendAllDataToTaskRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private OpenDatasetProxyAppendDataRequest body; 

        private Builder() {
            super();
        } 

        private Builder(AppendAllDataToTaskRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GAR***134</p>
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>154***518306500608</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(OpenDatasetProxyAppendDataRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public AppendAllDataToTaskRequest build() {
            return new AppendAllDataToTaskRequest(this);
        } 

    } 

}
