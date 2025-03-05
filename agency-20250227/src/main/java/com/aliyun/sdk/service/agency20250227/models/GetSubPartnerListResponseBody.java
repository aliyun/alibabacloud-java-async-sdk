// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetSubPartnerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubPartnerListResponseBody</p>
 */
public class GetSubPartnerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetSubPartnerListResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubPartnerListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetSubPartnerListResponseBody build() {
            return new GetSubPartnerListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubPartnerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubPartnerListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AgreementStatus")
        private String agreementStatus;

        @com.aliyun.core.annotation.NameInMap("AgreementStatusDesc")
        private String agreementStatusDesc;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("Contact")
        private String contact;

        @com.aliyun.core.annotation.NameInMap("District")
        private String district;

        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private String joinTime;

        @com.aliyun.core.annotation.NameInMap("MasterAccount")
        private String masterAccount;

        @com.aliyun.core.annotation.NameInMap("MasterUid")
        private String masterUid;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private Data(Builder builder) {
            this.address = builder.address;
            this.agreementStatus = builder.agreementStatus;
            this.agreementStatusDesc = builder.agreementStatusDesc;
            this.city = builder.city;
            this.companyName = builder.companyName;
            this.contact = builder.contact;
            this.district = builder.district;
            this.joinTime = builder.joinTime;
            this.masterAccount = builder.masterAccount;
            this.masterUid = builder.masterUid;
            this.pid = builder.pid;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return agreementStatus
         */
        public String getAgreementStatus() {
            return this.agreementStatus;
        }

        /**
         * @return agreementStatusDesc
         */
        public String getAgreementStatusDesc() {
            return this.agreementStatusDesc;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return contact
         */
        public String getContact() {
            return this.contact;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return joinTime
         */
        public String getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return masterAccount
         */
        public String getMasterAccount() {
            return this.masterAccount;
        }

        /**
         * @return masterUid
         */
        public String getMasterUid() {
            return this.masterUid;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String address; 
            private String agreementStatus; 
            private String agreementStatusDesc; 
            private String city; 
            private String companyName; 
            private String contact; 
            private String district; 
            private String joinTime; 
            private String masterAccount; 
            private String masterUid; 
            private String pid; 
            private String province; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AgreementStatus.
             */
            public Builder agreementStatus(String agreementStatus) {
                this.agreementStatus = agreementStatus;
                return this;
            }

            /**
             * AgreementStatusDesc.
             */
            public Builder agreementStatusDesc(String agreementStatusDesc) {
                this.agreementStatusDesc = agreementStatusDesc;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * Contact.
             */
            public Builder contact(String contact) {
                this.contact = contact;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * JoinTime.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * MasterAccount.
             */
            public Builder masterAccount(String masterAccount) {
                this.masterAccount = masterAccount;
                return this;
            }

            /**
             * MasterUid.
             */
            public Builder masterUid(String masterUid) {
                this.masterUid = masterUid;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
