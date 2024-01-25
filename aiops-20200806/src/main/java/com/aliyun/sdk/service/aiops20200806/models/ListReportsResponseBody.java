// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListReportsResponseBody</p>
 */
public class ListReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageTotal")
    private Long pageTotal;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private ListReportsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return pageTotal
     */
    public Long getPageTotal() {
        return this.pageTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private Long pageTotal; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * PageTotal.
         */
        public Builder pageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListReportsResponseBody build() {
            return new ListReportsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("bid")
        private String bid;

        @NameInMap("cid")
        private Long cid;

        @NameInMap("costCount")
        private Long costCount;

        @NameInMap("costCountTrendJson")
        private String costCountTrendJson;

        @NameInMap("criticalCount")
        private Long criticalCount;

        @NameInMap("criticalCountTrendJson")
        private String criticalCountTrendJson;

        @NameInMap("customerName")
        private String customerName;

        @NameInMap("gcLevel")
        private String gcLevel;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("id")
        private Long id;

        @NameInMap("normalCount")
        private Long normalCount;

        @NameInMap("normalCountTrendJson")
        private String normalCountTrendJson;

        @NameInMap("score")
        private Long score;

        @NameInMap("scoreTrendJson")
        private String scoreTrendJson;

        @NameInMap("trendJson")
        private String trendJson;

        @NameInMap("uid")
        private Long uid;

        @NameInMap("warningCount")
        private Long warningCount;

        @NameInMap("warningCountTrendJson")
        private String warningCountTrendJson;

        private Data(Builder builder) {
            this.bid = builder.bid;
            this.cid = builder.cid;
            this.costCount = builder.costCount;
            this.costCountTrendJson = builder.costCountTrendJson;
            this.criticalCount = builder.criticalCount;
            this.criticalCountTrendJson = builder.criticalCountTrendJson;
            this.customerName = builder.customerName;
            this.gcLevel = builder.gcLevel;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.normalCount = builder.normalCount;
            this.normalCountTrendJson = builder.normalCountTrendJson;
            this.score = builder.score;
            this.scoreTrendJson = builder.scoreTrendJson;
            this.trendJson = builder.trendJson;
            this.uid = builder.uid;
            this.warningCount = builder.warningCount;
            this.warningCountTrendJson = builder.warningCountTrendJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return cid
         */
        public Long getCid() {
            return this.cid;
        }

        /**
         * @return costCount
         */
        public Long getCostCount() {
            return this.costCount;
        }

        /**
         * @return costCountTrendJson
         */
        public String getCostCountTrendJson() {
            return this.costCountTrendJson;
        }

        /**
         * @return criticalCount
         */
        public Long getCriticalCount() {
            return this.criticalCount;
        }

        /**
         * @return criticalCountTrendJson
         */
        public String getCriticalCountTrendJson() {
            return this.criticalCountTrendJson;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return gcLevel
         */
        public String getGcLevel() {
            return this.gcLevel;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return normalCount
         */
        public Long getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return normalCountTrendJson
         */
        public String getNormalCountTrendJson() {
            return this.normalCountTrendJson;
        }

        /**
         * @return score
         */
        public Long getScore() {
            return this.score;
        }

        /**
         * @return scoreTrendJson
         */
        public String getScoreTrendJson() {
            return this.scoreTrendJson;
        }

        /**
         * @return trendJson
         */
        public String getTrendJson() {
            return this.trendJson;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return warningCount
         */
        public Long getWarningCount() {
            return this.warningCount;
        }

        /**
         * @return warningCountTrendJson
         */
        public String getWarningCountTrendJson() {
            return this.warningCountTrendJson;
        }

        public static final class Builder {
            private String bid; 
            private Long cid; 
            private Long costCount; 
            private String costCountTrendJson; 
            private Long criticalCount; 
            private String criticalCountTrendJson; 
            private String customerName; 
            private String gcLevel; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long normalCount; 
            private String normalCountTrendJson; 
            private Long score; 
            private String scoreTrendJson; 
            private String trendJson; 
            private Long uid; 
            private Long warningCount; 
            private String warningCountTrendJson; 

            /**
             * bid.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * cid.
             */
            public Builder cid(Long cid) {
                this.cid = cid;
                return this;
            }

            /**
             * costCount.
             */
            public Builder costCount(Long costCount) {
                this.costCount = costCount;
                return this;
            }

            /**
             * costCountTrendJson.
             */
            public Builder costCountTrendJson(String costCountTrendJson) {
                this.costCountTrendJson = costCountTrendJson;
                return this;
            }

            /**
             * criticalCount.
             */
            public Builder criticalCount(Long criticalCount) {
                this.criticalCount = criticalCount;
                return this;
            }

            /**
             * criticalCountTrendJson.
             */
            public Builder criticalCountTrendJson(String criticalCountTrendJson) {
                this.criticalCountTrendJson = criticalCountTrendJson;
                return this;
            }

            /**
             * customerName.
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * gcLevel.
             */
            public Builder gcLevel(String gcLevel) {
                this.gcLevel = gcLevel;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * normalCount.
             */
            public Builder normalCount(Long normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * normalCountTrendJson.
             */
            public Builder normalCountTrendJson(String normalCountTrendJson) {
                this.normalCountTrendJson = normalCountTrendJson;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Long score) {
                this.score = score;
                return this;
            }

            /**
             * scoreTrendJson.
             */
            public Builder scoreTrendJson(String scoreTrendJson) {
                this.scoreTrendJson = scoreTrendJson;
                return this;
            }

            /**
             * trendJson.
             */
            public Builder trendJson(String trendJson) {
                this.trendJson = trendJson;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * warningCount.
             */
            public Builder warningCount(Long warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            /**
             * warningCountTrendJson.
             */
            public Builder warningCountTrendJson(String warningCountTrendJson) {
                this.warningCountTrendJson = warningCountTrendJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
