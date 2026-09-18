// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link TestLargeModelResponseBody} extends {@link TeaModel}
 *
 * <p>TestLargeModelResponseBody</p>
 */
public class TestLargeModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TestLargeModelResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestLargeModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TestLargeModelResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Details about the authentication error.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code. A value of <code>OK</code> indicates that the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of data entries.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TestLargeModelResponseBody build() {
            return new TestLargeModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestLargeModelResponseBody} extends {@link TeaModel}
     *
     * <p>TestLargeModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ModelVersion")
        private String modelVersion;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.modelVersion = builder.modelVersion;
            this.output = builder.output;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return modelVersion
         */
        public String getModelVersion() {
            return this.modelVersion;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorMsg; 
            private String modelVersion; 
            private String output; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMsg = model.errorMsg;
                this.modelVersion = model.modelVersion;
                this.output = model.output;
                this.success = model.success;
            } 

            /**
             * <p>The error message if the model fails to process the request.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;code\&quot;:\&quot;InvalidApiKey\&quot;,\&quot;message\&quot;:\&quot;Invalid API-key provided.\&quot;,\&quot;request_id\&quot;:\&quot;dd14065e-3dd5-90a1-b8ee-d6c80891defe\&quot;}</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The version of the model that processed the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder modelVersion(String modelVersion) {
                this.modelVersion = modelVersion;
                return this;
            }

            /**
             * <p>The output text generated by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>⌈您好！我是阿里云官网的 AI 小助手。\n\n您输入的“得到的”似乎不是一个完整的问题。请问您具体想了解关于阿里云的哪些知识？\n\n例如：\n*   阿里云有哪些核心产品（如 ECS、RDS、OSS 等）？\n*   如何购买或续费云服务器？\n*   阿里云的安全防护能力有哪些？\n*   如何获取技术支持或查看文档？\n\n请随时提出您的具体问题，我将为您解答！⌋</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>Indicates whether the model processing was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
