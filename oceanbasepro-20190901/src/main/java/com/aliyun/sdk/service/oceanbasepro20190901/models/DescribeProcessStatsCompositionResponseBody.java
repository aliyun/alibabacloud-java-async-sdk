// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessStatsCompositionResponseBody</p>
 */
public class DescribeProcessStatsCompositionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeProcessStatsCompositionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The return result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessStatsCompositionResponseBody build() {
            return new DescribeProcessStatsCompositionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AllProcessList model) {
                this.clientIp = model.clientIp;
                this.command = model.command;
                this.cpuTime = model.cpuTime;
                this.database = model.database;
                this.executeTime = model.executeTime;
                this.planId = model.planId;
                this.proxySessId = model.proxySessId;
                this.serverIp = model.serverIp;
                this.sessionId = model.sessionId;
                this.sqlId = model.sqlId;
                this.sqlText = model.sqlText;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.traceId = model.traceId;
                this.user = model.user;
            } 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The type of the SQL statement being executed in the session.</p>
             * 
             * <strong>example:</strong>
             * <p>Query</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The CPU time spent on executing the current SQL statement, in seconds. </p>
             * <blockquote>
             * <p>This parameter is introduced since OceanBase Database V3.2.4 BP5.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>c1</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The definition of this parameter varies based on whether the SQL statement is executed.</p>
             * <ul>
             * <li>When the request is accepted and the result is not returned to the client, this parameter indicates the time interval between the time when the request is accepted and the current time, in seconds.</li>
             * <li>When the request is not accepted, this parameter indicates the duration for which the current status lasts, in seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The ID of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1898</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The session ID of the client. If an OceanBase Database Proxy (ODP) is used for connection, the session ID of the ODP is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>7521015416********</p>
             */
            public Builder proxySessId(String proxySessId) {
                this.proxySessId = proxySessId;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>322441****</p>
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The ID of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>45CCBDC7DEBDCDAXXXXAFC********</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The SQL text.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from c1 where id = 100;</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The status of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>test_mysql</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the trace.</p>
             * 
             * <strong>example:</strong>
             * <p>YB420XXX128-00062XXXX8313XXX1-X-X</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The user to which the session belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
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
    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataBaseStatistics model) {
                this.activeCount = model.activeCount;
                this.metricValue = model.metricValue;
                this.totalCount = model.totalCount;
                this.type = model.type;
            } 

            /**
             * <p>The number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_database</p>
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The dimension. This value is fixed to database.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
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
    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceStatistics model) {
                this.activeCount = model.activeCount;
                this.metricValue = model.metricValue;
                this.totalCount = model.totalCount;
                this.type = model.type;
            } 

            /**
             * <p>The number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The dimension. This value is fixed to client.</p>
             * 
             * <strong>example:</strong>
             * <p>client</p>
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
    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UserStatistics model) {
                this.activeCount = model.activeCount;
                this.metricValue = model.metricValue;
                this.totalCount = model.totalCount;
                this.type = model.type;
            } 

            /**
             * <p>The number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The dimension. This value is fixed to user.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
    public static class SessionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataBaseStatistics")
        private java.util.List<DataBaseStatistics> dataBaseStatistics;

        @com.aliyun.core.annotation.NameInMap("SourceStatistics")
        private java.util.List<SourceStatistics> sourceStatistics;

        @com.aliyun.core.annotation.NameInMap("UserStatistics")
        private java.util.List<UserStatistics> userStatistics;

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
        public java.util.List<DataBaseStatistics> getDataBaseStatistics() {
            return this.dataBaseStatistics;
        }

        /**
         * @return sourceStatistics
         */
        public java.util.List<SourceStatistics> getSourceStatistics() {
            return this.sourceStatistics;
        }

        /**
         * @return userStatistics
         */
        public java.util.List<UserStatistics> getUserStatistics() {
            return this.userStatistics;
        }

        public static final class Builder {
            private java.util.List<DataBaseStatistics> dataBaseStatistics; 
            private java.util.List<SourceStatistics> sourceStatistics; 
            private java.util.List<UserStatistics> userStatistics; 

            private Builder() {
            } 

            private Builder(SessionStatistics model) {
                this.dataBaseStatistics = model.dataBaseStatistics;
                this.sourceStatistics = model.sourceStatistics;
                this.userStatistics = model.userStatistics;
            } 

            /**
             * <p>The session data in the database dimension.</p>
             */
            public Builder dataBaseStatistics(java.util.List<DataBaseStatistics> dataBaseStatistics) {
                this.dataBaseStatistics = dataBaseStatistics;
                return this;
            }

            /**
             * <p>The session data in the client dimension.</p>
             */
            public Builder sourceStatistics(java.util.List<SourceStatistics> sourceStatistics) {
                this.sourceStatistics = sourceStatistics;
                return this;
            }

            /**
             * <p>The session data in the user dimension.</p>
             */
            public Builder userStatistics(java.util.List<UserStatistics> userStatistics) {
                this.userStatistics = userStatistics;
                return this;
            }

            public SessionStatistics build() {
                return new SessionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProcessStatsCompositionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatsCompositionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Integer activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("AllProcessList")
        private java.util.List<AllProcessList> allProcessList;

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
        public java.util.List<AllProcessList> getAllProcessList() {
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
            private java.util.List<AllProcessList> allProcessList; 
            private Integer idleSessionCount; 
            private String obVersion; 
            private SessionStatistics sessionStatistics; 
            private Integer totalSessionCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeSessionCount = model.activeSessionCount;
                this.allProcessList = model.allProcessList;
                this.idleSessionCount = model.idleSessionCount;
                this.obVersion = model.obVersion;
                this.sessionStatistics = model.sessionStatistics;
                this.totalSessionCount = model.totalSessionCount;
            } 

            /**
             * <p>The number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder activeSessionCount(Integer activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * <p>The details of all sessions.</p>
             */
            public Builder allProcessList(java.util.List<AllProcessList> allProcessList) {
                this.allProcessList = allProcessList;
                return this;
            }

            /**
             * <p>The number of sessions in the SLEEP state.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder idleSessionCount(Integer idleSessionCount) {
                this.idleSessionCount = idleSessionCount;
                return this;
            }

            /**
             * <p>The version of OceanBase Database.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.4</p>
             */
            public Builder obVersion(String obVersion) {
                this.obVersion = obVersion;
                return this;
            }

            /**
             * <p>The session data in different dimensions.</p>
             */
            public Builder sessionStatistics(SessionStatistics sessionStatistics) {
                this.sessionStatistics = sessionStatistics;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
