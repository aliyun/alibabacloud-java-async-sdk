// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricChannelConfigResponseBody</p>
 */
public class DescribeFabricChannelConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeFabricChannelConfigResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChannelConfigResponseBody create() {
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

        public DescribeFabricChannelConfigResponseBody build() {
            return new DescribeFabricChannelConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AbsoluteMaxBytes")
        private Long absoluteMaxBytes;

        @NameInMap("BatchTimeout")
        private String batchTimeout;

        @NameInMap("MaxMessageCount")
        private Long maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        private Long preferredMaxBytes;

        private Result(Builder builder) {
            this.absoluteMaxBytes = builder.absoluteMaxBytes;
            this.batchTimeout = builder.batchTimeout;
            this.maxMessageCount = builder.maxMessageCount;
            this.preferredMaxBytes = builder.preferredMaxBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return absoluteMaxBytes
         */
        public Long getAbsoluteMaxBytes() {
            return this.absoluteMaxBytes;
        }

        /**
         * @return batchTimeout
         */
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        /**
         * @return maxMessageCount
         */
        public Long getMaxMessageCount() {
            return this.maxMessageCount;
        }

        /**
         * @return preferredMaxBytes
         */
        public Long getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public static final class Builder {
            private Long absoluteMaxBytes; 
            private String batchTimeout; 
            private Long maxMessageCount; 
            private Long preferredMaxBytes; 

            /**
             * AbsoluteMaxBytes.
             */
            public Builder absoluteMaxBytes(Long absoluteMaxBytes) {
                this.absoluteMaxBytes = absoluteMaxBytes;
                return this;
            }

            /**
             * BatchTimeout.
             */
            public Builder batchTimeout(String batchTimeout) {
                this.batchTimeout = batchTimeout;
                return this;
            }

            /**
             * MaxMessageCount.
             */
            public Builder maxMessageCount(Long maxMessageCount) {
                this.maxMessageCount = maxMessageCount;
                return this;
            }

            /**
             * PreferredMaxBytes.
             */
            public Builder preferredMaxBytes(Long preferredMaxBytes) {
                this.preferredMaxBytes = preferredMaxBytes;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
