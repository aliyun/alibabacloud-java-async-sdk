// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataPushResultResponseBody</p>
 */
public class DescribeDataPushResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PushResults")
    private PushResults pushResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataPushResultResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pushResults = builder.pushResults;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataPushResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pushResults
     */
    public PushResults getPushResults() {
        return this.pushResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private PushResults pushResults; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDataPushResultResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.pushResults = model.pushResults;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The push results of data files.</p>
         */
        public Builder pushResults(PushResults pushResults) {
            this.pushResults = pushResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataPushResultResponseBody build() {
            return new DescribeDataPushResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class RegionId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatusDescrip")
        private String statusDescrip;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private RegionId(Builder builder) {
            this.regionId = builder.regionId;
            this.startTime = builder.startTime;
            this.statusDescrip = builder.statusDescrip;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionId create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusDescrip
         */
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String regionId; 
            private String startTime; 
            private String statusDescrip; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(RegionId model) {
                this.regionId = model.regionId;
                this.startTime = model.startTime;
                this.statusDescrip = model.statusDescrip;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wuxi-5</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The start time of the push operation. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-28T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The description of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * <p>The time when the status was last updated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-07T02:37:10Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public RegionId build() {
                return new RegionId(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class RegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private java.util.List<RegionId> regionId;

        private RegionIds(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionIds create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public java.util.List<RegionId> getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List<RegionId> regionId; 

            private Builder() {
            } 

            private Builder(RegionIds model) {
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wuxi-5</p>
             */
            public Builder regionId(java.util.List<RegionId> regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class StatusStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionIdCount")
        private Integer regionIdCount;

        @com.aliyun.core.annotation.NameInMap("RegionIds")
        private RegionIds regionIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StatusStat(Builder builder) {
            this.regionIdCount = builder.regionIdCount;
            this.regionIds = builder.regionIds;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusStat create() {
            return builder().build();
        }

        /**
         * @return regionIdCount
         */
        public Integer getRegionIdCount() {
            return this.regionIdCount;
        }

        /**
         * @return regionIds
         */
        public RegionIds getRegionIds() {
            return this.regionIds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer regionIdCount; 
            private RegionIds regionIds; 
            private String status; 

            private Builder() {
            } 

            private Builder(StatusStat model) {
                this.regionIdCount = model.regionIdCount;
                this.regionIds = model.regionIds;
                this.status = model.status;
            } 

            /**
             * <p>The total number of ENS nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder regionIdCount(Integer regionIdCount) {
                this.regionIdCount = regionIdCount;
                return this;
            }

            /**
             * <p>The push status of data files on the ENS node.</p>
             */
            public Builder regionIds(RegionIds regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * <p>The push status. The value is of the enumeration type. Valid values: SUCCESS FAILED PUSHING</p>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StatusStat build() {
                return new StatusStat(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class StatusStatS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusStat")
        private java.util.List<StatusStat> statusStat;

        private StatusStatS(Builder builder) {
            this.statusStat = builder.statusStat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusStatS create() {
            return builder().build();
        }

        /**
         * @return statusStat
         */
        public java.util.List<StatusStat> getStatusStat() {
            return this.statusStat;
        }

        public static final class Builder {
            private java.util.List<StatusStat> statusStat; 

            private Builder() {
            } 

            private Builder(StatusStatS model) {
                this.statusStat = model.statusStat;
            } 

            /**
             * StatusStat.
             */
            public Builder statusStat(java.util.List<StatusStat> statusStat) {
                this.statusStat = statusStat;
                return this;
            }

            public StatusStatS build() {
                return new StatusStatS(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class PushResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StatusStatS")
        private StatusStatS statusStatS;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PushResult(Builder builder) {
            this.name = builder.name;
            this.statusStatS = builder.statusStatS;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResult create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return statusStatS
         */
        public StatusStatS getStatusStatS() {
            return this.statusStatS;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private StatusStatS statusStatS; 
            private String version; 

            private Builder() {
            } 

            private Builder(PushResult model) {
                this.name = model.name;
                this.statusStatS = model.statusStatS;
                this.version = model.version;
            } 

            /**
             * <p>The name of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>gcs-pre-websocket-eip-telecom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The push status of data files.</p>
             */
            public Builder statusStatS(StatusStatS statusStatS) {
                this.statusStatS = statusStatS;
                return this;
            }

            /**
             * <p>The version number of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PushResult build() {
                return new PushResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataPushResultResponseBody</p>
     */
    public static class PushResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushResult")
        private java.util.List<PushResult> pushResult;

        private PushResults(Builder builder) {
            this.pushResult = builder.pushResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResults create() {
            return builder().build();
        }

        /**
         * @return pushResult
         */
        public java.util.List<PushResult> getPushResult() {
            return this.pushResult;
        }

        public static final class Builder {
            private java.util.List<PushResult> pushResult; 

            private Builder() {
            } 

            private Builder(PushResults model) {
                this.pushResult = model.pushResult;
            } 

            /**
             * PushResult.
             */
            public Builder pushResult(java.util.List<PushResult> pushResult) {
                this.pushResult = pushResult;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
}
