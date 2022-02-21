// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataPushResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataPushResultResponseBody</p>
 */
public class DescribeDataPushResultResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PushResults")
    private PushResults pushResults;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PushResults.
         */
        public Builder pushResults(PushResults pushResults) {
            this.pushResults = pushResults;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataPushResultResponseBody build() {
            return new DescribeDataPushResultResponseBody(this);
        } 

    } 

    public static class RegionId extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StatusDescrip")
        private String statusDescrip;

        @NameInMap("UpdateTime")
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

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatusDescrip.
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * UpdateTime.
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
    public static class RegionIds extends TeaModel {
        @NameInMap("RegionId")
        private java.util.List < RegionId> regionId;

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
        public java.util.List < RegionId> getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < RegionId> regionId; 

            /**
             * RegionId.
             */
            public Builder regionId(java.util.List < RegionId> regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
    public static class StatusStat extends TeaModel {
        @NameInMap("RegionIdCount")
        private Integer regionIdCount;

        @NameInMap("RegionIds")
        private RegionIds regionIds;

        @NameInMap("Status")
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

            /**
             * RegionIdCount.
             */
            public Builder regionIdCount(Integer regionIdCount) {
                this.regionIdCount = regionIdCount;
                return this;
            }

            /**
             * RegionIds.
             */
            public Builder regionIds(RegionIds regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * Status.
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
    public static class StatusStatS extends TeaModel {
        @NameInMap("StatusStat")
        private java.util.List < StatusStat> statusStat;

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
        public java.util.List < StatusStat> getStatusStat() {
            return this.statusStat;
        }

        public static final class Builder {
            private java.util.List < StatusStat> statusStat; 

            /**
             * StatusStat.
             */
            public Builder statusStat(java.util.List < StatusStat> statusStat) {
                this.statusStat = statusStat;
                return this;
            }

            public StatusStatS build() {
                return new StatusStatS(this);
            } 

        } 

    }
    public static class PushResult extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("StatusStatS")
        private StatusStatS statusStatS;

        @NameInMap("Version")
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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StatusStatS.
             */
            public Builder statusStatS(StatusStatS statusStatS) {
                this.statusStatS = statusStatS;
                return this;
            }

            /**
             * Version.
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
    public static class PushResults extends TeaModel {
        @NameInMap("PushResult")
        private java.util.List < PushResult> pushResult;

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
        public java.util.List < PushResult> getPushResult() {
            return this.pushResult;
        }

        public static final class Builder {
            private java.util.List < PushResult> pushResult; 

            /**
             * PushResult.
             */
            public Builder pushResult(java.util.List < PushResult> pushResult) {
                this.pushResult = pushResult;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
}
