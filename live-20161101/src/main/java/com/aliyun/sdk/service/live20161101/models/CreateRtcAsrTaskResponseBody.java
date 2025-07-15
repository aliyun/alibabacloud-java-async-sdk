// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateRtcAsrTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRtcAsrTaskResponseBody</p>
 */
public class CreateRtcAsrTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Long retCode;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateRtcAsrTaskResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRtcAsrTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Long getRetCode() {
        return this.retCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private Long retCode; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(CreateRtcAsrTaskResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The result of the request. If success is returned, the request is successful. If an error message is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7FF5417D-06E9-5A2C-9A70-581F6149E6C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned HTTP status code. HTTP status code 2000 indicates that the request is successful. If another HTTP status code is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder retCode(Long retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>asr-a6ac15e0-9118-4b4c-9e64-306163a0****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateRtcAsrTaskResponseBody build() {
            return new CreateRtcAsrTaskResponseBody(this);
        } 

    } 

}
