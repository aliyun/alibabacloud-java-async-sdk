// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListCloudMetricProfilingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudMetricProfilingsResponseBody</p>
 */
public class ListCloudMetricProfilingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Profilings")
    private Profilings profilings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCloudMetricProfilingsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.profilings = builder.profilings;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudMetricProfilingsResponseBody create() {
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
     * @return profilings
     */
    public Profilings getProfilings() {
        return this.profilings;
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
        private Profilings profilings; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudMetricProfilingsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.profilings = model.profilings;
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
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The profiling information of the cluster.</p>
         */
        public Builder profilings(Profilings profilings) {
            this.profilings = profilings;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A05F620-ED46-4A57-95F1-C67D6D3C5DD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudMetricProfilingsResponseBody build() {
            return new ListCloudMetricProfilingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudMetricProfilingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudMetricProfilingsResponseBody</p>
     */
    public static class ProfilingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Freq")
        private Integer freq;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("ProfilingId")
        private String profilingId;

        @com.aliyun.core.annotation.NameInMap("TriggerTime")
        private String triggerTime;

        private ProfilingInfo(Builder builder) {
            this.duration = builder.duration;
            this.freq = builder.freq;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.pid = builder.pid;
            this.profilingId = builder.profilingId;
            this.triggerTime = builder.triggerTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfilingInfo create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return freq
         */
        public Integer getFreq() {
            return this.freq;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return profilingId
         */
        public String getProfilingId() {
            return this.profilingId;
        }

        /**
         * @return triggerTime
         */
        public String getTriggerTime() {
            return this.triggerTime;
        }

        public static final class Builder {
            private Integer duration; 
            private Integer freq; 
            private String hostName; 
            private String instanceId; 
            private Integer pid; 
            private String profilingId; 
            private String triggerTime; 

            private Builder() {
            } 

            private Builder(ProfilingInfo model) {
                this.duration = model.duration;
                this.freq = model.freq;
                this.hostName = model.hostName;
                this.instanceId = model.instanceId;
                this.pid = model.pid;
                this.profilingId = model.profilingId;
                this.triggerTime = model.triggerTime;
            } 

            /**
             * <p>The duration of the profiling process. Unit: seconds.</p>
             * <p>Valid values: 10 to 300.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frequency of the profiling process. Unit: Hz.</p>
             * <p>Valid values: 1 to 2000</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder freq(Integer freq) {
                this.freq = freq;
                return this;
            }

            /**
             * <p>The name of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>compute5</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1j76z8dlukzqgl0****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The progress ID.</p>
             * 
             * <strong>example:</strong>
             * <p>21687</p>
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The ID of the profiling process.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-i-bplukzqgl****_21687_2019-09-09-02-37-40</p>
             */
            public Builder profilingId(String profilingId) {
                this.profilingId = profilingId;
                return this;
            }

            /**
             * <p>The time when the profiling was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-09 02:37:40</p>
             */
            public Builder triggerTime(String triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            public ProfilingInfo build() {
                return new ProfilingInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudMetricProfilingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudMetricProfilingsResponseBody</p>
     */
    public static class Profilings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProfilingInfo")
        private java.util.List<ProfilingInfo> profilingInfo;

        private Profilings(Builder builder) {
            this.profilingInfo = builder.profilingInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profilings create() {
            return builder().build();
        }

        /**
         * @return profilingInfo
         */
        public java.util.List<ProfilingInfo> getProfilingInfo() {
            return this.profilingInfo;
        }

        public static final class Builder {
            private java.util.List<ProfilingInfo> profilingInfo; 

            private Builder() {
            } 

            private Builder(Profilings model) {
                this.profilingInfo = model.profilingInfo;
            } 

            /**
             * ProfilingInfo.
             */
            public Builder profilingInfo(java.util.List<ProfilingInfo> profilingInfo) {
                this.profilingInfo = profilingInfo;
                return this;
            }

            public Profilings build() {
                return new Profilings(this);
            } 

        } 

    }
}
