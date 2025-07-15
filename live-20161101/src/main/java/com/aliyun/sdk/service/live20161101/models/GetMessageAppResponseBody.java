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
 * {@link GetMessageAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageAppResponseBody</p>
 */
public class GetMessageAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMessageAppResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageAppResponseBody build() {
            return new GetMessageAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageAppResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppConfig")
        private java.util.Map<String, String> appConfig;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private java.util.Map<String, String> extension;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.Map<String, String> getAppConfig() {
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
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map<String, String> appConfig; 
            private String appId; 
            private String appName; 
            private Long createTime; 
            private java.util.Map<String, String> extension; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appConfig = model.appConfig;
                this.appId = model.appId;
                this.appName = model.appName;
                this.createTime = model.createTime;
                this.extension = model.extension;
                this.status = model.status;
            } 

            /**
             * <p>The configurations of the application.</p>
             */
            public Builder appConfig(java.util.Map<String, String> appConfig) {
                this.appConfig = appConfig;
                return this;
            }

            /**
             * <p>The ID of the interactive messaging application.</p>
             * 
             * <strong>example:</strong>
             * <p>VKL3***</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the interactive messaging application.</p>
             * 
             * <strong>example:</strong>
             * <p>testApp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The time when the interactive messaging application was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>502280113</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The extended field.</p>
             */
            public Builder extension(java.util.Map<String, String> extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The status of the interactive message application. A value of 1 indicates that the application is normal.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
