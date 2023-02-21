// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxIllegalResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcTaxIllegalResponseBody</p>
 */
public class GetOcTaxIllegalResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcTaxIllegalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcTaxIllegalResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
        public Builder data(java.util.List < Data> data) {
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcTaxIllegalResponseBody build() {
            return new GetOcTaxIllegalResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgencyCardNum")
        private String agencyCardNum;

        @NameInMap("AgencyCardType")
        private String agencyCardType;

        @NameInMap("AgencyEnt")
        private String agencyEnt;

        @NameInMap("AgencyName")
        private String agencyName;

        @NameInMap("AgencySex")
        private String agencySex;

        @NameInMap("CaseType")
        private String caseType;

        @NameInMap("Department")
        private String department;

        @NameInMap("EntAddress")
        private String entAddress;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("FinancialCardNum")
        private String financialCardNum;

        @NameInMap("FinancialCardType")
        private String financialCardType;

        @NameInMap("FinancialName")
        private String financialName;

        @NameInMap("FinancialSex")
        private String financialSex;

        @NameInMap("IllegalTruth")
        private String illegalTruth;

        @NameInMap("LawBasis")
        private String lawBasis;

        @NameInMap("LegalCardNum")
        private String legalCardNum;

        @NameInMap("LegalCardType")
        private String legalCardType;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("LegalSex")
        private String legalSex;

        @NameInMap("OrgCode")
        private String orgCode;

        @NameInMap("PublishDate")
        private String publishDate;

        @NameInMap("TaxpayerNum")
        private String taxpayerNum;

        private Data(Builder builder) {
            this.agencyCardNum = builder.agencyCardNum;
            this.agencyCardType = builder.agencyCardType;
            this.agencyEnt = builder.agencyEnt;
            this.agencyName = builder.agencyName;
            this.agencySex = builder.agencySex;
            this.caseType = builder.caseType;
            this.department = builder.department;
            this.entAddress = builder.entAddress;
            this.entName = builder.entName;
            this.financialCardNum = builder.financialCardNum;
            this.financialCardType = builder.financialCardType;
            this.financialName = builder.financialName;
            this.financialSex = builder.financialSex;
            this.illegalTruth = builder.illegalTruth;
            this.lawBasis = builder.lawBasis;
            this.legalCardNum = builder.legalCardNum;
            this.legalCardType = builder.legalCardType;
            this.legalName = builder.legalName;
            this.legalSex = builder.legalSex;
            this.orgCode = builder.orgCode;
            this.publishDate = builder.publishDate;
            this.taxpayerNum = builder.taxpayerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agencyCardNum
         */
        public String getAgencyCardNum() {
            return this.agencyCardNum;
        }

        /**
         * @return agencyCardType
         */
        public String getAgencyCardType() {
            return this.agencyCardType;
        }

        /**
         * @return agencyEnt
         */
        public String getAgencyEnt() {
            return this.agencyEnt;
        }

        /**
         * @return agencyName
         */
        public String getAgencyName() {
            return this.agencyName;
        }

        /**
         * @return agencySex
         */
        public String getAgencySex() {
            return this.agencySex;
        }

        /**
         * @return caseType
         */
        public String getCaseType() {
            return this.caseType;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return entAddress
         */
        public String getEntAddress() {
            return this.entAddress;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return financialCardNum
         */
        public String getFinancialCardNum() {
            return this.financialCardNum;
        }

        /**
         * @return financialCardType
         */
        public String getFinancialCardType() {
            return this.financialCardType;
        }

        /**
         * @return financialName
         */
        public String getFinancialName() {
            return this.financialName;
        }

        /**
         * @return financialSex
         */
        public String getFinancialSex() {
            return this.financialSex;
        }

        /**
         * @return illegalTruth
         */
        public String getIllegalTruth() {
            return this.illegalTruth;
        }

        /**
         * @return lawBasis
         */
        public String getLawBasis() {
            return this.lawBasis;
        }

        /**
         * @return legalCardNum
         */
        public String getLegalCardNum() {
            return this.legalCardNum;
        }

        /**
         * @return legalCardType
         */
        public String getLegalCardType() {
            return this.legalCardType;
        }

        /**
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return legalSex
         */
        public String getLegalSex() {
            return this.legalSex;
        }

        /**
         * @return orgCode
         */
        public String getOrgCode() {
            return this.orgCode;
        }

        /**
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        /**
         * @return taxpayerNum
         */
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public static final class Builder {
            private String agencyCardNum; 
            private String agencyCardType; 
            private String agencyEnt; 
            private String agencyName; 
            private String agencySex; 
            private String caseType; 
            private String department; 
            private String entAddress; 
            private String entName; 
            private String financialCardNum; 
            private String financialCardType; 
            private String financialName; 
            private String financialSex; 
            private String illegalTruth; 
            private String lawBasis; 
            private String legalCardNum; 
            private String legalCardType; 
            private String legalName; 
            private String legalSex; 
            private String orgCode; 
            private String publishDate; 
            private String taxpayerNum; 

            /**
             * 直接中介人证件号
             */
            public Builder agencyCardNum(String agencyCardNum) {
                this.agencyCardNum = agencyCardNum;
                return this;
            }

            /**
             * 直接中介人证件类型
             */
            public Builder agencyCardType(String agencyCardType) {
                this.agencyCardType = agencyCardType;
                return this;
            }

            /**
             * 直接中介机构公司名称
             */
            public Builder agencyEnt(String agencyEnt) {
                this.agencyEnt = agencyEnt;
                return this;
            }

            /**
             * 直接中介人名称
             */
            public Builder agencyName(String agencyName) {
                this.agencyName = agencyName;
                return this;
            }

            /**
             * 直接中介人性别
             */
            public Builder agencySex(String agencySex) {
                this.agencySex = agencySex;
                return this;
            }

            /**
             * 案件性质
             */
            public Builder caseType(String caseType) {
                this.caseType = caseType;
                return this;
            }

            /**
             * 所属税务机关
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 公司注册地址
             */
            public Builder entAddress(String entAddress) {
                this.entAddress = entAddress;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 财务人员证件号
             */
            public Builder financialCardNum(String financialCardNum) {
                this.financialCardNum = financialCardNum;
                return this;
            }

            /**
             * 财务人员证件类型
             */
            public Builder financialCardType(String financialCardType) {
                this.financialCardType = financialCardType;
                return this;
            }

            /**
             * 财务人员姓名
             */
            public Builder financialName(String financialName) {
                this.financialName = financialName;
                return this;
            }

            /**
             * 财务人员性别
             */
            public Builder financialSex(String financialSex) {
                this.financialSex = financialSex;
                return this;
            }

            /**
             * 主要违法事实、相关法律依据及税务处理处罚情况
             */
            public Builder illegalTruth(String illegalTruth) {
                this.illegalTruth = illegalTruth;
                return this;
            }

            /**
             * 法律处罚
             */
            public Builder lawBasis(String lawBasis) {
                this.lawBasis = lawBasis;
                return this;
            }

            /**
             * 法人证件号
             */
            public Builder legalCardNum(String legalCardNum) {
                this.legalCardNum = legalCardNum;
                return this;
            }

            /**
             * 法人证件类型
             */
            public Builder legalCardType(String legalCardType) {
                this.legalCardType = legalCardType;
                return this;
            }

            /**
             * 法定代表人姓名
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 法人性别
             */
            public Builder legalSex(String legalSex) {
                this.legalSex = legalSex;
                return this;
            }

            /**
             * 组织机构代码
             */
            public Builder orgCode(String orgCode) {
                this.orgCode = orgCode;
                return this;
            }

            /**
             * 发布日期
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * 纳税人税号
             */
            public Builder taxpayerNum(String taxpayerNum) {
                this.taxpayerNum = taxpayerNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
