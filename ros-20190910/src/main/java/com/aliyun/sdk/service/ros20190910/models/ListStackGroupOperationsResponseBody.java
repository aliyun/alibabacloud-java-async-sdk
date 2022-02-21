// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackGroupOperationsResponseBody</p>
 */
public class ListStackGroupOperationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackGroupOperations")
    private java.util.List < StackGroupOperations> stackGroupOperations;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackGroupOperationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stackGroupOperations = builder.stackGroupOperations;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackGroupOperationsResponseBody create() {
        return builder().build();
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
     * @return stackGroupOperations
     */
    public java.util.List < StackGroupOperations> getStackGroupOperations() {
        return this.stackGroupOperations;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < StackGroupOperations> stackGroupOperations; 
        private Integer totalCount; 

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
         * StackGroupOperations.
         */
        public Builder stackGroupOperations(java.util.List < StackGroupOperations> stackGroupOperations) {
            this.stackGroupOperations = stackGroupOperations;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupOperationsResponseBody build() {
            return new ListStackGroupOperationsResponseBody(this);
        } 

    } 

    public static class StackGroupOperations extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OperationDescription")
        private String operationDescription;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("StackGroupId")
        private String stackGroupId;

        @NameInMap("StackGroupName")
        private String stackGroupName;

        @NameInMap("Status")
        private String status;

        private StackGroupOperations(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.operationDescription = builder.operationDescription;
            this.operationId = builder.operationId;
            this.stackGroupId = builder.stackGroupId;
            this.stackGroupName = builder.stackGroupName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroupOperations create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return operationDescription
         */
        public String getOperationDescription() {
            return this.operationDescription;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return stackGroupId
         */
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        /**
         * @return stackGroupName
         */
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String createTime; 
            private String endTime; 
            private String operationDescription; 
            private String operationId; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String status; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * OperationDescription.
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * StackGroupId.
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * StackGroupName.
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StackGroupOperations build() {
                return new StackGroupOperations(this);
            } 

        } 

    }
}
