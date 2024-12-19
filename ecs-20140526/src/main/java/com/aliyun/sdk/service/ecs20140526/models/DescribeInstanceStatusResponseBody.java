// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatusResponseBody</p>
 */
public class DescribeInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatuses")
    private InstanceStatuses instanceStatuses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The IDs and status of the ECS instances.</p>
         */
        public Builder instanceStatuses(InstanceStatuses instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceStatusResponseBody build() {
            return new DescribeInstanceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceStatusResponseBody</p>
     */
    public static class InstanceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1j4i2jdf3owlhe****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Pending: The instance is being created.</li>
             * <li>Running: The instance is running.</li>
             * <li>Starting: The instance is being started.</li>
             * <li>Stopping: The instance is being stopped.</li>
             * <li>Stopped: The instance is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
    /**
     * 
     * {@link DescribeInstanceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceStatusResponseBody</p>
     */
    public static class InstanceStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private java.util.List<InstanceStatus> instanceStatus;

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
        public java.util.List<InstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

        public static final class Builder {
            private java.util.List<InstanceStatus> instanceStatus; 

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(java.util.List<InstanceStatus> instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
