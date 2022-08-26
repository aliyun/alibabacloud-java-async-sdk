// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvUserSaveRequest} extends {@link RequestModel}
 *
 * <p>IsvUserSaveRequest</p>
 */
public class IsvUserSaveRequest extends Request {
    @Body
    @NameInMap("user_list")
    private java.util.List < UserList> userList;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private IsvUserSaveRequest(Builder builder) {
        super(builder);
        this.userList = builder.userList;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsvUserSaveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userList
     */
    public java.util.List < UserList> getUserList() {
        return this.userList;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<IsvUserSaveRequest, Builder> {
        private java.util.List < UserList> userList; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IsvUserSaveRequest request) {
            super(request);
            this.userList = request.userList;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * user_list.
         */
        public Builder userList(java.util.List < UserList> userList) {
            String userListShrink = shrink(userList, "user_list", "json");
            this.putBodyParameter("user_list", userListShrink);
            this.userList = userList;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public IsvUserSaveRequest build() {
            return new IsvUserSaveRequest(this);
        } 

    } 

    public static class UserList extends TeaModel {
        @NameInMap("depart_id")
        private Long departId;

        @NameInMap("email")
        private String email;

        @NameInMap("job_no")
        private String jobNo;

        @NameInMap("leave_status")
        private Integer leaveStatus;

        @NameInMap("phone")
        private String phone;

        @NameInMap("position")
        private String position;

        @NameInMap("position_level")
        private String positionLevel;

        @NameInMap("real_name_en")
        private String realNameEn;

        @NameInMap("third_depart_id")
        private String thirdDepartId;

        @NameInMap("third_depart_id_list")
        private java.util.List < String > thirdDepartIdList;

        @NameInMap("user_id")
        @Validation(required = true)
        private String userId;

        @NameInMap("user_name")
        @Validation(required = true)
        private String userName;

        private UserList(Builder builder) {
            this.departId = builder.departId;
            this.email = builder.email;
            this.jobNo = builder.jobNo;
            this.leaveStatus = builder.leaveStatus;
            this.phone = builder.phone;
            this.position = builder.position;
            this.positionLevel = builder.positionLevel;
            this.realNameEn = builder.realNameEn;
            this.thirdDepartId = builder.thirdDepartId;
            this.thirdDepartIdList = builder.thirdDepartIdList;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return departId
         */
        public Long getDepartId() {
            return this.departId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return leaveStatus
         */
        public Integer getLeaveStatus() {
            return this.leaveStatus;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return positionLevel
         */
        public String getPositionLevel() {
            return this.positionLevel;
        }

        /**
         * @return realNameEn
         */
        public String getRealNameEn() {
            return this.realNameEn;
        }

        /**
         * @return thirdDepartId
         */
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        /**
         * @return thirdDepartIdList
         */
        public java.util.List < String > getThirdDepartIdList() {
            return this.thirdDepartIdList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long departId; 
            private String email; 
            private String jobNo; 
            private Integer leaveStatus; 
            private String phone; 
            private String position; 
            private String positionLevel; 
            private String realNameEn; 
            private String thirdDepartId; 
            private java.util.List < String > thirdDepartIdList; 
            private String userId; 
            private String userName; 

            /**
             * depart_id.
             */
            public Builder departId(Long departId) {
                this.departId = departId;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * leave_status.
             */
            public Builder leaveStatus(Integer leaveStatus) {
                this.leaveStatus = leaveStatus;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * position_level.
             */
            public Builder positionLevel(String positionLevel) {
                this.positionLevel = positionLevel;
                return this;
            }

            /**
             * real_name_en.
             */
            public Builder realNameEn(String realNameEn) {
                this.realNameEn = realNameEn;
                return this;
            }

            /**
             * third_depart_id.
             */
            public Builder thirdDepartId(String thirdDepartId) {
                this.thirdDepartId = thirdDepartId;
                return this;
            }

            /**
             * third_depart_id_list.
             */
            public Builder thirdDepartIdList(java.util.List < String > thirdDepartIdList) {
                this.thirdDepartIdList = thirdDepartIdList;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
