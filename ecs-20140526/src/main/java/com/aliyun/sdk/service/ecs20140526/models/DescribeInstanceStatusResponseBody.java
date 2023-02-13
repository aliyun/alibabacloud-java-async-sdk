// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatusResponseBody</p>
 */
public class DescribeInstanceStatusResponseBody extends TeaModel {
    @NameInMap("InstanceStatuses")
    private InstanceStatuses instanceStatuses;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceStatusResponseBody(Builder builder) {
        this.instanceStatuses = builder.instanceStatuses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatuses
     */
    public InstanceStatuses getInstanceStatuses() {
        return this.instanceStatuses;
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
        private InstanceStatuses instanceStatuses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The status information of the instances.
         */
        public Builder instanceStatuses(InstanceStatuses instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceStatusResponseBody build() {
            return new DescribeInstanceStatusResponseBody(this);
        } 

    } 

    public static class InstanceStatus extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private InstanceStatus(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatus create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private String status; 

            /**
             * The ID of instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * * Pending: The instance is being created.
             * * Running: The instance is running.
             * * Starting: The instance is being started.
             * * Stopping: The instance is being stopped.
             * * Stopped: The instance is stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceStatus build() {
                return new InstanceStatus(this);
            } 

        } 

    }
    public static class InstanceStatuses extends TeaModel {
        @NameInMap("InstanceStatus")
        private java.util.List < InstanceStatus> instanceStatus;

        private InstanceStatuses(Builder builder) {
            this.instanceStatus = builder.instanceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatuses create() {
            return builder().build();
        }

        /**
         * @return instanceStatus
         */
        public java.util.List < InstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

        public static final class Builder {
            private java.util.List < InstanceStatus> instanceStatus; 

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(java.util.List < InstanceStatus> instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
