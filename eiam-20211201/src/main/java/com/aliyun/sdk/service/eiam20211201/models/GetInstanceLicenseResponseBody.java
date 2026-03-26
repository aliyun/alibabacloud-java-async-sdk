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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceLicenseResponseBody model) {
            this.license = model.license;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned result.</p>
         */
        public Builder license(License license) {
            this.license = license;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
    public static class InstanceLicenseDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyLicenseStatus")
        private String conditionalAccessPolicyLicenseStatus;

        @com.aliyun.core.annotation.NameInMap("M2mApplicationLicenseStatus")
        private String m2mApplicationLicenseStatus;

        @com.aliyun.core.annotation.NameInMap("M2mApplicationQuota")
        private Long m2mApplicationQuota;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointQuota")
        private Long networkAccessEndpointQuota;

        @com.aliyun.core.annotation.NameInMap("UserQuota")
        private Long userQuota;

        private InstanceLicenseDetail(Builder builder) {
            this.conditionalAccessPolicyLicenseStatus = builder.conditionalAccessPolicyLicenseStatus;
            this.m2mApplicationLicenseStatus = builder.m2mApplicationLicenseStatus;
            this.m2mApplicationQuota = builder.m2mApplicationQuota;
            this.networkAccessEndpointQuota = builder.networkAccessEndpointQuota;
            this.userQuota = builder.userQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLicenseDetail create() {
            return builder().build();
        }

        /**
         * @return conditionalAccessPolicyLicenseStatus
         */
        public String getConditionalAccessPolicyLicenseStatus() {
            return this.conditionalAccessPolicyLicenseStatus;
        }

        /**
         * @return m2mApplicationLicenseStatus
         */
        public String getM2mApplicationLicenseStatus() {
            return this.m2mApplicationLicenseStatus;
        }

        /**
         * @return m2mApplicationQuota
         */
        public Long getM2mApplicationQuota() {
            return this.m2mApplicationQuota;
        }

        /**
         * @return networkAccessEndpointQuota
         */
        public Long getNetworkAccessEndpointQuota() {
            return this.networkAccessEndpointQuota;
        }

        /**
         * @return userQuota
         */
        public Long getUserQuota() {
            return this.userQuota;
        }

        public static final class Builder {
            private String conditionalAccessPolicyLicenseStatus; 
            private String m2mApplicationLicenseStatus; 
            private Long m2mApplicationQuota; 
            private Long networkAccessEndpointQuota; 
            private Long userQuota; 

            private Builder() {
            } 

            private Builder(InstanceLicenseDetail model) {
                this.conditionalAccessPolicyLicenseStatus = model.conditionalAccessPolicyLicenseStatus;
                this.m2mApplicationLicenseStatus = model.m2mApplicationLicenseStatus;
                this.m2mApplicationQuota = model.m2mApplicationQuota;
                this.networkAccessEndpointQuota = model.networkAccessEndpointQuota;
                this.userQuota = model.userQuota;
            } 

            /**
             * ConditionalAccessPolicyLicenseStatus.
             */
            public Builder conditionalAccessPolicyLicenseStatus(String conditionalAccessPolicyLicenseStatus) {
                this.conditionalAccessPolicyLicenseStatus = conditionalAccessPolicyLicenseStatus;
                return this;
            }

            /**
             * M2mApplicationLicenseStatus.
             */
            public Builder m2mApplicationLicenseStatus(String m2mApplicationLicenseStatus) {
                this.m2mApplicationLicenseStatus = m2mApplicationLicenseStatus;
                return this;
            }

            /**
             * M2mApplicationQuota.
             */
            public Builder m2mApplicationQuota(Long m2mApplicationQuota) {
                this.m2mApplicationQuota = m2mApplicationQuota;
                return this;
            }

            /**
             * NetworkAccessEndpointQuota.
             */
            public Builder networkAccessEndpointQuota(Long networkAccessEndpointQuota) {
                this.networkAccessEndpointQuota = networkAccessEndpointQuota;
                return this;
            }

            /**
             * UserQuota.
             */
            public Builder userQuota(Long userQuota) {
                this.userQuota = userQuota;
                return this;
            }

            public InstanceLicenseDetail build() {
                return new InstanceLicenseDetail(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("InstanceLicenseDetail")
        private InstanceLicenseDetail instanceLicenseDetail;

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
            this.instanceLicenseDetail = builder.instanceLicenseDetail;
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
         * @return instanceLicenseDetail
         */
        public InstanceLicenseDetail getInstanceLicenseDetail() {
            return this.instanceLicenseDetail;
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
            private InstanceLicenseDetail instanceLicenseDetail; 
            private String licenseChargeType; 
            private String licenseConfigJson; 
            private Long licenseCreateTime; 
            private String licenseId; 
            private String licenseStatus; 
            private String purchaseChannel; 
            private String purchaseInstanceId; 
            private Long startTime; 
            private Long userQuota; 

            private Builder() {
            } 

            private Builder(License model) {
                this.edition = model.edition;
                this.endTime = model.endTime;
                this.instanceLicenseDetail = model.instanceLicenseDetail;
                this.licenseChargeType = model.licenseChargeType;
                this.licenseConfigJson = model.licenseConfigJson;
                this.licenseCreateTime = model.licenseCreateTime;
                this.licenseId = model.licenseId;
                this.licenseStatus = model.licenseStatus;
                this.purchaseChannel = model.purchaseChannel;
                this.purchaseInstanceId = model.purchaseInstanceId;
                this.startTime = model.startTime;
                this.userQuota = model.userQuota;
            } 

            /**
             * <p>Edition of the License</p>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>End date of the validity period of the License, timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1723996800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceLicenseDetail.
             */
            public Builder instanceLicenseDetail(InstanceLicenseDetail instanceLicenseDetail) {
                this.instanceLicenseDetail = instanceLicenseDetail;
                return this;
            }

            /**
             * <p>Payment type of the License</p>
             * 
             * <strong>example:</strong>
             * <p>prepay</p>
             */
            public Builder licenseChargeType(String licenseChargeType) {
                this.licenseChargeType = licenseChargeType;
                return this;
            }

            /**
             * <p>Detailed configuration JSON string of the License</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;modules&quot;:[{&quot;features&quot;:[{&quot;name&quot;:&quot;urn:alibaba:idaas:license:module:ud:customField&quot;,&quot;status&quot;:&quot;enabled&quot;}]……{&quot;name&quot;:&quot;urn:alibaba:idaas:license:tag:enterprise&quot;,&quot;status&quot;:&quot;enabled&quot;}],&quot;version&quot;:&quot;1.0&quot;}</p>
             */
            public Builder licenseConfigJson(String licenseConfigJson) {
                this.licenseConfigJson = licenseConfigJson;
                return this;
            }

            /**
             * <p>Creation time of the License, timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1720509699000</p>
             */
            public Builder licenseCreateTime(Long licenseCreateTime) {
                this.licenseCreateTime = licenseCreateTime;
                return this;
            }

            /**
             * <p>Unique identifier of the License</p>
             * 
             * <strong>example:</strong>
             * <p>license_1234xxxx</p>
             */
            public Builder licenseId(String licenseId) {
                this.licenseId = licenseId;
                return this;
            }

            /**
             * <p>Status of the License</p>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder licenseStatus(String licenseStatus) {
                this.licenseStatus = licenseStatus;
                return this;
            }

            /**
             * <p>Purchase channel of the License</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder purchaseChannel(String purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
                return this;
            }

            /**
             * <p>Unique external product identifier corresponding to the License</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-cn-xxxxx</p>
             */
            public Builder purchaseInstanceId(String purchaseInstanceId) {
                this.purchaseInstanceId = purchaseInstanceId;
                return this;
            }

            /**
             * <p>Start date of the validity period of the License, timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1720509699000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>User quota of the License</p>
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
