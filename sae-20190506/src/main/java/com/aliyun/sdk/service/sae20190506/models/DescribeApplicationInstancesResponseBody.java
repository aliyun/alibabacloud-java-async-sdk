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
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
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
         * <p>The details of the application instances.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. </p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the list of application instances was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the list was obtained.</li>
         * <li><strong>false</strong>: indicates that the list could not be obtained.</li>
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
         * <p>The ID of the trace. It is used to query the details of a request.</p>
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
             * ContainerId.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * ContainerStatus.
             */
            public Builder containerStatus(String containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            /**
             * ImageUrl.
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

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

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
            this.timestamp = builder.timestamp;
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
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
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
            private Long timestamp; 
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
                this.timestamp = model.timestamp;
                this.unhealthyMessage = model.unhealthyMessage;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The start time of the instance creation process. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1558442609000</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * DebugStatus.
             */
            public Builder debugStatus(Boolean debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>The elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>8.129.XX.XXX</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>The end time of the instance creation process. Unit: milliseconds.</p>
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
             * <p>The address of the repository.</p>
             * <blockquote>
             * <p> If you deploy the application by using a JAR or WAR package, the image generated by SAE is not available for download.</p>
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
             * <p>The number of times that the instance restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceContainerRestarts(Long instanceContainerRestarts) {
                this.instanceContainerRestarts = instanceContainerRestarts;
                return this;
            }

            /**
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Error</strong>: An error occurred during the instance startup.</li>
             * <li><strong>CrashLoopBackOff</strong>: The container failed to start. An error occurred during the startup process and persisted after the restart.</li>
             * <li><strong>ErrImagePull</strong>: An error occurred while the container image was being pulled from the instance.</li>
             * <li><strong>ImagePullBackOff</strong>: The container image could not be obtained.</li>
             * <li><strong>Pending</strong>: The instance is waiting to be scheduled.</li>
             * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
             * <li><strong>Terminating</strong>: The instance creation process is being terminated.</li>
             * <li><strong>NotFound</strong>: The instance cannot be found.</li>
             * <li><strong>PodInitializing</strong>: The instance is being initialized.</li>
             * <li><strong>Init:0/1</strong>: The instance is initialized.</li>
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
             * <p>The configurations of health checks. Valid values:</p>
             * <ul>
             * <li><strong>WithoutHealthCheckConfig</strong>: Liveness and readiness checks are not configured.</li>
             * <li><strong>WithoutLivenessConfig</strong>: The liveness check is not configured.</li>
             * <li><strong>WithoutReadinessConfig</strong>: The readiness check is not configured.</li>
             * <li><strong>NotCheckedYet</strong>: The health checks are not performed or are in progress.</li>
             * <li><strong>LivenessUnhealthy</strong>: The instance failed the liveness check.</li>
             * <li><strong>ReadinessUnhealthy</strong>: The instance failed the readiness check.</li>
             * <li><strong>Unhealthy</strong>: The instance failed both liveness and readiness checks.</li>
             * <li><strong>Healthy</strong>: The instance passed both liveness and readiness checks.</li>
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MainContainerStatus.
             */
            public Builder mainContainerStatus(String mainContainerStatus) {
                this.mainContainerStatus = mainContainerStatus;
                return this;
            }

            /**
             * <p>The version of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>1609939496200</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * SidecarContainersStatus.
             */
            public Builder sidecarContainersStatus(java.util.List<SidecarContainersStatus> sidecarContainersStatus) {
                this.sidecarContainersStatus = sidecarContainersStatus;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * UnhealthyMessage.
             */
            public Builder unhealthyMessage(String unhealthyMessage) {
                this.unhealthyMessage = unhealthyMessage;
                return this;
            }

            /**
             * <p>The ID of the zone where the instance is deployed.</p>
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
             * <p>The number of the returned page.</p>
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
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned instances.</p>
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
