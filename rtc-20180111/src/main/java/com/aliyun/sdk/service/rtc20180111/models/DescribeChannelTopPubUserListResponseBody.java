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
 * {@link DescribeChannelTopPubUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelTopPubUserListResponseBody</p>
 */
public class DescribeChannelTopPubUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopPubUserDetailList")
    private java.util.List<TopPubUserDetailList> topPubUserDetailList;

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
     * @return topPubUserDetailList
     */
    public java.util.List<TopPubUserDetailList> getTopPubUserDetailList() {
        return this.topPubUserDetailList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TopPubUserDetailList> topPubUserDetailList; 

        private Builder() {
        } 

        private Builder(DescribeChannelTopPubUserListResponseBody model) {
            this.requestId = model.requestId;
            this.topPubUserDetailList = model.topPubUserDetailList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of details about top publishing users.</p>
         */
        public Builder topPubUserDetailList(java.util.List<TopPubUserDetailList> topPubUserDetailList) {
            this.topPubUserDetailList = topPubUserDetailList;
            return this;
        }

        public DescribeChannelTopPubUserListResponseBody build() {
            return new DescribeChannelTopPubUserListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelTopPubUserListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelTopPubUserListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OnlinePeriods model) {
                this.joinTs = model.joinTs;
                this.leaveTs = model.leaveTs;
            } 

            /**
             * <p>The time when the user joined the channel. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615893327</p>
             */
            public Builder joinTs(Long joinTs) {
                this.joinTs = joinTs;
                return this;
            }

            /**
             * <p>The time when the user left the channel. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615893442</p>
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
    /**
     * 
     * {@link DescribeChannelTopPubUserListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelTopPubUserListResponseBody</p>
     */
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
        private java.util.List<OnlinePeriods> onlinePeriods;

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
        public java.util.List<OnlinePeriods> getOnlinePeriods() {
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
            private java.util.List<OnlinePeriods> onlinePeriods; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TopPubUserDetailList model) {
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.duration = model.duration;
                this.location = model.location;
                this.onlineDuration = model.onlineDuration;
                this.onlinePeriods = model.onlinePeriods;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the user first joined the channel. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615893327</p>
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * <p>The time when the user last left the channel. The value is a UNIX timestamp in seconds. The value is 0 if the call has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1615893442</p>
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * <p>The total duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>115</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The geographic location, such as Beijing-Beijing.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang-Hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The communication duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>115</p>
             */
            public Builder onlineDuration(Long onlineDuration) {
                this.onlineDuration = onlineDuration;
                return this;
            }

            /**
             * <p>The list of online periods for the user.</p>
             */
            public Builder onlinePeriods(java.util.List<OnlinePeriods> onlinePeriods) {
                this.onlinePeriods = onlinePeriods;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testuserid</p>
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
