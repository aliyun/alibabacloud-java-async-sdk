// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeSiteLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteLogsResponseBody</p>
 */
public class DescribeSiteLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteLogDetails")
    private java.util.List<SiteLogDetails> siteLogDetails;

    private DescribeSiteLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.siteLogDetails = builder.siteLogDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteLogDetails
     */
    public java.util.List<SiteLogDetails> getSiteLogDetails() {
        return this.siteLogDetails;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SiteLogDetails> siteLogDetails; 

        private Builder() {
        } 

        private Builder(DescribeSiteLogsResponseBody model) {
            this.requestId = model.requestId;
            this.siteLogDetails = model.siteLogDetails;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteLogDetails.
         */
        public Builder siteLogDetails(java.util.List<SiteLogDetails> siteLogDetails) {
            this.siteLogDetails = siteLogDetails;
            return this;
        }

        public DescribeSiteLogsResponseBody build() {
            return new DescribeSiteLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteLogsResponseBody</p>
     */
    public static class LogInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("LogPath")
        private String logPath;

        @com.aliyun.core.annotation.NameInMap("LogSize")
        private Integer logSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private LogInfos(Builder builder) {
            this.endTime = builder.endTime;
            this.logName = builder.logName;
            this.logPath = builder.logPath;
            this.logSize = builder.logSize;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfos create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return logSize
         */
        public Integer getLogSize() {
            return this.logSize;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String logName; 
            private String logPath; 
            private Integer logSize; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(LogInfos model) {
                this.endTime = model.endTime;
                this.logName = model.logName;
                this.logPath = model.logPath;
                this.logSize = model.logSize;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * LogName.
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * LogPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * LogSize.
             */
            public Builder logSize(Integer logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public LogInfos build() {
                return new LogInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteLogsResponseBody</p>
     */
    public static class PageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Integer pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfos(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfos create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageIndex; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfos model) {
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfos build() {
                return new PageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteLogsResponseBody</p>
     */
    public static class SiteLogDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogCount")
        private Integer logCount;

        @com.aliyun.core.annotation.NameInMap("LogInfos")
        private java.util.List<LogInfos> logInfos;

        @com.aliyun.core.annotation.NameInMap("PageInfos")
        private PageInfos pageInfos;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        private SiteLogDetails(Builder builder) {
            this.logCount = builder.logCount;
            this.logInfos = builder.logInfos;
            this.pageInfos = builder.pageInfos;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteLogDetails create() {
            return builder().build();
        }

        /**
         * @return logCount
         */
        public Integer getLogCount() {
            return this.logCount;
        }

        /**
         * @return logInfos
         */
        public java.util.List<LogInfos> getLogInfos() {
            return this.logInfos;
        }

        /**
         * @return pageInfos
         */
        public PageInfos getPageInfos() {
            return this.pageInfos;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        public static final class Builder {
            private Integer logCount; 
            private java.util.List<LogInfos> logInfos; 
            private PageInfos pageInfos; 
            private Long siteId; 
            private String siteName; 

            private Builder() {
            } 

            private Builder(SiteLogDetails model) {
                this.logCount = model.logCount;
                this.logInfos = model.logInfos;
                this.pageInfos = model.pageInfos;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
            } 

            /**
             * LogCount.
             */
            public Builder logCount(Integer logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * LogInfos.
             */
            public Builder logInfos(java.util.List<LogInfos> logInfos) {
                this.logInfos = logInfos;
                return this;
            }

            /**
             * PageInfos.
             */
            public Builder pageInfos(PageInfos pageInfos) {
                this.pageInfos = pageInfos;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * SiteName.
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            public SiteLogDetails build() {
                return new SiteLogDetails(this);
            } 

        } 

    }
}
