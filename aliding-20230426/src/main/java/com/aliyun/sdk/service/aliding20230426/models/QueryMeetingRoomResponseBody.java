// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMeetingRoomResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMeetingRoomResponseBody</p>
 */
public class QueryMeetingRoomResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
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
         * requestId
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

    public static class AuthorizedMembers extends TeaModel {
        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("MemberType")
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
    public static class ReservationAuthority extends TeaModel {
        @NameInMap("AuthorizedMembers")
        private java.util.List < AuthorizedMembers> authorizedMembers;

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
        public java.util.List < AuthorizedMembers> getAuthorizedMembers() {
            return this.authorizedMembers;
        }

        public static final class Builder {
            private java.util.List < AuthorizedMembers> authorizedMembers; 

            /**
             * AuthorizedMembers.
             */
            public Builder authorizedMembers(java.util.List < AuthorizedMembers> authorizedMembers) {
                this.authorizedMembers = authorizedMembers;
                return this;
            }

            public ReservationAuthority build() {
                return new ReservationAuthority(this);
            } 

        } 

    }
    public static class RoomGroup extends TeaModel {
        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ParentId")
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
    public static class RoomLabels extends TeaModel {
        @NameInMap("LabelId")
        private Long labelId;

        @NameInMap("LabelName")
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
    public static class RoomLocation extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Title")
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
    public static class Result extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DeviceUnionIds")
        private java.util.List < String > deviceUnionIds;

        @NameInMap("EnableCycleReservation")
        private Boolean enableCycleReservation;

        @NameInMap("IsvRoomId")
        private String isvRoomId;

        @NameInMap("ReservationAuthority")
        private ReservationAuthority reservationAuthority;

        @NameInMap("RoomCapacity")
        private Integer roomCapacity;

        @NameInMap("RoomGroup")
        private RoomGroup roomGroup;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("RoomLabels")
        private java.util.List < RoomLabels> roomLabels;

        @NameInMap("RoomLocation")
        private RoomLocation roomLocation;

        @NameInMap("RoomName")
        private String roomName;

        @NameInMap("RoomPicture")
        private String roomPicture;

        @NameInMap("RoomStaffId")
        private String roomStaffId;

        @NameInMap("RoomStatus")
        private Integer roomStatus;

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
        public java.util.List < String > getDeviceUnionIds() {
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
            private java.util.List < String > deviceUnionIds; 
            private Boolean enableCycleReservation; 
            private String isvRoomId; 
            private ReservationAuthority reservationAuthority; 
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
             * DeviceUnionIds.
             */
            public Builder deviceUnionIds(java.util.List < String > deviceUnionIds) {
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
