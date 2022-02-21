// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("InstanceStatuses")
    private InstanceStatuses instanceStatuses;

    private DescribeInstanceStatusResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instanceStatuses = builder.instanceStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatusResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instanceStatuses
     */
    public InstanceStatuses getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private InstanceStatuses instanceStatuses; 

        /**
         * The number of entries to return on each page.
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
         * The page number of the instance list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The type of the instance status set (InstanceStatus).
         */
        public Builder instanceStatuses(InstanceStatuses instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        public DescribeInstanceStatusResponseBody build() {
            return new DescribeInstanceStatusResponseBody(this);
        } 

    } 

    public static class InstanceStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceStatus(Builder builder) {
            this.status = builder.status;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String status; 
            private String instanceId; 

            /**
             * The status of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
