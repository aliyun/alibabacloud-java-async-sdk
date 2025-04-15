// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRtcUserCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcUserCntDataResponseBody</p>
 */
public class DescribeRtcUserCntDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserCntDataPerInterval")
    private UserCntDataPerInterval userCntDataPerInterval;

    private DescribeRtcUserCntDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userCntDataPerInterval = builder.userCntDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcUserCntDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userCntDataPerInterval
     */
    public UserCntDataPerInterval getUserCntDataPerInterval() {
        return this.userCntDataPerInterval;
    }

    public static final class Builder {
        private String requestId; 
        private UserCntDataPerInterval userCntDataPerInterval; 

        private Builder() {
        } 

        private Builder(DescribeRtcUserCntDataResponseBody model) {
            this.requestId = model.requestId;
            this.userCntDataPerInterval = model.userCntDataPerInterval;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserCntDataPerInterval.
         */
        public Builder userCntDataPerInterval(UserCntDataPerInterval userCntDataPerInterval) {
            this.userCntDataPerInterval = userCntDataPerInterval;
            return this;
        }

        public DescribeRtcUserCntDataResponseBody build() {
            return new DescribeRtcUserCntDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcUserCntDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcUserCntDataResponseBody</p>
     */
    public static class UserCntModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveUserCnt")
        private Long activeUserCnt;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private UserCntModule(Builder builder) {
            this.activeUserCnt = builder.activeUserCnt;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCntModule create() {
            return builder().build();
        }

        /**
         * @return activeUserCnt
         */
        public Long getActiveUserCnt() {
            return this.activeUserCnt;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long activeUserCnt; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(UserCntModule model) {
                this.activeUserCnt = model.activeUserCnt;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * ActiveUserCnt.
             */
            public Builder activeUserCnt(Long activeUserCnt) {
                this.activeUserCnt = activeUserCnt;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public UserCntModule build() {
                return new UserCntModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcUserCntDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcUserCntDataResponseBody</p>
     */
    public static class UserCntDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserCntModule")
        private java.util.List<UserCntModule> userCntModule;

        private UserCntDataPerInterval(Builder builder) {
            this.userCntModule = builder.userCntModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCntDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return userCntModule
         */
        public java.util.List<UserCntModule> getUserCntModule() {
            return this.userCntModule;
        }

        public static final class Builder {
            private java.util.List<UserCntModule> userCntModule; 

            private Builder() {
            } 

            private Builder(UserCntDataPerInterval model) {
                this.userCntModule = model.userCntModule;
            } 

            /**
             * UserCntModule.
             */
            public Builder userCntModule(java.util.List<UserCntModule> userCntModule) {
                this.userCntModule = userCntModule;
                return this;
            }

            public UserCntDataPerInterval build() {
                return new UserCntDataPerInterval(this);
            } 

        } 

    }
}
