// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationInstancesResponseBody</p>
 */
public class DescribeApplicationInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * TraceId.
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
        @NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @NameInMap("DebugStatus")
        private Boolean debugStatus;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("FinishTimeStamp")
        private Long finishTimeStamp;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("InstanceContainerIp")
        private String instanceContainerIp;

        @NameInMap("InstanceContainerRestarts")
        private Long instanceContainerRestarts;

        @NameInMap("InstanceContainerStatus")
        private String instanceContainerStatus;

        @NameInMap("InstanceHealthStatus")
        private String instanceHealthStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("VSwitchId")
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
             * CreateTimeStamp.
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
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * FinishTimeStamp.
             */
            public Builder finishTimeStamp(Long finishTimeStamp) {
                this.finishTimeStamp = finishTimeStamp;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * InstanceContainerIp.
             */
            public Builder instanceContainerIp(String instanceContainerIp) {
                this.instanceContainerIp = instanceContainerIp;
                return this;
            }

            /**
             * InstanceContainerRestarts.
             */
            public Builder instanceContainerRestarts(Long instanceContainerRestarts) {
                this.instanceContainerRestarts = instanceContainerRestarts;
                return this;
            }

            /**
             * InstanceContainerStatus.
             */
            public Builder instanceContainerStatus(String instanceContainerStatus) {
                this.instanceContainerStatus = instanceContainerStatus;
                return this;
            }

            /**
             * InstanceHealthStatus.
             */
            public Builder instanceHealthStatus(String instanceHealthStatus) {
                this.instanceHealthStatus = instanceHealthStatus;
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
             * PackageVersion.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * VSwitchId.
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
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("Instances")
        private java.util.List < Instances> instances;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalSize")
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
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
             * TotalSize.
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
