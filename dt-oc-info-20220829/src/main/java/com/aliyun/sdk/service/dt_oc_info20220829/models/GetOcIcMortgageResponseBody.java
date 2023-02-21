// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcMortgageResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcMortgageResponseBody</p>
 */
public class GetOcIcMortgageResponseBody extends TeaModel {
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

    private GetOcIcMortgageResponseBody(Builder builder) {
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

    public static GetOcIcMortgageResponseBody create() {
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

        public GetOcIcMortgageResponseBody build() {
            return new GetOcIcMortgageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DebitAmount")
        private String debitAmount;

        @NameInMap("DebitPeriod")
        private String debitPeriod;

        @NameInMap("DebitScope")
        private String debitScope;

        @NameInMap("DebitType")
        private String debitType;

        @NameInMap("Department")
        private String department;

        @NameInMap("Guarantees")
        private String guarantees;

        @NameInMap("IdentifyNo")
        private String identifyNo;

        @NameInMap("IdentifyType")
        private String identifyType;

        @NameInMap("MortgageesName")
        private String mortgageesName;

        @NameInMap("Number")
        private String number;

        @NameInMap("OnecompId")
        private String onecompId;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("RegDate")
        private String regDate;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.debitAmount = builder.debitAmount;
            this.debitPeriod = builder.debitPeriod;
            this.debitScope = builder.debitScope;
            this.debitType = builder.debitType;
            this.department = builder.department;
            this.guarantees = builder.guarantees;
            this.identifyNo = builder.identifyNo;
            this.identifyType = builder.identifyType;
            this.mortgageesName = builder.mortgageesName;
            this.number = builder.number;
            this.onecompId = builder.onecompId;
            this.publicDate = builder.publicDate;
            this.regDate = builder.regDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return debitAmount
         */
        public String getDebitAmount() {
            return this.debitAmount;
        }

        /**
         * @return debitPeriod
         */
        public String getDebitPeriod() {
            return this.debitPeriod;
        }

        /**
         * @return debitScope
         */
        public String getDebitScope() {
            return this.debitScope;
        }

        /**
         * @return debitType
         */
        public String getDebitType() {
            return this.debitType;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return guarantees
         */
        public String getGuarantees() {
            return this.guarantees;
        }

        /**
         * @return identifyNo
         */
        public String getIdentifyNo() {
            return this.identifyNo;
        }

        /**
         * @return identifyType
         */
        public String getIdentifyType() {
            return this.identifyType;
        }

        /**
         * @return mortgageesName
         */
        public String getMortgageesName() {
            return this.mortgageesName;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return onecompId
         */
        public String getOnecompId() {
            return this.onecompId;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return regDate
         */
        public String getRegDate() {
            return this.regDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String debitAmount; 
            private String debitPeriod; 
            private String debitScope; 
            private String debitType; 
            private String department; 
            private String guarantees; 
            private String identifyNo; 
            private String identifyType; 
            private String mortgageesName; 
            private String number; 
            private String onecompId; 
            private String publicDate; 
            private String regDate; 
            private String status; 

            /**
             * 数额
             */
            public Builder debitAmount(String debitAmount) {
                this.debitAmount = debitAmount;
                return this;
            }

            /**
             * 债务履行期限
             */
            public Builder debitPeriod(String debitPeriod) {
                this.debitPeriod = debitPeriod;
                return this;
            }

            /**
             * 担保范围
             */
            public Builder debitScope(String debitScope) {
                this.debitScope = debitScope;
                return this;
            }

            /**
             * 种类
             */
            public Builder debitType(String debitType) {
                this.debitType = debitType;
                return this;
            }

            /**
             * 登记机关
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 抵押物
             */
            public Builder guarantees(String guarantees) {
                this.guarantees = guarantees;
                return this;
            }

            /**
             * 证件号码
             */
            public Builder identifyNo(String identifyNo) {
                this.identifyNo = identifyNo;
                return this;
            }

            /**
             * 抵押权人证照
             */
            public Builder identifyType(String identifyType) {
                this.identifyType = identifyType;
                return this;
            }

            /**
             * 抵押权人名称
             */
            public Builder mortgageesName(String mortgageesName) {
                this.mortgageesName = mortgageesName;
                return this;
            }

            /**
             * 登记编号
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * ocid
             */
            public Builder onecompId(String onecompId) {
                this.onecompId = onecompId;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 登记日期
             */
            public Builder regDate(String regDate) {
                this.regDate = regDate;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
