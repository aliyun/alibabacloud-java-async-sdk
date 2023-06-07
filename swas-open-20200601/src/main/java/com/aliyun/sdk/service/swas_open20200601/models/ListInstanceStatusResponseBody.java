// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceStatusResponseBody</p>
 */
public class ListInstanceStatusResponseBody extends TeaModel {
    @NameInMap("InstanceStatuses")
    private java.util.List < InstanceStatuses> instanceStatuses;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListInstanceStatusResponseBody(Builder builder) {
        this.instanceStatuses = builder.instanceStatuses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatuses
     */
    public java.util.List < InstanceStatuses> getInstanceStatuses() {
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
        private java.util.List < InstanceStatuses> instanceStatuses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceStatuses.
         */
        public Builder instanceStatuses(java.util.List < InstanceStatuses> instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceStatusResponseBody build() {
            return new ListInstanceStatusResponseBody(this);
        } 

    } 

    public static class InstanceStatuses extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private InstanceStatuses(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatuses create() {
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
