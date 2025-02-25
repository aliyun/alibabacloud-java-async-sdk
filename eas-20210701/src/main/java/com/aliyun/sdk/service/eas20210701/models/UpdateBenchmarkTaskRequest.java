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
 * {@link UpdateBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateBenchmarkTaskRequest</p>
 */
public class UpdateBenchmarkTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateBenchmarkTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.taskName = builder.taskName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBenchmarkTaskRequest create() {
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateBenchmarkTaskRequest, Builder> {
        private String clusterId; 
        private String taskName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBenchmarkTaskRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.taskName = request.taskName;
            this.body = request.body;
        } 

        /**
         * <p>The ID of the region where the stress testing task is performed.</p>
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
         * <p>The name of the stress testing task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>benchmark-larec-test-645c</p>
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The request body. The body includes the parameters that are set to create a stress testing task. For more information, see <strong>Table 1. Fields in the base parameter</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;base&quot;:  {
         *          &quot;qps&quot;: 200
         *     }
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateBenchmarkTaskRequest build() {
            return new UpdateBenchmarkTaskRequest(this);
        } 

    } 

}
