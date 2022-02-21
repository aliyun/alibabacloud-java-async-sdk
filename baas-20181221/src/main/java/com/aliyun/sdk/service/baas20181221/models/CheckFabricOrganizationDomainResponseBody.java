// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricOrganizationDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckFabricOrganizationDomainResponseBody</p>
 */
public class CheckFabricOrganizationDomainResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CheckFabricOrganizationDomainResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFabricOrganizationDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckFabricOrganizationDomainResponseBody build() {
            return new CheckFabricOrganizationDomainResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Prompt")
        private String prompt;

        @NameInMap("Valid")
        private Boolean valid;

        private Result(Builder builder) {
            this.domain = builder.domain;
            this.prompt = builder.prompt;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private String domain; 
            private String prompt; 
            private Boolean valid; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
