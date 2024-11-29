// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSqlLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogConfigResponseBody</p>
 */
public class DescribeSqlLogConfigResponseBody extends TeaModel {
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

    private DescribeSqlLogConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogConfigResponseBody create() {
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message is returned.</p>
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
         * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
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

        public DescribeSqlLogConfigResponseBody build() {
            return new DescribeSqlLogConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdEnable")
        private Boolean coldEnable;

        @com.aliyun.core.annotation.NameInMap("ColdRetention")
        private Integer coldRetention;

        @com.aliyun.core.annotation.NameInMap("ColdStartTime")
        private Long coldStartTime;

        @com.aliyun.core.annotation.NameInMap("CollectorVersion")
        private String collectorVersion;

        @com.aliyun.core.annotation.NameInMap("HotEnable")
        private Boolean hotEnable;

        @com.aliyun.core.annotation.NameInMap("HotRetention")
        private Integer hotRetention;

        @com.aliyun.core.annotation.NameInMap("HotStartTime")
        private Long hotStartTime;

        @com.aliyun.core.annotation.NameInMap("LogFilter")
        private String logFilter;

        @com.aliyun.core.annotation.NameInMap("RequestEnable")
        private Boolean requestEnable;

        @com.aliyun.core.annotation.NameInMap("RequestStartTime")
        private Long requestStartTime;

        @com.aliyun.core.annotation.NameInMap("RequestStopTime")
        private Long requestStopTime;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Integer retention;

        @com.aliyun.core.annotation.NameInMap("SqlLogEnable")
        private Boolean sqlLogEnable;

        @com.aliyun.core.annotation.NameInMap("SqlLogSource")
        private String sqlLogSource;

        @com.aliyun.core.annotation.NameInMap("SqlLogState")
        private String sqlLogState;

        @com.aliyun.core.annotation.NameInMap("SqlLogVisibleTime")
        private Long sqlLogVisibleTime;

        @com.aliyun.core.annotation.NameInMap("SupportMigration")
        private Boolean supportMigration;

        @com.aliyun.core.annotation.NameInMap("SupportVersion")
        private String supportVersion;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.coldEnable = builder.coldEnable;
            this.coldRetention = builder.coldRetention;
            this.coldStartTime = builder.coldStartTime;
            this.collectorVersion = builder.collectorVersion;
            this.hotEnable = builder.hotEnable;
            this.hotRetention = builder.hotRetention;
            this.hotStartTime = builder.hotStartTime;
            this.logFilter = builder.logFilter;
            this.requestEnable = builder.requestEnable;
            this.requestStartTime = builder.requestStartTime;
            this.requestStopTime = builder.requestStopTime;
            this.retention = builder.retention;
            this.sqlLogEnable = builder.sqlLogEnable;
            this.sqlLogSource = builder.sqlLogSource;
            this.sqlLogState = builder.sqlLogState;
            this.sqlLogVisibleTime = builder.sqlLogVisibleTime;
            this.supportMigration = builder.supportMigration;
            this.supportVersion = builder.supportVersion;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldEnable
         */
        public Boolean getColdEnable() {
            return this.coldEnable;
        }

        /**
         * @return coldRetention
         */
        public Integer getColdRetention() {
            return this.coldRetention;
        }

        /**
         * @return coldStartTime
         */
        public Long getColdStartTime() {
            return this.coldStartTime;
        }

        /**
         * @return collectorVersion
         */
        public String getCollectorVersion() {
            return this.collectorVersion;
        }

        /**
         * @return hotEnable
         */
        public Boolean getHotEnable() {
            return this.hotEnable;
        }

        /**
         * @return hotRetention
         */
        public Integer getHotRetention() {
            return this.hotRetention;
        }

        /**
         * @return hotStartTime
         */
        public Long getHotStartTime() {
            return this.hotStartTime;
        }

        /**
         * @return logFilter
         */
        public String getLogFilter() {
            return this.logFilter;
        }

        /**
         * @return requestEnable
         */
        public Boolean getRequestEnable() {
            return this.requestEnable;
        }

        /**
         * @return requestStartTime
         */
        public Long getRequestStartTime() {
            return this.requestStartTime;
        }

        /**
         * @return requestStopTime
         */
        public Long getRequestStopTime() {
            return this.requestStopTime;
        }

        /**
         * @return retention
         */
        public Integer getRetention() {
            return this.retention;
        }

        /**
         * @return sqlLogEnable
         */
        public Boolean getSqlLogEnable() {
            return this.sqlLogEnable;
        }

        /**
         * @return sqlLogSource
         */
        public String getSqlLogSource() {
            return this.sqlLogSource;
        }

        /**
         * @return sqlLogState
         */
        public String getSqlLogState() {
            return this.sqlLogState;
        }

        /**
         * @return sqlLogVisibleTime
         */
        public Long getSqlLogVisibleTime() {
            return this.sqlLogVisibleTime;
        }

        /**
         * @return supportMigration
         */
        public Boolean getSupportMigration() {
            return this.supportMigration;
        }

        /**
         * @return supportVersion
         */
        public String getSupportVersion() {
            return this.supportVersion;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean coldEnable; 
            private Integer coldRetention; 
            private Long coldStartTime; 
            private String collectorVersion; 
            private Boolean hotEnable; 
            private Integer hotRetention; 
            private Long hotStartTime; 
            private String logFilter; 
            private Boolean requestEnable; 
            private Long requestStartTime; 
            private Long requestStopTime; 
            private Integer retention; 
            private Boolean sqlLogEnable; 
            private String sqlLogSource; 
            private String sqlLogState; 
            private Long sqlLogVisibleTime; 
            private Boolean supportMigration; 
            private String supportVersion; 
            private String version; 

            /**
             * <p>Indicates whether the cold data storage is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder coldEnable(Boolean coldEnable) {
                this.coldEnable = coldEnable;
                return this;
            }

            /**
             * <p>The number of days for which the SQL Explorer and Audit data is stored in cold storage.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder coldRetention(Integer coldRetention) {
                this.coldRetention = coldRetention;
                return this;
            }

            /**
             * <p>The time when the cold data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1683712800000</p>
             */
            public Builder coldStartTime(Long coldStartTime) {
                this.coldStartTime = coldStartTime;
                return this;
            }

            /**
             * <p>The collector version. Valid values:</p>
             * <ul>
             * <li><strong>MYSQL_V0</strong></li>
             * <li><strong>MYSQL_V1</strong></li>
             * <li><strong>MYSQL_V2</strong></li>
             * <li><strong>MYSQL_V3</strong></li>
             * <li><strong>PG_V1</strong></li>
             * <li><strong>rdspg_v1</strong></li>
             * <li><strong>polarpg_v1</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MYSQL_V3</p>
             */
            public Builder collectorVersion(String collectorVersion) {
                this.collectorVersion = collectorVersion;
                return this;
            }

            /**
             * <p>Indicates whether the hot data storage is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hotEnable(Boolean hotEnable) {
                this.hotEnable = hotEnable;
                return this;
            }

            /**
             * <p>The number of days for which the SQL Explorer and Audit data is stored in hot storage.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder hotRetention(Integer hotRetention) {
                this.hotRetention = hotRetention;
                return this;
            }

            /**
             * <p>The time when the hot data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1683712800000</p>
             */
            public Builder hotStartTime(Long hotStartTime) {
                this.hotStartTime = hotStartTime;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder logFilter(String logFilter) {
                this.logFilter = logFilter;
                return this;
            }

            /**
             * <p>Indicates whether the SQL Explorer feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requestEnable(Boolean requestEnable) {
                this.requestEnable = requestEnable;
                return this;
            }

            /**
             * <p>The time when the SQL Explorer feature was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1683712800000</p>
             */
            public Builder requestStartTime(Long requestStartTime) {
                this.requestStartTime = requestStartTime;
                return this;
            }

            /**
             * <p>The time when DAS Enterprise Edition V1 expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1715335200000</p>
             */
            public Builder requestStopTime(Long requestStopTime) {
                this.requestStopTime = requestStopTime;
                return this;
            }

            /**
             * <p>The total storage duration of the SQL Explorer and Audit data. The value of this parameter is the sum of the values of <strong>HotRetention</strong> and <strong>ColdRetention</strong>. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sqlLogEnable(Boolean sqlLogEnable) {
                this.sqlLogEnable = sqlLogEnable;
                return this;
            }

            /**
             * SqlLogSource.
             */
            public Builder sqlLogSource(String sqlLogSource) {
                this.sqlLogSource = sqlLogSource;
                return this;
            }

            /**
             * <p>The state of data migration. Valid values:</p>
             * <ul>
             * <li><strong>FINISH</strong>: The historical data is migrated.</li>
             * <li><strong>RUNNING</strong>: The historical data is being migrated.</li>
             * <li><strong>FAILURE</strong>: The historical data fails to be migrated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISH</p>
             */
            public Builder sqlLogState(String sqlLogState) {
                this.sqlLogState = sqlLogState;
                return this;
            }

            /**
             * <p>The time when DAS Enterprise Edition was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1683712800000</p>
             */
            public Builder sqlLogVisibleTime(Long sqlLogVisibleTime) {
                this.sqlLogVisibleTime = sqlLogVisibleTime;
                return this;
            }

            /**
             * SupportMigration.
             */
            public Builder supportMigration(Boolean supportMigration) {
                this.supportMigration = supportMigration;
                return this;
            }

            /**
             * <p>The latest version of DAS Enterprise Edition that supports the database instance. Valid values:</p>
             * <ul>
             * <li><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0.</li>
             * <li><strong>SQL_LOG_V1</strong>: DAS Enterprise version V1.</li>
             * <li><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2.</li>
             * <li><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3.</li>
             * <li><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</li>
             * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL_LOG_V3</p>
             */
            public Builder supportVersion(String supportVersion) {
                this.supportVersion = supportVersion;
                return this;
            }

            /**
             * <p>The version of DAS Enterprise Edition that is enabled for the database instance. Valid values:</p>
             * <ul>
             * <li><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0.</li>
             * <li><strong>SQL_LOG_V1</strong>: DAS Enterprise version V1.</li>
             * <li><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2.</li>
             * <li><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3.</li>
             * <li><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</li>
             * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL_LOG_V3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
