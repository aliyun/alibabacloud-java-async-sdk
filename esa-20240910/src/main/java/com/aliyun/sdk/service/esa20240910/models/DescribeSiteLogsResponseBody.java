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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the website log files.</p>
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
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-06T17:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com_2022_11_07_000000_020000.gz.xxxxxx</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The log path.</p>
             * <blockquote>
             * <p> Take note of the Expires field (expiration timestamp) in this parameter. If the log download URL expires, you must reobtain the URL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com /v1.l1cache/105252530/example.com/2022_11_07/example.com_2022_11_07_000000_020000.gz.xxxxxx?Expires=1636963354&amp;OSSAccessKeyId=LTAIviCc6zy8****&amp;Signature=u0V6foRfZniHE8i%2BHUdxGOhZsK****</p>
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * <p>The size of the log file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>438304768</p>
             */
            public Builder logSize(Integer logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * <p>The create time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-06T16:00:00Z</p>
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
             * <p>The page number returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: <strong>300</strong>. Valid values: <strong>1 to 1000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
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
             * <p>The total number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder logCount(Integer logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * <p>The details of the website log files.</p>
             */
            public Builder logInfos(java.util.List<LogInfos> logInfos) {
                this.logInfos = logInfos;
                return this;
            }

            /**
             * <p>Pagination information.</p>
             */
            public Builder pageInfos(PageInfos pageInfos) {
                this.pageInfos = pageInfos;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456***</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
