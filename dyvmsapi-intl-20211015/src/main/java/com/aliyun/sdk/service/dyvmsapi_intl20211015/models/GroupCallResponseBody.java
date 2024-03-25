// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupCallResponseBody} extends {@link TeaModel}
 *
 * <p>GroupCallResponseBody</p>
 */
public class GroupCallResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private GroupCallResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupCallResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * 请求状态码。  返回OK代表请求成功。 其他错误码，请参见API错误码。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回信息描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GroupCallResponseBody build() {
            return new GroupCallResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("TaskId")
        private String taskId;

        private Model(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

            /**
             * 任务ID，可以通过此ID查询任务的详情。
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
