// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMyBlockchainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMyBlockchainsResponseBody</p>
 */
public class DescribeMyBlockchainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeMyBlockchainsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMyBlockchainsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

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

        public DescribeMyBlockchainsResponseBody build() {
            return new DescribeMyBlockchainsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bizid")
        private String bizid;

        @com.aliyun.core.annotation.NameInMap("Createtime")
        private Long createtime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("RejectReason")
        private String rejectReason;

        @com.aliyun.core.annotation.NameInMap("ReqAddr")
        private String reqAddr;

        @com.aliyun.core.annotation.NameInMap("SignedAddr")
        private String signedAddr;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Updatetime")
        private Long updatetime;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Result(Builder builder) {
            this.bizid = builder.bizid;
            this.createtime = builder.createtime;
            this.id = builder.id;
            this.rejectReason = builder.rejectReason;
            this.reqAddr = builder.reqAddr;
            this.signedAddr = builder.signedAddr;
            this.status = builder.status;
            this.updatetime = builder.updatetime;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizid
         */
        public String getBizid() {
            return this.bizid;
        }

        /**
         * @return createtime
         */
        public Long getCreatetime() {
            return this.createtime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return rejectReason
         */
        public String getRejectReason() {
            return this.rejectReason;
        }

        /**
         * @return reqAddr
         */
        public String getReqAddr() {
            return this.reqAddr;
        }

        /**
         * @return signedAddr
         */
        public String getSignedAddr() {
            return this.signedAddr;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updatetime
         */
        public Long getUpdatetime() {
            return this.updatetime;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String bizid; 
            private Long createtime; 
            private Integer id; 
            private String rejectReason; 
            private String reqAddr; 
            private String signedAddr; 
            private Integer status; 
            private Long updatetime; 
            private String username; 

            /**
             * Bizid.
             */
            public Builder bizid(String bizid) {
                this.bizid = bizid;
                return this;
            }

            /**
             * Createtime.
             */
            public Builder createtime(Long createtime) {
                this.createtime = createtime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * RejectReason.
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * ReqAddr.
             */
            public Builder reqAddr(String reqAddr) {
                this.reqAddr = reqAddr;
                return this;
            }

            /**
             * SignedAddr.
             */
            public Builder signedAddr(String signedAddr) {
                this.signedAddr = signedAddr;
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
             * Updatetime.
             */
            public Builder updatetime(Long updatetime) {
                this.updatetime = updatetime;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
