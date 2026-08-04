// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryEnterpriseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEnterpriseInfoResponseBody</p>
 */
public class QueryEnterpriseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProfileInfo")
    private ProfileInfo profileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEnterpriseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.profileInfo = builder.profileInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnterpriseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return profileInfo
     */
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private ProfileInfo profileInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEnterpriseInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.profileInfo = model.profileInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ProfileInfo.
         */
        public Builder profileInfo(ProfileInfo profileInfo) {
            this.profileInfo = profileInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEnterpriseInfoResponseBody build() {
            return new QueryEnterpriseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEnterpriseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEnterpriseInfoResponseBody</p>
     */
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private City(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(City model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEnterpriseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEnterpriseInfoResponseBody</p>
     */
    public static class Province extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Province(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Province create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Province model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Province build() {
                return new Province(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEnterpriseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEnterpriseInfoResponseBody</p>
     */
    public static class ProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AliyunPK")
        private String aliyunPK;

        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseImgSrc")
        private String businessLicenseImgSrc;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseNumber")
        private String businessLicenseNumber;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseType")
        private String businessLicenseType;

        @com.aliyun.core.annotation.NameInMap("CertifiedFrom")
        private String certifiedFrom;

        @com.aliyun.core.annotation.NameInMap("CertifiedTime")
        private String certifiedTime;

        @com.aliyun.core.annotation.NameInMap("City")
        private City city;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DetailAddress")
        private String detailAddress;

        @com.aliyun.core.annotation.NameInMap("EInterpriseSize")
        private String eInterpriseSize;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEntity")
        private String enterpriseEntity;

        @com.aliyun.core.annotation.NameInMap("EntityIDNumber")
        private String entityIDNumber;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("Fax")
        private String fax;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Province")
        private Province province;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Years")
        private String years;

        private ProfileInfo(Builder builder) {
            this.alias = builder.alias;
            this.aliyunPK = builder.aliyunPK;
            this.auditStatus = builder.auditStatus;
            this.businessLicenseImgSrc = builder.businessLicenseImgSrc;
            this.businessLicenseNumber = builder.businessLicenseNumber;
            this.businessLicenseType = builder.businessLicenseType;
            this.certifiedFrom = builder.certifiedFrom;
            this.certifiedTime = builder.certifiedTime;
            this.city = builder.city;
            this.createTime = builder.createTime;
            this.detailAddress = builder.detailAddress;
            this.eInterpriseSize = builder.eInterpriseSize;
            this.enterpriseEntity = builder.enterpriseEntity;
            this.entityIDNumber = builder.entityIDNumber;
            this.extend = builder.extend;
            this.fax = builder.fax;
            this.name = builder.name;
            this.phone = builder.phone;
            this.postalCode = builder.postalCode;
            this.profile = builder.profile;
            this.province = builder.province;
            this.updateTime = builder.updateTime;
            this.years = builder.years;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfileInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return aliyunPK
         */
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return businessLicenseImgSrc
         */
        public String getBusinessLicenseImgSrc() {
            return this.businessLicenseImgSrc;
        }

        /**
         * @return businessLicenseNumber
         */
        public String getBusinessLicenseNumber() {
            return this.businessLicenseNumber;
        }

        /**
         * @return businessLicenseType
         */
        public String getBusinessLicenseType() {
            return this.businessLicenseType;
        }

        /**
         * @return certifiedFrom
         */
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        /**
         * @return certifiedTime
         */
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detailAddress
         */
        public String getDetailAddress() {
            return this.detailAddress;
        }

        /**
         * @return eInterpriseSize
         */
        public String getEInterpriseSize() {
            return this.eInterpriseSize;
        }

        /**
         * @return enterpriseEntity
         */
        public String getEnterpriseEntity() {
            return this.enterpriseEntity;
        }

        /**
         * @return entityIDNumber
         */
        public String getEntityIDNumber() {
            return this.entityIDNumber;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return fax
         */
        public String getFax() {
            return this.fax;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return province
         */
        public Province getProvince() {
            return this.province;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return years
         */
        public String getYears() {
            return this.years;
        }

        public static final class Builder {
            private String alias; 
            private String aliyunPK; 
            private String auditStatus; 
            private String businessLicenseImgSrc; 
            private String businessLicenseNumber; 
            private String businessLicenseType; 
            private String certifiedFrom; 
            private String certifiedTime; 
            private City city; 
            private String createTime; 
            private String detailAddress; 
            private String eInterpriseSize; 
            private String enterpriseEntity; 
            private String entityIDNumber; 
            private String extend; 
            private String fax; 
            private String name; 
            private String phone; 
            private String postalCode; 
            private String profile; 
            private Province province; 
            private String updateTime; 
            private String years; 

            private Builder() {
            } 

            private Builder(ProfileInfo model) {
                this.alias = model.alias;
                this.aliyunPK = model.aliyunPK;
                this.auditStatus = model.auditStatus;
                this.businessLicenseImgSrc = model.businessLicenseImgSrc;
                this.businessLicenseNumber = model.businessLicenseNumber;
                this.businessLicenseType = model.businessLicenseType;
                this.certifiedFrom = model.certifiedFrom;
                this.certifiedTime = model.certifiedTime;
                this.city = model.city;
                this.createTime = model.createTime;
                this.detailAddress = model.detailAddress;
                this.eInterpriseSize = model.eInterpriseSize;
                this.enterpriseEntity = model.enterpriseEntity;
                this.entityIDNumber = model.entityIDNumber;
                this.extend = model.extend;
                this.fax = model.fax;
                this.name = model.name;
                this.phone = model.phone;
                this.postalCode = model.postalCode;
                this.profile = model.profile;
                this.province = model.province;
                this.updateTime = model.updateTime;
                this.years = model.years;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * AliyunPK.
             */
            public Builder aliyunPK(String aliyunPK) {
                this.aliyunPK = aliyunPK;
                return this;
            }

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * BusinessLicenseImgSrc.
             */
            public Builder businessLicenseImgSrc(String businessLicenseImgSrc) {
                this.businessLicenseImgSrc = businessLicenseImgSrc;
                return this;
            }

            /**
             * BusinessLicenseNumber.
             */
            public Builder businessLicenseNumber(String businessLicenseNumber) {
                this.businessLicenseNumber = businessLicenseNumber;
                return this;
            }

            /**
             * BusinessLicenseType.
             */
            public Builder businessLicenseType(String businessLicenseType) {
                this.businessLicenseType = businessLicenseType;
                return this;
            }

            /**
             * CertifiedFrom.
             */
            public Builder certifiedFrom(String certifiedFrom) {
                this.certifiedFrom = certifiedFrom;
                return this;
            }

            /**
             * CertifiedTime.
             */
            public Builder certifiedTime(String certifiedTime) {
                this.certifiedTime = certifiedTime;
                return this;
            }

            /**
             * City.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DetailAddress.
             */
            public Builder detailAddress(String detailAddress) {
                this.detailAddress = detailAddress;
                return this;
            }

            /**
             * EInterpriseSize.
             */
            public Builder eInterpriseSize(String eInterpriseSize) {
                this.eInterpriseSize = eInterpriseSize;
                return this;
            }

            /**
             * EnterpriseEntity.
             */
            public Builder enterpriseEntity(String enterpriseEntity) {
                this.enterpriseEntity = enterpriseEntity;
                return this;
            }

            /**
             * EntityIDNumber.
             */
            public Builder entityIDNumber(String entityIDNumber) {
                this.entityIDNumber = entityIDNumber;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * Fax.
             */
            public Builder fax(String fax) {
                this.fax = fax;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * PostalCode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Years.
             */
            public Builder years(String years) {
                this.years = years;
                return this;
            }

            public ProfileInfo build() {
                return new ProfileInfo(this);
            } 

        } 

    }
}
