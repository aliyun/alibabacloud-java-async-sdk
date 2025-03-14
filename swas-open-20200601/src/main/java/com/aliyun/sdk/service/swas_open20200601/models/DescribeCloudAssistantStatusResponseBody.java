// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantStatusResponseBody</p>
 */
public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAssistantStatus")
    private java.util.List<CloudAssistantStatus> cloudAssistantStatus;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudAssistantStatusResponseBody(Builder builder) {
        this.cloudAssistantStatus = builder.cloudAssistantStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssistantStatus
     */
    public java.util.List<CloudAssistantStatus> getCloudAssistantStatus() {
        return this.cloudAssistantStatus;
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
        private java.util.List<CloudAssistantStatus> cloudAssistantStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudAssistantStatusResponseBody model) {
            this.cloudAssistantStatus = model.cloudAssistantStatus;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Indicates whether the Cloud Assistant client is installed on the server.</p>
         */
        public Builder cloudAssistantStatus(java.util.List<CloudAssistantStatus> cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudAssistantStatusResponseBody build() {
            return new DescribeCloudAssistantStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantStatusResponseBody</p>
     */
    public static class CloudAssistantStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private CloudAssistantStatus(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssistantStatus create() {
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
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private Boolean status; 

            private Builder() {
            } 

            private Builder(CloudAssistantStatus model) {
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>ace0706b2ac4454d984295a94213****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the Cloud Assistant client is installed on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public CloudAssistantStatus build() {
                return new CloudAssistantStatus(this);
            } 

        } 

    }
}
