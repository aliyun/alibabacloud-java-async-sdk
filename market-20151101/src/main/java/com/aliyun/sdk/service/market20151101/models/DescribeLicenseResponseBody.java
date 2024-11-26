// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLicenseResponseBody</p>
 */
public class DescribeLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("License")
    private License license;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLicenseResponseBody(Builder builder) {
        this.license = builder.license;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLicenseResponseBody create() {
        return builder().build();
    }

    /**
     * @return license
     */
    public License getLicense() {
        return this.license;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private License license; 
        private String requestId; 

        /**
         * License.
         */
        public Builder license(License license) {
            this.license = license;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLicenseResponseBody build() {
            return new DescribeLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLicenseResponseBody</p>
     */
    public static class LicenseAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LicenseAttribute(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseAttribute create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LicenseAttribute build() {
                return new LicenseAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLicenseResponseBody</p>
     */
    public static class ExtendArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicenseAttribute")
        private java.util.List < LicenseAttribute> licenseAttribute;

        private ExtendArray(Builder builder) {
            this.licenseAttribute = builder.licenseAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendArray create() {
            return builder().build();
        }

        /**
         * @return licenseAttribute
         */
        public java.util.List < LicenseAttribute> getLicenseAttribute() {
            return this.licenseAttribute;
        }

        public static final class Builder {
            private java.util.List < LicenseAttribute> licenseAttribute; 

            /**
             * LicenseAttribute.
             */
            public Builder licenseAttribute(java.util.List < LicenseAttribute> licenseAttribute) {
                this.licenseAttribute = licenseAttribute;
                return this;
            }

            public ExtendArray build() {
                return new ExtendArray(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLicenseResponseBody</p>
     */
    public static class ExtendInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountQuantity")
        private Long accountQuantity;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        private ExtendInfo(Builder builder) {
            this.accountQuantity = builder.accountQuantity;
            this.aliUid = builder.aliUid;
            this.email = builder.email;
            this.mobile = builder.mobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendInfo create() {
            return builder().build();
        }

        /**
         * @return accountQuantity
         */
        public Long getAccountQuantity() {
            return this.accountQuantity;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        public static final class Builder {
            private Long accountQuantity; 
            private Long aliUid; 
            private String email; 
            private String mobile; 

            /**
             * AccountQuantity.
             */
            public Builder accountQuantity(Long accountQuantity) {
                this.accountQuantity = accountQuantity;
                return this;
            }

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public ExtendInfo build() {
                return new ExtendInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLicenseResponseBody</p>
     */
    public static class License extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateTime")
        private String activateTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ExtendArray")
        private ExtendArray extendArray;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private ExtendInfo extendInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("LicenseStatus")
        private String licenseStatus;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductSkuId")
        private String productSkuId;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        private License(Builder builder) {
            this.activateTime = builder.activateTime;
            this.createTime = builder.createTime;
            this.expiredTime = builder.expiredTime;
            this.extendArray = builder.extendArray;
            this.extendInfo = builder.extendInfo;
            this.instanceId = builder.instanceId;
            this.licenseCode = builder.licenseCode;
            this.licenseStatus = builder.licenseStatus;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.productSkuId = builder.productSkuId;
            this.supplierName = builder.supplierName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static License create() {
            return builder().build();
        }

        /**
         * @return activateTime
         */
        public String getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return extendArray
         */
        public ExtendArray getExtendArray() {
            return this.extendArray;
        }

        /**
         * @return extendInfo
         */
        public ExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return licenseStatus
         */
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productSkuId
         */
        public String getProductSkuId() {
            return this.productSkuId;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        public static final class Builder {
            private String activateTime; 
            private String createTime; 
            private String expiredTime; 
            private ExtendArray extendArray; 
            private ExtendInfo extendInfo; 
            private String instanceId; 
            private String licenseCode; 
            private String licenseStatus; 
            private String productCode; 
            private String productName; 
            private String productSkuId; 
            private String supplierName; 

            /**
             * ActivateTime.
             */
            public Builder activateTime(String activateTime) {
                this.activateTime = activateTime;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ExtendArray.
             */
            public Builder extendArray(ExtendArray extendArray) {
                this.extendArray = extendArray;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(ExtendInfo extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LicenseCode.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * LicenseStatus.
             */
            public Builder licenseStatus(String licenseStatus) {
                this.licenseStatus = licenseStatus;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProductSkuId.
             */
            public Builder productSkuId(String productSkuId) {
                this.productSkuId = productSkuId;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            public License build() {
                return new License(this);
            } 

        } 

    }
}
