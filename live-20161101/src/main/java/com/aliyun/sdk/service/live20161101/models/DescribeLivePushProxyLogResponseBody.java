// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePushProxyLogResponseBody</p>
 */
public class DescribeLivePushProxyLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLogDetails")
    private DomainLogDetails domainLogDetails;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLivePushProxyLogResponseBody(Builder builder) {
        this.domainLogDetails = builder.domainLogDetails;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePushProxyLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainLogDetails
     */
    public DomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainLogDetails domainLogDetails; 
        private String domainName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLivePushProxyLogResponseBody model) {
            this.domainLogDetails = model.domainLogDetails;
            this.domainName = model.domainName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The log information.</p>
         */
        public Builder domainLogDetails(DomainLogDetails domainLogDetails) {
            this.domainLogDetails = domainLogDetails;
            return this;
        }

        /**
         * <p>Push domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLivePushProxyLogResponseBody build() {
            return new DescribeLivePushProxyLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(LogInfoDetail model) {
                this.endTime = model.endTime;
                this.logName = model.logName;
                this.logPath = model.logPath;
                this.logSize = model.logSize;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end of the time range during which data was queried.</p>
             * <p>The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1695189600</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com
             * _2023_09_20_160000_170000.****.gz</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The path of the log file.</p>
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * <p>The size of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * <p>The beginning of the time range during which data was queried.</p>
             * <p>The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1695193200</p>
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
     * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyLogResponseBody</p>
     */
    public static class LogInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfoDetail")
        private java.util.List<LogInfoDetail> logInfoDetail;

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
        public java.util.List<LogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

        public static final class Builder {
            private java.util.List<LogInfoDetail> logInfoDetail; 

            private Builder() {
            } 

            private Builder(LogInfos model) {
                this.logInfoDetail = model.logInfoDetail;
            } 

            /**
             * LogInfoDetail.
             */
            public Builder logInfoDetail(java.util.List<LogInfoDetail> logInfoDetail) {
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
     * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyLogResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfos model) {
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyLogResponseBody</p>
     */
    public static class DomainLogDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogCount")
        private Long logCount;

        @com.aliyun.core.annotation.NameInMap("LogInfos")
        private LogInfos logInfos;

        @com.aliyun.core.annotation.NameInMap("PageInfos")
        private PageInfos pageInfos;

        private DomainLogDetail(Builder builder) {
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
            private Long logCount; 
            private LogInfos logInfos; 
            private PageInfos pageInfos; 

            private Builder() {
            } 

            private Builder(DomainLogDetail model) {
                this.logCount = model.logCount;
                this.logInfos = model.logInfos;
                this.pageInfos = model.pageInfos;
            } 

            /**
             * <p>The total number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * <p>Details about the logs.</p>
             */
            public Builder logInfos(LogInfos logInfos) {
                this.logInfos = logInfos;
                return this;
            }

            /**
             * <p>The page information.</p>
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
     * {@link DescribeLivePushProxyLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyLogResponseBody</p>
     */
    public static class DomainLogDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainLogDetail")
        private java.util.List<DomainLogDetail> domainLogDetail;

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
        public java.util.List<DomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

        public static final class Builder {
            private java.util.List<DomainLogDetail> domainLogDetail; 

            private Builder() {
            } 

            private Builder(DomainLogDetails model) {
                this.domainLogDetail = model.domainLogDetail;
            } 

            /**
             * DomainLogDetail.
             */
            public Builder domainLogDetail(java.util.List<DomainLogDetail> domainLogDetail) {
                this.domainLogDetail = domainLogDetail;
                return this;
            }

            public DomainLogDetails build() {
                return new DomainLogDetails(this);
            } 

        } 

    }
}
