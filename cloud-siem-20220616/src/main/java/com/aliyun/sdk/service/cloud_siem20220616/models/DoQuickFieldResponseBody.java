// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoQuickFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DoQuickFieldResponseBody</p>
 */
public class DoQuickFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DoQuickFieldResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoQuickFieldResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response of the quick analysis.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DoQuickFieldResponseBody build() {
            return new DoQuickFieldResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggQueryd")
        private String aggQueryd;

        @com.aliyun.core.annotation.NameInMap("CompleteOrNot")
        private Boolean completeOrNot;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("HasSQL")
        private Boolean hasSQL;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List < String > keys;

        @com.aliyun.core.annotation.NameInMap("Limited")
        private Long limited;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List < ? > logs;

        @com.aliyun.core.annotation.NameInMap("PQuery")
        private String pQuery;

        @com.aliyun.core.annotation.NameInMap("ProcessedRows")
        private Long processedRows;

        @com.aliyun.core.annotation.NameInMap("QueryMode")
        private Integer queryMode;

        @com.aliyun.core.annotation.NameInMap("WhereQuery")
        private String whereQuery;

        private Data(Builder builder) {
            this.aggQueryd = builder.aggQueryd;
            this.completeOrNot = builder.completeOrNot;
            this.count = builder.count;
            this.hasSQL = builder.hasSQL;
            this.keys = builder.keys;
            this.limited = builder.limited;
            this.logs = builder.logs;
            this.pQuery = builder.pQuery;
            this.processedRows = builder.processedRows;
            this.queryMode = builder.queryMode;
            this.whereQuery = builder.whereQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aggQueryd
         */
        public String getAggQueryd() {
            return this.aggQueryd;
        }

        /**
         * @return completeOrNot
         */
        public Boolean getCompleteOrNot() {
            return this.completeOrNot;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return hasSQL
         */
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        /**
         * @return keys
         */
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        /**
         * @return limited
         */
        public Long getLimited() {
            return this.limited;
        }

        /**
         * @return logs
         */
        public java.util.List < ? > getLogs() {
            return this.logs;
        }

        /**
         * @return pQuery
         */
        public String getPQuery() {
            return this.pQuery;
        }

        /**
         * @return processedRows
         */
        public Long getProcessedRows() {
            return this.processedRows;
        }

        /**
         * @return queryMode
         */
        public Integer getQueryMode() {
            return this.queryMode;
        }

        /**
         * @return whereQuery
         */
        public String getWhereQuery() {
            return this.whereQuery;
        }

        public static final class Builder {
            private String aggQueryd; 
            private Boolean completeOrNot; 
            private Integer count; 
            private Boolean hasSQL; 
            private java.util.List < String > keys; 
            private Long limited; 
            private java.util.List < ? > logs; 
            private String pQuery; 
            private Long processedRows; 
            private Integer queryMode; 
            private String whereQuery; 

            /**
             * This parameter is deprecated.
             */
            public Builder aggQueryd(String aggQueryd) {
                this.aggQueryd = aggQueryd;
                return this;
            }

            /**
             * Indicates whether the quick analysis was successful. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder completeOrNot(Boolean completeOrNot) {
                this.completeOrNot = completeOrNot;
                return this;
            }

            /**
             * The number of entries returned.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder limited(Long limited) {
                this.limited = limited;
                return this;
            }

            /**
             * The logs queried by using the quick analysis feature.
             */
            public Builder logs(java.util.List < ? > logs) {
                this.logs = logs;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder pQuery(String pQuery) {
                this.pQuery = pQuery;
                return this;
            }

            /**
             * The number of entries queried.
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder queryMode(Integer queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder whereQuery(String whereQuery) {
                this.whereQuery = whereQuery;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
