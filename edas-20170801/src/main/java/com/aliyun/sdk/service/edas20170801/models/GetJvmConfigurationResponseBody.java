// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJvmConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetJvmConfigurationResponseBody</p>
 */
public class GetJvmConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("JvmConfiguration")
    private JvmConfiguration jvmConfiguration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetJvmConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.jvmConfiguration = builder.jvmConfiguration;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJvmConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return jvmConfiguration
     */
    public JvmConfiguration getJvmConfiguration() {
        return this.jvmConfiguration;
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
        private JvmConfiguration jvmConfiguration; 
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
         * The JVM configuration of the application or instance group.
         */
        public Builder jvmConfiguration(JvmConfiguration jvmConfiguration) {
            this.jvmConfiguration = jvmConfiguration;
            return this;
        }

        /**
         * The additional information that is returned.
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

        public GetJvmConfigurationResponseBody build() {
            return new GetJvmConfigurationResponseBody(this);
        } 

    } 

    public static class JvmConfiguration extends TeaModel {
        @NameInMap("MaxHeapSize")
        private Integer maxHeapSize;

        @NameInMap("MaxPermSize")
        private Integer maxPermSize;

        @NameInMap("MinHeapSize")
        private Integer minHeapSize;

        @NameInMap("Options")
        private String options;

        private JvmConfiguration(Builder builder) {
            this.maxHeapSize = builder.maxHeapSize;
            this.maxPermSize = builder.maxPermSize;
            this.minHeapSize = builder.minHeapSize;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JvmConfiguration create() {
            return builder().build();
        }

        /**
         * @return maxHeapSize
         */
        public Integer getMaxHeapSize() {
            return this.maxHeapSize;
        }

        /**
         * @return maxPermSize
         */
        public Integer getMaxPermSize() {
            return this.maxPermSize;
        }

        /**
         * @return minHeapSize
         */
        public Integer getMinHeapSize() {
            return this.minHeapSize;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        public static final class Builder {
            private Integer maxHeapSize; 
            private Integer maxPermSize; 
            private Integer minHeapSize; 
            private String options; 

            /**
             * The maximum size of the heap memory. Unit: MB.
             */
            public Builder maxHeapSize(Integer maxHeapSize) {
                this.maxHeapSize = maxHeapSize;
                return this;
            }

            /**
             * The size of the permanent generation heap memory. Unit: MB.
             */
            public Builder maxPermSize(Integer maxPermSize) {
                this.maxPermSize = maxPermSize;
                return this;
            }

            /**
             * The initial size of the heap memory. Unit: MB.
             */
            public Builder minHeapSize(Integer minHeapSize) {
                this.minHeapSize = minHeapSize;
                return this;
            }

            /**
             * The custom parameter.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            public JvmConfiguration build() {
                return new JvmConfiguration(this);
            } 

        } 

    }
}
