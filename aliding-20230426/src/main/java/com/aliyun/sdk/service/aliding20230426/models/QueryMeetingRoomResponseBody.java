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
 * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMeetingRoomResponseBody</p>
 */
public class QueryMeetingRoomResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryMeetingRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMeetingRoomResponseBody create() {
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

        private Builder() {
        } 

        private Builder(QueryMeetingRoomResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
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

        public QueryMeetingRoomResponseBody build() {
            return new QueryMeetingRoomResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
     */
    public static class AuthorizedMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        private AuthorizedMembers(Builder builder) {
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.memberType = builder.memberType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedMembers create() {
            return builder().build();
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        public static final class Builder {
            private String memberId; 
            private String memberName; 
            private String memberType; 

            private Builder() {
            } 

            private Builder(AuthorizedMembers model) {
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.memberType = model.memberType;
            } 

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * MemberType.
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            public AuthorizedMembers build() {
                return new AuthorizedMembers(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
     */
    public static class ReservationAuthority extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedMembers")
        private java.util.List<AuthorizedMembers> authorizedMembers;

        private ReservationAuthority(Builder builder) {
            this.authorizedMembers = builder.authorizedMembers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservationAuthority create() {
            return builder().build();
        }

        /**
         * @return authorizedMembers
         */
        public java.util.List<AuthorizedMembers> getAuthorizedMembers() {
            return this.authorizedMembers;
        }

        public static final class Builder {
            private java.util.List<AuthorizedMembers> authorizedMembers; 

            private Builder() {
            } 

            private Builder(ReservationAuthority model) {
                this.authorizedMembers = model.authorizedMembers;
            } 

            /**
             * AuthorizedMembers.
             */
            public Builder authorizedMembers(java.util.List<AuthorizedMembers> authorizedMembers) {
                this.authorizedMembers = authorizedMembers;
                return this;
            }

            public ReservationAuthority build() {
                return new ReservationAuthority(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RoomGroup model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.parentId = model.parentId;
            } 

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
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RoomLabels model) {
                this.labelId = model.labelId;
                this.labelName = model.labelName;
            } 

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
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RoomLocation model) {
                this.desc = model.desc;
                this.title = model.title;
            } 

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
     * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMeetingRoomResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("DeviceUnionIds")
        private java.util.List<String> deviceUnionIds;

        @com.aliyun.core.annotation.NameInMap("EnableCycleReservation")
        private Boolean enableCycleReservation;

        @com.aliyun.core.annotation.NameInMap("IsvRoomId")
        private String isvRoomId;

        @com.aliyun.core.annotation.NameInMap("ReservationAuthority")
        private ReservationAuthority reservationAuthority;

        @com.aliyun.core.annotation.NameInMap("RoomCapacity")
        private Integer roomCapacity;

        @com.aliyun.core.annotation.NameInMap("RoomGroup")
        private RoomGroup roomGroup;

        @com.aliyun.core.annotation.NameInMap("RoomId")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("RoomLabels")
        private java.util.List<RoomLabels> roomLabels;

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

        @com.aliyun.core.annotation.NameInMap("RoomUnionId")
        private String roomUnionId;

        private Result(Builder builder) {
            this.corpId = builder.corpId;
            this.deviceUnionIds = builder.deviceUnionIds;
            this.enableCycleReservation = builder.enableCycleReservation;
            this.isvRoomId = builder.isvRoomId;
            this.reservationAuthority = builder.reservationAuthority;
            this.roomCapacity = builder.roomCapacity;
            this.roomGroup = builder.roomGroup;
            this.roomId = builder.roomId;
            this.roomLabels = builder.roomLabels;
            this.roomLocation = builder.roomLocation;
            this.roomName = builder.roomName;
            this.roomPicture = builder.roomPicture;
            this.roomStaffId = builder.roomStaffId;
            this.roomStatus = builder.roomStatus;
            this.roomUnionId = builder.roomUnionId;
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
         * @return deviceUnionIds
         */
        public java.util.List<String> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

        /**
         * @return enableCycleReservation
         */
        public Boolean getEnableCycleReservation() {
            return this.enableCycleReservation;
        }

        /**
         * @return isvRoomId
         */
        public String getIsvRoomId() {
            return this.isvRoomId;
        }

        /**
         * @return reservationAuthority
         */
        public ReservationAuthority getReservationAuthority() {
            return this.reservationAuthority;
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
        public java.util.List<RoomLabels> getRoomLabels() {
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

        /**
         * @return roomUnionId
         */
        public String getRoomUnionId() {
            return this.roomUnionId;
        }

        public static final class Builder {
            private String corpId; 
            private java.util.List<String> deviceUnionIds; 
            private Boolean enableCycleReservation; 
            private String isvRoomId; 
            private ReservationAuthority reservationAuthority; 
            private Integer roomCapacity; 
            private RoomGroup roomGroup; 
            private String roomId; 
            private java.util.List<RoomLabels> roomLabels; 
            private RoomLocation roomLocation; 
            private String roomName; 
            private String roomPicture; 
            private String roomStaffId; 
            private Integer roomStatus; 
            private String roomUnionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.corpId = model.corpId;
                this.deviceUnionIds = model.deviceUnionIds;
                this.enableCycleReservation = model.enableCycleReservation;
                this.isvRoomId = model.isvRoomId;
                this.reservationAuthority = model.reservationAuthority;
                this.roomCapacity = model.roomCapacity;
                this.roomGroup = model.roomGroup;
                this.roomId = model.roomId;
                this.roomLabels = model.roomLabels;
                this.roomLocation = model.roomLocation;
                this.roomName = model.roomName;
                this.roomPicture = model.roomPicture;
                this.roomStaffId = model.roomStaffId;
                this.roomStatus = model.roomStatus;
                this.roomUnionId = model.roomUnionId;
            } 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DeviceUnionIds.
             */
            public Builder deviceUnionIds(java.util.List<String> deviceUnionIds) {
                this.deviceUnionIds = deviceUnionIds;
                return this;
            }

            /**
             * EnableCycleReservation.
             */
            public Builder enableCycleReservation(Boolean enableCycleReservation) {
                this.enableCycleReservation = enableCycleReservation;
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
             * ReservationAuthority.
             */
            public Builder reservationAuthority(ReservationAuthority reservationAuthority) {
                this.reservationAuthority = reservationAuthority;
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
            public Builder roomLabels(java.util.List<RoomLabels> roomLabels) {
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

            /**
             * RoomUnionId.
             */
            public Builder roomUnionId(String roomUnionId) {
                this.roomUnionId = roomUnionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
