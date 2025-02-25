// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrgLiveListResponseBody</p>
 */
public class GetOrgLiveListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetOrgLiveListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgLiveListResponseBody create() {
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

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetOrgLiveListResponseBody build() {
            return new GetOrgLiveListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgLiveListResponseBody</p>
     */
    public static class LiveList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorNickname")
        private String anchorNickname;

        @com.aliyun.core.annotation.NameInMap("AnchorUnionId")
        private String anchorUnionId;

        @com.aliyun.core.annotation.NameInMap("AnchorUserId")
        private String anchorUserId;

        @com.aliyun.core.annotation.NameInMap("LiveEndTime")
        private Long liveEndTime;

        @com.aliyun.core.annotation.NameInMap("LiveStartTime")
        private Long liveStartTime;

        @com.aliyun.core.annotation.NameInMap("LiveUuid")
        private String liveUuid;

        @com.aliyun.core.annotation.NameInMap("ShareOpenConversationIds")
        private java.util.List<String> shareOpenConversationIds;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private LiveList(Builder builder) {
            this.anchorNickname = builder.anchorNickname;
            this.anchorUnionId = builder.anchorUnionId;
            this.anchorUserId = builder.anchorUserId;
            this.liveEndTime = builder.liveEndTime;
            this.liveStartTime = builder.liveStartTime;
            this.liveUuid = builder.liveUuid;
            this.shareOpenConversationIds = builder.shareOpenConversationIds;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveList create() {
            return builder().build();
        }

        /**
         * @return anchorNickname
         */
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        /**
         * @return anchorUnionId
         */
        public String getAnchorUnionId() {
            return this.anchorUnionId;
        }

        /**
         * @return anchorUserId
         */
        public String getAnchorUserId() {
            return this.anchorUserId;
        }

        /**
         * @return liveEndTime
         */
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        /**
         * @return liveStartTime
         */
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        /**
         * @return liveUuid
         */
        public String getLiveUuid() {
            return this.liveUuid;
        }

        /**
         * @return shareOpenConversationIds
         */
        public java.util.List<String> getShareOpenConversationIds() {
            return this.shareOpenConversationIds;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String anchorNickname; 
            private String anchorUnionId; 
            private String anchorUserId; 
            private Long liveEndTime; 
            private Long liveStartTime; 
            private String liveUuid; 
            private java.util.List<String> shareOpenConversationIds; 
            private String title; 

            /**
             * AnchorNickname.
             */
            public Builder anchorNickname(String anchorNickname) {
                this.anchorNickname = anchorNickname;
                return this;
            }

            /**
             * AnchorUnionId.
             */
            public Builder anchorUnionId(String anchorUnionId) {
                this.anchorUnionId = anchorUnionId;
                return this;
            }

            /**
             * AnchorUserId.
             */
            public Builder anchorUserId(String anchorUserId) {
                this.anchorUserId = anchorUserId;
                return this;
            }

            /**
             * LiveEndTime.
             */
            public Builder liveEndTime(Long liveEndTime) {
                this.liveEndTime = liveEndTime;
                return this;
            }

            /**
             * LiveStartTime.
             */
            public Builder liveStartTime(Long liveStartTime) {
                this.liveStartTime = liveStartTime;
                return this;
            }

            /**
             * LiveUuid.
             */
            public Builder liveUuid(String liveUuid) {
                this.liveUuid = liveUuid;
                return this;
            }

            /**
             * ShareOpenConversationIds.
             */
            public Builder shareOpenConversationIds(java.util.List<String> shareOpenConversationIds) {
                this.shareOpenConversationIds = shareOpenConversationIds;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public LiveList build() {
                return new LiveList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgLiveListResponseBody</p>
     */
    public static class NewLive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("LiveList")
        private java.util.List<LiveList> liveList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private NewLive(Builder builder) {
            this.hasMore = builder.hasMore;
            this.liveList = builder.liveList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewLive create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return liveList
         */
        public java.util.List<LiveList> getLiveList() {
            return this.liveList;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<LiveList> liveList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * LiveList.
             */
            public Builder liveList(java.util.List<LiveList> liveList) {
                this.liveList = liveList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public NewLive build() {
                return new NewLive(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgLiveListResponseBody</p>
     */
    public static class UpdateLiveLiveList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorNickname")
        private String anchorNickname;

        @com.aliyun.core.annotation.NameInMap("AnchorUnionId")
        private String anchorUnionId;

        @com.aliyun.core.annotation.NameInMap("AnchorUserId")
        private String anchorUserId;

        @com.aliyun.core.annotation.NameInMap("LiveEndTime")
        private Long liveEndTime;

        @com.aliyun.core.annotation.NameInMap("LiveStartTime")
        private Long liveStartTime;

        @com.aliyun.core.annotation.NameInMap("LiveUuid")
        private String liveUuid;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private UpdateLiveLiveList(Builder builder) {
            this.anchorNickname = builder.anchorNickname;
            this.anchorUnionId = builder.anchorUnionId;
            this.anchorUserId = builder.anchorUserId;
            this.liveEndTime = builder.liveEndTime;
            this.liveStartTime = builder.liveStartTime;
            this.liveUuid = builder.liveUuid;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateLiveLiveList create() {
            return builder().build();
        }

        /**
         * @return anchorNickname
         */
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        /**
         * @return anchorUnionId
         */
        public String getAnchorUnionId() {
            return this.anchorUnionId;
        }

        /**
         * @return anchorUserId
         */
        public String getAnchorUserId() {
            return this.anchorUserId;
        }

        /**
         * @return liveEndTime
         */
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        /**
         * @return liveStartTime
         */
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        /**
         * @return liveUuid
         */
        public String getLiveUuid() {
            return this.liveUuid;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String anchorNickname; 
            private String anchorUnionId; 
            private String anchorUserId; 
            private Long liveEndTime; 
            private Long liveStartTime; 
            private String liveUuid; 
            private String title; 

            /**
             * AnchorNickname.
             */
            public Builder anchorNickname(String anchorNickname) {
                this.anchorNickname = anchorNickname;
                return this;
            }

            /**
             * AnchorUnionId.
             */
            public Builder anchorUnionId(String anchorUnionId) {
                this.anchorUnionId = anchorUnionId;
                return this;
            }

            /**
             * AnchorUserId.
             */
            public Builder anchorUserId(String anchorUserId) {
                this.anchorUserId = anchorUserId;
                return this;
            }

            /**
             * LiveEndTime.
             */
            public Builder liveEndTime(Long liveEndTime) {
                this.liveEndTime = liveEndTime;
                return this;
            }

            /**
             * LiveStartTime.
             */
            public Builder liveStartTime(Long liveStartTime) {
                this.liveStartTime = liveStartTime;
                return this;
            }

            /**
             * LiveUuid.
             */
            public Builder liveUuid(String liveUuid) {
                this.liveUuid = liveUuid;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public UpdateLiveLiveList build() {
                return new UpdateLiveLiveList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgLiveListResponseBody</p>
     */
    public static class UpdateLive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("LiveList")
        private java.util.List<UpdateLiveLiveList> liveList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private UpdateLive(Builder builder) {
            this.hasMore = builder.hasMore;
            this.liveList = builder.liveList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateLive create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return liveList
         */
        public java.util.List<UpdateLiveLiveList> getLiveList() {
            return this.liveList;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<UpdateLiveLiveList> liveList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * LiveList.
             */
            public Builder liveList(java.util.List<UpdateLiveLiveList> liveList) {
                this.liveList = liveList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public UpdateLive build() {
                return new UpdateLive(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrgLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrgLiveListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewLive")
        private NewLive newLive;

        @com.aliyun.core.annotation.NameInMap("UpdateLive")
        private UpdateLive updateLive;

        private Result(Builder builder) {
            this.newLive = builder.newLive;
            this.updateLive = builder.updateLive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return newLive
         */
        public NewLive getNewLive() {
            return this.newLive;
        }

        /**
         * @return updateLive
         */
        public UpdateLive getUpdateLive() {
            return this.updateLive;
        }

        public static final class Builder {
            private NewLive newLive; 
            private UpdateLive updateLive; 

            /**
             * NewLive.
             */
            public Builder newLive(NewLive newLive) {
                this.newLive = newLive;
                return this;
            }

            /**
             * UpdateLive.
             */
            public Builder updateLive(UpdateLive updateLive) {
                this.updateLive = updateLive;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
