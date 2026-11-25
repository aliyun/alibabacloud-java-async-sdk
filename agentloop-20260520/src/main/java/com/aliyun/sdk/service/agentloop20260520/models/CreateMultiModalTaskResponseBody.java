// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateMultiModalTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMultiModalTaskResponseBody</p>
 */
public class CreateMultiModalTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("score")
    private Float score;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private CreateMultiModalTaskResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.score = builder.score;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiModalTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String msg; 
        private Float score; 
        private String taskId; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(CreateMultiModalTaskResponseBody model) {
            this.msg = model.msg;
            this.score = model.score;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The evaluation message. It is the description returned by the backend upon success, or the customer-visible error message upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The image is complete and the inspection is passed</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The score, ranging from 0 to 1. It is null when the evaluation fails. If the backend returns a percentage score greater than 1, it is converted to score/100 and rounded to a maximum of 4 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The task ID, in the format of eval-task-&lt;32hex&gt;. It can be used for tracing in the console or query API. It is null if the failure occurs before the task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-task-0123456789abcdef0123456789abcdef</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task name used for this call. It is also returned upon failure if the request body has been parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>agentloop-media-process</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateMultiModalTaskResponseBody build() {
            return new CreateMultiModalTaskResponseBody(this);
        } 

    } 

}
