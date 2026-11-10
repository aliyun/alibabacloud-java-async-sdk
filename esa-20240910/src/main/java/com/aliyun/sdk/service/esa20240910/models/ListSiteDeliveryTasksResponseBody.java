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
 * {@link ListSiteDeliveryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSiteDeliveryTasksResponseBody</p>
 */
public class ListSiteDeliveryTasksResponseBody extends TeaModel {
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

    private ListSiteDeliveryTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSiteDeliveryTasksResponseBody create() {
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

        private Builder(ListSiteDeliveryTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>. Valid values: <strong>1 to 500</strong>.</p>
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
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of real-time log projects.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSiteDeliveryTasksResponseBody build() {
            return new ListSiteDeliveryTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSiteDeliveryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteDeliveryTasksResponseBody</p>
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
             * <p>The real-time log type. Valid values:</p>
             * <ul>
             * <li><strong>dcdn_log_access_l1</strong> (default): Access logs.</li>
             * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
             * <li><strong>dcdn_log_waf</strong>: Security protection logs.</li>
             * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dcdn_log_access_l1</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The data center. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: The Chinese mainland.</li>
             * <li><strong>sg</strong>: Global (excluding the Chinese mainland).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder dataCenter(String dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            /**
             * <p>The delivery type. Valid values:</p>
             * <ul>
             * <li><strong>sls</strong>: Simple Log Service.</li>
             * <li><strong>http</strong>: HTTP service.</li>
             * <li><strong>aws3</strong>: Amazon S3 service.</li>
             * <li><strong>oss</strong>: Object Storage Service (OSS).</li>
             * <li><strong>kafka</strong>: Kafka service.</li>
             * <li><strong>aws3cmpt</strong>: Amazon S3-compatible service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><p><strong>online</strong>: Pushing.</p>
             * </li>
             * <li><p><strong>offline</strong>: Paused.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>cdn-test-task</p>
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
