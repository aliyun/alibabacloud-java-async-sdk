// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentJobResponseBody</p>
 */
public class ListDeploymentJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListDeploymentJobResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer showSize; 
        private Long total; 

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The data returned for the request.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of deployment tasks per page. Default value: **50**.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of deployment tasks returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDeploymentJobResponseBody build() {
            return new ListDeploymentJobResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertDomain")
        private String certDomain;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("Del")
        private Integer del;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Rollback")
        private Integer rollback;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.certDomain = builder.certDomain;
            this.certType = builder.certType;
            this.del = builder.del;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.jobType = builder.jobType;
            this.name = builder.name;
            this.productName = builder.productName;
            this.rollback = builder.rollback;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certDomain
         */
        public String getCertDomain() {
            return this.certDomain;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return del
         */
        public Integer getDel() {
            return this.del;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return rollback
         */
        public Integer getRollback() {
            return this.rollback;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String certDomain; 
            private String certType; 
            private Integer del; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private String jobType; 
            private String name; 
            private String productName; 
            private Integer rollback; 
            private String scheduleTime; 
            private String startTime; 
            private String status; 
            private Long userId; 

            /**
             * The domain names bound to the certificate of the deployment task.
             */
            public Builder certDomain(String certDomain) {
                this.certDomain = certDomain;
                return this;
            }

            /**
             * The type of the certificate. Valid values:
             * <p>
             * 
             * *   **upload**: uploaded certificate
             * *   **buy**: purchased certificate
             * *   **free**: free certificate, available only on the China site (aliyun.com)
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * Indicates whether the deployment task is deleted. Valid values:
             * <p>
             * 
             * *   **0**: not deleted
             * *   **1**: deleted
             */
            public Builder del(Integer del) {
                this.del = del;
                return this;
            }

            /**
             * The end time of the deployment task.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the deployment task was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the deployment task was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the deployment task. You can use the ID to query the details and status of the deployment task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID of the deployment task.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the deployment task.
             * <p>
             * 
             * *   **cloud**: multi-cloud deployment task.
             * *   **user**: cloud service deployment task. This type of task does not support ECS instances.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The name of the deployment task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The cloud service included in the resources of the deployment task.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * Indicates whether the rollback worker is included. For example, if a cloud service involved in a deployment task has been rolled back, **1** is returned. Valid values:
             * <p>
             * 
             * *   **0**: The rollback worker is not included.
             * *   **1**: The rollback worker is included.
             */
            public Builder rollback(Integer rollback) {
                this.rollback = rollback;
                return this;
            }

            /**
             * The time when the deployment task was scheduled.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * The start time of the deployment task.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the deployment task. Valid values:
             * <p>
             * 
             * *   **pending**
             * *   **editing**
             * *   **scheduling**
             * *   **processing**
             * *   **error**
             * *   **success**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
