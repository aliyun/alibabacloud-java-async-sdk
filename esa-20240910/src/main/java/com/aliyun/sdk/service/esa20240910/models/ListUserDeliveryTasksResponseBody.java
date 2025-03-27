// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListUserDeliveryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDeliveryTasksResponseBody</p>
 */
public class ListUserDeliveryTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListUserDeliveryTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDeliveryTasksResponseBody create() {
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
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
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListUserDeliveryTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number returned.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1f94c47f-3a1a-4f69-8d6c-bfeee1b49aab</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The delivery tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of delivery tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserDeliveryTasksResponseBody build() {
            return new ListUserDeliveryTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserDeliveryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDeliveryTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("DataCenter")
        private String dataCenter;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Tasks(Builder builder) {
            this.businessType = builder.businessType;
            this.dataCenter = builder.dataCenter;
            this.deliveryType = builder.deliveryType;
            this.status = builder.status;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return dataCenter
         */
        public String getDataCenter() {
            return this.dataCenter;
        }

        /**
         * @return deliveryType
         */
        public String getDeliveryType() {
            return this.deliveryType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String businessType; 
            private String dataCenter; 
            private String deliveryType; 
            private String status; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.businessType = model.businessType;
                this.dataCenter = model.dataCenter;
                this.deliveryType = model.deliveryType;
                this.status = model.status;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The log category.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn_log_er</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The data center. Valid values:</p>
             * <ol>
             * <li>cn: the Chinese mainland.</li>
             * <li>sg: outside the Chinese mainland.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder dataCenter(String dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            /**
             * <p>The delivery destination.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * <p>The status of the delivery task.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the delivery task.</p>
             * 
             * <strong>example:</strong>
             * <p>testoss11</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
