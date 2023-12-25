// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMeetingRoomRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeetingRoomRequest</p>
 */
public class UpdateMeetingRoomRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("EnableCycleReservation")
    private Boolean enableCycleReservation;

    @Body
    @NameInMap("GroupId")
    private Long groupId;

    @Body
    @NameInMap("IsvRoomId")
    private String isvRoomId;

    @Body
    @NameInMap("ReservationAuthority")
    private ReservationAuthority reservationAuthority;

    @Body
    @NameInMap("RoomCapacity")
    private Integer roomCapacity;

    @Body
    @NameInMap("RoomId")
    private String roomId;

    @Body
    @NameInMap("RoomLabelIds")
    private java.util.List < Long > roomLabelIds;

    @Body
    @NameInMap("RoomLocation")
    private RoomLocation roomLocation;

    @Body
    @NameInMap("RoomName")
    private String roomName;

    @Body
    @NameInMap("RoomPicture")
    private String roomPicture;

    @Body
    @NameInMap("RoomStatus")
    private Integer roomStatus;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private UpdateMeetingRoomRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.enableCycleReservation = builder.enableCycleReservation;
        this.groupId = builder.groupId;
        this.isvRoomId = builder.isvRoomId;
        this.reservationAuthority = builder.reservationAuthority;
        this.roomCapacity = builder.roomCapacity;
        this.roomId = builder.roomId;
        this.roomLabelIds = builder.roomLabelIds;
        this.roomLocation = builder.roomLocation;
        this.roomName = builder.roomName;
        this.roomPicture = builder.roomPicture;
        this.roomStatus = builder.roomStatus;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMeetingRoomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return enableCycleReservation
     */
    public Boolean getEnableCycleReservation() {
        return this.enableCycleReservation;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomLabelIds
     */
    public java.util.List < Long > getRoomLabelIds() {
        return this.roomLabelIds;
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
     * @return roomStatus
     */
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<UpdateMeetingRoomRequest, Builder> {
        private AccountContext accountContext; 
        private Boolean enableCycleReservation; 
        private Long groupId; 
        private String isvRoomId; 
        private ReservationAuthority reservationAuthority; 
        private Integer roomCapacity; 
        private String roomId; 
        private java.util.List < Long > roomLabelIds; 
        private RoomLocation roomLocation; 
        private String roomName; 
        private String roomPicture; 
        private Integer roomStatus; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMeetingRoomRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.enableCycleReservation = request.enableCycleReservation;
            this.groupId = request.groupId;
            this.isvRoomId = request.isvRoomId;
            this.reservationAuthority = request.reservationAuthority;
            this.roomCapacity = request.roomCapacity;
            this.roomId = request.roomId;
            this.roomLabelIds = request.roomLabelIds;
            this.roomLocation = request.roomLocation;
            this.roomName = request.roomName;
            this.roomPicture = request.roomPicture;
            this.roomStatus = request.roomStatus;
            this.tenantContext = request.tenantContext;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * EnableCycleReservation.
         */
        public Builder enableCycleReservation(Boolean enableCycleReservation) {
            this.putBodyParameter("EnableCycleReservation", enableCycleReservation);
            this.enableCycleReservation = enableCycleReservation;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IsvRoomId.
         */
        public Builder isvRoomId(String isvRoomId) {
            this.putBodyParameter("IsvRoomId", isvRoomId);
            this.isvRoomId = isvRoomId;
            return this;
        }

        /**
         * ReservationAuthority.
         */
        public Builder reservationAuthority(ReservationAuthority reservationAuthority) {
            String reservationAuthorityShrink = shrink(reservationAuthority, "ReservationAuthority", "json");
            this.putBodyParameter("ReservationAuthority", reservationAuthorityShrink);
            this.reservationAuthority = reservationAuthority;
            return this;
        }

        /**
         * RoomCapacity.
         */
        public Builder roomCapacity(Integer roomCapacity) {
            this.putBodyParameter("RoomCapacity", roomCapacity);
            this.roomCapacity = roomCapacity;
            return this;
        }

        /**
         * RoomId.
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * RoomLabelIds.
         */
        public Builder roomLabelIds(java.util.List < Long > roomLabelIds) {
            String roomLabelIdsShrink = shrink(roomLabelIds, "RoomLabelIds", "json");
            this.putBodyParameter("RoomLabelIds", roomLabelIdsShrink);
            this.roomLabelIds = roomLabelIds;
            return this;
        }

        /**
         * RoomLocation.
         */
        public Builder roomLocation(RoomLocation roomLocation) {
            String roomLocationShrink = shrink(roomLocation, "RoomLocation", "json");
            this.putBodyParameter("RoomLocation", roomLocationShrink);
            this.roomLocation = roomLocation;
            return this;
        }

        /**
         * RoomName.
         */
        public Builder roomName(String roomName) {
            this.putBodyParameter("RoomName", roomName);
            this.roomName = roomName;
            return this;
        }

        /**
         * RoomPicture.
         */
        public Builder roomPicture(String roomPicture) {
            this.putBodyParameter("RoomPicture", roomPicture);
            this.roomPicture = roomPicture;
            return this;
        }

        /**
         * RoomStatus.
         */
        public Builder roomStatus(Integer roomStatus) {
            this.putBodyParameter("RoomStatus", roomStatus);
            this.roomStatus = roomStatus;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        @Override
        public UpdateMeetingRoomRequest build() {
            return new UpdateMeetingRoomRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

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
    public static class TenantContext extends TeaModel {
        @NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}
