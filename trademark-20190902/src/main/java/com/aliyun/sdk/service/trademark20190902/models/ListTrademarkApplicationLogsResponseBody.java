// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrademarkApplicationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrademarkApplicationLogsResponseBody</p>
 */
public class ListTrademarkApplicationLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrademarkApplicationLogs")
    private TrademarkApplicationLogs trademarkApplicationLogs;

    private ListTrademarkApplicationLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trademarkApplicationLogs = builder.trademarkApplicationLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrademarkApplicationLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trademarkApplicationLogs
     */
    public TrademarkApplicationLogs getTrademarkApplicationLogs() {
        return this.trademarkApplicationLogs;
    }

    public static final class Builder {
        private String requestId; 
        private TrademarkApplicationLogs trademarkApplicationLogs; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrademarkApplicationLogs.
         */
        public Builder trademarkApplicationLogs(TrademarkApplicationLogs trademarkApplicationLogs) {
            this.trademarkApplicationLogs = trademarkApplicationLogs;
            return this;
        }

        public ListTrademarkApplicationLogsResponseBody build() {
            return new ListTrademarkApplicationLogsResponseBody(this);
        } 

    } 

    public static class TrademarkApplicationLog extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizStatus")
        private Integer bizStatus;

        @NameInMap("Note")
        private String note;

        @NameInMap("OperateTime")
        private Long operateTime;

        @NameInMap("OperateType")
        private Integer operateType;

        private TrademarkApplicationLog(Builder builder) {
            this.bizId = builder.bizId;
            this.bizStatus = builder.bizStatus;
            this.note = builder.note;
            this.operateTime = builder.operateTime;
            this.operateType = builder.operateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkApplicationLog create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizStatus
         */
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operateType
         */
        public Integer getOperateType() {
            return this.operateType;
        }

        public static final class Builder {
            private String bizId; 
            private Integer bizStatus; 
            private String note; 
            private Long operateTime; 
            private Integer operateType; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizStatus.
             */
            public Builder bizStatus(Integer bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(Integer operateType) {
                this.operateType = operateType;
                return this;
            }

            public TrademarkApplicationLog build() {
                return new TrademarkApplicationLog(this);
            } 

        } 

    }
    public static class TrademarkApplicationLogs extends TeaModel {
        @NameInMap("TrademarkApplicationLog")
        private java.util.List < TrademarkApplicationLog> trademarkApplicationLog;

        private TrademarkApplicationLogs(Builder builder) {
            this.trademarkApplicationLog = builder.trademarkApplicationLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkApplicationLogs create() {
            return builder().build();
        }

        /**
         * @return trademarkApplicationLog
         */
        public java.util.List < TrademarkApplicationLog> getTrademarkApplicationLog() {
            return this.trademarkApplicationLog;
        }

        public static final class Builder {
            private java.util.List < TrademarkApplicationLog> trademarkApplicationLog; 

            /**
             * TrademarkApplicationLog.
             */
            public Builder trademarkApplicationLog(java.util.List < TrademarkApplicationLog> trademarkApplicationLog) {
                this.trademarkApplicationLog = trademarkApplicationLog;
                return this;
            }

            public TrademarkApplicationLogs build() {
                return new TrademarkApplicationLogs(this);
            } 

        } 

    }
}
