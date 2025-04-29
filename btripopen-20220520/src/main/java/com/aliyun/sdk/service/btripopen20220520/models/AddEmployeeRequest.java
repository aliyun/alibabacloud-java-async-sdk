// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AddEmployeeRequest} extends {@link RequestModel}
 *
 * <p>AddEmployeeRequest</p>
 */
public class AddEmployeeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attribute")
    private String attribute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("base_city_code_list")
    private java.util.List<String> baseCityCodeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("base_location_list")
    private java.util.List<BaseLocationList> baseLocationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("birthday")
    private String birthday;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cert_list")
    private java.util.List<CertList> certList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_role_code_list")
    private java.util.List<String> customRoleCodeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_admin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_boss")
    private Boolean isBoss;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_dept_leader")
    private Boolean isDeptLeader;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("job_no")
    private String jobNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manager_user_id")
    private String managerUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_dept_id_list")
    private java.util.List<String> outDeptIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("position_level")
    private String positionLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("real_name")
    private String realName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("real_name_en")
    private String realNameEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("union_id")
    private String unionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_nick")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userNick;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private AddEmployeeRequest(Builder builder) {
        super(builder);
        this.attribute = builder.attribute;
        this.avatar = builder.avatar;
        this.baseCityCodeList = builder.baseCityCodeList;
        this.baseLocationList = builder.baseLocationList;
        this.birthday = builder.birthday;
        this.certList = builder.certList;
        this.customRoleCodeList = builder.customRoleCodeList;
        this.email = builder.email;
        this.gender = builder.gender;
        this.isAdmin = builder.isAdmin;
        this.isBoss = builder.isBoss;
        this.isDeptLeader = builder.isDeptLeader;
        this.jobNo = builder.jobNo;
        this.managerUserId = builder.managerUserId;
        this.outDeptIdList = builder.outDeptIdList;
        this.phone = builder.phone;
        this.positionLevel = builder.positionLevel;
        this.realName = builder.realName;
        this.realNameEn = builder.realNameEn;
        this.unionId = builder.unionId;
        this.userId = builder.userId;
        this.userNick = builder.userNick;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEmployeeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attribute
     */
    public String getAttribute() {
        return this.attribute;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return baseCityCodeList
     */
    public java.util.List<String> getBaseCityCodeList() {
        return this.baseCityCodeList;
    }

    /**
     * @return baseLocationList
     */
    public java.util.List<BaseLocationList> getBaseLocationList() {
        return this.baseLocationList;
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
    public java.util.List<CertList> getCertList() {
        return this.certList;
    }

    /**
     * @return customRoleCodeList
     */
    public java.util.List<String> getCustomRoleCodeList() {
        return this.customRoleCodeList;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return isBoss
     */
    public Boolean getIsBoss() {
        return this.isBoss;
    }

    /**
     * @return isDeptLeader
     */
    public Boolean getIsDeptLeader() {
        return this.isDeptLeader;
    }

    /**
     * @return jobNo
     */
    public String getJobNo() {
        return this.jobNo;
    }

    /**
     * @return managerUserId
     */
    public String getManagerUserId() {
        return this.managerUserId;
    }

    /**
     * @return outDeptIdList
     */
    public java.util.List<String> getOutDeptIdList() {
        return this.outDeptIdList;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return positionLevel
     */
    public String getPositionLevel() {
        return this.positionLevel;
    }

    /**
     * @return realName
     */
    public String getRealName() {
        return this.realName;
    }

    /**
     * @return realNameEn
     */
    public String getRealNameEn() {
        return this.realNameEn;
    }

    /**
     * @return unionId
     */
    public String getUnionId() {
        return this.unionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<AddEmployeeRequest, Builder> {
        private String attribute; 
        private String avatar; 
        private java.util.List<String> baseCityCodeList; 
        private java.util.List<BaseLocationList> baseLocationList; 
        private String birthday; 
        private java.util.List<CertList> certList; 
        private java.util.List<String> customRoleCodeList; 
        private String email; 
        private String gender; 
        private Boolean isAdmin; 
        private Boolean isBoss; 
        private Boolean isDeptLeader; 
        private String jobNo; 
        private String managerUserId; 
        private java.util.List<String> outDeptIdList; 
        private String phone; 
        private String positionLevel; 
        private String realName; 
        private String realNameEn; 
        private String unionId; 
        private String userId; 
        private String userNick; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AddEmployeeRequest request) {
            super(request);
            this.attribute = request.attribute;
            this.avatar = request.avatar;
            this.baseCityCodeList = request.baseCityCodeList;
            this.baseLocationList = request.baseLocationList;
            this.birthday = request.birthday;
            this.certList = request.certList;
            this.customRoleCodeList = request.customRoleCodeList;
            this.email = request.email;
            this.gender = request.gender;
            this.isAdmin = request.isAdmin;
            this.isBoss = request.isBoss;
            this.isDeptLeader = request.isDeptLeader;
            this.jobNo = request.jobNo;
            this.managerUserId = request.managerUserId;
            this.outDeptIdList = request.outDeptIdList;
            this.phone = request.phone;
            this.positionLevel = request.positionLevel;
            this.realName = request.realName;
            this.realNameEn = request.realNameEn;
            this.unionId = request.unionId;
            this.userId = request.userId;
            this.userNick = request.userNick;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * attribute.
         */
        public Builder attribute(String attribute) {
            this.putBodyParameter("attribute", attribute);
            this.attribute = attribute;
            return this;
        }

        /**
         * avatar.
         */
        public Builder avatar(String avatar) {
            this.putBodyParameter("avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * base_city_code_list.
         */
        public Builder baseCityCodeList(java.util.List<String> baseCityCodeList) {
            String baseCityCodeListShrink = shrink(baseCityCodeList, "base_city_code_list", "json");
            this.putBodyParameter("base_city_code_list", baseCityCodeListShrink);
            this.baseCityCodeList = baseCityCodeList;
            return this;
        }

        /**
         * base_location_list.
         */
        public Builder baseLocationList(java.util.List<BaseLocationList> baseLocationList) {
            String baseLocationListShrink = shrink(baseLocationList, "base_location_list", "json");
            this.putBodyParameter("base_location_list", baseLocationListShrink);
            this.baseLocationList = baseLocationList;
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
        public Builder certList(java.util.List<CertList> certList) {
            String certListShrink = shrink(certList, "cert_list", "json");
            this.putBodyParameter("cert_list", certListShrink);
            this.certList = certList;
            return this;
        }

        /**
         * custom_role_code_list.
         */
        public Builder customRoleCodeList(java.util.List<String> customRoleCodeList) {
            String customRoleCodeListShrink = shrink(customRoleCodeList, "custom_role_code_list", "json");
            this.putBodyParameter("custom_role_code_list", customRoleCodeListShrink);
            this.customRoleCodeList = customRoleCodeList;
            return this;
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
         * gender.
         */
        public Builder gender(String gender) {
            this.putBodyParameter("gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * is_admin.
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.putBodyParameter("is_admin", isAdmin);
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * is_boss.
         */
        public Builder isBoss(Boolean isBoss) {
            this.putBodyParameter("is_boss", isBoss);
            this.isBoss = isBoss;
            return this;
        }

        /**
         * is_dept_leader.
         */
        public Builder isDeptLeader(Boolean isDeptLeader) {
            this.putBodyParameter("is_dept_leader", isDeptLeader);
            this.isDeptLeader = isDeptLeader;
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
         * manager_user_id.
         */
        public Builder managerUserId(String managerUserId) {
            this.putBodyParameter("manager_user_id", managerUserId);
            this.managerUserId = managerUserId;
            return this;
        }

        /**
         * out_dept_id_list.
         */
        public Builder outDeptIdList(java.util.List<String> outDeptIdList) {
            String outDeptIdListShrink = shrink(outDeptIdList, "out_dept_id_list", "json");
            this.putBodyParameter("out_dept_id_list", outDeptIdListShrink);
            this.outDeptIdList = outDeptIdList;
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
         * position_level.
         */
        public Builder positionLevel(String positionLevel) {
            this.putBodyParameter("position_level", positionLevel);
            this.positionLevel = positionLevel;
            return this;
        }

        /**
         * real_name.
         */
        public Builder realName(String realName) {
            this.putBodyParameter("real_name", realName);
            this.realName = realName;
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
         * union_id.
         */
        public Builder unionId(String unionId) {
            this.putBodyParameter("union_id", unionId);
            this.unionId = unionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userNick(String userNick) {
            this.putBodyParameter("user_nick", userNick);
            this.userNick = userNick;
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
        public AddEmployeeRequest build() {
            return new AddEmployeeRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddEmployeeRequest} extends {@link TeaModel}
     *
     * <p>AddEmployeeRequest</p>
     */
    public static class BaseLocationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        private BaseLocationList(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseLocationList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String code; 
            private String level; 

            private Builder() {
            } 

            private Builder(BaseLocationList model) {
                this.code = model.code;
                this.level = model.level;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public BaseLocationList build() {
                return new BaseLocationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddEmployeeRequest} extends {@link TeaModel}
     *
     * <p>AddEmployeeRequest</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("cert_expired_time")
        private String certExpiredTime;

        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("real_name")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("real_name_en")
        private String realNameEn;

        private CertList(Builder builder) {
            this.birthday = builder.birthday;
            this.certExpiredTime = builder.certExpiredTime;
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.gender = builder.gender;
            this.nationality = builder.nationality;
            this.phone = builder.phone;
            this.realName = builder.realName;
            this.realNameEn = builder.realNameEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
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
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return realNameEn
         */
        public String getRealNameEn() {
            return this.realNameEn;
        }

        public static final class Builder {
            private String birthday; 
            private String certExpiredTime; 
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String gender; 
            private String nationality; 
            private String phone; 
            private String realName; 
            private String realNameEn; 

            private Builder() {
            } 

            private Builder(CertList model) {
                this.birthday = model.birthday;
                this.certExpiredTime = model.certExpiredTime;
                this.certNation = model.certNation;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.gender = model.gender;
                this.nationality = model.nationality;
                this.phone = model.phone;
                this.realName = model.realName;
                this.realNameEn = model.realNameEn;
            } 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

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
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
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
             * real_name.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * real_name_en.
             */
            public Builder realNameEn(String realNameEn) {
                this.realNameEn = realNameEn;
                return this;
            }

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
}
