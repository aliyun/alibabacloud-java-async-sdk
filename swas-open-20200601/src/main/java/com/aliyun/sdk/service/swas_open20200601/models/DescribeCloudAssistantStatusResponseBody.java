// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantStatusResponseBody</p>
 */
public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @NameInMap("CloudAssistantStatus")
    private java.util.List < CloudAssistantStatus> cloudAssistantStatus;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return cloudAssistantStatus
     */
    public java.util.List < CloudAssistantStatus> getCloudAssistantStatus() {
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
        private java.util.List < CloudAssistantStatus> cloudAssistantStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The status of the Cloud Assistant client.
         */
        public Builder cloudAssistantStatus(java.util.List < CloudAssistantStatus> cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }

        /**
         * The page number of the returned page.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * Maximum value: 50.
         * 
         * Default value: 10.
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
         * The total number of commands.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudAssistantStatusResponseBody build() {
            return new DescribeCloudAssistantStatusResponseBody(this);
        } 

    } 

    public static class CloudAssistantStatus extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
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

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the Cloud Assistant client is installed on the server.
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
