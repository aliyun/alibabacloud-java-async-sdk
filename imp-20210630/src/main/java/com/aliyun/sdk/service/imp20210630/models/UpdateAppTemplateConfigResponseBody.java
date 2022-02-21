// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppTemplateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAppTemplateConfigResponseBody</p>
 */
public class UpdateAppTemplateConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateAppTemplateConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppTemplateConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateAppTemplateConfigResponseBody build() {
            return new UpdateAppTemplateConfigResponseBody(this);
        } 

    } 

    public static class ConfigLogs extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        private ConfigLogs(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigLogs create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * 日志标示
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 日志内容
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ConfigLogs build() {
                return new ConfigLogs(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ConfigLogs")
        private java.util.List < ConfigLogs> configLogs;

        private Result(Builder builder) {
            this.configLogs = builder.configLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return configLogs
         */
        public java.util.List < ConfigLogs> getConfigLogs() {
            return this.configLogs;
        }

        public static final class Builder {
            private java.util.List < ConfigLogs> configLogs; 

            /**
             * 配置日志列表
             */
            public Builder configLogs(java.util.List < ConfigLogs> configLogs) {
                this.configLogs = configLogs;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
