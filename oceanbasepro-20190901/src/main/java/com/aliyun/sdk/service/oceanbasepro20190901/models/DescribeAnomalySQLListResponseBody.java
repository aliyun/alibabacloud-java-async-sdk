// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnomalySQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnomalySQLListResponseBody</p>
 */
public class DescribeAnomalySQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnomalySQLList")
    private java.util.List < AnomalySQLList> anomalySQLList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAnomalySQLListResponseBody(Builder builder) {
        this.anomalySQLList = builder.anomalySQLList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnomalySQLListResponseBody create() {
        return builder().build();
    }

    /**
     * @return anomalySQLList
     */
    public java.util.List < AnomalySQLList> getAnomalySQLList() {
        return this.anomalySQLList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AnomalySQLList> anomalySQLList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The list of suspicious SQL statements.
         */
        public Builder anomalySQLList(java.util.List < AnomalySQLList> anomalySQLList) {
            this.anomalySQLList = anomalySQLList;
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
         * The total count.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAnomalySQLListResponseBody build() {
            return new DescribeAnomalySQLListResponseBody(this);
        } 

    } 

    public static class AnomalySQLList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Float cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private String diagnosis;

        @com.aliyun.core.annotation.NameInMap("DiagnosisRule")
        private String diagnosisRule;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Long executions;

        @com.aliyun.core.annotation.NameInMap("Key")
        private Long key;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private Float requestTime;

        @com.aliyun.core.annotation.NameInMap("RequestTimeUTCString")
        private String requestTimeUTCString;

        @com.aliyun.core.annotation.NameInMap("SQLId")
        private String SQLId;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private AnomalySQLList(Builder builder) {
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.diagnosis = builder.diagnosis;
            this.diagnosisRule = builder.diagnosisRule;
            this.executions = builder.executions;
            this.key = builder.key;
            this.requestTime = builder.requestTime;
            this.requestTimeUTCString = builder.requestTimeUTCString;
            this.SQLId = builder.SQLId;
            this.SQLText = builder.SQLText;
            this.suggestion = builder.suggestion;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnomalySQLList create() {
            return builder().build();
        }

        /**
         * @return cpuTime
         */
        public Float getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return diagnosis
         */
        public String getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return diagnosisRule
         */
        public String getDiagnosisRule() {
            return this.diagnosisRule;
        }

        /**
         * @return executions
         */
        public Long getExecutions() {
            return this.executions;
        }

        /**
         * @return key
         */
        public Long getKey() {
            return this.key;
        }

        /**
         * @return requestTime
         */
        public Float getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return requestTimeUTCString
         */
        public String getRequestTimeUTCString() {
            return this.requestTimeUTCString;
        }

        /**
         * @return SQLId
         */
        public String getSQLId() {
            return this.SQLId;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Float cpuTime; 
            private String dbName; 
            private String diagnosis; 
            private String diagnosisRule; 
            private Long executions; 
            private Long key; 
            private Float requestTime; 
            private String requestTimeUTCString; 
            private String SQLId; 
            private String SQLText; 
            private String suggestion; 
            private String userName; 

            /**
             * The average CPU time, in ms.
             */
            public Builder cpuTime(Float cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The diagnosis information.
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * The diagnostic rule.
             */
            public Builder diagnosisRule(String diagnosisRule) {
                this.diagnosisRule = diagnosisRule;
                return this;
            }

            /**
             * The number of executions.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * The sequence number of the returned SQL statement.
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * The request time, in ms.
             */
            public Builder requestTime(Float requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * The request time in UTC +0.
             */
            public Builder requestTimeUTCString(String requestTimeUTCString) {
                this.requestTimeUTCString = requestTimeUTCString;
                return this;
            }

            /**
             * SQLID.
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * The SQL text.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The suggestions.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public AnomalySQLList build() {
                return new AnomalySQLList(this);
            } 

        } 

    }
}
