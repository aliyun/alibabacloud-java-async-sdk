// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcBasicResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcBasicResponseBody</p>
 */
public class GetOcIcBasicResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

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

    private GetOcIcBasicResponseBody(Builder builder) {
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

    public static GetOcIcBasicResponseBody create() {
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
        private Data data; 
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

        public GetOcIcBasicResponseBody build() {
            return new GetOcIcBasicResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CheckDate")
        private String checkDate;

        @NameInMap("EntAddress")
        private String entAddress;

        @NameInMap("EntBrief")
        private String entBrief;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("EntNameEng")
        private String entNameEng;

        @NameInMap("EntStatus")
        private String entStatus;

        @NameInMap("EntType")
        private String entType;

        @NameInMap("EsDate")
        private String esDate;

        @NameInMap("FormerNames")
        private String formerNames;

        @NameInMap("IndustryNameLv1")
        private String industryNameLv1;

        @NameInMap("IndustryNameLv2")
        private String industryNameLv2;

        @NameInMap("InsuredNum")
        private String insuredNum;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("LicenseNumber")
        private String licenseNumber;

        @NameInMap("OpFrom")
        private String opFrom;

        @NameInMap("OpScope")
        private String opScope;

        @NameInMap("OpTo")
        private String opTo;

        @NameInMap("OrgNo")
        private String orgNo;

        @NameInMap("RecCap")
        private String recCap;

        @NameInMap("RegCap")
        private String regCap;

        @NameInMap("RegOrg")
        private String regOrg;

        @NameInMap("RegOrgCity")
        private String regOrgCity;

        @NameInMap("RegOrgDistrict")
        private String regOrgDistrict;

        @NameInMap("RegOrgProvince")
        private String regOrgProvince;

        @NameInMap("SocialCreditCode")
        private String socialCreditCode;

        @NameInMap("StaffNum")
        private String staffNum;

        @NameInMap("TaxNum")
        private String taxNum;

        private Data(Builder builder) {
            this.checkDate = builder.checkDate;
            this.entAddress = builder.entAddress;
            this.entBrief = builder.entBrief;
            this.entName = builder.entName;
            this.entNameEng = builder.entNameEng;
            this.entStatus = builder.entStatus;
            this.entType = builder.entType;
            this.esDate = builder.esDate;
            this.formerNames = builder.formerNames;
            this.industryNameLv1 = builder.industryNameLv1;
            this.industryNameLv2 = builder.industryNameLv2;
            this.insuredNum = builder.insuredNum;
            this.legalName = builder.legalName;
            this.licenseNumber = builder.licenseNumber;
            this.opFrom = builder.opFrom;
            this.opScope = builder.opScope;
            this.opTo = builder.opTo;
            this.orgNo = builder.orgNo;
            this.recCap = builder.recCap;
            this.regCap = builder.regCap;
            this.regOrg = builder.regOrg;
            this.regOrgCity = builder.regOrgCity;
            this.regOrgDistrict = builder.regOrgDistrict;
            this.regOrgProvince = builder.regOrgProvince;
            this.socialCreditCode = builder.socialCreditCode;
            this.staffNum = builder.staffNum;
            this.taxNum = builder.taxNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkDate
         */
        public String getCheckDate() {
            return this.checkDate;
        }

        /**
         * @return entAddress
         */
        public String getEntAddress() {
            return this.entAddress;
        }

        /**
         * @return entBrief
         */
        public String getEntBrief() {
            return this.entBrief;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return entNameEng
         */
        public String getEntNameEng() {
            return this.entNameEng;
        }

        /**
         * @return entStatus
         */
        public String getEntStatus() {
            return this.entStatus;
        }

        /**
         * @return entType
         */
        public String getEntType() {
            return this.entType;
        }

        /**
         * @return esDate
         */
        public String getEsDate() {
            return this.esDate;
        }

        /**
         * @return formerNames
         */
        public String getFormerNames() {
            return this.formerNames;
        }

        /**
         * @return industryNameLv1
         */
        public String getIndustryNameLv1() {
            return this.industryNameLv1;
        }

        /**
         * @return industryNameLv2
         */
        public String getIndustryNameLv2() {
            return this.industryNameLv2;
        }

        /**
         * @return insuredNum
         */
        public String getInsuredNum() {
            return this.insuredNum;
        }

        /**
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return licenseNumber
         */
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        /**
         * @return opFrom
         */
        public String getOpFrom() {
            return this.opFrom;
        }

        /**
         * @return opScope
         */
        public String getOpScope() {
            return this.opScope;
        }

        /**
         * @return opTo
         */
        public String getOpTo() {
            return this.opTo;
        }

        /**
         * @return orgNo
         */
        public String getOrgNo() {
            return this.orgNo;
        }

        /**
         * @return recCap
         */
        public String getRecCap() {
            return this.recCap;
        }

        /**
         * @return regCap
         */
        public String getRegCap() {
            return this.regCap;
        }

        /**
         * @return regOrg
         */
        public String getRegOrg() {
            return this.regOrg;
        }

        /**
         * @return regOrgCity
         */
        public String getRegOrgCity() {
            return this.regOrgCity;
        }

        /**
         * @return regOrgDistrict
         */
        public String getRegOrgDistrict() {
            return this.regOrgDistrict;
        }

        /**
         * @return regOrgProvince
         */
        public String getRegOrgProvince() {
            return this.regOrgProvince;
        }

        /**
         * @return socialCreditCode
         */
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

        /**
         * @return staffNum
         */
        public String getStaffNum() {
            return this.staffNum;
        }

        /**
         * @return taxNum
         */
        public String getTaxNum() {
            return this.taxNum;
        }

        public static final class Builder {
            private String checkDate; 
            private String entAddress; 
            private String entBrief; 
            private String entName; 
            private String entNameEng; 
            private String entStatus; 
            private String entType; 
            private String esDate; 
            private String formerNames; 
            private String industryNameLv1; 
            private String industryNameLv2; 
            private String insuredNum; 
            private String legalName; 
            private String licenseNumber; 
            private String opFrom; 
            private String opScope; 
            private String opTo; 
            private String orgNo; 
            private String recCap; 
            private String regCap; 
            private String regOrg; 
            private String regOrgCity; 
            private String regOrgDistrict; 
            private String regOrgProvince; 
            private String socialCreditCode; 
            private String staffNum; 
            private String taxNum; 

            /**
             * 核准日期
             */
            public Builder checkDate(String checkDate) {
                this.checkDate = checkDate;
                return this;
            }

            /**
             * 企业地址
             */
            public Builder entAddress(String entAddress) {
                this.entAddress = entAddress;
                return this;
            }

            /**
             * 公司简介
             */
            public Builder entBrief(String entBrief) {
                this.entBrief = entBrief;
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
             * 英文名称
             */
            public Builder entNameEng(String entNameEng) {
                this.entNameEng = entNameEng;
                return this;
            }

            /**
             * 经营状态
             */
            public Builder entStatus(String entStatus) {
                this.entStatus = entStatus;
                return this;
            }

            /**
             * 企业类型
             */
            public Builder entType(String entType) {
                this.entType = entType;
                return this;
            }

            /**
             * 成立日期
             */
            public Builder esDate(String esDate) {
                this.esDate = esDate;
                return this;
            }

            /**
             * 曾用名
             */
            public Builder formerNames(String formerNames) {
                this.formerNames = formerNames;
                return this;
            }

            /**
             * 国民经济行业门类名称
             */
            public Builder industryNameLv1(String industryNameLv1) {
                this.industryNameLv1 = industryNameLv1;
                return this;
            }

            /**
             * 国民经济行业大类名称
             */
            public Builder industryNameLv2(String industryNameLv2) {
                this.industryNameLv2 = industryNameLv2;
                return this;
            }

            /**
             * 参保人数
             */
            public Builder insuredNum(String insuredNum) {
                this.insuredNum = insuredNum;
                return this;
            }

            /**
             * 法定代表人
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 工商注册号
             */
            public Builder licenseNumber(String licenseNumber) {
                this.licenseNumber = licenseNumber;
                return this;
            }

            /**
             * 经营期限自
             */
            public Builder opFrom(String opFrom) {
                this.opFrom = opFrom;
                return this;
            }

            /**
             * 经营范围
             */
            public Builder opScope(String opScope) {
                this.opScope = opScope;
                return this;
            }

            /**
             * 经营期限至
             */
            public Builder opTo(String opTo) {
                this.opTo = opTo;
                return this;
            }

            /**
             * 组织机构代码
             */
            public Builder orgNo(String orgNo) {
                this.orgNo = orgNo;
                return this;
            }

            /**
             * 实收注册资本
             */
            public Builder recCap(String recCap) {
                this.recCap = recCap;
                return this;
            }

            /**
             * 注册资本
             */
            public Builder regCap(String regCap) {
                this.regCap = regCap;
                return this;
            }

            /**
             * 登记机关
             */
            public Builder regOrg(String regOrg) {
                this.regOrg = regOrg;
                return this;
            }

            /**
             * 注册地址所在城市
             */
            public Builder regOrgCity(String regOrgCity) {
                this.regOrgCity = regOrgCity;
                return this;
            }

            /**
             * 注册地址所在区县
             */
            public Builder regOrgDistrict(String regOrgDistrict) {
                this.regOrgDistrict = regOrgDistrict;
                return this;
            }

            /**
             * 注册地址所在省
             */
            public Builder regOrgProvince(String regOrgProvince) {
                this.regOrgProvince = regOrgProvince;
                return this;
            }

            /**
             * 统一社会信用代码
             */
            public Builder socialCreditCode(String socialCreditCode) {
                this.socialCreditCode = socialCreditCode;
                return this;
            }

            /**
             * 人员规模
             */
            public Builder staffNum(String staffNum) {
                this.staffNum = staffNum;
                return this;
            }

            /**
             * 纳税人识别号
             */
            public Builder taxNum(String taxNum) {
                this.taxNum = taxNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
