// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningSqlConcurrencyControlRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunningSqlConcurrencyControlRulesResponseBody</p>
 */
public class GetRunningSqlConcurrencyControlRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetRunningSqlConcurrencyControlRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunningSqlConcurrencyControlRulesResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBody build() {
            return new GetRunningSqlConcurrencyControlRulesResponseBody(this);
        } 

    } 

    public static class RunningRules extends TeaModel {
        @NameInMap("ConcurrencyControlTime")
        private Long concurrencyControlTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("KeywordsHash")
        private String keywordsHash;

        @NameInMap("MaxConcurrency")
        private String maxConcurrency;

        @NameInMap("SqlKeywords")
        private String sqlKeywords;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        private RunningRules(Builder builder) {
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

        public static RunningRules create() {
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
        public String getMaxConcurrency() {
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
            private String maxConcurrency; 
            private String sqlKeywords; 
            private String sqlType; 
            private Long startTime; 
            private String status; 
            private String userId; 

            /**
             * ConcurrencyControlTime.
             */
            public Builder concurrencyControlTime(Long concurrencyControlTime) {
                this.concurrencyControlTime = concurrencyControlTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * KeywordsHash.
             */
            public Builder keywordsHash(String keywordsHash) {
                this.keywordsHash = keywordsHash;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * SqlKeywords.
             */
            public Builder sqlKeywords(String sqlKeywords) {
                this.sqlKeywords = sqlKeywords;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RunningRules build() {
                return new RunningRules(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("runningRules")
        private java.util.List < RunningRules> runningRules;

        private List(Builder builder) {
            this.runningRules = builder.runningRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return runningRules
         */
        public java.util.List < RunningRules> getRunningRules() {
            return this.runningRules;
        }

        public static final class Builder {
            private java.util.List < RunningRules> runningRules; 

            /**
             * runningRules.
             */
            public Builder runningRules(java.util.List < RunningRules> runningRules) {
                this.runningRules = runningRules;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("Total")
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
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
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
