// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJavaStartUpConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetJavaStartUpConfigResponseBody</p>
 */
public class GetJavaStartUpConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("JavaStartUpConfig")
    private JavaStartUpConfig javaStartUpConfig;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetJavaStartUpConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.javaStartUpConfig = builder.javaStartUpConfig;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJavaStartUpConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return javaStartUpConfig
     */
    public JavaStartUpConfig getJavaStartUpConfig() {
        return this.javaStartUpConfig;
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

    public static final class Builder {
        private Integer code; 
        private JavaStartUpConfig javaStartUpConfig; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The configuration of Java startup parameters.
         */
        public Builder javaStartUpConfig(JavaStartUpConfig javaStartUpConfig) {
            this.javaStartUpConfig = javaStartUpConfig;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJavaStartUpConfigResponseBody build() {
            return new GetJavaStartUpConfigResponseBody(this);
        } 

    } 

    public static class JavaStartUpConfig extends TeaModel {
        @NameInMap("OriginalConfigs")
        private String originalConfigs;

        @NameInMap("StartUpArgs")
        private String startUpArgs;

        private JavaStartUpConfig(Builder builder) {
            this.originalConfigs = builder.originalConfigs;
            this.startUpArgs = builder.startUpArgs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JavaStartUpConfig create() {
            return builder().build();
        }

        /**
         * @return originalConfigs
         */
        public String getOriginalConfigs() {
            return this.originalConfigs;
        }

        /**
         * @return startUpArgs
         */
        public String getStartUpArgs() {
            return this.startUpArgs;
        }

        public static final class Builder {
            private String originalConfigs; 
            private String startUpArgs; 

            /**
             * The displayed startup parameter configuration.
             */
            public Builder originalConfigs(String originalConfigs) {
                this.originalConfigs = originalConfigs;
                return this;
            }

            /**
             * The effective startup parameter configuration.
             */
            public Builder startUpArgs(String startUpArgs) {
                this.startUpArgs = startUpArgs;
                return this;
            }

            public JavaStartUpConfig build() {
                return new JavaStartUpConfig(this);
            } 

        } 

    }
}
