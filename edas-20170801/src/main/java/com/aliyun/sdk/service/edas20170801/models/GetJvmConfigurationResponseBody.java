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
 * {@link GetJvmConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetJvmConfigurationResponseBody</p>
 */
public class GetJvmConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("JvmConfiguration")
    private JvmConfiguration jvmConfiguration;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(GetJvmConfigurationResponseBody model) {
            this.code = model.code;
            this.jvmConfiguration = model.jvmConfiguration;
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
         * <p>The JVM configuration of the application or instance group.</p>
         */
        public Builder jvmConfiguration(JvmConfiguration jvmConfiguration) {
            this.jvmConfiguration = jvmConfiguration;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
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
         * <p>3F43-F34V-0VCD***********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJvmConfigurationResponseBody build() {
            return new GetJvmConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJvmConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetJvmConfigurationResponseBody</p>
     */
    public static class JvmConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxHeapSize")
        private Integer maxHeapSize;

        @com.aliyun.core.annotation.NameInMap("MaxPermSize")
        private Integer maxPermSize;

        @com.aliyun.core.annotation.NameInMap("MinHeapSize")
        private Integer minHeapSize;

        @com.aliyun.core.annotation.NameInMap("Options")
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

            private Builder() {
            } 

            private Builder(JvmConfiguration model) {
                this.maxHeapSize = model.maxHeapSize;
                this.maxPermSize = model.maxPermSize;
                this.minHeapSize = model.minHeapSize;
                this.options = model.options;
            } 

            /**
             * <p>The maximum size of the heap memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxHeapSize(Integer maxHeapSize) {
                this.maxHeapSize = maxHeapSize;
                return this;
            }

            /**
             * <p>The size of the permanent generation heap memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxPermSize(Integer maxPermSize) {
                this.maxPermSize = maxPermSize;
                return this;
            }

            /**
             * <p>The initial size of the heap memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder minHeapSize(Integer minHeapSize) {
                this.minHeapSize = minHeapSize;
                return this;
            }

            /**
             * <p>The custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>-XX:+UseConcMarkSweepGC -XX:-UseParNewGC</p>
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
