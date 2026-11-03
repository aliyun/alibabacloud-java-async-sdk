// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationInstancesResponseBody</p>
 */
public class DescribeApplicationInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Successful.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application instance information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>Request succeeded: The <strong>ErrorCode</strong> field is not returned.</li>
         * <li>Request failed: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information about the call result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the application instance list was successfully retrieved. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationInstancesResponseBody build() {
            return new DescribeApplicationInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationInstancesResponseBody</p>
     */
    public static class SidecarContainersStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerStatus")
        private String containerStatus;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        private SidecarContainersStatus(Builder builder) {
            this.containerId = builder.containerId;
            this.containerStatus = builder.containerStatus;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarContainersStatus create() {
            return builder().build();
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerStatus
         */
        public String getContainerStatus() {
            return this.containerStatus;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String containerId; 
            private String containerStatus; 
            private String imageUrl; 

            private Builder() {
            } 

            private Builder(SidecarContainersStatus model) {
                this.containerId = model.containerId;
                this.containerStatus = model.containerStatus;
                this.imageUrl = model.imageUrl;
            } 

            /**
             * <p>The sidecar container ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sidecar-test-01</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The container status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder containerStatus(String containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            /**
             * <p>The image address.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-beijing.aliyuncs.com/sae-dev-test/******</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public SidecarContainersStatus build() {
                return new SidecarContainersStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("DebugStatus")
        private Boolean debugStatus;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("FinishTimeStamp")
        private Long finishTimeStamp;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceContainerIp")
        private String instanceContainerIp;

        @com.aliyun.core.annotation.NameInMap("InstanceContainerRestarts")
        private Long instanceContainerRestarts;

        @com.aliyun.core.annotation.NameInMap("InstanceContainerStatus")
        private String instanceContainerStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceHealthStatus")
        private String instanceHealthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MainContainerStatus")
        private String mainContainerStatus;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("SidecarContainersStatus")
        private java.util.List<SidecarContainersStatus> sidecarContainersStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TrafficStatus")
        private String trafficStatus;

        @com.aliyun.core.annotation.NameInMap("UnhealthyMessage")
        private String unhealthyMessage;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private Instances(Builder builder) {
            this.createTimeStamp = builder.createTimeStamp;
            this.debugStatus = builder.debugStatus;
            this.eip = builder.eip;
            this.finishTimeStamp = builder.finishTimeStamp;
            this.groupId = builder.groupId;
            this.imageUrl = builder.imageUrl;
            this.instanceContainerIp = builder.instanceContainerIp;
            this.instanceContainerRestarts = builder.instanceContainerRestarts;
            this.instanceContainerStatus = builder.instanceContainerStatus;
            this.instanceHealthStatus = builder.instanceHealthStatus;
            this.instanceId = builder.instanceId;
            this.mainContainerStatus = builder.mainContainerStatus;
            this.packageVersion = builder.packageVersion;
            this.sidecarContainersStatus = builder.sidecarContainersStatus;
            this.tags = builder.tags;
            this.timestamp = builder.timestamp;
            this.trafficStatus = builder.trafficStatus;
            this.unhealthyMessage = builder.unhealthyMessage;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return createTimeStamp
         */
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        /**
         * @return debugStatus
         */
        public Boolean getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return finishTimeStamp
         */
        public Long getFinishTimeStamp() {
            return this.finishTimeStamp;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return instanceContainerIp
         */
        public String getInstanceContainerIp() {
            return this.instanceContainerIp;
        }

        /**
         * @return instanceContainerRestarts
         */
        public Long getInstanceContainerRestarts() {
            return this.instanceContainerRestarts;
        }

        /**
         * @return instanceContainerStatus
         */
        public String getInstanceContainerStatus() {
            return this.instanceContainerStatus;
        }

        /**
         * @return instanceHealthStatus
         */
        public String getInstanceHealthStatus() {
            return this.instanceHealthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mainContainerStatus
         */
        public String getMainContainerStatus() {
            return this.mainContainerStatus;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return sidecarContainersStatus
         */
        public java.util.List<SidecarContainersStatus> getSidecarContainersStatus() {
            return this.sidecarContainersStatus;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return trafficStatus
         */
        public String getTrafficStatus() {
            return this.trafficStatus;
        }

        /**
         * @return unhealthyMessage
         */
        public String getUnhealthyMessage() {
            return this.unhealthyMessage;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private Long createTimeStamp; 
            private Boolean debugStatus; 
            private String eip; 
            private Long finishTimeStamp; 
            private String groupId; 
            private String imageUrl; 
            private String instanceContainerIp; 
            private Long instanceContainerRestarts; 
            private String instanceContainerStatus; 
            private String instanceHealthStatus; 
            private String instanceId; 
            private String mainContainerStatus; 
            private String packageVersion; 
            private java.util.List<SidecarContainersStatus> sidecarContainersStatus; 
            private java.util.List<Tags> tags; 
            private Long timestamp; 
            private String trafficStatus; 
            private String unhealthyMessage; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.createTimeStamp = model.createTimeStamp;
                this.debugStatus = model.debugStatus;
                this.eip = model.eip;
                this.finishTimeStamp = model.finishTimeStamp;
                this.groupId = model.groupId;
                this.imageUrl = model.imageUrl;
                this.instanceContainerIp = model.instanceContainerIp;
                this.instanceContainerRestarts = model.instanceContainerRestarts;
                this.instanceContainerStatus = model.instanceContainerStatus;
                this.instanceHealthStatus = model.instanceHealthStatus;
                this.instanceId = model.instanceId;
                this.mainContainerStatus = model.mainContainerStatus;
                this.packageVersion = model.packageVersion;
                this.sidecarContainersStatus = model.sidecarContainersStatus;
                this.tags = model.tags;
                this.timestamp = model.timestamp;
                this.trafficStatus = model.trafficStatus;
                this.unhealthyMessage = model.unhealthyMessage;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The timestamp when the instance started to be created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1558442609000</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>Specifies whether the instance is being debugged. Valid values:</p>
             * <ul>
             * <li><strong>True</strong>: Yes.</li>
             * <li><strong>False</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder debugStatus(Boolean debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>The elastic IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>8.129.XX.XXX</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>The timestamp when the instance was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642757283000</p>
             */
            public Builder finishTimeStamp(Long finishTimeStamp) {
                this.finishTimeStamp = finishTimeStamp;
                return this;
            }

            /**
             * <p>The ID of the group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The image repository address.</p>
             * <blockquote>
             * <p>If you deploy the application by using a JAR package or a WAR package, the image generated by the Serverless App Engine (SAE) platform is not available for public download.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-beijing.aliyuncs.com/sae-demo-image/cartservice:1.0</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The internal IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.X.X</p>
             */
            public Builder instanceContainerIp(String instanceContainerIp) {
                this.instanceContainerIp = instanceContainerIp;
                return this;
            }

            /**
             * <p>The number of times the instance has been restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceContainerRestarts(Long instanceContainerRestarts) {
                this.instanceContainerRestarts = instanceContainerRestarts;
                return this;
            }

            /**
             * <p>The running status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Error</strong>: An error occurred during instance startup.</li>
             * <li><strong>CrashLoopBackOff</strong>: The container failed to start. An error occurred during startup, and the error persisted after a restart.</li>
             * <li><strong>ErrImagePull</strong>: An error occurred while pulling the container image for the instance.</li>
             * <li><strong>ImagePullBackOff</strong>: The container image cannot be retrieved.</li>
             * <li><strong>Pending</strong>: The instance is waiting to be scheduled.</li>
             * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
             * <li><strong>Terminating</strong>: The instance is being terminated.</li>
             * <li><strong>NotFound</strong>: The instance cannot be found.</li>
             * <li><strong>PodInitializing</strong>: The instance is being initialized.</li>
             * <li><strong>Init:0/1</strong>: The instance is initializing.</li>
             * <li><strong>Running</strong>: The instance is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceContainerStatus(String instanceContainerStatus) {
                this.instanceContainerStatus = instanceContainerStatus;
                return this;
            }

            /**
             * <p>The health check configuration information. Valid values:</p>
             * <ul>
             * <li><strong>WithoutHealthCheckConfig</strong>: Neither liveness nor readiness health checks are configured.</li>
             * <li><strong>WithoutLivenessConfig</strong>: The liveness health check is not configured.</li>
             * <li><strong>WithoutReadinessConfig</strong>: The readiness health check is not configured.</li>
             * <li><strong>NotCheckedYet</strong>: The instance is undergoing or waiting for a health check.</li>
             * <li><strong>LivenessUnhealthy</strong>: The liveness health check failed, and the instance is unhealthy.</li>
             * <li><strong>ReadinessUnhealthy</strong>: The readiness health check failed, and the instance is unhealthy.</li>
             * <li><strong>Unhealthy</strong>: Both liveness and readiness health checks failed, and the instance is unhealthy.</li>
             * <li><strong>Healthy</strong>: The health checks passed, and the instance is healthy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WithoutHealthCheckConfig</p>
             */
            public Builder instanceHealthStatus(String instanceHealthStatus) {
                this.instanceHealthStatus = instanceHealthStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The main container status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder mainContainerStatus(String mainContainerStatus) {
                this.mainContainerStatus = mainContainerStatus;
                return this;
            }

            /**
             * <p>The version information.</p>
             * 
             * <strong>example:</strong>
             * <p>1609939496200</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The status information of the sidecar containers.</p>
             */
            public Builder sidecarContainersStatus(java.util.List<SidecarContainersStatus> sidecarContainersStatus) {
                this.sidecarContainersStatus = sidecarContainersStatus;
                return this;
            }

            /**
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1750061980000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The traffic status.</p>
             * 
             * <strong>example:</strong>
             * <p>suspend</p>
             */
            public Builder trafficStatus(String trafficStatus) {
                this.trafficStatus = trafficStatus;
                return this;
            }

            /**
             * <p>The specific cause or error message returned when the health check of the application instance fails. If the health check passes, no information is returned in this field.</p>
             */
            public Builder unhealthyMessage(String unhealthyMessage) {
                this.unhealthyMessage = unhealthyMessage;
                return this;
            }

            /**
             * <p>The zone where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-***</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.instances = builder.instances;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<Instances> instances; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.instances = model.instances;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The list of application instances.</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The paging Settings for the number of entries per page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
