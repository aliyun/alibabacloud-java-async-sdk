// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryCardSmsStatisticsSendResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardSmsStatisticsSendResponseBody</p>
 */
public class QueryCardSmsStatisticsSendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCardSmsStatisticsSendResponseBody(Builder builder) {
        this.code = builder.code;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsStatisticsSendResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
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

    public static final class Builder {
        private String code; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCardSmsStatisticsSendResponseBody model) {
            this.code = model.code;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public QueryCardSmsStatisticsSendResponseBody build() {
            return new QueryCardSmsStatisticsSendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCardSmsStatisticsSendResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsStatisticsSendResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomTmpCode")
        private String customTmpCode;

        @com.aliyun.core.annotation.NameInMap("RenderSuccessRate")
        private Double renderSuccessRate;

        @com.aliyun.core.annotation.NameInMap("RenderSuccessTotal")
        private Long renderSuccessTotal;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("SendFailTotal")
        private Long sendFailTotal;

        @com.aliyun.core.annotation.NameInMap("SendProcessTotal")
        private Long sendProcessTotal;

        @com.aliyun.core.annotation.NameInMap("SendSuccessRate")
        private Double sendSuccessRate;

        @com.aliyun.core.annotation.NameInMap("SendSuccessTotal")
        private Long sendSuccessTotal;

        @com.aliyun.core.annotation.NameInMap("SendTotal")
        private Long sendTotal;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("SupportRate")
        private Double supportRate;

        @com.aliyun.core.annotation.NameInMap("SupportTotal")
        private Long supportTotal;

        @com.aliyun.core.annotation.NameInMap("TmpCode")
        private String tmpCode;

        private Records(Builder builder) {
            this.customTmpCode = builder.customTmpCode;
            this.renderSuccessRate = builder.renderSuccessRate;
            this.renderSuccessTotal = builder.renderSuccessTotal;
            this.sendDate = builder.sendDate;
            this.sendFailTotal = builder.sendFailTotal;
            this.sendProcessTotal = builder.sendProcessTotal;
            this.sendSuccessRate = builder.sendSuccessRate;
            this.sendSuccessTotal = builder.sendSuccessTotal;
            this.sendTotal = builder.sendTotal;
            this.signName = builder.signName;
            this.supportRate = builder.supportRate;
            this.supportTotal = builder.supportTotal;
            this.tmpCode = builder.tmpCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return customTmpCode
         */
        public String getCustomTmpCode() {
            return this.customTmpCode;
        }

        /**
         * @return renderSuccessRate
         */
        public Double getRenderSuccessRate() {
            return this.renderSuccessRate;
        }

        /**
         * @return renderSuccessTotal
         */
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return sendFailTotal
         */
        public Long getSendFailTotal() {
            return this.sendFailTotal;
        }

        /**
         * @return sendProcessTotal
         */
        public Long getSendProcessTotal() {
            return this.sendProcessTotal;
        }

        /**
         * @return sendSuccessRate
         */
        public Double getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        /**
         * @return sendSuccessTotal
         */
        public Long getSendSuccessTotal() {
            return this.sendSuccessTotal;
        }

        /**
         * @return sendTotal
         */
        public Long getSendTotal() {
            return this.sendTotal;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return supportRate
         */
        public Double getSupportRate() {
            return this.supportRate;
        }

        /**
         * @return supportTotal
         */
        public Long getSupportTotal() {
            return this.supportTotal;
        }

        /**
         * @return tmpCode
         */
        public String getTmpCode() {
            return this.tmpCode;
        }

        public static final class Builder {
            private String customTmpCode; 
            private Double renderSuccessRate; 
            private Long renderSuccessTotal; 
            private String sendDate; 
            private Long sendFailTotal; 
            private Long sendProcessTotal; 
            private Double sendSuccessRate; 
            private Long sendSuccessTotal; 
            private Long sendTotal; 
            private String signName; 
            private Double supportRate; 
            private Long supportTotal; 
            private String tmpCode; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.customTmpCode = model.customTmpCode;
                this.renderSuccessRate = model.renderSuccessRate;
                this.renderSuccessTotal = model.renderSuccessTotal;
                this.sendDate = model.sendDate;
                this.sendFailTotal = model.sendFailTotal;
                this.sendProcessTotal = model.sendProcessTotal;
                this.sendSuccessRate = model.sendSuccessRate;
                this.sendSuccessTotal = model.sendSuccessTotal;
                this.sendTotal = model.sendTotal;
                this.signName = model.signName;
                this.supportRate = model.supportRate;
                this.supportTotal = model.supportTotal;
                this.tmpCode = model.tmpCode;
            } 

            /**
             * CustomTmpCode.
             */
            public Builder customTmpCode(String customTmpCode) {
                this.customTmpCode = customTmpCode;
                return this;
            }

            /**
             * RenderSuccessRate.
             */
            public Builder renderSuccessRate(Double renderSuccessRate) {
                this.renderSuccessRate = renderSuccessRate;
                return this;
            }

            /**
             * RenderSuccessTotal.
             */
            public Builder renderSuccessTotal(Long renderSuccessTotal) {
                this.renderSuccessTotal = renderSuccessTotal;
                return this;
            }

            /**
             * SendDate.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * SendFailTotal.
             */
            public Builder sendFailTotal(Long sendFailTotal) {
                this.sendFailTotal = sendFailTotal;
                return this;
            }

            /**
             * SendProcessTotal.
             */
            public Builder sendProcessTotal(Long sendProcessTotal) {
                this.sendProcessTotal = sendProcessTotal;
                return this;
            }

            /**
             * SendSuccessRate.
             */
            public Builder sendSuccessRate(Double sendSuccessRate) {
                this.sendSuccessRate = sendSuccessRate;
                return this;
            }

            /**
             * SendSuccessTotal.
             */
            public Builder sendSuccessTotal(Long sendSuccessTotal) {
                this.sendSuccessTotal = sendSuccessTotal;
                return this;
            }

            /**
             * SendTotal.
             */
            public Builder sendTotal(Long sendTotal) {
                this.sendTotal = sendTotal;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * SupportRate.
             */
            public Builder supportRate(Double supportRate) {
                this.supportRate = supportRate;
                return this;
            }

            /**
             * SupportTotal.
             */
            public Builder supportTotal(Long supportTotal) {
                this.supportTotal = supportTotal;
                return this;
            }

            /**
             * TmpCode.
             */
            public Builder tmpCode(String tmpCode) {
                this.tmpCode = tmpCode;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCardSmsStatisticsSendResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsStatisticsSendResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Model(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
