// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSceneBuildTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSceneBuildTaskStatusResponseBody</p>
 */
public class GetSceneBuildTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneId")
    private String sceneId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private GetSceneBuildTaskStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneBuildTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private String errorCode; 
        private String errorMsg; 
        private String message; 
        private String requestId; 
        private String sceneId; 
        private String status; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 任务失败错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 任务失败错误消息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 未开始  init 处理中 失败     failed   processing  完成     succeed 取消     canceled
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSceneBuildTaskStatusResponseBody build() {
            return new GetSceneBuildTaskStatusResponseBody(this);
        } 

    } 

}
