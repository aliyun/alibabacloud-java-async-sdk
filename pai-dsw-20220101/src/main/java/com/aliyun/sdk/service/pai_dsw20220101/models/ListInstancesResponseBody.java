// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instances = builder.instances;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Instances> instances; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class CPU extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private CPU(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CPU create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public CPU build() {
                return new CPU(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Affinity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private CPU CPU;

        private Affinity(Builder builder) {
            this.CPU = builder.CPU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Affinity create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public CPU getCPU() {
            return this.CPU;
        }

        public static final class Builder {
            private CPU CPU; 

            /**
             * CPU.
             */
            public Builder CPU(CPU CPU) {
                this.CPU = CPU;
                return this;
            }

            public Affinity build() {
                return new Affinity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class CloudDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private CloudDisks(Builder builder) {
            this.capacity = builder.capacity;
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDisks create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String capacity; 
            private String mountPath; 
            private String path; 
            private String subType; 

            /**
             * Capacity.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public CloudDisks build() {
                return new CloudDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetVersion")
        private String datasetVersion;

        @com.aliyun.core.annotation.NameInMap("MountAccess")
        private String mountAccess;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("OptionType")
        private String optionType;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Datasets(Builder builder) {
            this.datasetId = builder.datasetId;
            this.datasetVersion = builder.datasetVersion;
            this.mountAccess = builder.mountAccess;
            this.mountPath = builder.mountPath;
            this.optionType = builder.optionType;
            this.options = builder.options;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetVersion
         */
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        /**
         * @return mountAccess
         */
        public String getMountAccess() {
            return this.mountAccess;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return optionType
         */
        public String getOptionType() {
            return this.optionType;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String datasetId; 
            private String datasetVersion; 
            private String mountAccess; 
            private String mountPath; 
            private String optionType; 
            private String options; 
            private String uri; 

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetVersion.
             */
            public Builder datasetVersion(String datasetVersion) {
                this.datasetVersion = datasetVersion;
                return this;
            }

            /**
             * MountAccess.
             */
            public Builder mountAccess(String mountAccess) {
                this.mountAccess = mountAccess;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * OptionType.
             */
            public Builder optionType(String optionType) {
                this.optionType = optionType;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class IdleInstanceCuller extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPercentThreshold")
        private Integer cpuPercentThreshold;

        @com.aliyun.core.annotation.NameInMap("GpuPercentThreshold")
        private Integer gpuPercentThreshold;

        @com.aliyun.core.annotation.NameInMap("IdleTimeInMinutes")
        private Integer idleTimeInMinutes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTimeInMinutes")
        private Integer maxIdleTimeInMinutes;

        private IdleInstanceCuller(Builder builder) {
            this.cpuPercentThreshold = builder.cpuPercentThreshold;
            this.gpuPercentThreshold = builder.gpuPercentThreshold;
            this.idleTimeInMinutes = builder.idleTimeInMinutes;
            this.instanceId = builder.instanceId;
            this.maxIdleTimeInMinutes = builder.maxIdleTimeInMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdleInstanceCuller create() {
            return builder().build();
        }

        /**
         * @return cpuPercentThreshold
         */
        public Integer getCpuPercentThreshold() {
            return this.cpuPercentThreshold;
        }

        /**
         * @return gpuPercentThreshold
         */
        public Integer getGpuPercentThreshold() {
            return this.gpuPercentThreshold;
        }

        /**
         * @return idleTimeInMinutes
         */
        public Integer getIdleTimeInMinutes() {
            return this.idleTimeInMinutes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxIdleTimeInMinutes
         */
        public Integer getMaxIdleTimeInMinutes() {
            return this.maxIdleTimeInMinutes;
        }

        public static final class Builder {
            private Integer cpuPercentThreshold; 
            private Integer gpuPercentThreshold; 
            private Integer idleTimeInMinutes; 
            private String instanceId; 
            private Integer maxIdleTimeInMinutes; 

            /**
             * CpuPercentThreshold.
             */
            public Builder cpuPercentThreshold(Integer cpuPercentThreshold) {
                this.cpuPercentThreshold = cpuPercentThreshold;
                return this;
            }

            /**
             * GpuPercentThreshold.
             */
            public Builder gpuPercentThreshold(Integer gpuPercentThreshold) {
                this.gpuPercentThreshold = gpuPercentThreshold;
                return this;
            }

            /**
             * IdleTimeInMinutes.
             */
            public Builder idleTimeInMinutes(Integer idleTimeInMinutes) {
                this.idleTimeInMinutes = idleTimeInMinutes;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MaxIdleTimeInMinutes.
             */
            public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
                this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
                return this;
            }

            public IdleInstanceCuller build() {
                return new IdleInstanceCuller(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class InstanceShutdownTimer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DueTime")
        private String dueTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RemainingTimeInMs")
        private Long remainingTimeInMs;

        private InstanceShutdownTimer(Builder builder) {
            this.dueTime = builder.dueTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.remainingTimeInMs = builder.remainingTimeInMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceShutdownTimer create() {
            return builder().build();
        }

        /**
         * @return dueTime
         */
        public String getDueTime() {
            return this.dueTime;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return remainingTimeInMs
         */
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

        public static final class Builder {
            private String dueTime; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private Long remainingTimeInMs; 

            /**
             * DueTime.
             */
            public Builder dueTime(String dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RemainingTimeInMs.
             */
            public Builder remainingTimeInMs(Long remainingTimeInMs) {
                this.remainingTimeInMs = remainingTimeInMs;
                return this;
            }

            public InstanceShutdownTimer build() {
                return new InstanceShutdownTimer(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class InstanceSnapshotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RepositoryUrl")
        private String repositoryUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceSnapshotList(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.repositoryUrl = builder.repositoryUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSnapshotList create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String reasonCode; 
            private String reasonMessage; 
            private String repositoryUrl; 
            private String status; 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * RepositoryUrl.
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceSnapshotList build() {
                return new InstanceSnapshotList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class LatestSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RepositoryUrl")
        private String repositoryUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LatestSnapshot(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.repositoryUrl = builder.repositoryUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestSnapshot create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return repositoryUrl
         */
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String reasonCode; 
            private String reasonMessage; 
            private String repositoryUrl; 
            private String status; 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * RepositoryUrl.
             */
            public Builder repositoryUrl(String repositoryUrl) {
                this.repositoryUrl = repositoryUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LatestSnapshot build() {
                return new LatestSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class RequestedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private String sharedMemory;

        private RequestedResource(Builder builder) {
            this.CPU = builder.CPU;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.memory = builder.memory;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestedResource create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return sharedMemory
         */
        public String getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private String CPU; 
            private String GPU; 
            private String GPUType; 
            private String memory; 
            private String sharedMemory; 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * GPU.
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * GPUType.
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * SharedMemory.
             */
            public Builder sharedMemory(String sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public RequestedResource build() {
                return new RequestedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("ForwardInfos")
        private java.util.List<ForwardInfoResponse> forwardInfos;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
            this.forwardInfos = builder.forwardInfos;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCIDRs
         */
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        /**
         * @return forwardInfos
         */
        public java.util.List<ForwardInfoResponse> getForwardInfos() {
            return this.forwardInfos;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String defaultRoute; 
            private java.util.List<String> extendedCIDRs; 
            private java.util.List<ForwardInfoResponse> forwardInfos; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * DefaultRoute.
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * ExtendedCIDRs.
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * ForwardInfos.
             */
            public Builder forwardInfos(java.util.List<ForwardInfoResponse> forwardInfos) {
                this.forwardInfos = forwardInfos;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorType")
        private String acceleratorType;

        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("AccumulatedRunningTimeInMs")
        private Long accumulatedRunningTimeInMs;

        @com.aliyun.core.annotation.NameInMap("Affinity")
        private Affinity affinity;

        @com.aliyun.core.annotation.NameInMap("CloudDisks")
        private java.util.List<CloudDisks> cloudDisks;

        @com.aliyun.core.annotation.NameInMap("CredentialConfig")
        private CredentialConfig credentialConfig;

        @com.aliyun.core.annotation.NameInMap("Datasets")
        private java.util.List<Datasets> datasets;

        @com.aliyun.core.annotation.NameInMap("Driver")
        private String driver;

        @com.aliyun.core.annotation.NameInMap("EcsSpec")
        private String ecsSpec;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
        private java.util.Map<String, String> environmentVariables;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("IdleInstanceCuller")
        private IdleInstanceCuller idleInstanceCuller;

        @com.aliyun.core.annotation.NameInMap("ImageAuth")
        private String imageAuth;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceShutdownTimer")
        private InstanceShutdownTimer instanceShutdownTimer;

        @com.aliyun.core.annotation.NameInMap("InstanceSnapshotList")
        private java.util.List<InstanceSnapshotList> instanceSnapshotList;

        @com.aliyun.core.annotation.NameInMap("InstanceUrl")
        private String instanceUrl;

        @com.aliyun.core.annotation.NameInMap("JupyterlabUrl")
        private String jupyterlabUrl;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("LatestSnapshot")
        private LatestSnapshot latestSnapshot;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RequestedResource")
        private RequestedResource requestedResource;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TerminalUrl")
        private String terminalUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserVpc")
        private UserVpc userVpc;

        @com.aliyun.core.annotation.NameInMap("WebIDEUrl")
        private String webIDEUrl;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceSource")
        private String workspaceSource;

        private Instances(Builder builder) {
            this.acceleratorType = builder.acceleratorType;
            this.accessibility = builder.accessibility;
            this.accumulatedRunningTimeInMs = builder.accumulatedRunningTimeInMs;
            this.affinity = builder.affinity;
            this.cloudDisks = builder.cloudDisks;
            this.credentialConfig = builder.credentialConfig;
            this.datasets = builder.datasets;
            this.driver = builder.driver;
            this.ecsSpec = builder.ecsSpec;
            this.environmentVariables = builder.environmentVariables;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.idleInstanceCuller = builder.idleInstanceCuller;
            this.imageAuth = builder.imageAuth;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceShutdownTimer = builder.instanceShutdownTimer;
            this.instanceSnapshotList = builder.instanceSnapshotList;
            this.instanceUrl = builder.instanceUrl;
            this.jupyterlabUrl = builder.jupyterlabUrl;
            this.labels = builder.labels;
            this.latestSnapshot = builder.latestSnapshot;
            this.paymentType = builder.paymentType;
            this.priority = builder.priority;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.requestedResource = builder.requestedResource;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.terminalUrl = builder.terminalUrl;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userVpc = builder.userVpc;
            this.webIDEUrl = builder.webIDEUrl;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.workspaceSource = builder.workspaceSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return acceleratorType
         */
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
        }

        /**
         * @return accumulatedRunningTimeInMs
         */
        public Long getAccumulatedRunningTimeInMs() {
            return this.accumulatedRunningTimeInMs;
        }

        /**
         * @return affinity
         */
        public Affinity getAffinity() {
            return this.affinity;
        }

        /**
         * @return cloudDisks
         */
        public java.util.List<CloudDisks> getCloudDisks() {
            return this.cloudDisks;
        }

        /**
         * @return credentialConfig
         */
        public CredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        /**
         * @return datasets
         */
        public java.util.List<Datasets> getDatasets() {
            return this.datasets;
        }

        /**
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return ecsSpec
         */
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        /**
         * @return environmentVariables
         */
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return idleInstanceCuller
         */
        public IdleInstanceCuller getIdleInstanceCuller() {
            return this.idleInstanceCuller;
        }

        /**
         * @return imageAuth
         */
        public String getImageAuth() {
            return this.imageAuth;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceShutdownTimer
         */
        public InstanceShutdownTimer getInstanceShutdownTimer() {
            return this.instanceShutdownTimer;
        }

        /**
         * @return instanceSnapshotList
         */
        public java.util.List<InstanceSnapshotList> getInstanceSnapshotList() {
            return this.instanceSnapshotList;
        }

        /**
         * @return instanceUrl
         */
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        /**
         * @return jupyterlabUrl
         */
        public String getJupyterlabUrl() {
            return this.jupyterlabUrl;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return latestSnapshot
         */
        public LatestSnapshot getLatestSnapshot() {
            return this.latestSnapshot;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return requestedResource
         */
        public RequestedResource getRequestedResource() {
            return this.requestedResource;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return terminalUrl
         */
        public String getTerminalUrl() {
            return this.terminalUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userVpc
         */
        public UserVpc getUserVpc() {
            return this.userVpc;
        }

        /**
         * @return webIDEUrl
         */
        public String getWebIDEUrl() {
            return this.webIDEUrl;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        /**
         * @return workspaceSource
         */
        public String getWorkspaceSource() {
            return this.workspaceSource;
        }

        public static final class Builder {
            private String acceleratorType; 
            private String accessibility; 
            private Long accumulatedRunningTimeInMs; 
            private Affinity affinity; 
            private java.util.List<CloudDisks> cloudDisks; 
            private CredentialConfig credentialConfig; 
            private java.util.List<Datasets> datasets; 
            private String driver; 
            private String ecsSpec; 
            private java.util.Map<String, String> environmentVariables; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private IdleInstanceCuller idleInstanceCuller; 
            private String imageAuth; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String instanceId; 
            private String instanceName; 
            private InstanceShutdownTimer instanceShutdownTimer; 
            private java.util.List<InstanceSnapshotList> instanceSnapshotList; 
            private String instanceUrl; 
            private String jupyterlabUrl; 
            private java.util.List<Labels> labels; 
            private LatestSnapshot latestSnapshot; 
            private String paymentType; 
            private Long priority; 
            private String reasonCode; 
            private String reasonMessage; 
            private RequestedResource requestedResource; 
            private String resourceId; 
            private String resourceName; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String terminalUrl; 
            private String userId; 
            private String userName; 
            private UserVpc userVpc; 
            private String webIDEUrl; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceSource; 

            /**
             * AcceleratorType.
             */
            public Builder acceleratorType(String acceleratorType) {
                this.acceleratorType = acceleratorType;
                return this;
            }

            /**
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * AccumulatedRunningTimeInMs.
             */
            public Builder accumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
                this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
                return this;
            }

            /**
             * Affinity.
             */
            public Builder affinity(Affinity affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * CloudDisks.
             */
            public Builder cloudDisks(java.util.List<CloudDisks> cloudDisks) {
                this.cloudDisks = cloudDisks;
                return this;
            }

            /**
             * CredentialConfig.
             */
            public Builder credentialConfig(CredentialConfig credentialConfig) {
                this.credentialConfig = credentialConfig;
                return this;
            }

            /**
             * Datasets.
             */
            public Builder datasets(java.util.List<Datasets> datasets) {
                this.datasets = datasets;
                return this;
            }

            /**
             * Driver.
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * EcsSpec.
             */
            public Builder ecsSpec(String ecsSpec) {
                this.ecsSpec = ecsSpec;
                return this;
            }

            /**
             * EnvironmentVariables.
             */
            public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * IdleInstanceCuller.
             */
            public Builder idleInstanceCuller(IdleInstanceCuller idleInstanceCuller) {
                this.idleInstanceCuller = idleInstanceCuller;
                return this;
            }

            /**
             * ImageAuth.
             */
            public Builder imageAuth(String imageAuth) {
                this.imageAuth = imageAuth;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceShutdownTimer.
             */
            public Builder instanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
                this.instanceShutdownTimer = instanceShutdownTimer;
                return this;
            }

            /**
             * InstanceSnapshotList.
             */
            public Builder instanceSnapshotList(java.util.List<InstanceSnapshotList> instanceSnapshotList) {
                this.instanceSnapshotList = instanceSnapshotList;
                return this;
            }

            /**
             * InstanceUrl.
             */
            public Builder instanceUrl(String instanceUrl) {
                this.instanceUrl = instanceUrl;
                return this;
            }

            /**
             * <p>Jupyterlab Url。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/</a></p>
             */
            public Builder jupyterlabUrl(String jupyterlabUrl) {
                this.jupyterlabUrl = jupyterlabUrl;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * LatestSnapshot.
             */
            public Builder latestSnapshot(LatestSnapshot latestSnapshot) {
                this.latestSnapshot = latestSnapshot;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * RequestedResource.
             */
            public Builder requestedResource(RequestedResource requestedResource) {
                this.requestedResource = requestedResource;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TerminalUrl.
             */
            public Builder terminalUrl(String terminalUrl) {
                this.terminalUrl = terminalUrl;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserVpc.
             */
            public Builder userVpc(UserVpc userVpc) {
                this.userVpc = userVpc;
                return this;
            }

            /**
             * <p>Web IDE url。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/</a></p>
             */
            public Builder webIDEUrl(String webIDEUrl) {
                this.webIDEUrl = webIDEUrl;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * WorkspaceSource.
             */
            public Builder workspaceSource(String workspaceSource) {
                this.workspaceSource = workspaceSource;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
