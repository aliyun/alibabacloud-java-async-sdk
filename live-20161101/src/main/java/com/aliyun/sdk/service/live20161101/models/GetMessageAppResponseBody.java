// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageAppResponseBody</p>
 */
public class GetMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetMessageAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageAppResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageAppResponseBody build() {
            return new GetMessageAppResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppConfig")
        private java.util.Map < String, String > appConfig;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("Status")
        private Integer status;

        private Result(Builder builder) {
            this.appConfig = builder.appConfig;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.extension = builder.extension;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appConfig
         */
        public java.util.Map < String, String > getAppConfig() {
            return this.appConfig;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, String > appConfig; 
            private String appId; 
            private String appName; 
            private Long createTime; 
            private java.util.Map < String, String > extension; 
            private Integer status; 

            /**
             * AppConfig.
             */
            public Builder appConfig(java.util.Map < String, String > appConfig) {
                this.appConfig = appConfig;
                return this;
            }

            /**
             * 应用ID。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 应用名称。长度2~16位。
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
