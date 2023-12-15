// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteUserResponseBody} extends {@link TeaModel}
 *
 * <p>InviteUserResponseBody</p>
 */
public class InviteUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private InviteUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteUserResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

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

        public InviteUserResponseBody build() {
            return new InviteUserResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Bid")
        private String bid;

        @NameInMap("Bizid")
        private String bizid;

        @NameInMap("Code")
        private String code;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Email")
        private String email;

        @NameInMap("FromBid")
        private String fromBid;

        @NameInMap("FromUserId")
        private Integer fromUserId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private Integer userId;

        private Result(Builder builder) {
            this.bid = builder.bid;
            this.bizid = builder.bizid;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.email = builder.email;
            this.fromBid = builder.fromBid;
            this.fromUserId = builder.fromUserId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return bizid
         */
        public String getBizid() {
            return this.bizid;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return fromBid
         */
        public String getFromBid() {
            return this.fromBid;
        }

        /**
         * @return fromUserId
         */
        public Integer getFromUserId() {
            return this.fromUserId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bid; 
            private String bizid; 
            private String code; 
            private Long createTime; 
            private String email; 
            private String fromBid; 
            private Integer fromUserId; 
            private Integer status; 
            private Long updateTime; 
            private Integer userId; 

            /**
             * Bid.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * Bizid.
             */
            public Builder bizid(String bizid) {
                this.bizid = bizid;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * FromBid.
             */
            public Builder fromBid(String fromBid) {
                this.fromBid = fromBid;
                return this;
            }

            /**
             * FromUserId.
             */
            public Builder fromUserId(Integer fromUserId) {
                this.fromUserId = fromUserId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
