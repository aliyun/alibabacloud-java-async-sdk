// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelTopPubUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelTopPubUserListResponseBody</p>
 */
public class DescribeChannelTopPubUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopPubUserDetailList")
    private java.util.List < TopPubUserDetailList> topPubUserDetailList;

    private DescribeChannelTopPubUserListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topPubUserDetailList = builder.topPubUserDetailList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelTopPubUserListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topPubUserDetailList
     */
    public java.util.List < TopPubUserDetailList> getTopPubUserDetailList() {
        return this.topPubUserDetailList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TopPubUserDetailList> topPubUserDetailList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TopPubUserDetailList.
         */
        public Builder topPubUserDetailList(java.util.List < TopPubUserDetailList> topPubUserDetailList) {
            this.topPubUserDetailList = topPubUserDetailList;
            return this;
        }

        public DescribeChannelTopPubUserListResponseBody build() {
            return new DescribeChannelTopPubUserListResponseBody(this);
        } 

    } 

    public static class OnlinePeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTs")
        private Long joinTs;

        @com.aliyun.core.annotation.NameInMap("LeaveTs")
        private Long leaveTs;

        private OnlinePeriods(Builder builder) {
            this.joinTs = builder.joinTs;
            this.leaveTs = builder.leaveTs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlinePeriods create() {
            return builder().build();
        }

        /**
         * @return joinTs
         */
        public Long getJoinTs() {
            return this.joinTs;
        }

        /**
         * @return leaveTs
         */
        public Long getLeaveTs() {
            return this.leaveTs;
        }

        public static final class Builder {
            private Long joinTs; 
            private Long leaveTs; 

            /**
             * JoinTs.
             */
            public Builder joinTs(Long joinTs) {
                this.joinTs = joinTs;
                return this;
            }

            /**
             * LeaveTs.
             */
            public Builder leaveTs(Long leaveTs) {
                this.leaveTs = leaveTs;
                return this;
            }

            public OnlinePeriods build() {
                return new OnlinePeriods(this);
            } 

        } 

    }
    public static class TopPubUserDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OnlineDuration")
        private Long onlineDuration;

        @com.aliyun.core.annotation.NameInMap("OnlinePeriods")
        private java.util.List < OnlinePeriods> onlinePeriods;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private TopPubUserDetailList(Builder builder) {
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
            this.location = builder.location;
            this.onlineDuration = builder.onlineDuration;
            this.onlinePeriods = builder.onlinePeriods;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopPubUserDetailList create() {
            return builder().build();
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return onlineDuration
         */
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        /**
         * @return onlinePeriods
         */
        public java.util.List < OnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 
            private String location; 
            private Long onlineDuration; 
            private java.util.List < OnlinePeriods> onlinePeriods; 
            private String userId; 

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OnlineDuration.
             */
            public Builder onlineDuration(Long onlineDuration) {
                this.onlineDuration = onlineDuration;
                return this;
            }

            /**
             * OnlinePeriods.
             */
            public Builder onlinePeriods(java.util.List < OnlinePeriods> onlinePeriods) {
                this.onlinePeriods = onlinePeriods;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TopPubUserDetailList build() {
                return new TopPubUserDetailList(this);
            } 

        } 

    }
}
