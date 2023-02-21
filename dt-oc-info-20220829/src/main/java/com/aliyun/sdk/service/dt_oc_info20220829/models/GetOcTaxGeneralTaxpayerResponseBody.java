// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxGeneralTaxpayerResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcTaxGeneralTaxpayerResponseBody</p>
 */
public class GetOcTaxGeneralTaxpayerResponseBody extends TeaModel {
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

    private GetOcTaxGeneralTaxpayerResponseBody(Builder builder) {
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

    public static GetOcTaxGeneralTaxpayerResponseBody create() {
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

        public GetOcTaxGeneralTaxpayerResponseBody build() {
            return new GetOcTaxGeneralTaxpayerResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("JudgeDate")
        private String judgeDate;

        @NameInMap("Qualification")
        private String qualification;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("TaxpayerNum")
        private String taxpayerNum;

        private Data(Builder builder) {
            this.department = builder.department;
            this.endDate = builder.endDate;
            this.entName = builder.entName;
            this.judgeDate = builder.judgeDate;
            this.qualification = builder.qualification;
            this.startDate = builder.startDate;
            this.taxpayerNum = builder.taxpayerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return judgeDate
         */
        public String getJudgeDate() {
            return this.judgeDate;
        }

        /**
         * @return qualification
         */
        public String getQualification() {
            return this.qualification;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return taxpayerNum
         */
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public static final class Builder {
            private String department; 
            private String endDate; 
            private String entName; 
            private String judgeDate; 
            private String qualification; 
            private String startDate; 
            private String taxpayerNum; 

            /**
             * 主营税务机关
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 有效日期止
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
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
             * 认定日期
             */
            public Builder judgeDate(String judgeDate) {
                this.judgeDate = judgeDate;
                return this;
            }

            /**
             * 纳税人资格
             */
            public Builder qualification(String qualification) {
                this.qualification = qualification;
                return this;
            }

            /**
             * 有效日期起
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * 纳税人识别号
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
