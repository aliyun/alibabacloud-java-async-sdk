// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeCdnDomainLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainLogsResponseBody</p>
 */
public class DescribeCdnDomainLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLogModel")
    private DomainLogModel domainLogModel;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeCdnDomainLogsResponseBody(Builder builder) {
        this.domainLogModel = builder.domainLogModel;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainLogModel
     */
    public DomainLogModel getDomainLogModel() {
        return this.domainLogModel;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private DomainLogModel domainLogModel; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DescribeCdnDomainLogsResponseBody model) {
            this.domainLogModel = model.domainLogModel;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * DomainLogModel.
         */
        public Builder domainLogModel(DomainLogModel domainLogModel) {
            this.domainLogModel = domainLogModel;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeCdnDomainLogsResponseBody build() {
            return new DescribeCdnDomainLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDomainLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainLogsResponseBody</p>
     */
    public static class DomainLogDetail extends TeaModel {
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

        private DomainLogDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.logName = builder.logName;
            this.logPath = builder.logPath;
            this.logSize = builder.logSize;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLogDetail create() {
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

            private Builder(DomainLogDetail model) {
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
            public Builder logSize(Long logSize) {
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

            public DomainLogDetail build() {
                return new DomainLogDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDomainLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainLogsResponseBody</p>
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
    /**
     * 
     * {@link DescribeCdnDomainLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainLogsResponseBody</p>
     */
    public static class DomainLogModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainLogDetails")
        private DomainLogDetails domainLogDetails;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        private DomainLogModel(Builder builder) {
            this.domainLogDetails = builder.domainLogDetails;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainLogModel create() {
            return builder().build();
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

        public static final class Builder {
            private DomainLogDetails domainLogDetails; 
            private String domainName; 

            private Builder() {
            } 

            private Builder(DomainLogModel model) {
                this.domainLogDetails = model.domainLogDetails;
                this.domainName = model.domainName;
            } 

            /**
             * DomainLogDetails.
             */
            public Builder domainLogDetails(DomainLogDetails domainLogDetails) {
                this.domainLogDetails = domainLogDetails;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public DomainLogModel build() {
                return new DomainLogModel(this);
            } 

        } 

    }
}
