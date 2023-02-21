// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcEquityPledgeResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcEquityPledgeResponseBody</p>
 */
public class GetOcIcEquityPledgeResponseBody extends TeaModel {
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

    private GetOcIcEquityPledgeResponseBody(Builder builder) {
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

    public static GetOcIcEquityPledgeResponseBody create() {
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

        public GetOcIcEquityPledgeResponseBody build() {
            return new GetOcIcEquityPledgeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Number")
        private String number;

        @NameInMap("Pawnee")
        private String pawnee;

        @NameInMap("PawneeIdentifyNo")
        private String pawneeIdentifyNo;

        @NameInMap("Pledgor")
        private String pledgor;

        @NameInMap("PledgorAmount")
        private String pledgorAmount;

        @NameInMap("PledgorIdentifyNo")
        private String pledgorIdentifyNo;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("RegDate")
        private String regDate;

        @NameInMap("RelatedComp")
        private String relatedComp;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.number = builder.number;
            this.pawnee = builder.pawnee;
            this.pawneeIdentifyNo = builder.pawneeIdentifyNo;
            this.pledgor = builder.pledgor;
            this.pledgorAmount = builder.pledgorAmount;
            this.pledgorIdentifyNo = builder.pledgorIdentifyNo;
            this.publicDate = builder.publicDate;
            this.regDate = builder.regDate;
            this.relatedComp = builder.relatedComp;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return pawnee
         */
        public String getPawnee() {
            return this.pawnee;
        }

        /**
         * @return pawneeIdentifyNo
         */
        public String getPawneeIdentifyNo() {
            return this.pawneeIdentifyNo;
        }

        /**
         * @return pledgor
         */
        public String getPledgor() {
            return this.pledgor;
        }

        /**
         * @return pledgorAmount
         */
        public String getPledgorAmount() {
            return this.pledgorAmount;
        }

        /**
         * @return pledgorIdentifyNo
         */
        public String getPledgorIdentifyNo() {
            return this.pledgorIdentifyNo;
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
         * @return relatedComp
         */
        public String getRelatedComp() {
            return this.relatedComp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String number; 
            private String pawnee; 
            private String pawneeIdentifyNo; 
            private String pledgor; 
            private String pledgorAmount; 
            private String pledgorIdentifyNo; 
            private String publicDate; 
            private String regDate; 
            private String relatedComp; 
            private String status; 

            /**
             * 登记编号
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * 质权人
             */
            public Builder pawnee(String pawnee) {
                this.pawnee = pawnee;
                return this;
            }

            /**
             * 质权人证件号码
             */
            public Builder pawneeIdentifyNo(String pawneeIdentifyNo) {
                this.pawneeIdentifyNo = pawneeIdentifyNo;
                return this;
            }

            /**
             * 出质人
             */
            public Builder pledgor(String pledgor) {
                this.pledgor = pledgor;
                return this;
            }

            /**
             * 出质股权数
             */
            public Builder pledgorAmount(String pledgorAmount) {
                this.pledgorAmount = pledgorAmount;
                return this;
            }

            /**
             * 出质人证照/证件号码
             */
            public Builder pledgorIdentifyNo(String pledgorIdentifyNo) {
                this.pledgorIdentifyNo = pledgorIdentifyNo;
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
             * 标的方
             */
            public Builder relatedComp(String relatedComp) {
                this.relatedComp = relatedComp;
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
