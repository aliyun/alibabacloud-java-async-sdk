// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetRunningSqlConcurrencyControlRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunningSqlConcurrencyControlRulesResponseBody</p>
 */
public class GetRunningSqlConcurrencyControlRulesResponseBody extends TeaModel {
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRunningSqlConcurrencyControlRulesResponseBody build() {
            return new GetRunningSqlConcurrencyControlRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRunningSqlConcurrencyControlRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunningSqlConcurrencyControlRulesResponseBody</p>
     */
    public static class RunningRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrencyControlTime")
        private Long concurrencyControlTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("KeywordsHash")
        private String keywordsHash;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private String maxConcurrency;

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
             * <p>The duration within which the SQL throttling rule takes effect. Unit: seconds.</p>
             * <blockquote>
             * <p>The throttling rule takes effect only within this duration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder concurrencyControlTime(Long concurrencyControlTime) {
                this.concurrencyControlTime = concurrencyControlTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1jdv45i7l6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the throttling rule that is applied to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The hash value of the SQL keywords. The hash value is calculated based on the SQL keywords that are contained in the SQL statements to which the throttling rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>b0b8aceeb43baea87b219c81767b****</p>
             */
            public Builder keywordsHash(String keywordsHash) {
                this.keywordsHash = keywordsHash;
                return this;
            }

            /**
             * <p>The maximum number of concurrent SQL statements. The value is a positive integer.</p>
             * <blockquote>
             * <p>If the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxConcurrency(String maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * <p>The keywords contained in the SQL statements to which the throttling rule was applied.</p>
             * <blockquote>
             * <p>SQL keywords are separated by tildes (~). If the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>call<del>open</del>api<del>test</del>4<del>from</del>POP</p>
             */
            public Builder sqlKeywords(String sqlKeywords) {
                this.sqlKeywords = sqlKeywords;
                return this;
            }

            /**
             * <p>The type of the SQL statements. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The time when the throttling rule started to take effect. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the throttling rule. The value of <strong>Open</strong> indicates that the throttling rule is in effect.</p>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testxxx</p>
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
    /**
     * 
     * {@link GetRunningSqlConcurrencyControlRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunningSqlConcurrencyControlRulesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runningRules")
        private java.util.List<RunningRules> runningRules;

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
        public java.util.List<RunningRules> getRunningRules() {
            return this.runningRules;
        }

        public static final class Builder {
            private java.util.List<RunningRules> runningRules; 

            /**
             * runningRules.
             */
            public Builder runningRules(java.util.List<RunningRules> runningRules) {
                this.runningRules = runningRules;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRunningSqlConcurrencyControlRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunningSqlConcurrencyControlRulesResponseBody</p>
     */
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
             * <p>The returned data.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
