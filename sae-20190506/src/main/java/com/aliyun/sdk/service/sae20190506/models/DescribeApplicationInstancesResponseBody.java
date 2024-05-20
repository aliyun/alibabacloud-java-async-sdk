// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the application instances.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code. 
         * <p>
         * 
         * - The **ErrorCode** parameter is not returned when the request succeeds.
         * - The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the list of application instances was obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the list was obtained.
         * *   **false**: indicates that the list could not be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationInstancesResponseBody build() {
            return new DescribeApplicationInstancesResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

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
            this.packageVersion = builder.packageVersion;
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
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
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
            private String packageVersion; 
            private String vSwitchId; 

            /**
             * The start time of the instance creation process. Unit: milliseconds.
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
             * The elastic IP address (EIP).
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * The end time of the instance creation process. Unit: milliseconds.
             */
            public Builder finishTimeStamp(Long finishTimeStamp) {
                this.finishTimeStamp = finishTimeStamp;
                return this;
            }

            /**
             * The ID of the group to which the instance belongs.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The address of the repository.
             * <p>
             * 
             * >  If you deploy the application by using a JAR or WAR package, the image generated by SAE is not available for download.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The internal IP address of the instance.
             */
            public Builder instanceContainerIp(String instanceContainerIp) {
                this.instanceContainerIp = instanceContainerIp;
                return this;
            }

            /**
             * The number of times that the instance restarted.
             */
            public Builder instanceContainerRestarts(Long instanceContainerRestarts) {
                this.instanceContainerRestarts = instanceContainerRestarts;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * *   **Error**: An error occurred during the instance startup.
             * *   **CrashLoopBackOff**: The container failed to start. An error occurred during the startup process and persisted after the restart.
             * *   **ErrImagePull**: An error occurred while the container image was being pulled from the instance.
             * *   **ImagePullBackOff**: The container image could not be obtained.
             * *   **Pending**: The instance is waiting to be scheduled.
             * *   **Unknown**: An unknown exception occurred.
             * *   **Terminating**: The instance creation process is being terminated.
             * *   **NotFound**: The instance cannot be found.
             * *   **PodInitializing**: The instance is being initialized.
             * *   **Init:0/1**: The instance is initialized.
             * *   **Running**: The instance is running.
             */
            public Builder instanceContainerStatus(String instanceContainerStatus) {
                this.instanceContainerStatus = instanceContainerStatus;
                return this;
            }

            /**
             * The configurations of health checks. Valid values:
             * <p>
             * 
             * *   **WithoutHealthCheckConfig**: Liveness and readiness checks are not configured.
             * *   **WithoutLivenessConfig**: The liveness check is not configured.
             * *   **WithoutReadinessConfig**: The readiness check is not configured.
             * *   **NotCheckedYet**: The health checks are not performed or are in progress.
             * *   **LivenessUnhealthy**: The instance failed the liveness check.
             * *   **ReadinessUnhealthy**: The instance failed the readiness check.
             * *   **Unhealthy**: The instance failed both liveness and readiness checks.
             * *   **Healthy**: The instance passed both liveness and readiness checks.
             */
            public Builder instanceHealthStatus(String instanceHealthStatus) {
                this.instanceHealthStatus = instanceHealthStatus;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The version of the package.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * The ID of the zone where the instance is deployed.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

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
        public java.util.List < Instances> getInstances() {
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
            private java.util.List < Instances> instances; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * The number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The list of application instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned instances.
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
