// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetLicenseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLicenseInfoResponseBody</p>
 */
public class GetLicenseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LicenseInfo")
    private LicenseInfo licenseInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLicenseInfoResponseBody(Builder builder) {
        this.licenseInfo = builder.licenseInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLicenseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseInfo
     */
    public LicenseInfo getLicenseInfo() {
        return this.licenseInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LicenseInfo licenseInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLicenseInfoResponseBody model) {
            this.licenseInfo = model.licenseInfo;
            this.requestId = model.requestId;
        } 

        /**
         * LicenseInfo.
         */
        public Builder licenseInfo(LicenseInfo licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLicenseInfoResponseBody build() {
            return new GetLicenseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLicenseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetLicenseInfoResponseBody</p>
     */
    public static class LicenseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("ContractNo")
        private String contractNo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpiredOn")
        private String expiredOn;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("LicenseId")
        private String licenseId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private LicenseInfo(Builder builder) {
            this.accountId = builder.accountId;
            this.beginTime = builder.beginTime;
            this.businessType = builder.businessType;
            this.contractNo = builder.contractNo;
            this.createTime = builder.createTime;
            this.expiredOn = builder.expiredOn;
            this.extraInfo = builder.extraInfo;
            this.licenseId = builder.licenseId;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseInfo create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return contractNo
         */
        public String getContractNo() {
            return this.contractNo;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expiredOn
         */
        public String getExpiredOn() {
            return this.expiredOn;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return licenseId
         */
        public String getLicenseId() {
            return this.licenseId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long accountId; 
            private String beginTime; 
            private String businessType; 
            private String contractNo; 
            private String createTime; 
            private String expiredOn; 
            private String extraInfo; 
            private String licenseId; 
            private String modifyTime; 
            private String status; 
            private String type; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(LicenseInfo model) {
                this.accountId = model.accountId;
                this.beginTime = model.beginTime;
                this.businessType = model.businessType;
                this.contractNo = model.contractNo;
                this.createTime = model.createTime;
                this.expiredOn = model.expiredOn;
                this.extraInfo = model.extraInfo;
                this.licenseId = model.licenseId;
                this.modifyTime = model.modifyTime;
                this.status = model.status;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * ContractNo.
             */
            public Builder contractNo(String contractNo) {
                this.contractNo = contractNo;
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
             * ExpiredOn.
             */
            public Builder expiredOn(String expiredOn) {
                this.expiredOn = expiredOn;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * LicenseId.
             */
            public Builder licenseId(String licenseId) {
                this.licenseId = licenseId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public LicenseInfo build() {
                return new LicenseInfo(this);
            } 

        } 

    }
}
