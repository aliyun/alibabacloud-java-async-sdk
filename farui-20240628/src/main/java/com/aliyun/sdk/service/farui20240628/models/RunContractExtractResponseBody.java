// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunContractExtractResponseBody} extends {@link TeaModel}
 *
 * <p>RunContractExtractResponseBody</p>
 */
public class RunContractExtractResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RunContractExtractResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunContractExtractResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RunContractExtractResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C844BE6B-33A9-5AC4-A1AE-97B131849E0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RunContractExtractResponseBody build() {
            return new RunContractExtractResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunContractExtractResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractExtractResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("originalText")
        private String originalText;

        private Value(Builder builder) {
            this.data = builder.data;
            this.originalText = builder.originalText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return originalText
         */
        public String getOriginalText() {
            return this.originalText;
        }

        public static final class Builder {
            private String data; 
            private String originalText; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.data = model.data;
                this.originalText = model.originalText;
            } 

            /**
             * data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * originalText.
             */
            public Builder originalText(String originalText) {
                this.originalText = originalText;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractExtractResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractExtractResponseBody</p>
     */
    public static class ExtractResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("extractItem")
        private String extractItem;

        @com.aliyun.core.annotation.NameInMap("option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.List<Value> value;

        private ExtractResult(Builder builder) {
            this.desc = builder.desc;
            this.extractItem = builder.extractItem;
            this.option = builder.option;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractResult create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return extractItem
         */
        public String getExtractItem() {
            return this.extractItem;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return value
         */
        public java.util.List<Value> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private String extractItem; 
            private String option; 
            private java.util.List<Value> value; 

            private Builder() {
            } 

            private Builder(ExtractResult model) {
                this.desc = model.desc;
                this.extractItem = model.extractItem;
                this.option = model.option;
                this.value = model.value;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * extractItem.
             */
            public Builder extractItem(String extractItem) {
                this.extractItem = extractItem;
                return this;
            }

            /**
             * option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * value.
             */
            public Builder value(java.util.List<Value> value) {
                this.value = value;
                return this;
            }

            public ExtractResult build() {
                return new ExtractResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractExtractResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractExtractResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contractText")
        private String contractText;

        @com.aliyun.core.annotation.NameInMap("extractResult")
        private java.util.List<ExtractResult> extractResult;

        private Data(Builder builder) {
            this.contractText = builder.contractText;
            this.extractResult = builder.extractResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contractText
         */
        public String getContractText() {
            return this.contractText;
        }

        /**
         * @return extractResult
         */
        public java.util.List<ExtractResult> getExtractResult() {
            return this.extractResult;
        }

        public static final class Builder {
            private String contractText; 
            private java.util.List<ExtractResult> extractResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contractText = model.contractText;
                this.extractResult = model.extractResult;
            } 

            /**
             * contractText.
             */
            public Builder contractText(String contractText) {
                this.contractText = contractText;
                return this;
            }

            /**
             * extractResult.
             */
            public Builder extractResult(java.util.List<ExtractResult> extractResult) {
                this.extractResult = extractResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
