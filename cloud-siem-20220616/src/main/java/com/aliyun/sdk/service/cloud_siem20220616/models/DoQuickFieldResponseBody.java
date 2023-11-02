// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoQuickFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DoQuickFieldResponseBody</p>
 */
public class DoQuickFieldResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DoQuickFieldResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoQuickFieldResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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

        public DoQuickFieldResponseBody build() {
            return new DoQuickFieldResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AggQueryd")
        private String aggQueryd;

        @NameInMap("CompleteOrNot")
        private Boolean completeOrNot;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("HasSQL")
        private Boolean hasSQL;

        @NameInMap("Keys")
        private java.util.List < String > keys;

        @NameInMap("Limited")
        private Long limited;

        @NameInMap("Logs")
        private java.util.List < ? > logs;

        @NameInMap("PQuery")
        private String pQuery;

        @NameInMap("ProcessedRows")
        private Long processedRows;

        @NameInMap("QueryMode")
        private Integer queryMode;

        @NameInMap("WhereQuery")
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
             * AggQueryd.
             */
            public Builder aggQueryd(String aggQueryd) {
                this.aggQueryd = aggQueryd;
                return this;
            }

            /**
             * CompleteOrNot.
             */
            public Builder completeOrNot(Boolean completeOrNot) {
                this.completeOrNot = completeOrNot;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * HasSQL.
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * Keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * Limited.
             */
            public Builder limited(Long limited) {
                this.limited = limited;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < ? > logs) {
                this.logs = logs;
                return this;
            }

            /**
             * PQuery.
             */
            public Builder pQuery(String pQuery) {
                this.pQuery = pQuery;
                return this;
            }

            /**
             * ProcessedRows.
             */
            public Builder processedRows(Long processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * QueryMode.
             */
            public Builder queryMode(Integer queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * WhereQuery.
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
