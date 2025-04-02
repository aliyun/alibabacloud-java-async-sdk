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
 * {@link CreateMeetingRoomRequest} extends {@link RequestModel}
 *
 * <p>CreateMeetingRoomRequest</p>
 */
public class CreateMeetingRoomRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCycleReservation")
    private Boolean enableCycleReservation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsvRoomId")
    private String isvRoomId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservationAuthority")
    private ReservationAuthority reservationAuthority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomCapacity")
    private Integer roomCapacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomLabelIds")
    private java.util.List<Long> roomLabelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomLocation")
    private RoomLocation roomLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomName")
    private String roomName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomPicture")
    private String roomPicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomStatus")
    private Integer roomStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private CreateMeetingRoomRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.enableCycleReservation = builder.enableCycleReservation;
        this.groupId = builder.groupId;
        this.isvRoomId = builder.isvRoomId;
        this.reservationAuthority = builder.reservationAuthority;
        this.roomCapacity = builder.roomCapacity;
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

    public static CreateMeetingRoomRequest create() {
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
     * @return roomLabelIds
     */
    public java.util.List<Long> getRoomLabelIds() {
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

    public static final class Builder extends Request.Builder<CreateMeetingRoomRequest, Builder> {
        private AccountContext accountContext; 
        private Boolean enableCycleReservation; 
        private Long groupId; 
        private String isvRoomId; 
        private ReservationAuthority reservationAuthority; 
        private Integer roomCapacity; 
        private java.util.List<Long> roomLabelIds; 
        private RoomLocation roomLocation; 
        private String roomName; 
        private String roomPicture; 
        private Integer roomStatus; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(CreateMeetingRoomRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.enableCycleReservation = request.enableCycleReservation;
            this.groupId = request.groupId;
            this.isvRoomId = request.isvRoomId;
            this.reservationAuthority = request.reservationAuthority;
            this.roomCapacity = request.roomCapacity;
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
         * RoomLabelIds.
         */
        public Builder roomLabelIds(java.util.List<Long> roomLabelIds) {
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
        public CreateMeetingRoomRequest build() {
            return new CreateMeetingRoomRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMeetingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateMeetingRoomRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
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
    /**
     * 
     * {@link CreateMeetingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateMeetingRoomRequest</p>
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
     * {@link CreateMeetingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateMeetingRoomRequest</p>
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
     * {@link CreateMeetingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateMeetingRoomRequest</p>
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
     * {@link CreateMeetingRoomRequest} extends {@link TeaModel}
     *
     * <p>CreateMeetingRoomRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
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

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

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
