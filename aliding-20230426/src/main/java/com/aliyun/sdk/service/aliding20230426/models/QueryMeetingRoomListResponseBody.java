// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMeetingRoomListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMeetingRoomListResponseBody</p>
 */
public class QueryMeetingRoomListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private Long nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private QueryMeetingRoomListResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMeetingRoomListResponseBody create() {
        return builder().build();
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
    public Long getNextToken() {
        return this.nextToken;
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
        private Boolean hasMore; 
        private Long nextToken; 
        private String requestId; 
        private java.util.List < Result> result; 

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
        public Builder nextToken(Long nextToken) {
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

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public QueryMeetingRoomListResponseBody build() {
            return new QueryMeetingRoomListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMeetingRoomListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomListResponseBody</p>
     */
    public static class RoomGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private RoomGroup(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomGroup create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long groupId; 
            private String groupName; 
            private Long parentId; 

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public RoomGroup build() {
                return new RoomGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMeetingRoomListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomListResponseBody</p>
     */
    public static class RoomLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelId")
        private Long labelId;

        @com.aliyun.core.annotation.NameInMap("LabelName")
        private String labelName;

        private RoomLabels(Builder builder) {
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomLabels create() {
            return builder().build();
        }

        /**
         * @return labelId
         */
        public Long getLabelId() {
            return this.labelId;
        }

        /**
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        public static final class Builder {
            private Long labelId; 
            private String labelName; 

            /**
             * LabelId.
             */
            public Builder labelId(Long labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * LabelName.
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            public RoomLabels build() {
                return new RoomLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMeetingRoomListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomListResponseBody</p>
     */
    public static class RoomLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private RoomLocation(Builder builder) {
            this.desc = builder.desc;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomLocation create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String desc; 
            private String title; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RoomLocation build() {
                return new RoomLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMeetingRoomListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("IsvRoomId")
        private String isvRoomId;

        @com.aliyun.core.annotation.NameInMap("RoomCapacity")
        private Integer roomCapacity;

        @com.aliyun.core.annotation.NameInMap("RoomGroup")
        private RoomGroup roomGroup;

        @com.aliyun.core.annotation.NameInMap("RoomId")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("RoomLabels")
        private java.util.List < RoomLabels> roomLabels;

        @com.aliyun.core.annotation.NameInMap("RoomLocation")
        private RoomLocation roomLocation;

        @com.aliyun.core.annotation.NameInMap("RoomName")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("RoomPicture")
        private String roomPicture;

        @com.aliyun.core.annotation.NameInMap("RoomStaffId")
        private String roomStaffId;

        @com.aliyun.core.annotation.NameInMap("RoomStatus")
        private Integer roomStatus;

        private Result(Builder builder) {
            this.corpId = builder.corpId;
            this.isvRoomId = builder.isvRoomId;
            this.roomCapacity = builder.roomCapacity;
            this.roomGroup = builder.roomGroup;
            this.roomId = builder.roomId;
            this.roomLabels = builder.roomLabels;
            this.roomLocation = builder.roomLocation;
            this.roomName = builder.roomName;
            this.roomPicture = builder.roomPicture;
            this.roomStaffId = builder.roomStaffId;
            this.roomStatus = builder.roomStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return isvRoomId
         */
        public String getIsvRoomId() {
            return this.isvRoomId;
        }

        /**
         * @return roomCapacity
         */
        public Integer getRoomCapacity() {
            return this.roomCapacity;
        }

        /**
         * @return roomGroup
         */
        public RoomGroup getRoomGroup() {
            return this.roomGroup;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return roomLabels
         */
        public java.util.List < RoomLabels> getRoomLabels() {
            return this.roomLabels;
        }

        /**
         * @return roomLocation
         */
        public RoomLocation getRoomLocation() {
            return this.roomLocation;
        }

        /**
         * @return roomName
         */
        public String getRoomName() {
            return this.roomName;
        }

        /**
         * @return roomPicture
         */
        public String getRoomPicture() {
            return this.roomPicture;
        }

        /**
         * @return roomStaffId
         */
        public String getRoomStaffId() {
            return this.roomStaffId;
        }

        /**
         * @return roomStatus
         */
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

        public static final class Builder {
            private String corpId; 
            private String isvRoomId; 
            private Integer roomCapacity; 
            private RoomGroup roomGroup; 
            private String roomId; 
            private java.util.List < RoomLabels> roomLabels; 
            private RoomLocation roomLocation; 
            private String roomName; 
            private String roomPicture; 
            private String roomStaffId; 
            private Integer roomStatus; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * IsvRoomId.
             */
            public Builder isvRoomId(String isvRoomId) {
                this.isvRoomId = isvRoomId;
                return this;
            }

            /**
             * RoomCapacity.
             */
            public Builder roomCapacity(Integer roomCapacity) {
                this.roomCapacity = roomCapacity;
                return this;
            }

            /**
             * RoomGroup.
             */
            public Builder roomGroup(RoomGroup roomGroup) {
                this.roomGroup = roomGroup;
                return this;
            }

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * RoomLabels.
             */
            public Builder roomLabels(java.util.List < RoomLabels> roomLabels) {
                this.roomLabels = roomLabels;
                return this;
            }

            /**
             * RoomLocation.
             */
            public Builder roomLocation(RoomLocation roomLocation) {
                this.roomLocation = roomLocation;
                return this;
            }

            /**
             * RoomName.
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * RoomPicture.
             */
            public Builder roomPicture(String roomPicture) {
                this.roomPicture = roomPicture;
                return this;
            }

            /**
             * RoomStaffId.
             */
            public Builder roomStaffId(String roomStaffId) {
                this.roomStaffId = roomStaffId;
                return this;
            }

            /**
             * RoomStatus.
             */
            public Builder roomStatus(Integer roomStatus) {
                this.roomStatus = roomStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
