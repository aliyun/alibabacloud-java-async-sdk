// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateLakebaseMountParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLakebaseMountParameterGroupResponseBody</p>
 */
public class CreateLakebaseMountParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private CreateLakebaseMountParameterGroupResponseBody(Builder builder) {
        this.parameterGroupId = builder.parameterGroupId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLakebaseMountParameterGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String parameterGroupId; 
        private String requestId; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(CreateLakebaseMountParameterGroupResponseBody model) {
            this.parameterGroupId = model.parameterGroupId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of the created parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-lakebase-xxx</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateLakebaseMountParameterGroupResponseBody build() {
            return new CreateLakebaseMountParameterGroupResponseBody(this);
        } 

    } 

}
