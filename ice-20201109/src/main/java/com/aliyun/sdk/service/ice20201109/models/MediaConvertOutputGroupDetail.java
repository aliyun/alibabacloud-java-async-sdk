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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String message; 
        private String name; 
        private java.util.List<MediaConvertOutputDetail> outputs; 
        private String status; 
        private String taskId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(java.util.List<MediaConvertOutputDetail> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskId.
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
