// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link GetLineSplitResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetLineSplitResultResponseBody</p>
 */
public class GetLineSplitResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLineSplitResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLineSplitResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return errorCode
     */
    public Long getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Long errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Resource resource; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetLineSplitResultResponseBody model) {
            this.code = model.code;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLineSplitResultResponseBody build() {
            return new GetLineSplitResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLineSplitResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLineSplitResultResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalRegex")
        private String additionalRegex;

        @com.aliyun.core.annotation.NameInMap("EndSplitSymbol")
        private String endSplitSymbol;

        @com.aliyun.core.annotation.NameInMap("Regex")
        private String regex;

        @com.aliyun.core.annotation.NameInMap("RegexSplitResult")
        private java.util.List<String> regexSplitResult;

        @com.aliyun.core.annotation.NameInMap("StartSplitSymbol")
        private String startSplitSymbol;

        @com.aliyun.core.annotation.NameInMap("StartSplitSymbolIndex")
        private Long startSplitSymbolIndex;

        private Resource(Builder builder) {
            this.additionalRegex = builder.additionalRegex;
            this.endSplitSymbol = builder.endSplitSymbol;
            this.regex = builder.regex;
            this.regexSplitResult = builder.regexSplitResult;
            this.startSplitSymbol = builder.startSplitSymbol;
            this.startSplitSymbolIndex = builder.startSplitSymbolIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return additionalRegex
         */
        public String getAdditionalRegex() {
            return this.additionalRegex;
        }

        /**
         * @return endSplitSymbol
         */
        public String getEndSplitSymbol() {
            return this.endSplitSymbol;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        /**
         * @return regexSplitResult
         */
        public java.util.List<String> getRegexSplitResult() {
            return this.regexSplitResult;
        }

        /**
         * @return startSplitSymbol
         */
        public String getStartSplitSymbol() {
            return this.startSplitSymbol;
        }

        /**
         * @return startSplitSymbolIndex
         */
        public Long getStartSplitSymbolIndex() {
            return this.startSplitSymbolIndex;
        }

        public static final class Builder {
            private String additionalRegex; 
            private String endSplitSymbol; 
            private String regex; 
            private java.util.List<String> regexSplitResult; 
            private String startSplitSymbol; 
            private Long startSplitSymbolIndex; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.additionalRegex = model.additionalRegex;
                this.endSplitSymbol = model.endSplitSymbol;
                this.regex = model.regex;
                this.regexSplitResult = model.regexSplitResult;
                this.startSplitSymbol = model.startSplitSymbol;
                this.startSplitSymbolIndex = model.startSplitSymbolIndex;
            } 

            /**
             * AdditionalRegex.
             */
            public Builder additionalRegex(String additionalRegex) {
                this.additionalRegex = additionalRegex;
                return this;
            }

            /**
             * EndSplitSymbol.
             */
            public Builder endSplitSymbol(String endSplitSymbol) {
                this.endSplitSymbol = endSplitSymbol;
                return this;
            }

            /**
             * Regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            /**
             * RegexSplitResult.
             */
            public Builder regexSplitResult(java.util.List<String> regexSplitResult) {
                this.regexSplitResult = regexSplitResult;
                return this;
            }

            /**
             * StartSplitSymbol.
             */
            public Builder startSplitSymbol(String startSplitSymbol) {
                this.startSplitSymbol = startSplitSymbol;
                return this;
            }

            /**
             * StartSplitSymbolIndex.
             */
            public Builder startSplitSymbolIndex(Long startSplitSymbolIndex) {
                this.startSplitSymbolIndex = startSplitSymbolIndex;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
