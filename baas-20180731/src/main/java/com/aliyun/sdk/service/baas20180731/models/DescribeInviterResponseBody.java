// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInviterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInviterResponseBody</p>
 */
public class DescribeInviterResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeInviterResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInviterResponseBody create() {
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

        public DescribeInviterResponseBody build() {
            return new DescribeInviterResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("ConsortiumName")
        private String consortiumName;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InviterId")
        private Long inviterId;

        @NameInMap("InviterName")
        private String inviterName;

        private Result(Builder builder) {
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.expireTime = builder.expireTime;
            this.inviterId = builder.inviterId;
            this.inviterName = builder.inviterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return consortiumName
         */
        public String getConsortiumName() {
            return this.consortiumName;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return inviterId
         */
        public Long getInviterId() {
            return this.inviterId;
        }

        /**
         * @return inviterName
         */
        public String getInviterName() {
            return this.inviterName;
        }

        public static final class Builder {
            private String consortiumId; 
            private String consortiumName; 
            private String expireTime; 
            private Long inviterId; 
            private String inviterName; 

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * ConsortiumName.
             */
            public Builder consortiumName(String consortiumName) {
                this.consortiumName = consortiumName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InviterId.
             */
            public Builder inviterId(Long inviterId) {
                this.inviterId = inviterId;
                return this;
            }

            /**
             * InviterName.
             */
            public Builder inviterName(String inviterName) {
                this.inviterName = inviterName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
