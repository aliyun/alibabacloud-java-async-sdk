// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlConcurrencyControlRulesHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetSqlConcurrencyControlRulesHistoryResponseBody</p>
 */
public class GetSqlConcurrencyControlRulesHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetSqlConcurrencyControlRulesHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConcurrencyControlRulesHistoryResponseBody create() {
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
    public Data getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information, including the error codes and the number of entries that are returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetSqlConcurrencyControlRulesHistoryResponseBody build() {
            return new GetSqlConcurrencyControlRulesHistoryResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrencyControlTime")
        private Long concurrencyControlTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("KeywordsHash")
        private String keywordsHash;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Long maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("SqlKeywords")
        private String sqlKeywords;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Rules(Builder builder) {
            this.concurrencyControlTime = builder.concurrencyControlTime;
            this.instanceId = builder.instanceId;
            this.itemId = builder.itemId;
            this.keywordsHash = builder.keywordsHash;
            this.maxConcurrency = builder.maxConcurrency;
            this.sqlKeywords = builder.sqlKeywords;
            this.sqlType = builder.sqlType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return concurrencyControlTime
         */
        public Long getConcurrencyControlTime() {
            return this.concurrencyControlTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return keywordsHash
         */
        public String getKeywordsHash() {
            return this.keywordsHash;
        }

        /**
         * @return maxConcurrency
         */
        public Long getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return sqlKeywords
         */
        public String getSqlKeywords() {
            return this.sqlKeywords;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long concurrencyControlTime; 
            private String instanceId; 
            private Long itemId; 
            private String keywordsHash; 
            private Long maxConcurrency; 
            private String sqlKeywords; 
            private String sqlType; 
            private Long startTime; 
            private String status; 
            private String userId; 

            /**
             * The duration within which the SQL throttling rule takes effect. Unit: seconds.
             * <p>
             * 
             * >  The throttling rule takes effect only within this duration.
             */
            public Builder concurrencyControlTime(Long concurrencyControlTime) {
                this.concurrencyControlTime = concurrencyControlTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the throttling rule that is applied to the instance.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * The hash value of the SQL keywords. The SQL keywords are contained in the SQL statements to which the throttling rule is applied.
             */
            public Builder keywordsHash(String keywordsHash) {
                this.keywordsHash = keywordsHash;
                return this;
            }

            /**
             * The maximum number of concurrent SQL statements. Set this parameter to a positive integer.
             * <p>
             * 
             * >  When the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.
             */
            public Builder maxConcurrency(Long maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * The keywords that are used to identify the SQL statements that need to be throttled.
             * <p>
             * 
             * > SQL keywords are separated with tildes (~). When the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.
             */
            public Builder sqlKeywords(String sqlKeywords) {
                this.sqlKeywords = sqlKeywords;
                return this;
            }

            /**
             * The type of the SQL statements. Valid values:
             * <p>
             * 
             * * **SELECT**
             * * **UPDATE**
             * * **DELETE**
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the throttling rule. Valid values:
             * <p>
             * 
             * * **Open**: The throttling rule is in effect.
             * * **Closed**: The throttling rule was in effect.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List < Rules> rules;

        private List(Builder builder) {
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private java.util.List < Rules> rules; 

            /**
             * rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private List list; 
            private Long total; 

            /**
             * The list of the queried throttling rules.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
