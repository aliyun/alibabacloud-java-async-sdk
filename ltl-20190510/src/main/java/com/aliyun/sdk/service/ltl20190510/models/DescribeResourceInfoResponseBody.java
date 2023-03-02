// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceInfoResponseBody</p>
 */
public class DescribeResourceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeResourceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceInfoResponseBody build() {
            return new DescribeResourceInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthorizeType")
        private String authorizeType;

        @NameInMap("EffectiveTime")
        private Long effectiveTime;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.authorizeType = builder.authorizeType;
            this.effectiveTime = builder.effectiveTime;
            this.expiredTime = builder.expiredTime;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizeType
         */
        public String getAuthorizeType() {
            return this.authorizeType;
        }

        /**
         * @return effectiveTime
         */
        public Long getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authorizeType; 
            private Long effectiveTime; 
            private Long expiredTime; 
            private String region; 
            private String status; 

            /**
             * AuthorizeType.
             */
            public Builder authorizeType(String authorizeType) {
                this.authorizeType = authorizeType;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(Long effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
