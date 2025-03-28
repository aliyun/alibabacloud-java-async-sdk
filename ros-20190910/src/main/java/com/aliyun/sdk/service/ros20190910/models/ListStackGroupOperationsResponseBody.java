// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListStackGroupOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackGroupOperationsResponseBody</p>
 */
public class ListStackGroupOperationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroupOperations")
    private java.util.List<StackGroupOperations> stackGroupOperations;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StackGroupOperations> getStackGroupOperations() {
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
        private java.util.List<StackGroupOperations> stackGroupOperations; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListStackGroupOperationsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.stackGroupOperations = model.stackGroupOperations;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
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
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stack group operations.</p>
         */
        public Builder stackGroupOperations(java.util.List<StackGroupOperations> stackGroupOperations) {
            this.stackGroupOperations = stackGroupOperations;
            return this;
        }

        /**
         * <p>The total number of stack group operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupOperationsResponseBody build() {
            return new ListStackGroupOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackGroupOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackGroupOperationsResponseBody</p>
     */
    public static class StackGroupOperations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("OperationDescription")
        private String operationDescription;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("StackGroupId")
        private String stackGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupName")
        private String stackGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(StackGroupOperations model) {
                this.action = model.action;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.operationDescription = model.operationDescription;
                this.operationId = model.operationId;
                this.stackGroupId = model.stackGroupId;
                this.stackGroupName = model.stackGroupName;
                this.status = model.status;
            } 

            /**
             * <p>The operation type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CREATE</li>
             * <li>UPDATE</li>
             * <li>DELETE</li>
             * <li>DETECT_DRIFT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The time when the operation was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20T09:22:36.000000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the operation ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20T09:22:41.000000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The description of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Create stack instance in hangzhou</p>
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * <p>The operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>14A07460-EBE7-47CA-9757-12CC4761****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The ID of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * <p>The name of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStackGroup</p>
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * <p>The state of the operation.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>SUCCEEDED</li>
             * <li>FAILED</li>
             * <li>STOPPING</li>
             * <li>STOPPED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
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
