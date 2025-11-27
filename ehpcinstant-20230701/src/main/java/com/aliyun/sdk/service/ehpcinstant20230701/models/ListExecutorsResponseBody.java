// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutorsResponseBody</p>
 */
public class ListExecutorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executors")
    private java.util.List<Executors> executors;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListExecutorsResponseBody(Builder builder) {
        this.executors = builder.executors;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executors
     */
    public java.util.List<Executors> getExecutors() {
        return this.executors;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Executors> executors; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListExecutorsResponseBody model) {
            this.executors = model.executors;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Executor list.</p>
         */
        public Builder executors(java.util.List<Executors> executors) {
            this.executors = executors;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExecutorsResponseBody build() {
            return new ListExecutorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorsResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Disks(Builder builder) {
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer size; 
            private String type; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.size = model.size;
                this.type = model.type;
            } 

            /**
             * <p>The size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The category of the disk. The following disk categories are supported:</p>
             * <ul>
             * <li>System: system disk.</li>
             * <li>Data: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorsResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Float cores;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private Resource(Builder builder) {
            this.cores = builder.cores;
            this.disks = builder.disks;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Float getCores() {
            return this.cores;
        }

        /**
         * @return disks
         */
        public java.util.List<Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private java.util.List<Disks> disks; 
            private String instanceType; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.cores = model.cores;
                this.disks = model.disks;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of running CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The array of the disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The total amount of memory resources. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the executor tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the executor tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorsResponseBody</p>
     */
    public static class Executors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationSpec")
        private String allocationSpec;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private Integer arrayIndex;

        @com.aliyun.core.annotation.NameInMap("BlockDuration")
        private Integer blockDuration;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecutorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("ExternalIpAddress")
        private java.util.List<String> externalIpAddress;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private java.util.List<String> hostName;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Preemptible")
        private Boolean preemptible;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskSustainable")
        private Boolean taskSustainable;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Executors(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.appName = builder.appName;
            this.arrayIndex = builder.arrayIndex;
            this.blockDuration = builder.blockDuration;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.executorId = builder.executorId;
            this.expirationTime = builder.expirationTime;
            this.externalIpAddress = builder.externalIpAddress;
            this.hostName = builder.hostName;
            this.image = builder.image;
            this.ipAddress = builder.ipAddress;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.preemptible = builder.preemptible;
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.tags = builder.tags;
            this.taskName = builder.taskName;
            this.taskSustainable = builder.taskSustainable;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executors create() {
            return builder().build();
        }

        /**
         * @return allocationSpec
         */
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return arrayIndex
         */
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return blockDuration
         */
        public Integer getBlockDuration() {
            return this.blockDuration;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return externalIpAddress
         */
        public java.util.List<String> getExternalIpAddress() {
            return this.externalIpAddress;
        }

        /**
         * @return hostName
         */
        public java.util.List<String> getHostName() {
            return this.hostName;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return preemptible
         */
        public Boolean getPreemptible() {
            return this.preemptible;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskSustainable
         */
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String allocationSpec; 
            private String appName; 
            private Integer arrayIndex; 
            private Integer blockDuration; 
            private String createTime; 
            private String endTime; 
            private String executorId; 
            private String expirationTime; 
            private java.util.List<String> externalIpAddress; 
            private java.util.List<String> hostName; 
            private String image; 
            private java.util.List<String> ipAddress; 
            private String jobId; 
            private String jobName; 
            private Boolean preemptible; 
            private Resource resource; 
            private String resourceType; 
            private String startTime; 
            private String status; 
            private String statusReason; 
            private java.util.List<Tags> tags; 
            private String taskName; 
            private Boolean taskSustainable; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(Executors model) {
                this.allocationSpec = model.allocationSpec;
                this.appName = model.appName;
                this.arrayIndex = model.arrayIndex;
                this.blockDuration = model.blockDuration;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.executorId = model.executorId;
                this.expirationTime = model.expirationTime;
                this.externalIpAddress = model.externalIpAddress;
                this.hostName = model.hostName;
                this.image = model.image;
                this.ipAddress = model.ipAddress;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.preemptible = model.preemptible;
                this.resource = model.resource;
                this.resourceType = model.resourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.tags = model.tags;
                this.taskName = model.taskName;
                this.taskSustainable = model.taskSustainable;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * AllocationSpec.
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The executor number.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder arrayIndex(Integer arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * BlockDuration.
             */
            public Builder blockDuration(Integer blockDuration) {
                this.blockDuration = blockDuration;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:18</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The executor ID. The format is JobId-TaskName-ArrayIndex.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx-task0-1</p>
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The list of public IP addresses of the nodes.</p>
             */
            public Builder externalIpAddress(java.util.List<String> externalIpAddress) {
                this.externalIpAddress = externalIpAddress;
                return this;
            }

            /**
             * <p>The list of hostnames.</p>
             */
            public Builder hostName(java.util.List<String> hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>Executor image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-f8z0dfa96luxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The list of internal IP addresses.</p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-hy1nggvyukuvkr******</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>testJob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Preemptible.
             */
            public Builder preemptible(Boolean preemptible) {
                this.preemptible = preemptible;
                return this;
            }

            /**
             * <p>The resource information.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ECI</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:13</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the executor. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Initing</li>
             * <li>Succeed</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Unknown</li>
             * <li>Exception</li>
             * <li>Retrying</li>
             * <li>Expired</li>
             * <li>Deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the status reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded to release executor resource</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The list of executor tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task0</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>Indicate whether the job is a long-running job.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskSustainable(Boolean taskSustainable) {
                this.taskSustainable = taskSustainable;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxx</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Executors build() {
                return new Executors(this);
            } 

        } 

    }
}
