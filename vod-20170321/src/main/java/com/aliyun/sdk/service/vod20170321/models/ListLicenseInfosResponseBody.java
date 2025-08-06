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
 * {@link ListLicenseInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListLicenseInfosResponseBody</p>
 */
public class ListLicenseInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LicenseList")
    private java.util.List<LicenseList> licenseList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListLicenseInfosResponseBody(Builder builder) {
        this.licenseList = builder.licenseList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLicenseInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseList
     */
    public java.util.List<LicenseList> getLicenseList() {
        return this.licenseList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<LicenseList> licenseList; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListLicenseInfosResponseBody model) {
            this.licenseList = model.licenseList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * LicenseList.
         */
        public Builder licenseList(java.util.List<LicenseList> licenseList) {
            this.licenseList = licenseList;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListLicenseInfosResponseBody build() {
            return new ListLicenseInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLicenseInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListLicenseInfosResponseBody</p>
     */
    public static class LicenseList extends TeaModel {
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

        private LicenseList(Builder builder) {
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

        public static LicenseList create() {
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

            private Builder(LicenseList model) {
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

            public LicenseList build() {
                return new LicenseList(this);
            } 

        } 

    }
}
