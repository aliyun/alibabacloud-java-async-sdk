// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeUserConnectTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserConnectTimeResponseBody</p>
 */
public class DescribeUserConnectTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserConnectTimeResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserConnectTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private Integer count; 
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserConnectTimeResponseBody build() {
            return new DescribeUserConnectTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserConnectTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserConnectTimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndConnectTime")
        private String endConnectTime;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
        private String oversoldGroupId;

        @com.aliyun.core.annotation.NameInMap("StartConnectTime")
        private String startConnectTime;

        @com.aliyun.core.annotation.NameInMap("UserDesktopId")
        private String userDesktopId;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private Data(Builder builder) {
            this.endConnectTime = builder.endConnectTime;
            this.endUserId = builder.endUserId;
            this.oversoldGroupId = builder.oversoldGroupId;
            this.startConnectTime = builder.startConnectTime;
            this.userDesktopId = builder.userDesktopId;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endConnectTime
         */
        public String getEndConnectTime() {
            return this.endConnectTime;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return oversoldGroupId
         */
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        /**
         * @return startConnectTime
         */
        public String getStartConnectTime() {
            return this.startConnectTime;
        }

        /**
         * @return userDesktopId
         */
        public String getUserDesktopId() {
            return this.userDesktopId;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String endConnectTime; 
            private String endUserId; 
            private String oversoldGroupId; 
            private String startConnectTime; 
            private String userDesktopId; 
            private String userGroupId; 

            /**
             * EndConnectTime.
             */
            public Builder endConnectTime(String endConnectTime) {
                this.endConnectTime = endConnectTime;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * OversoldGroupId.
             */
            public Builder oversoldGroupId(String oversoldGroupId) {
                this.oversoldGroupId = oversoldGroupId;
                return this;
            }

            /**
             * StartConnectTime.
             */
            public Builder startConnectTime(String startConnectTime) {
                this.startConnectTime = startConnectTime;
                return this;
            }

            /**
             * UserDesktopId.
             */
            public Builder userDesktopId(String userDesktopId) {
                this.userDesktopId = userDesktopId;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
