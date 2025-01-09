// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceLicenseResponseBody</p>
 */
public class GetInstanceLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("License")
    private License license;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceLicenseResponseBody(Builder builder) {
        this.license = builder.license;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLicenseResponseBody create() {
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

        public GetInstanceLicenseResponseBody build() {
            return new GetInstanceLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceLicenseResponseBody</p>
     */
    public static class License extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("LicenseChargeType")
        private String licenseChargeType;

        @com.aliyun.core.annotation.NameInMap("LicenseConfigJson")
        private String licenseConfigJson;

        @com.aliyun.core.annotation.NameInMap("LicenseCreateTime")
        private Long licenseCreateTime;

        @com.aliyun.core.annotation.NameInMap("LicenseId")
        private String licenseId;

        @com.aliyun.core.annotation.NameInMap("LicenseStatus")
        private String licenseStatus;

        @com.aliyun.core.annotation.NameInMap("PurchaseChannel")
        private String purchaseChannel;

        @com.aliyun.core.annotation.NameInMap("PurchaseInstanceId")
        private String purchaseInstanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UserQuota")
        private Long userQuota;

        private License(Builder builder) {
            this.edition = builder.edition;
            this.endTime = builder.endTime;
            this.licenseChargeType = builder.licenseChargeType;
            this.licenseConfigJson = builder.licenseConfigJson;
            this.licenseCreateTime = builder.licenseCreateTime;
            this.licenseId = builder.licenseId;
            this.licenseStatus = builder.licenseStatus;
            this.purchaseChannel = builder.purchaseChannel;
            this.purchaseInstanceId = builder.purchaseInstanceId;
            this.startTime = builder.startTime;
            this.userQuota = builder.userQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static License create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return licenseChargeType
         */
        public String getLicenseChargeType() {
            return this.licenseChargeType;
        }

        /**
         * @return licenseConfigJson
         */
        public String getLicenseConfigJson() {
            return this.licenseConfigJson;
        }

        /**
         * @return licenseCreateTime
         */
        public Long getLicenseCreateTime() {
            return this.licenseCreateTime;
        }

        /**
         * @return licenseId
         */
        public String getLicenseId() {
            return this.licenseId;
        }

        /**
         * @return licenseStatus
         */
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        /**
         * @return purchaseChannel
         */
        public String getPurchaseChannel() {
            return this.purchaseChannel;
        }

        /**
         * @return purchaseInstanceId
         */
        public String getPurchaseInstanceId() {
            return this.purchaseInstanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return userQuota
         */
        public Long getUserQuota() {
            return this.userQuota;
        }

        public static final class Builder {
            private String edition; 
            private Long endTime; 
            private String licenseChargeType; 
            private String licenseConfigJson; 
            private Long licenseCreateTime; 
            private String licenseId; 
            private String licenseStatus; 
            private String purchaseChannel; 
            private String purchaseInstanceId; 
            private Long startTime; 
            private Long userQuota; 

            /**
             * <p>License 的版本型号,free-免费版，trail-试用版，enterprise-企业版</p>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>License 的有效期终止日期</p>
             * 
             * <strong>example:</strong>
             * <p>1723996800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>License 的付费类型，prepay-预付费，postpay-后付费</p>
             * 
             * <strong>example:</strong>
             * <p>prepay</p>
             */
            public Builder licenseChargeType(String licenseChargeType) {
                this.licenseChargeType = licenseChargeType;
                return this;
            }

            /**
             * <p>License 详细配置JSON</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;modules&quot;:[{&quot;features&quot;:[{&quot;name&quot;:&quot;urn:alibaba:idaas:license:module:ud:customField&quot;,&quot;status&quot;:&quot;enabled&quot;}]……{&quot;name&quot;:&quot;urn:alibaba:idaas:license:tag:enterprise&quot;,&quot;status&quot;:&quot;enabled&quot;}],&quot;version&quot;:&quot;1.0&quot;}</p>
             */
            public Builder licenseConfigJson(String licenseConfigJson) {
                this.licenseConfigJson = licenseConfigJson;
                return this;
            }

            /**
             * <p>License 的创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1720509699000</p>
             */
            public Builder licenseCreateTime(Long licenseCreateTime) {
                this.licenseCreateTime = licenseCreateTime;
                return this;
            }

            /**
             * <p>License 的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>license_1234xxxx</p>
             */
            public Builder licenseId(String licenseId) {
                this.licenseId = licenseId;
                return this;
            }

            /**
             * <p>License 的状态，valid-有效，expired-已过期，released-已释放</p>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder licenseStatus(String licenseStatus) {
                this.licenseStatus = licenseStatus;
                return this;
            }

            /**
             * <p>License 的购买渠道</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder purchaseChannel(String purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
                return this;
            }

            /**
             * <p>License 对应的外部商品唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-cn-xxxxx</p>
             */
            public Builder purchaseInstanceId(String purchaseInstanceId) {
                this.purchaseInstanceId = purchaseInstanceId;
                return this;
            }

            /**
             * <p>License 的有效期开始日期</p>
             * 
             * <strong>example:</strong>
             * <p>1720509699000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>License 的用户配额</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder userQuota(Long userQuota) {
                this.userQuota = userQuota;
                return this;
            }

            public License build() {
                return new License(this);
            } 

        } 

    }
}
