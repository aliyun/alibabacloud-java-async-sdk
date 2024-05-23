// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessStatsCompositionResponseBody</p>
 */
public class DescribeProcessStatsCompositionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProcessStatsCompositionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessStatsCompositionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessStatsCompositionResponseBody build() {
            return new DescribeProcessStatsCompositionResponseBody(this);
        } 

    } 

    public static class AllProcessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Long cpuTime;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("ProxySessId")
        private String proxySessId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private Long sessionId;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private AllProcessList(Builder builder) {
            this.clientIp = builder.clientIp;
            this.command = builder.command;
            this.cpuTime = builder.cpuTime;
            this.database = builder.database;
            this.executeTime = builder.executeTime;
            this.planId = builder.planId;
            this.proxySessId = builder.proxySessId;
            this.serverIp = builder.serverIp;
            this.sessionId = builder.sessionId;
            this.sqlId = builder.sqlId;
            this.sqlText = builder.sqlText;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.traceId = builder.traceId;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllProcessList create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return cpuTime
         */
        public Long getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return proxySessId
         */
        public String getProxySessId() {
            return this.proxySessId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return sessionId
         */
        public Long getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String clientIp; 
            private String command; 
            private Long cpuTime; 
            private String database; 
            private Long executeTime; 
            private String planId; 
            private String proxySessId; 
            private String serverIp; 
            private Long sessionId; 
            private String sqlId; 
            private String sqlText; 
            private String status; 
            private String tenantId; 
            private String traceId; 
            private String user; 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * CpuTime.
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * ProxySessId.
             */
            public Builder proxySessId(String proxySessId) {
                this.proxySessId = proxySessId;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * SQL ID。
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlText.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public AllProcessList build() {
                return new AllProcessList(this);
            } 

        } 

    }
    public static class DataBaseStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private String metricValue;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataBaseStatistics(Builder builder) {
            this.activeCount = builder.activeCount;
            this.metricValue = builder.metricValue;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBaseStatistics create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return metricValue
         */
        public String getMetricValue() {
            return this.metricValue;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long activeCount; 
            private String metricValue; 
            private Long totalCount; 
            private String type; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * MetricValue.
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataBaseStatistics build() {
                return new DataBaseStatistics(this);
            } 

        } 

    }
    public static class SourceStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private String metricValue;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SourceStatistics(Builder builder) {
            this.activeCount = builder.activeCount;
            this.metricValue = builder.metricValue;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceStatistics create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return metricValue
         */
        public String getMetricValue() {
            return this.metricValue;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long activeCount; 
            private String metricValue; 
            private Long totalCount; 
            private String type; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * MetricValue.
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceStatistics build() {
                return new SourceStatistics(this);
            } 

        } 

    }
    public static class UserStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private String metricValue;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserStatistics(Builder builder) {
            this.activeCount = builder.activeCount;
            this.metricValue = builder.metricValue;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatistics create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return metricValue
         */
        public String getMetricValue() {
            return this.metricValue;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long activeCount; 
            private String metricValue; 
            private Long totalCount; 
            private String type; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * MetricValue.
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserStatistics build() {
                return new UserStatistics(this);
            } 

        } 

    }
    public static class SessionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataBaseStatistics")
        private java.util.List < DataBaseStatistics> dataBaseStatistics;

        @com.aliyun.core.annotation.NameInMap("SourceStatistics")
        private java.util.List < SourceStatistics> sourceStatistics;

        @com.aliyun.core.annotation.NameInMap("UserStatistics")
        private java.util.List < UserStatistics> userStatistics;

        private SessionStatistics(Builder builder) {
            this.dataBaseStatistics = builder.dataBaseStatistics;
            this.sourceStatistics = builder.sourceStatistics;
            this.userStatistics = builder.userStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionStatistics create() {
            return builder().build();
        }

        /**
         * @return dataBaseStatistics
         */
        public java.util.List < DataBaseStatistics> getDataBaseStatistics() {
            return this.dataBaseStatistics;
        }

        /**
         * @return sourceStatistics
         */
        public java.util.List < SourceStatistics> getSourceStatistics() {
            return this.sourceStatistics;
        }

        /**
         * @return userStatistics
         */
        public java.util.List < UserStatistics> getUserStatistics() {
            return this.userStatistics;
        }

        public static final class Builder {
            private java.util.List < DataBaseStatistics> dataBaseStatistics; 
            private java.util.List < SourceStatistics> sourceStatistics; 
            private java.util.List < UserStatistics> userStatistics; 

            /**
             * DataBaseStatistics.
             */
            public Builder dataBaseStatistics(java.util.List < DataBaseStatistics> dataBaseStatistics) {
                this.dataBaseStatistics = dataBaseStatistics;
                return this;
            }

            /**
             * SourceStatistics.
             */
            public Builder sourceStatistics(java.util.List < SourceStatistics> sourceStatistics) {
                this.sourceStatistics = sourceStatistics;
                return this;
            }

            /**
             * UserStatistics.
             */
            public Builder userStatistics(java.util.List < UserStatistics> userStatistics) {
                this.userStatistics = userStatistics;
                return this;
            }

            public SessionStatistics build() {
                return new SessionStatistics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Integer activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("AllProcessList")
        private java.util.List < AllProcessList> allProcessList;

        @com.aliyun.core.annotation.NameInMap("IdleSessionCount")
        private Integer idleSessionCount;

        @com.aliyun.core.annotation.NameInMap("ObVersion")
        private String obVersion;

        @com.aliyun.core.annotation.NameInMap("SessionStatistics")
        private SessionStatistics sessionStatistics;

        @com.aliyun.core.annotation.NameInMap("TotalSessionCount")
        private Integer totalSessionCount;

        private Data(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.allProcessList = builder.allProcessList;
            this.idleSessionCount = builder.idleSessionCount;
            this.obVersion = builder.obVersion;
            this.sessionStatistics = builder.sessionStatistics;
            this.totalSessionCount = builder.totalSessionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Integer getActiveSessionCount() {
            return this.activeSessionCount;
        }

        /**
         * @return allProcessList
         */
        public java.util.List < AllProcessList> getAllProcessList() {
            return this.allProcessList;
        }

        /**
         * @return idleSessionCount
         */
        public Integer getIdleSessionCount() {
            return this.idleSessionCount;
        }

        /**
         * @return obVersion
         */
        public String getObVersion() {
            return this.obVersion;
        }

        /**
         * @return sessionStatistics
         */
        public SessionStatistics getSessionStatistics() {
            return this.sessionStatistics;
        }

        /**
         * @return totalSessionCount
         */
        public Integer getTotalSessionCount() {
            return this.totalSessionCount;
        }

        public static final class Builder {
            private Integer activeSessionCount; 
            private java.util.List < AllProcessList> allProcessList; 
            private Integer idleSessionCount; 
            private String obVersion; 
            private SessionStatistics sessionStatistics; 
            private Integer totalSessionCount; 

            /**
             * ActiveSessionCount.
             */
            public Builder activeSessionCount(Integer activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * AllProcessList.
             */
            public Builder allProcessList(java.util.List < AllProcessList> allProcessList) {
                this.allProcessList = allProcessList;
                return this;
            }

            /**
             * IdleSessionCount.
             */
            public Builder idleSessionCount(Integer idleSessionCount) {
                this.idleSessionCount = idleSessionCount;
                return this;
            }

            /**
             * ObVersion.
             */
            public Builder obVersion(String obVersion) {
                this.obVersion = obVersion;
                return this;
            }

            /**
             * SessionStatistics.
             */
            public Builder sessionStatistics(SessionStatistics sessionStatistics) {
                this.sessionStatistics = sessionStatistics;
                return this;
            }

            /**
             * TotalSessionCount.
             */
            public Builder totalSessionCount(Integer totalSessionCount) {
                this.totalSessionCount = totalSessionCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
