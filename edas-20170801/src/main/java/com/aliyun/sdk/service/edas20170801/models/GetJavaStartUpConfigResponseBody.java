// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetJavaStartUpConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetJavaStartUpConfigResponseBody</p>
 */
public class GetJavaStartUpConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("JavaStartUpConfig")
    private JavaStartUpConfig javaStartUpConfig;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetJavaStartUpConfigResponseBody model) {
            this.code = model.code;
            this.javaStartUpConfig = model.javaStartUpConfig;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration of Java startup parameters.</p>
         */
        public Builder javaStartUpConfig(JavaStartUpConfig javaStartUpConfig) {
            this.javaStartUpConfig = javaStartUpConfig;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4823-bhjf-23u4-eiufh</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJavaStartUpConfigResponseBody build() {
            return new GetJavaStartUpConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJavaStartUpConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetJavaStartUpConfigResponseBody</p>
     */
    public static class JavaStartUpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalConfigs")
        private String originalConfigs;

        @com.aliyun.core.annotation.NameInMap("StartUpArgs")
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

            private Builder() {
            } 

            private Builder(JavaStartUpConfig model) {
                this.originalConfigs = model.originalConfigs;
                this.startUpArgs = model.startUpArgs;
            } 

            /**
             * <p>The displayed startup parameter configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>-Xms512m</p>
             */
            public Builder originalConfigs(String originalConfigs) {
                this.originalConfigs = originalConfigs;
                return this;
            }

            /**
             * <p>The effective startup parameter configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>-Xms512m</p>
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
