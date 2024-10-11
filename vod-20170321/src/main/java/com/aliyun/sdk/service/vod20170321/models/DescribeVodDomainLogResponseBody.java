// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainLogResponseBody</p>
 */
public class DescribeVodDomainLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLogDetails")
    private DomainLogDetails domainLogDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainLogResponseBody(Builder builder) {
        this.domainLogDetails = builder.domainLogDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainLogResponseBody create() {
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
         * <p>The details of CDN logs.</p>
         */
        public Builder domainLogDetails(DomainLogDetails domainLogDetails) {
            this.domainLogDetails = domainLogDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>077D0284-F041-4A41-4D3C-B48377FD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainLogResponseBody build() {
            return new DescribeVodDomainLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainLogResponseBody</p>
     */
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
             * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-31T05:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com_2018_03_25_180000_19****.gz</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The path of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com/2018_03_25/example.com_2018_03_25_180000_19****.gz?Expires=1522659931&amp;OSSAccessKeyId=<strong><strong>&amp;Signature=</strong></strong></p>
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * <p>The size of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>2645401</p>
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-31T04:00:00Z</p>
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
    /**
     * 
     * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainLogResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainLogResponseBody</p>
     */
    public static class PageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageInfos(Builder builder) {
            this.pageNumber = builder.pageNumber;
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
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
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
            private Long pageNumber; 
            private Long pageSize; 
            private Long total; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
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

            public PageInfos build() {
                return new PageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainLogResponseBody</p>
     */
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
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The total number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * <p>The queried CDN logs.</p>
             */
            public Builder logInfos(LogInfos logInfos) {
                this.logInfos = logInfos;
                return this;
            }

            /**
             * <p>The pagination information.</p>
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
    /**
     * 
     * {@link DescribeVodDomainLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainLogResponseBody</p>
     */
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
