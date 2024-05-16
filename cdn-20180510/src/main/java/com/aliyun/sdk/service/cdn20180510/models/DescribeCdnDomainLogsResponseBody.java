// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainLogsResponseBody</p>
 */
public class DescribeCdnDomainLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLogDetails")
    private DomainLogDetails domainLogDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDomainLogsResponseBody(Builder builder) {
        this.domainLogDetails = builder.domainLogDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainLogDetails
     */
    public DomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainLogDetails domainLogDetails; 
        private String requestId; 

        /**
         * A set of DomainLogDetail data.
         */
        public Builder domainLogDetails(DomainLogDetails domainLogDetails) {
            this.domainLogDetails = domainLogDetails;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainLogsResponseBody build() {
            return new DescribeCdnDomainLogsResponseBody(this);
        } 

    } 

    public static class LogInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("LogPath")
        private String logPath;

        @com.aliyun.core.annotation.NameInMap("LogSize")
        private Long logSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private LogInfoDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.logName = builder.logName;
            this.logPath = builder.logPath;
            this.logSize = builder.logSize;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfoDetail create() {
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
        public Long getLogSize() {
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
            private Long logSize; 
            private String startTime; 

            /**
             * The end of the time range during which data was queried.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the log file.
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * The path of the log file.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * The size of the log file.
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * The start of the time range during which data was queried.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public LogInfoDetail build() {
                return new LogInfoDetail(this);
            } 

        } 

    }
    public static class LogInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfoDetail")
        private java.util.List < LogInfoDetail> logInfoDetail;

        private LogInfos(Builder builder) {
            this.logInfoDetail = builder.logInfoDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfos create() {
            return builder().build();
        }

        /**
         * @return logInfoDetail
         */
        public java.util.List < LogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

        public static final class Builder {
            private java.util.List < LogInfoDetail> logInfoDetail; 

            /**
             * LogInfoDetail.
             */
            public Builder logInfoDetail(java.util.List < LogInfoDetail> logInfoDetail) {
                this.logInfoDetail = logInfoDetail;
                return this;
            }

            public LogInfos build() {
                return new LogInfos(this);
            } 

        } 

    }
    public static class PageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageInfos(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
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
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 
            private Long total; 

            /**
             * The page number of the returned page.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageInfos build() {
                return new PageInfos(this);
            } 

        } 

    }
    public static class DomainLogDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("LogCount")
        private Long logCount;

        @com.aliyun.core.annotation.NameInMap("LogInfos")
        private LogInfos logInfos;

        @com.aliyun.core.annotation.NameInMap("PageInfos")
        private PageInfos pageInfos;

        private DomainLogDetail(Builder builder) {
            this.domainName = builder.domainName;
            this.logCount = builder.logCount;
            this.logInfos = builder.logInfos;
            this.pageInfos = builder.pageInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLogDetail create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return logCount
         */
        public Long getLogCount() {
            return this.logCount;
        }

        /**
         * @return logInfos
         */
        public LogInfos getLogInfos() {
            return this.logInfos;
        }

        /**
         * @return pageInfos
         */
        public PageInfos getPageInfos() {
            return this.pageInfos;
        }

        public static final class Builder {
            private String domainName; 
            private Long logCount; 
            private LogInfos logInfos; 
            private PageInfos pageInfos; 

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The total number of entries returned on the current page.
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * A set of LogInfoDetail data.
             */
            public Builder logInfos(LogInfos logInfos) {
                this.logInfos = logInfos;
                return this;
            }

            /**
             * A set of PageInfoDetail data.
             */
            public Builder pageInfos(PageInfos pageInfos) {
                this.pageInfos = pageInfos;
                return this;
            }

            public DomainLogDetail build() {
                return new DomainLogDetail(this);
            } 

        } 

    }
    public static class DomainLogDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainLogDetail")
        private java.util.List < DomainLogDetail> domainLogDetail;

        private DomainLogDetails(Builder builder) {
            this.domainLogDetail = builder.domainLogDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLogDetails create() {
            return builder().build();
        }

        /**
         * @return domainLogDetail
         */
        public java.util.List < DomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

        public static final class Builder {
            private java.util.List < DomainLogDetail> domainLogDetail; 

            /**
             * DomainLogDetail.
             */
            public Builder domainLogDetail(java.util.List < DomainLogDetail> domainLogDetail) {
                this.domainLogDetail = domainLogDetail;
                return this;
            }

            public DomainLogDetails build() {
                return new DomainLogDetails(this);
            } 

        } 

    }
}
