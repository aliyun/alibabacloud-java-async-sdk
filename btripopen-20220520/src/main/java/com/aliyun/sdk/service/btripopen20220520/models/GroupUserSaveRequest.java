// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupUserSaveRequest} extends {@link RequestModel}
 *
 * <p>GroupUserSaveRequest</p>
 */
public class GroupUserSaveRequest extends Request {
    @Body
    @NameInMap("job_no")
    private String jobNo;

    @Body
    @NameInMap("leave_status")
    @Validation(required = true)
    private Integer leaveStatus;

    @Body
    @NameInMap("phone")
    private String phone;

    @Body
    @NameInMap("real_name_en")
    private String realNameEn;

    @Body
    @NameInMap("sub_corp_id_list")
    @Validation(required = true)
    private java.util.List < SubCorpIdList> subCorpIdList;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("user_name")
    @Validation(required = true)
    private String userName;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private GroupUserSaveRequest(Builder builder) {
        super(builder);
        this.jobNo = builder.jobNo;
        this.leaveStatus = builder.leaveStatus;
        this.phone = builder.phone;
        this.realNameEn = builder.realNameEn;
        this.subCorpIdList = builder.subCorpIdList;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupUserSaveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return realNameEn
     */
    public String getRealNameEn() {
        return this.realNameEn;
    }

    /**
     * @return subCorpIdList
     */
    public java.util.List < SubCorpIdList> getSubCorpIdList() {
        return this.subCorpIdList;
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<GroupUserSaveRequest, Builder> {
        private String jobNo; 
        private Integer leaveStatus; 
        private String phone; 
        private String realNameEn; 
        private java.util.List < SubCorpIdList> subCorpIdList; 
        private String userId; 
        private String userName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(GroupUserSaveRequest request) {
            super(request);
            this.jobNo = request.jobNo;
            this.leaveStatus = request.leaveStatus;
            this.phone = request.phone;
            this.realNameEn = request.realNameEn;
            this.subCorpIdList = request.subCorpIdList;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 工号
         */
        public Builder jobNo(String jobNo) {
            this.putBodyParameter("job_no", jobNo);
            this.jobNo = jobNo;
            return this;
        }

        /**
         * 离职状态（0 在职 1 离职）
         */
        public Builder leaveStatus(Integer leaveStatus) {
            this.putBodyParameter("leave_status", leaveStatus);
            this.leaveStatus = leaveStatus;
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
         * 员工名称EN
         */
        public Builder realNameEn(String realNameEn) {
            this.putBodyParameter("real_name_en", realNameEn);
            this.realNameEn = realNameEn;
            return this;
        }

        /**
         * 归属企业列表
         */
        public Builder subCorpIdList(java.util.List < SubCorpIdList> subCorpIdList) {
            String subCorpIdListShrink = shrink(subCorpIdList, "sub_corp_id_list", "json");
            this.putBodyParameter("sub_corp_id_list", subCorpIdListShrink);
            this.subCorpIdList = subCorpIdList;
            return this;
        }

        /**
         * 员工ID
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 员工名称
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public GroupUserSaveRequest build() {
            return new GroupUserSaveRequest(this);
        } 

    } 

    public static class SubCorpIdList extends TeaModel {
        @NameInMap("depart_ids")
        @Validation(required = true)
        private java.util.List < String > departIds;

        @NameInMap("manager_user_id")
        private String managerUserId;

        @NameInMap("sub_corp_id")
        @Validation(required = true)
        private String subCorpId;

        private SubCorpIdList(Builder builder) {
            this.departIds = builder.departIds;
            this.managerUserId = builder.managerUserId;
            this.subCorpId = builder.subCorpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCorpIdList create() {
            return builder().build();
        }

        /**
         * @return departIds
         */
        public java.util.List < String > getDepartIds() {
            return this.departIds;
        }

        /**
         * @return managerUserId
         */
        public String getManagerUserId() {
            return this.managerUserId;
        }

        /**
         * @return subCorpId
         */
        public String getSubCorpId() {
            return this.subCorpId;
        }

        public static final class Builder {
            private java.util.List < String > departIds; 
            private String managerUserId; 
            private String subCorpId; 

            /**
             * 部门Id集合
             */
            public Builder departIds(java.util.List < String > departIds) {
                this.departIds = departIds;
                return this;
            }

            /**
             * 直属主管id
             */
            public Builder managerUserId(String managerUserId) {
                this.managerUserId = managerUserId;
                return this;
            }

            /**
             * 子企业ID
             */
            public Builder subCorpId(String subCorpId) {
                this.subCorpId = subCorpId;
                return this;
            }

            public SubCorpIdList build() {
                return new SubCorpIdList(this);
            } 

        } 

    }
}
