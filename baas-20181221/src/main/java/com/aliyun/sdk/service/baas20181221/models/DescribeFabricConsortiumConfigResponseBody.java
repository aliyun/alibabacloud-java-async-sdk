// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumConfigResponseBody</p>
 */
public class DescribeFabricConsortiumConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeFabricConsortiumConfigResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumConfigResponseBody create() {
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

        public DescribeFabricConsortiumConfigResponseBody build() {
            return new DescribeFabricConsortiumConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ChannelPolicy")
        private java.util.List < String > channelPolicy;

        @NameInMap("OrdererType")
        private java.util.List < String > ordererType;

        private Result(Builder builder) {
            this.channelPolicy = builder.channelPolicy;
            this.ordererType = builder.ordererType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelPolicy
         */
        public java.util.List < String > getChannelPolicy() {
            return this.channelPolicy;
        }

        /**
         * @return ordererType
         */
        public java.util.List < String > getOrdererType() {
            return this.ordererType;
        }

        public static final class Builder {
            private java.util.List < String > channelPolicy; 
            private java.util.List < String > ordererType; 

            /**
             * ChannelPolicy.
             */
            public Builder channelPolicy(java.util.List < String > channelPolicy) {
                this.channelPolicy = channelPolicy;
                return this;
            }

            /**
             * OrdererType.
             */
            public Builder ordererType(java.util.List < String > ordererType) {
                this.ordererType = ordererType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
