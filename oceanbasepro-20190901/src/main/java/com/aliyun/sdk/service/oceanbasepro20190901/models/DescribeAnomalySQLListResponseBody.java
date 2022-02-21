// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnomalySQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnomalySQLListResponseBody</p>
 */
public class DescribeAnomalySQLListResponseBody extends TeaModel {
    @NameInMap("AnomalySQLList")
    private java.util.List < AnomalySQLList> anomalySQLList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * 可疑SQL列表
         */
        public Builder anomalySQLList(java.util.List < AnomalySQLList> anomalySQLList) {
            this.anomalySQLList = anomalySQLList;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总数量
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
        @NameInMap("CpuTime")
        private Long cpuTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Diagnosis")
        private String diagnosis;

        @NameInMap("DiagnosisRule")
        private String diagnosisRule;

        @NameInMap("Executions")
        private Long executions;

        @NameInMap("Key")
        private Long key;

        @NameInMap("RequestTime")
        private Long requestTime;

        @NameInMap("RequestTimeUTCString")
        private String requestTimeUTCString;

        @NameInMap("SQLId")
        private String SQLId;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("UserName")
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
        public Long getCpuTime() {
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
        public Long getRequestTime() {
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
            private Long cpuTime; 
            private String dbName; 
            private String diagnosis; 
            private String diagnosisRule; 
            private Long executions; 
            private Long key; 
            private Long requestTime; 
            private String requestTimeUTCString; 
            private String SQLId; 
            private String SQLText; 
            private String suggestion; 
            private String userName; 

            /**
             * 平均CPU时间
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * 数据库名
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * 诊断信息
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * 诊断规则
             */
            public Builder diagnosisRule(String diagnosisRule) {
                this.diagnosisRule = diagnosisRule;
                return this;
            }

            /**
             * 执行次数
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * 返回数据序号
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * 请求时间
             */
            public Builder requestTime(Long requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * 请求时间（零时区）
             */
            public Builder requestTimeUTCString(String requestTimeUTCString) {
                this.requestTimeUTCString = requestTimeUTCString;
                return this;
            }

            /**
             * SQLID
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * sql文本
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * 建议
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * 用户名
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
