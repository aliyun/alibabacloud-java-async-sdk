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
 * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataDistResultResponseBody</p>
 */
public class DescribeDataDistResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistResults")
    private DistResults distResults;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDataDistResultResponseBody model) {
            this.distResults = model.distResults;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The distribution status of data files on edge instances.</p>
         */
        public Builder distResults(DistResults distResults) {
            this.distResults = distResults;
            return this;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataDistResultResponseBody build() {
            return new DescribeDataDistResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatusDescrip")
        private String statusDescrip;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Instance model) {
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
                this.statusDescrip = model.statusDescrip;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>i-5qzje8f5un1wmi341m2yetaxv</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The start time of the distribution. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-19T07:24:52Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The description of the distribution status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * <p>The time when the distribution status was last updated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-11T02:38:19Z</p>
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
    /**
     * 
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class StatusStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private String instanceCount;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Instances instances;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(StatusStat model) {
                this.instanceCount = model.instanceCount;
                this.instances = model.instances;
                this.status = model.status;
            } 

            /**
             * <p>The number of associated edge instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The distribution status of the edge instance.</p>
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The distribution status. The value is of the enumeration type. Valid values:</p>
             * <ul>
             * <li>SUCCESS: The distribution is successful.</li>
             * <li>FAILED: The distribution failed.</li>
             * <li>DISTING: The data is being distributed.</li>
             * <li>POD_RESTARTING: The idle pod is being restarted.</li>
             * <li>DELETED: The data is cleared or removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class StatusStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusStat")
        private java.util.List<StatusStat> statusStat;

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
        public java.util.List<StatusStat> getStatusStat() {
            return this.statusStat;
        }

        public static final class Builder {
            private java.util.List<StatusStat> statusStat; 

            private Builder() {
            } 

            private Builder(StatusStats model) {
                this.statusStat = model.statusStat;
            } 

            /**
             * StatusStat.
             */
            public Builder statusStat(java.util.List<StatusStat> statusStat) {
                this.statusStat = statusStat;
                return this;
            }

            public StatusStats build() {
                return new StatusStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class DistResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StatusStats")
        private StatusStats statusStats;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(DistResult model) {
                this.name = model.name;
                this.statusStats = model.statusStats;
                this.version = model.version;
            } 

            /**
             * <p>The name of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>gcs-prod-websocket-eip-unicom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The distribution status statistics.</p>
             */
            public Builder statusStats(StatusStats statusStats) {
                this.statusStats = statusStats;
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

            public DistResult build() {
                return new DistResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataDistResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDistResultResponseBody</p>
     */
    public static class DistResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistResult")
        private java.util.List<DistResult> distResult;

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
        public java.util.List<DistResult> getDistResult() {
            return this.distResult;
        }

        public static final class Builder {
            private java.util.List<DistResult> distResult; 

            private Builder() {
            } 

            private Builder(DistResults model) {
                this.distResult = model.distResult;
            } 

            /**
             * DistResult.
             */
            public Builder distResult(java.util.List<DistResult> distResult) {
                this.distResult = distResult;
                return this;
            }

            public DistResults build() {
                return new DistResults(this);
            } 

        } 

    }
}
