// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictionWallLineResponseBody} extends {@link TeaModel}
 *
 * <p>PredictionWallLineResponseBody</p>
 */
public class PredictionWallLineResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubSceneId")
    private String subSceneId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    private PredictionWallLineResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subSceneId = builder.subSceneId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictionWallLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private String requestId; 
        private String subSceneId; 
        private Boolean success; 
        private String taskId; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 子场景ID
         */
        public Builder subSceneId(String subSceneId) {
            this.subSceneId = subSceneId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public PredictionWallLineResponseBody build() {
            return new PredictionWallLineResponseBody(this);
        } 

    } 

}
