// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupUserSaveRequest} extends {@link RequestModel}
 *
 * <p>GroupUserSaveRequest</p>
 */
public class GroupUserSaveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("base_city_code")
    private String baseCityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("birthday")
    private String birthday;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cert_list")
    private java.util.List < CertList> certList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("job_no")
    private String jobNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("real_name_en")
    private String realNameEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sub_corp_id_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SubCorpIdList> subCorpIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private GroupUserSaveRequest(Builder builder) {
        super(builder);
        this.baseCityCode = builder.baseCityCode;
        this.birthday = builder.birthday;
        this.certList = builder.certList;
        this.gender = builder.gender;
        this.jobNo = builder.jobNo;
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
     * @return baseCityCode
     */
    public String getBaseCityCode() {
        return this.baseCityCode;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * @return certList
     */
    public java.util.List < CertList> getCertList() {
        return this.certList;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return jobNo
     */
    public String getJobNo() {
        return this.jobNo;
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
        private String baseCityCode; 
        private String birthday; 
        private java.util.List < CertList> certList; 
        private String gender; 
        private String jobNo; 
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
            this.baseCityCode = request.baseCityCode;
            this.birthday = request.birthday;
            this.certList = request.certList;
            this.gender = request.gender;
            this.jobNo = request.jobNo;
            this.phone = request.phone;
            this.realNameEn = request.realNameEn;
            this.subCorpIdList = request.subCorpIdList;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * base_city_code.
         */
        public Builder baseCityCode(String baseCityCode) {
            this.putBodyParameter("base_city_code", baseCityCode);
            this.baseCityCode = baseCityCode;
            return this;
        }

        /**
         * birthday.
         */
        public Builder birthday(String birthday) {
            this.putBodyParameter("birthday", birthday);
            this.birthday = birthday;
            return this;
        }

        /**
         * cert_list.
         */
        public Builder certList(java.util.List < CertList> certList) {
            String certListShrink = shrink(certList, "cert_list", "json");
            this.putBodyParameter("cert_list", certListShrink);
            this.certList = certList;
            return this;
        }

        /**
         * gender.
         */
        public Builder gender(String gender) {
            this.putBodyParameter("gender", gender);
            this.gender = gender;
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
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
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
         * sub_corp_id_list.
         */
        public Builder subCorpIdList(java.util.List < SubCorpIdList> subCorpIdList) {
            String subCorpIdListShrink = shrink(subCorpIdList, "sub_corp_id_list", "json");
            this.putBodyParameter("sub_corp_id_list", subCorpIdListShrink);
            this.subCorpIdList = subCorpIdList;
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

    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_expired_time")
        private String certExpiredTime;

        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        private CertList(Builder builder) {
            this.certExpiredTime = builder.certExpiredTime;
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.nationality = builder.nationality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return certExpiredTime
         */
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        /**
         * @return certNation
         */
        public String getCertNation() {
            return this.certNation;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        public static final class Builder {
            private String certExpiredTime; 
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String nationality; 

            /**
             * cert_expired_time.
             */
            public Builder certExpiredTime(String certExpiredTime) {
                this.certExpiredTime = certExpiredTime;
                return this;
            }

            /**
             * cert_nation.
             */
            public Builder certNation(String certNation) {
                this.certNation = certNation;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
    public static class SubCorpIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("depart_ids")
        private java.util.List < String > departIds;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("leave_status")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer leaveStatus;

        @com.aliyun.core.annotation.NameInMap("manager_user_id")
        private String managerUserId;

        @com.aliyun.core.annotation.NameInMap("position_level")
        private String positionLevel;

        @com.aliyun.core.annotation.NameInMap("sub_corp_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String subCorpId;

        private SubCorpIdList(Builder builder) {
            this.departIds = builder.departIds;
            this.email = builder.email;
            this.leaveStatus = builder.leaveStatus;
            this.managerUserId = builder.managerUserId;
            this.positionLevel = builder.positionLevel;
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
         * @return email
         */
        public String getEmail() {
            return this.email;
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
         * @return positionLevel
         */
        public String getPositionLevel() {
            return this.positionLevel;
        }

        /**
         * @return subCorpId
         */
        public String getSubCorpId() {
            return this.subCorpId;
        }

        public static final class Builder {
            private java.util.List < String > departIds; 
            private String email; 
            private Integer leaveStatus; 
            private String managerUserId; 
            private String positionLevel; 
            private String subCorpId; 

            /**
             * depart_ids.
             */
            public Builder departIds(java.util.List < String > departIds) {
                this.departIds = departIds;
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
             * leave_status.
             */
            public Builder leaveStatus(Integer leaveStatus) {
                this.leaveStatus = leaveStatus;
                return this;
            }

            /**
             * manager_user_id.
             */
            public Builder managerUserId(String managerUserId) {
                this.managerUserId = managerUserId;
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
             * sub_corp_id.
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
