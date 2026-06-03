// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link ListCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificateResponseBody</p>
 */
public class ListCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCertificateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificateResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCertificateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertificateResponseBody build() {
            return new ListCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationTime")
        private Long authorizationTime;

        @com.aliyun.core.annotation.NameInMap("BlockchainNo")
        private String blockchainNo;

        @com.aliyun.core.annotation.NameInMap("BusinessTypeList")
        private java.util.List<Integer> businessTypeList;

        @com.aliyun.core.annotation.NameInMap("CancelTime")
        private Long cancelTime;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("PhoneNo")
        private String phoneNo;

        @com.aliyun.core.annotation.NameInMap("SchemeType")
        private Integer schemeType;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.authorizationTime = builder.authorizationTime;
            this.blockchainNo = builder.blockchainNo;
            this.businessTypeList = builder.businessTypeList;
            this.cancelTime = builder.cancelTime;
            this.companyName = builder.companyName;
            this.endDate = builder.endDate;
            this.phoneNo = builder.phoneNo;
            this.schemeType = builder.schemeType;
            this.startDate = builder.startDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizationTime
         */
        public Long getAuthorizationTime() {
            return this.authorizationTime;
        }

        /**
         * @return blockchainNo
         */
        public String getBlockchainNo() {
            return this.blockchainNo;
        }

        /**
         * @return businessTypeList
         */
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        /**
         * @return cancelTime
         */
        public Long getCancelTime() {
            return this.cancelTime;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return schemeType
         */
        public Integer getSchemeType() {
            return this.schemeType;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long authorizationTime; 
            private String blockchainNo; 
            private java.util.List<Integer> businessTypeList; 
            private Long cancelTime; 
            private String companyName; 
            private String endDate; 
            private String phoneNo; 
            private Integer schemeType; 
            private String startDate; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizationTime = model.authorizationTime;
                this.blockchainNo = model.blockchainNo;
                this.businessTypeList = model.businessTypeList;
                this.cancelTime = model.cancelTime;
                this.companyName = model.companyName;
                this.endDate = model.endDate;
                this.phoneNo = model.phoneNo;
                this.schemeType = model.schemeType;
                this.startDate = model.startDate;
                this.status = model.status;
            } 

            /**
             * AuthorizationTime.
             */
            public Builder authorizationTime(Long authorizationTime) {
                this.authorizationTime = authorizationTime;
                return this;
            }

            /**
             * BlockchainNo.
             */
            public Builder blockchainNo(String blockchainNo) {
                this.blockchainNo = blockchainNo;
                return this;
            }

            /**
             * BusinessTypeList.
             */
            public Builder businessTypeList(java.util.List<Integer> businessTypeList) {
                this.businessTypeList = businessTypeList;
                return this;
            }

            /**
             * CancelTime.
             */
            public Builder cancelTime(Long cancelTime) {
                this.cancelTime = cancelTime;
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
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * SchemeType.
             */
            public Builder schemeType(Integer schemeType) {
                this.schemeType = schemeType;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
