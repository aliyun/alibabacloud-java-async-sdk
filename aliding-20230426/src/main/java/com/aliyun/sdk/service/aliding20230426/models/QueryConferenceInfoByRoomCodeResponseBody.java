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
 * {@link QueryConferenceInfoByRoomCodeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConferenceInfoByRoomCodeResponseBody</p>
 */
public class QueryConferenceInfoByRoomCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conferenceList")
    private java.util.List<ConferenceList> conferenceList;

    @com.aliyun.core.annotation.NameInMap("dingtalkRequestId")
    private String dingtalkRequestId;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryConferenceInfoByRoomCodeResponseBody(Builder builder) {
        this.conferenceList = builder.conferenceList;
        this.dingtalkRequestId = builder.dingtalkRequestId;
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConferenceInfoByRoomCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return conferenceList
     */
    public java.util.List<ConferenceList> getConferenceList() {
        return this.conferenceList;
    }

    /**
     * @return dingtalkRequestId
     */
    public String getDingtalkRequestId() {
        return this.dingtalkRequestId;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
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
        private java.util.List<ConferenceList> conferenceList; 
        private String dingtalkRequestId; 
        private Boolean hasMore; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * conferenceList.
         */
        public Builder conferenceList(java.util.List<ConferenceList> conferenceList) {
            this.conferenceList = conferenceList;
            return this;
        }

        /**
         * dingtalkRequestId.
         */
        public Builder dingtalkRequestId(String dingtalkRequestId) {
            this.dingtalkRequestId = dingtalkRequestId;
            return this;
        }

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        public QueryConferenceInfoByRoomCodeResponseBody build() {
            return new QueryConferenceInfoByRoomCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConferenceInfoByRoomCodeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConferenceInfoByRoomCodeResponseBody</p>
     */
    public static class ConferenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("ConfDuration")
        private Long confDuration;

        @com.aliyun.core.annotation.NameInMap("ConferenceId")
        private String conferenceId;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNick")
        private String creatorNick;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExternalLinkUrl")
        private String externalLinkUrl;

        @com.aliyun.core.annotation.NameInMap("RoomCode")
        private String roomCode;

        @com.aliyun.core.annotation.NameInMap("ScheduleConferenceId")
        private String scheduleConferenceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ConferenceList(Builder builder) {
            this.bizType = builder.bizType;
            this.confDuration = builder.confDuration;
            this.conferenceId = builder.conferenceId;
            this.creatorId = builder.creatorId;
            this.creatorNick = builder.creatorNick;
            this.endTime = builder.endTime;
            this.externalLinkUrl = builder.externalLinkUrl;
            this.roomCode = builder.roomCode;
            this.scheduleConferenceId = builder.scheduleConferenceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConferenceList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return confDuration
         */
        public Long getConfDuration() {
            return this.confDuration;
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNick
         */
        public String getCreatorNick() {
            return this.creatorNick;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return externalLinkUrl
         */
        public String getExternalLinkUrl() {
            return this.externalLinkUrl;
        }

        /**
         * @return roomCode
         */
        public String getRoomCode() {
            return this.roomCode;
        }

        /**
         * @return scheduleConferenceId
         */
        public String getScheduleConferenceId() {
            return this.scheduleConferenceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String bizType; 
            private Long confDuration; 
            private String conferenceId; 
            private String creatorId; 
            private String creatorNick; 
            private Long endTime; 
            private String externalLinkUrl; 
            private String roomCode; 
            private String scheduleConferenceId; 
            private Long startTime; 
            private Integer status; 
            private String title; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * ConfDuration.
             */
            public Builder confDuration(Long confDuration) {
                this.confDuration = confDuration;
                return this;
            }

            /**
             * ConferenceId.
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorNick.
             */
            public Builder creatorNick(String creatorNick) {
                this.creatorNick = creatorNick;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExternalLinkUrl.
             */
            public Builder externalLinkUrl(String externalLinkUrl) {
                this.externalLinkUrl = externalLinkUrl;
                return this;
            }

            /**
             * RoomCode.
             */
            public Builder roomCode(String roomCode) {
                this.roomCode = roomCode;
                return this;
            }

            /**
             * ScheduleConferenceId.
             */
            public Builder scheduleConferenceId(String scheduleConferenceId) {
                this.scheduleConferenceId = scheduleConferenceId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ConferenceList build() {
                return new ConferenceList(this);
            } 

        } 

    }
}
