// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteRemoteADBDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRemoteADBDataSourceResponseBody</p>
 */
public class DeleteRemoteADBDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private DeleteRemoteADBDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRemoteADBDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private Integer taskId; 

        private Builder() {
        } 

        private Builder(DeleteRemoteADBDataSourceResponseBody model) {
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e9d60eb1-e90d-4bc6-a470-c8b767460858</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90000</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public DeleteRemoteADBDataSourceResponseBody build() {
            return new DeleteRemoteADBDataSourceResponseBody(this);
        } 

    } 

}
