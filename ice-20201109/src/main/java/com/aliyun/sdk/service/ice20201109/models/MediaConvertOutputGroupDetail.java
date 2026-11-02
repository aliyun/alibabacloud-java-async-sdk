// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertOutputGroupDetail} extends {@link TeaModel}
 *
 * <p>MediaConvertOutputGroupDetail</p>
 */
public class MediaConvertOutputGroupDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List<MediaConvertOutputDetail> outputs;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private MediaConvertOutputGroupDetail(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.message = builder.message;
        this.name = builder.name;
        this.outputs = builder.outputs;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutputGroupDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputs
     */
    public java.util.List<MediaConvertOutputDetail> getOutputs() {
        return this.outputs;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String createTime; 
        private String finishTime; 
        private String message; 
        private String name; 
        private java.util.List<MediaConvertOutputDetail> outputs; 
        private String status; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(MediaConvertOutputGroupDetail model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.message = model.message;
            this.name = model.name;
            this.outputs = model.outputs;
            this.status = model.status;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The error code for the failed output group task.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceContentBad</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-21T01:48:41Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-21T01:48:41Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The reason for a task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated &quot;InputFile&quot; is bad</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the output group.</p>
         * 
         * <strong>example:</strong>
         * <p>hls-group</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The output details.</p>
         */
        public Builder outputs(java.util.List<MediaConvertOutputDetail> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The status of the output group task.</p>
         * <ul>
         * <li>Init: The task is submitted.</li>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Failed</li>
         * <li>Skipped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the output group task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>22dad741d086a50325f9</strong></strong></strong></p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public MediaConvertOutputGroupDetail build() {
            return new MediaConvertOutputGroupDetail(this);
        } 

    } 

}
