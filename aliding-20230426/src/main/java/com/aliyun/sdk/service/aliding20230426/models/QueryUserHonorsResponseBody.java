// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryUserHonorsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserHonorsResponseBody</p>
 */
public class QueryUserHonorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("honors")
    private java.util.List < Honors> honors;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryUserHonorsResponseBody(Builder builder) {
        this.honors = builder.honors;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserHonorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return honors
     */
    public java.util.List < Honors> getHonors() {
        return this.honors;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Honors> honors; 
        private String nextToken; 
        private String requestId; 

        /**
         * honors.
         */
        public Builder honors(java.util.List < Honors> honors) {
            this.honors = honors;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUserHonorsResponseBody build() {
            return new QueryUserHonorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserHonorsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserHonorsResponseBody</p>
     */
    public static class GrantHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("grantTime")
        private Long grantTime;

        @com.aliyun.core.annotation.NameInMap("senderUserid")
        private String senderUserid;

        private GrantHistory(Builder builder) {
            this.grantTime = builder.grantTime;
            this.senderUserid = builder.senderUserid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantHistory create() {
            return builder().build();
        }

        /**
         * @return grantTime
         */
        public Long getGrantTime() {
            return this.grantTime;
        }

        /**
         * @return senderUserid
         */
        public String getSenderUserid() {
            return this.senderUserid;
        }

        public static final class Builder {
            private Long grantTime; 
            private String senderUserid; 

            /**
             * grantTime.
             */
            public Builder grantTime(Long grantTime) {
                this.grantTime = grantTime;
                return this;
            }

            /**
             * senderUserid.
             */
            public Builder senderUserid(String senderUserid) {
                this.senderUserid = senderUserid;
                return this;
            }

            public GrantHistory build() {
                return new GrantHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryUserHonorsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserHonorsResponseBody</p>
     */
    public static class Honors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("grantHistory")
        private java.util.List < GrantHistory> grantHistory;

        @com.aliyun.core.annotation.NameInMap("honorDesc")
        private String honorDesc;

        @com.aliyun.core.annotation.NameInMap("honorId")
        private String honorId;

        @com.aliyun.core.annotation.NameInMap("honorName")
        private String honorName;

        private Honors(Builder builder) {
            this.expirationTime = builder.expirationTime;
            this.grantHistory = builder.grantHistory;
            this.honorDesc = builder.honorDesc;
            this.honorId = builder.honorId;
            this.honorName = builder.honorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Honors create() {
            return builder().build();
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return grantHistory
         */
        public java.util.List < GrantHistory> getGrantHistory() {
            return this.grantHistory;
        }

        /**
         * @return honorDesc
         */
        public String getHonorDesc() {
            return this.honorDesc;
        }

        /**
         * @return honorId
         */
        public String getHonorId() {
            return this.honorId;
        }

        /**
         * @return honorName
         */
        public String getHonorName() {
            return this.honorName;
        }

        public static final class Builder {
            private Long expirationTime; 
            private java.util.List < GrantHistory> grantHistory; 
            private String honorDesc; 
            private String honorId; 
            private String honorName; 

            /**
             * expirationTime.
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * grantHistory.
             */
            public Builder grantHistory(java.util.List < GrantHistory> grantHistory) {
                this.grantHistory = grantHistory;
                return this;
            }

            /**
             * honorDesc.
             */
            public Builder honorDesc(String honorDesc) {
                this.honorDesc = honorDesc;
                return this;
            }

            /**
             * honorId.
             */
            public Builder honorId(String honorId) {
                this.honorId = honorId;
                return this;
            }

            /**
             * honorName.
             */
            public Builder honorName(String honorName) {
                this.honorName = honorName;
                return this;
            }

            public Honors build() {
                return new Honors(this);
            } 

        } 

    }
}
