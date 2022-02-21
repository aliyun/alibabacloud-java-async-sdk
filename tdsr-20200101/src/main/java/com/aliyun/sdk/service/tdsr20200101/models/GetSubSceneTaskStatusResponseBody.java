// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubSceneTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubSceneTaskStatusResponseBody</p>
 */
public class GetSubSceneTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSubSceneTaskStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubSceneTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 任务信息
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubSceneTaskStatusResponseBody build() {
            return new GetSubSceneTaskStatusResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("Id")
        private String id;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubSceneId")
        private String subSceneId;

        @NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.id = builder.id;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
            this.subSceneId = builder.subSceneId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return subSceneId
         */
        public String getSubSceneId() {
            return this.subSceneId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String id; 
            private String sceneId; 
            private String status; 
            private String subSceneId; 
            private String type; 

            /**
             * 任务失败错误码
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * 任务失败错误信息
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * 任务ID
             */
            public Builder id(String id) {
                this.id = id;
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
             * 未开始  init 处理中   processing   失败     failure  完成     succeed  取消     canceled
             */
            public Builder status(String status) {
                this.status = status;
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
             * 墙线预测: wall_line   切图: cut_image 重建: build  直角优化：right_angle_optimization 其他：other
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
