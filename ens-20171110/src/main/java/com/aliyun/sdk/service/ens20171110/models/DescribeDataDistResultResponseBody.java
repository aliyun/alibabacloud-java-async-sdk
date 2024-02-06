// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataDistResultResponseBody</p>
 */
public class DescribeDataDistResultResponseBody extends TeaModel {
    @NameInMap("DistResults")
    private DistResults distResults;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataDistResultResponseBody(Builder builder) {
        this.distResults = builder.distResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataDistResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return distResults
     */
    public DistResults getDistResults() {
        return this.distResults;
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
        private DistResults distResults; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The distribution status of data files on edge instances.
         */
        public Builder distResults(DistResults distResults) {
            this.distResults = distResults;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataDistResultResponseBody build() {
            return new DescribeDataDistResultResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StatusDescrip")
        private String statusDescrip;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.statusDescrip = builder.statusDescrip;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
            private String startTime; 
            private String statusDescrip; 
            private String updateTime; 

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The start time of the distribution. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The description of the distribution status.
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * The time when the distribution status was last updated. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class StatusStat extends TeaModel {
        @NameInMap("InstanceCount")
        private String instanceCount;

        @NameInMap("Instances")
        private Instances instances;

        @NameInMap("Status")
        private String status;

        private StatusStat(Builder builder) {
            this.instanceCount = builder.instanceCount;
            this.instances = builder.instances;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusStat create() {
            return builder().build();
        }

        /**
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceCount; 
            private Instances instances; 
            private String status; 

            /**
             * The number of associated edge instances.
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The distribution status of the edge instance.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The distribution status. The value is of the enumeration type. Valid values:
             * <p>
             * 
             * *   SUCCESS: The distribution is successful.
             * *   FAILED: The distribution failed.
             * *   DISTING: The data is being distributed.
             * *   POD_RESTARTING: The idle pod is being restarted.
             * *   DELETED: The data is cleared or removed.
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
    public static class StatusStats extends TeaModel {
        @NameInMap("StatusStat")
        private java.util.List < StatusStat> statusStat;

        private StatusStats(Builder builder) {
            this.statusStat = builder.statusStat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusStats create() {
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

            public StatusStats build() {
                return new StatusStats(this);
            } 

        } 

    }
    public static class DistResult extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("StatusStats")
        private StatusStats statusStats;

        @NameInMap("Version")
        private String version;

        private DistResult(Builder builder) {
            this.name = builder.name;
            this.statusStats = builder.statusStats;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistResult create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return statusStats
         */
        public StatusStats getStatusStats() {
            return this.statusStats;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private StatusStats statusStats; 
            private String version; 

            /**
             * The name of the data file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The distribution status statistics.
             */
            public Builder statusStats(StatusStats statusStats) {
                this.statusStats = statusStats;
                return this;
            }

            /**
             * The version number of the data file.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DistResult build() {
                return new DistResult(this);
            } 

        } 

    }
    public static class DistResults extends TeaModel {
        @NameInMap("DistResult")
        private java.util.List < DistResult> distResult;

        private DistResults(Builder builder) {
            this.distResult = builder.distResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistResults create() {
            return builder().build();
        }

        /**
         * @return distResult
         */
        public java.util.List < DistResult> getDistResult() {
            return this.distResult;
        }

        public static final class Builder {
            private java.util.List < DistResult> distResult; 

            /**
             * DistResult.
             */
            public Builder distResult(java.util.List < DistResult> distResult) {
                this.distResult = distResult;
                return this;
            }

            public DistResults build() {
                return new DistResults(this);
            } 

        } 

    }
}
