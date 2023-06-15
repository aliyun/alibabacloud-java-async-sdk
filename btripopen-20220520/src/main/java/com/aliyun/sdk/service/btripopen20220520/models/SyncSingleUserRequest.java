// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncSingleUserRequest} extends {@link RequestModel}
 *
 * <p>SyncSingleUserRequest</p>
 */
public class SyncSingleUserRequest extends Request {
    @Body
    @NameInMap("email")
    private String email;

    @Body
    @NameInMap("job_no")
    private String jobNo;

    @Body
    @NameInMap("leave_status")
    private Integer leaveStatus;

    @Body
    @NameInMap("manager_user_id")
    private String managerUserId;

    @Body
    @NameInMap("phone")
    private String phone;

    @Body
    @NameInMap("position")
    private String position;

    @Body
    @NameInMap("position_level")
    private String positionLevel;

    @Body
    @NameInMap("real_name_en")
    private String realNameEn;

    @Body
    @NameInMap("third_depart_id_list")
    private java.util.List < String > thirdDepartIdList;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("user_name")
    @Validation(required = true)
    private String userName;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private SyncSingleUserRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.jobNo = builder.jobNo;
        this.leaveStatus = builder.leaveStatus;
        this.managerUserId = builder.managerUserId;
        this.phone = builder.phone;
        this.position = builder.position;
        this.positionLevel = builder.positionLevel;
        this.realNameEn = builder.realNameEn;
        this.thirdDepartIdList = builder.thirdDepartIdList;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncSingleUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return managerUserId
     */
    public String getManagerUserId() {
        return this.managerUserId;
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

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<SyncSingleUserRequest, Builder> {
        private String email; 
        private String jobNo; 
        private Integer leaveStatus; 
        private String managerUserId; 
        private String phone; 
        private String position; 
        private String positionLevel; 
        private String realNameEn; 
        private java.util.List < String > thirdDepartIdList; 
        private String userId; 
        private String userName; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(SyncSingleUserRequest request) {
            super(request);
            this.email = request.email;
            this.jobNo = request.jobNo;
            this.leaveStatus = request.leaveStatus;
            this.managerUserId = request.managerUserId;
            this.phone = request.phone;
            this.position = request.position;
            this.positionLevel = request.positionLevel;
            this.realNameEn = request.realNameEn;
            this.thirdDepartIdList = request.thirdDepartIdList;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * email.
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * job_no.
         */
        public Builder jobNo(String jobNo) {
            this.putBodyParameter("job_no", jobNo);
            this.jobNo = jobNo;
            return this;
        }

        /**
         * leave_status.
         */
        public Builder leaveStatus(Integer leaveStatus) {
            this.putBodyParameter("leave_status", leaveStatus);
            this.leaveStatus = leaveStatus;
            return this;
        }

        /**
         * manager_user_id.
         */
        public Builder managerUserId(String managerUserId) {
            this.putBodyParameter("manager_user_id", managerUserId);
            this.managerUserId = managerUserId;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * position.
         */
        public Builder position(String position) {
            this.putBodyParameter("position", position);
            this.position = position;
            return this;
        }

        /**
         * position_level.
         */
        public Builder positionLevel(String positionLevel) {
            this.putBodyParameter("position_level", positionLevel);
            this.positionLevel = positionLevel;
            return this;
        }

        /**
         * real_name_en.
         */
        public Builder realNameEn(String realNameEn) {
            this.putBodyParameter("real_name_en", realNameEn);
            this.realNameEn = realNameEn;
            return this;
        }

        /**
         * third_depart_id_list.
         */
        public Builder thirdDepartIdList(java.util.List < String > thirdDepartIdList) {
            String thirdDepartIdListShrink = shrink(thirdDepartIdList, "third_depart_id_list", "json");
            this.putBodyParameter("third_depart_id_list", thirdDepartIdListShrink);
            this.thirdDepartIdList = thirdDepartIdList;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
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
        public SyncSingleUserRequest build() {
            return new SyncSingleUserRequest(this);
        } 

    } 

}
