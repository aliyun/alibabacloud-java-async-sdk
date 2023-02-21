// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcSimpleCancelResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcSimpleCancelResponseBody</p>
 */
public class GetOcIcSimpleCancelResponseBody extends TeaModel {
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

    private GetOcIcSimpleCancelResponseBody(Builder builder) {
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

    public static GetOcIcSimpleCancelResponseBody create() {
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

        public GetOcIcSimpleCancelResponseBody build() {
            return new GetOcIcSimpleCancelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("NoticePeriod")
        private String noticePeriod;

        @NameInMap("ScaContent")
        private String scaContent;

        @NameInMap("ScaDate")
        private String scaDate;

        @NameInMap("ScaProposer")
        private String scaProposer;

        @NameInMap("ScaResult")
        private String scaResult;

        @NameInMap("ScaResultDate")
        private String scaResultDate;

        @NameInMap("SocialCreditCode")
        private String socialCreditCode;

        private Data(Builder builder) {
            this.department = builder.department;
            this.entName = builder.entName;
            this.noticePeriod = builder.noticePeriod;
            this.scaContent = builder.scaContent;
            this.scaDate = builder.scaDate;
            this.scaProposer = builder.scaProposer;
            this.scaResult = builder.scaResult;
            this.scaResultDate = builder.scaResultDate;
            this.socialCreditCode = builder.socialCreditCode;
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
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return noticePeriod
         */
        public String getNoticePeriod() {
            return this.noticePeriod;
        }

        /**
         * @return scaContent
         */
        public String getScaContent() {
            return this.scaContent;
        }

        /**
         * @return scaDate
         */
        public String getScaDate() {
            return this.scaDate;
        }

        /**
         * @return scaProposer
         */
        public String getScaProposer() {
            return this.scaProposer;
        }

        /**
         * @return scaResult
         */
        public String getScaResult() {
            return this.scaResult;
        }

        /**
         * @return scaResultDate
         */
        public String getScaResultDate() {
            return this.scaResultDate;
        }

        /**
         * @return socialCreditCode
         */
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

        public static final class Builder {
            private String department; 
            private String entName; 
            private String noticePeriod; 
            private String scaContent; 
            private String scaDate; 
            private String scaProposer; 
            private String scaResult; 
            private String scaResultDate; 
            private String socialCreditCode; 

            /**
             * 登记机关
             */
            public Builder department(String department) {
                this.department = department;
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
             * 公告期
             */
            public Builder noticePeriod(String noticePeriod) {
                this.noticePeriod = noticePeriod;
                return this;
            }

            /**
             * 异议内容
             */
            public Builder scaContent(String scaContent) {
                this.scaContent = scaContent;
                return this;
            }

            /**
             * 异议时间
             */
            public Builder scaDate(String scaDate) {
                this.scaDate = scaDate;
                return this;
            }

            /**
             * 异议申请人
             */
            public Builder scaProposer(String scaProposer) {
                this.scaProposer = scaProposer;
                return this;
            }

            /**
             * 简易注销结果
             */
            public Builder scaResult(String scaResult) {
                this.scaResult = scaResult;
                return this;
            }

            /**
             * 公告申请日期
             */
            public Builder scaResultDate(String scaResultDate) {
                this.scaResultDate = scaResultDate;
                return this;
            }

            /**
             * 企业统一信用代码
             */
            public Builder socialCreditCode(String socialCreditCode) {
                this.socialCreditCode = socialCreditCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
