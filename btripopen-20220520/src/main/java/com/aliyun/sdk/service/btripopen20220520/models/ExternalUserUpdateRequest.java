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
 * {@link ExternalUserUpdateRequest} extends {@link RequestModel}
 *
 * <p>ExternalUserUpdateRequest</p>
 */
public class ExternalUserUpdateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("external_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("birthday")
    private String birthday;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cert_request_list")
    private java.util.List<CertRequestList> certRequestList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("real_name")
    private String realName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("real_name_en")
    private String realNameEn;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private ExternalUserUpdateRequest(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.birthday = builder.birthday;
        this.certRequestList = builder.certRequestList;
        this.email = builder.email;
        this.phone = builder.phone;
        this.realName = builder.realName;
        this.realNameEn = builder.realNameEn;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalUserUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * @return certRequestList
     */
    public java.util.List<CertRequestList> getCertRequestList() {
        return this.certRequestList;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<ExternalUserUpdateRequest, Builder> {
        private String externalUserId; 
        private String birthday; 
        private java.util.List<CertRequestList> certRequestList; 
        private String email; 
        private String phone; 
        private String realName; 
        private String realNameEn; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ExternalUserUpdateRequest request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.birthday = request.birthday;
            this.certRequestList = request.certRequestList;
            this.email = request.email;
            this.phone = request.phone;
            this.realName = request.realName;
            this.realNameEn = request.realNameEn;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0012</p>
         */
        public Builder externalUserId(String externalUserId) {
            this.putPathParameter("external_user_id", externalUserId);
            this.externalUserId = externalUserId;
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
         * cert_request_list.
         */
        public Builder certRequestList(java.util.List<CertRequestList> certRequestList) {
            String certRequestListShrink = shrink(certRequestList, "cert_request_list", "json");
            this.putBodyParameter("cert_request_list", certRequestListShrink);
            this.certRequestList = certRequestList;
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
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public ExternalUserUpdateRequest build() {
            return new ExternalUserUpdateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExternalUserUpdateRequest} extends {@link TeaModel}
     *
     * <p>ExternalUserUpdateRequest</p>
     */
    public static class CertRequestList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_expired_time")
        private String certExpiredTime;

        @com.aliyun.core.annotation.NameInMap("cert_nation")
        private String certNation;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        private CertRequestList(Builder builder) {
            this.certExpiredTime = builder.certExpiredTime;
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.nationality = builder.nationality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertRequestList create() {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>330101199010010213</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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

            public CertRequestList build() {
                return new CertRequestList(this);
            } 

        } 

    }
}
