// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * SqlLogConfig
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. If the request fails, an error message that contains information such as an error code is returned.
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
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogConfigResponseBody build() {
            return new DescribeSqlLogConfigResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("SqlLogState")
        private String sqlLogState;

        @com.aliyun.core.annotation.NameInMap("SqlLogVisibleTime")
        private Long sqlLogVisibleTime;

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
            this.sqlLogState = builder.sqlLogState;
            this.sqlLogVisibleTime = builder.sqlLogVisibleTime;
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
            private String sqlLogState; 
            private Long sqlLogVisibleTime; 
            private String supportVersion; 
            private String version; 

            /**
             * The cold storage duration.
             */
            public Builder coldEnable(Boolean coldEnable) {
                this.coldEnable = coldEnable;
                return this;
            }

            /**
             * The cold storage duration.
             */
            public Builder coldRetention(Integer coldRetention) {
                this.coldRetention = coldRetention;
                return this;
            }

            /**
             * The time when cold storage was enabled.
             */
            public Builder coldStartTime(Long coldStartTime) {
                this.coldStartTime = coldStartTime;
                return this;
            }

            /**
             * The version of the collector.
             */
            public Builder collectorVersion(String collectorVersion) {
                this.collectorVersion = collectorVersion;
                return this;
            }

            /**
             * Indicates whether hot storage was enabled.
             */
            public Builder hotEnable(Boolean hotEnable) {
                this.hotEnable = hotEnable;
                return this;
            }

            /**
             * The hot storage duration.
             */
            public Builder hotRetention(Integer hotRetention) {
                this.hotRetention = hotRetention;
                return this;
            }

            /**
             * The time when hot storage was enabled.
             */
            public Builder hotStartTime(Long hotStartTime) {
                this.hotStartTime = hotStartTime;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder logFilter(String logFilter) {
                this.logFilter = logFilter;
                return this;
            }

            /**
             * Indicates whether SQL Explorer and Audit was enabled.
             */
            public Builder requestEnable(Boolean requestEnable) {
                this.requestEnable = requestEnable;
                return this;
            }

            /**
             * The time when SQL Explorer and Audit was enabled.
             */
            public Builder requestStartTime(Long requestStartTime) {
                this.requestStartTime = requestStartTime;
                return this;
            }

            /**
             * The time when SQL Explorer and Audit was disabled.
             * <p>
             * 
             * >  If DAS Enterprise Edition V1 was enabled, this parameter indicates the time when DAS Enterprise Edition expired.
             */
            public Builder requestStopTime(Long requestStopTime) {
                this.requestStopTime = requestStopTime;
                return this;
            }

            /**
             * The storage duration of the SQL Explorer and Audit data.
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * Indicates whether DAS Enterprise Edition was enabled.
             */
            public Builder sqlLogEnable(Boolean sqlLogEnable) {
                this.sqlLogEnable = sqlLogEnable;
                return this;
            }

            /**
             * The status of data migration.
             */
            public Builder sqlLogState(String sqlLogState) {
                this.sqlLogState = sqlLogState;
                return this;
            }

            /**
             * The time when SQL Explorer and Audit was enabled.
             */
            public Builder sqlLogVisibleTime(Long sqlLogVisibleTime) {
                this.sqlLogVisibleTime = sqlLogVisibleTime;
                return this;
            }

            /**
             * The supported versions of Database Autonomy Service (DAS) Enterprise Edition.
             */
            public Builder supportVersion(String supportVersion) {
                this.supportVersion = supportVersion;
                return this;
            }

            /**
             * The version of SQL Explorer and Audit.
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
