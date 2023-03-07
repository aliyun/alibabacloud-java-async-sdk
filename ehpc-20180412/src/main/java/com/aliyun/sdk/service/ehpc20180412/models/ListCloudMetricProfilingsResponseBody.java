// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudMetricProfilingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudMetricProfilingsResponseBody</p>
 */
public class ListCloudMetricProfilingsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Profilings")
    private Profilings profilings;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries that are returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The profiling information of a specified cluster.
         */
        public Builder profilings(Profilings profilings) {
            this.profilings = profilings;
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
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudMetricProfilingsResponseBody build() {
            return new ListCloudMetricProfilingsResponseBody(this);
        } 

    } 

    public static class ProfilingInfo extends TeaModel {
        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("Freq")
        private Integer freq;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Pid")
        private Integer pid;

        @NameInMap("ProfilingId")
        private String profilingId;

        @NameInMap("TriggerTime")
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

            /**
             * The duration of the profiling process. Unit: seconds
             * <p>
             * 
             * Valid values: 10 to 300
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The frequency of the profiling process. Unit: Hz
             * <p>
             * 
             * Valid values: 1 to 2000
             */
            public Builder freq(Integer freq) {
                this.freq = freq;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the profiling process.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The ID of the profiling process.
             */
            public Builder profilingId(String profilingId) {
                this.profilingId = profilingId;
                return this;
            }

            /**
             * The time when the profiling process is triggered.
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
    public static class Profilings extends TeaModel {
        @NameInMap("ProfilingInfo")
        private java.util.List < ProfilingInfo> profilingInfo;

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
        public java.util.List < ProfilingInfo> getProfilingInfo() {
            return this.profilingInfo;
        }

        public static final class Builder {
            private java.util.List < ProfilingInfo> profilingInfo; 

            /**
             * ProfilingInfo.
             */
            public Builder profilingInfo(java.util.List < ProfilingInfo> profilingInfo) {
                this.profilingInfo = profilingInfo;
                return this;
            }

            public Profilings build() {
                return new Profilings(this);
            } 

        } 

    }
}
