// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomUserStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRoomUserStatisticsResponseBody</p>
 */
public class GetLiveRoomUserStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveRoomUserStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRoomUserStatisticsResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 创建场景化直播返回的结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetLiveRoomUserStatisticsResponseBody build() {
            return new GetLiveRoomUserStatisticsResponseBody(this);
        } 

    } 

    public static class UserStatisticsList extends TeaModel {
        @NameInMap("CommentCount")
        private Integer commentCount;

        @NameInMap("LikeCount")
        private Integer likeCount;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WatchLiveTime")
        private Long watchLiveTime;

        private UserStatisticsList(Builder builder) {
            this.commentCount = builder.commentCount;
            this.likeCount = builder.likeCount;
            this.userId = builder.userId;
            this.watchLiveTime = builder.watchLiveTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsList create() {
            return builder().build();
        }

        /**
         * @return commentCount
         */
        public Integer getCommentCount() {
            return this.commentCount;
        }

        /**
         * @return likeCount
         */
        public Integer getLikeCount() {
            return this.likeCount;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return watchLiveTime
         */
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        public static final class Builder {
            private Integer commentCount; 
            private Integer likeCount; 
            private String userId; 
            private Long watchLiveTime; 

            /**
             * CommentCount.
             */
            public Builder commentCount(Integer commentCount) {
                this.commentCount = commentCount;
                return this;
            }

            /**
             * LikeCount.
             */
            public Builder likeCount(Integer likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            /**
             * 用户ID。
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 观看时长，单位：毫秒。
             */
            public Builder watchLiveTime(Long watchLiveTime) {
                this.watchLiveTime = watchLiveTime;
                return this;
            }

            public UserStatisticsList build() {
                return new UserStatisticsList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UserStatisticsList")
        private java.util.List < UserStatisticsList> userStatisticsList;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.liveId = builder.liveId;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
            this.userStatisticsList = builder.userStatisticsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userStatisticsList
         */
        public java.util.List < UserStatisticsList> getUserStatisticsList() {
            return this.userStatisticsList;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private String liveId; 
            private Integer pageTotal; 
            private Integer totalCount; 
            private java.util.List < UserStatisticsList> userStatisticsList; 

            /**
             * 是否还有下一页。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 直播ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 用户总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 用户总数
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 用户观看数据列表。
             */
            public Builder userStatisticsList(java.util.List < UserStatisticsList> userStatisticsList) {
                this.userStatisticsList = userStatisticsList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
