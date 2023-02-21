// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationCustomsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcOperationCustomsResponseBody</p>
 */
public class GetOcOperationCustomsResponseBody extends TeaModel {
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

    private GetOcOperationCustomsResponseBody(Builder builder) {
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

    public static GetOcOperationCustomsResponseBody create() {
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

        public GetOcOperationCustomsResponseBody build() {
            return new GetOcOperationCustomsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AdminRegionName")
        private String adminRegionName;

        @NameInMap("AnnualReport")
        private String annualReport;

        @NameInMap("BusinessCate")
        private String businessCate;

        @NameInMap("CancelFlag")
        private String cancelFlag;

        @NameInMap("CreditLevelsNew")
        private String creditLevelsNew;

        @NameInMap("CustomsNum")
        private String customsNum;

        @NameInMap("CustomsReg")
        private String customsReg;

        @NameInMap("EcoRegionName")
        private String ecoRegionName;

        @NameInMap("ElectType")
        private String electType;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("IdentCode")
        private String identCode;

        @NameInMap("IdentDate")
        private String identDate;

        @NameInMap("IndustryType")
        private String industryType;

        @NameInMap("RegDate")
        private String regDate;

        @NameInMap("SpecialArea")
        private String specialArea;

        @NameInMap("ValidDate")
        private String validDate;

        private Data(Builder builder) {
            this.adminRegionName = builder.adminRegionName;
            this.annualReport = builder.annualReport;
            this.businessCate = builder.businessCate;
            this.cancelFlag = builder.cancelFlag;
            this.creditLevelsNew = builder.creditLevelsNew;
            this.customsNum = builder.customsNum;
            this.customsReg = builder.customsReg;
            this.ecoRegionName = builder.ecoRegionName;
            this.electType = builder.electType;
            this.entName = builder.entName;
            this.identCode = builder.identCode;
            this.identDate = builder.identDate;
            this.industryType = builder.industryType;
            this.regDate = builder.regDate;
            this.specialArea = builder.specialArea;
            this.validDate = builder.validDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adminRegionName
         */
        public String getAdminRegionName() {
            return this.adminRegionName;
        }

        /**
         * @return annualReport
         */
        public String getAnnualReport() {
            return this.annualReport;
        }

        /**
         * @return businessCate
         */
        public String getBusinessCate() {
            return this.businessCate;
        }

        /**
         * @return cancelFlag
         */
        public String getCancelFlag() {
            return this.cancelFlag;
        }

        /**
         * @return creditLevelsNew
         */
        public String getCreditLevelsNew() {
            return this.creditLevelsNew;
        }

        /**
         * @return customsNum
         */
        public String getCustomsNum() {
            return this.customsNum;
        }

        /**
         * @return customsReg
         */
        public String getCustomsReg() {
            return this.customsReg;
        }

        /**
         * @return ecoRegionName
         */
        public String getEcoRegionName() {
            return this.ecoRegionName;
        }

        /**
         * @return electType
         */
        public String getElectType() {
            return this.electType;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return identCode
         */
        public String getIdentCode() {
            return this.identCode;
        }

        /**
         * @return identDate
         */
        public String getIdentDate() {
            return this.identDate;
        }

        /**
         * @return industryType
         */
        public String getIndustryType() {
            return this.industryType;
        }

        /**
         * @return regDate
         */
        public String getRegDate() {
            return this.regDate;
        }

        /**
         * @return specialArea
         */
        public String getSpecialArea() {
            return this.specialArea;
        }

        /**
         * @return validDate
         */
        public String getValidDate() {
            return this.validDate;
        }

        public static final class Builder {
            private String adminRegionName; 
            private String annualReport; 
            private String businessCate; 
            private String cancelFlag; 
            private String creditLevelsNew; 
            private String customsNum; 
            private String customsReg; 
            private String ecoRegionName; 
            private String electType; 
            private String entName; 
            private String identCode; 
            private String identDate; 
            private String industryType; 
            private String regDate; 
            private String specialArea; 
            private String validDate; 

            /**
             * 行政区划
             */
            public Builder adminRegionName(String adminRegionName) {
                this.adminRegionName = adminRegionName;
                return this;
            }

            /**
             * 年报情况
             */
            public Builder annualReport(String annualReport) {
                this.annualReport = annualReport;
                return this;
            }

            /**
             * 经营类别
             */
            public Builder businessCate(String businessCate) {
                this.businessCate = businessCate;
                return this;
            }

            /**
             * 海关注销标志
             */
            public Builder cancelFlag(String cancelFlag) {
                this.cancelFlag = cancelFlag;
                return this;
            }

            /**
             * 信用等级（新）
             */
            public Builder creditLevelsNew(String creditLevelsNew) {
                this.creditLevelsNew = creditLevelsNew;
                return this;
            }

            /**
             * 海关注册编码
             */
            public Builder customsNum(String customsNum) {
                this.customsNum = customsNum;
                return this;
            }

            /**
             * 注册海关
             */
            public Builder customsReg(String customsReg) {
                this.customsReg = customsReg;
                return this;
            }

            /**
             * 经济区划
             */
            public Builder ecoRegionName(String ecoRegionName) {
                this.ecoRegionName = ecoRegionName;
                return this;
            }

            /**
             * 跨境贸易电子商务类型
             */
            public Builder electType(String electType) {
                this.electType = electType;
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
             * 认证证书编码
             */
            public Builder identCode(String identCode) {
                this.identCode = identCode;
                return this;
            }

            /**
             * 认证证书编码
             */
            public Builder identDate(String identDate) {
                this.identDate = identDate;
                return this;
            }

            /**
             * 行业种类
             */
            public Builder industryType(String industryType) {
                this.industryType = industryType;
                return this;
            }

            /**
             * 海关进出口信用注册日期
             */
            public Builder regDate(String regDate) {
                this.regDate = regDate;
                return this;
            }

            /**
             * 特殊贸易区域
             */
            public Builder specialArea(String specialArea) {
                this.specialArea = specialArea;
                return this;
            }

            /**
             * 报关有效期
             */
            public Builder validDate(String validDate) {
                this.validDate = validDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
