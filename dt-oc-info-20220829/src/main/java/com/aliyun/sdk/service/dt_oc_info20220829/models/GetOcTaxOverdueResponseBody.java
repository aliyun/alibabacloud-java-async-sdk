// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxOverdueResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcTaxOverdueResponseBody</p>
 */
public class GetOcTaxOverdueResponseBody extends TeaModel {
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

    private GetOcTaxOverdueResponseBody(Builder builder) {
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

    public static GetOcTaxOverdueResponseBody create() {
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

        public GetOcTaxOverdueResponseBody build() {
            return new GetOcTaxOverdueResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CurrOverdueAmount")
        private String currOverdueAmount;

        @NameInMap("Department")
        private String department;

        @NameInMap("EntAddress")
        private String entAddress;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("OverdueAmount")
        private String overdueAmount;

        @NameInMap("OverdueType")
        private String overdueType;

        @NameInMap("PublishDate")
        private String publishDate;

        @NameInMap("TaxpayerNum")
        private String taxpayerNum;

        @NameInMap("TaxpayerType")
        private String taxpayerType;

        private Data(Builder builder) {
            this.currOverdueAmount = builder.currOverdueAmount;
            this.department = builder.department;
            this.entAddress = builder.entAddress;
            this.entName = builder.entName;
            this.legalName = builder.legalName;
            this.overdueAmount = builder.overdueAmount;
            this.overdueType = builder.overdueType;
            this.publishDate = builder.publishDate;
            this.taxpayerNum = builder.taxpayerNum;
            this.taxpayerType = builder.taxpayerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currOverdueAmount
         */
        public String getCurrOverdueAmount() {
            return this.currOverdueAmount;
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
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return overdueAmount
         */
        public String getOverdueAmount() {
            return this.overdueAmount;
        }

        /**
         * @return overdueType
         */
        public String getOverdueType() {
            return this.overdueType;
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

        /**
         * @return taxpayerType
         */
        public String getTaxpayerType() {
            return this.taxpayerType;
        }

        public static final class Builder {
            private String currOverdueAmount; 
            private String department; 
            private String entAddress; 
            private String entName; 
            private String legalName; 
            private String overdueAmount; 
            private String overdueType; 
            private String publishDate; 
            private String taxpayerNum; 
            private String taxpayerType; 

            /**
             * 当前新发生的欠税余额
             */
            public Builder currOverdueAmount(String currOverdueAmount) {
                this.currOverdueAmount = currOverdueAmount;
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
             * 公司经营地点
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
             * 负责人姓名
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 合计欠税余额
             */
            public Builder overdueAmount(String overdueAmount) {
                this.overdueAmount = overdueAmount;
                return this;
            }

            /**
             * 欠税税种
             */
            public Builder overdueType(String overdueType) {
                this.overdueType = overdueType;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * 纳税人识别号
             */
            public Builder taxpayerNum(String taxpayerNum) {
                this.taxpayerNum = taxpayerNum;
                return this;
            }

            /**
             * 纳税人类型
             */
            public Builder taxpayerType(String taxpayerType) {
                this.taxpayerType = taxpayerType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
