// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFabricOrganizationToExternalChannelResponseBody} extends {@link TeaModel}
 *
 * <p>AddFabricOrganizationToExternalChannelResponseBody</p>
 */
public class AddFabricOrganizationToExternalChannelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private AddFabricOrganizationToExternalChannelResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFabricOrganizationToExternalChannelResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
        public Builder result(java.util.List < Result> result) {
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

        public AddFabricOrganizationToExternalChannelResponseBody build() {
            return new AddFabricOrganizationToExternalChannelResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("M")
        private Integer m;

        @NameInMap("N")
        private Integer n;

        private Result(Builder builder) {
            this.m = builder.m;
            this.n = builder.n;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return m
         */
        public Integer getM() {
            return this.m;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        public static final class Builder {
            private Integer m; 
            private Integer n; 

            /**
             * M.
             */
            public Builder m(Integer m) {
                this.m = m;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
