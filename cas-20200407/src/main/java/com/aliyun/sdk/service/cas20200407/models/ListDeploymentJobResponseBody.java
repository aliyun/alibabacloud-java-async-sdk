// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data returned for the request.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789ABC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of deployment tasks per page. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of deployment tasks returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDeploymentJobResponseBody build() {
            return new ListDeploymentJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeploymentJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeploymentJobResponseBody</p>
     */
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
             * <p>The domain names bound to the certificate of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyundoc1.com,aliyundoc2.com,aliyundoc3.com</p>
             */
            public Builder certDomain(String certDomain) {
                this.certDomain = certDomain;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>upload</strong>: uploaded certificate</li>
             * <li><strong>buy</strong>: purchased certificate</li>
             * <li><strong>free</strong>: free certificate, available only on the China site (aliyun.com)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>upload</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>Indicates whether the deployment task is deleted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not deleted</li>
             * <li><strong>1</strong>: deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder del(Integer del) {
                this.del = del;
                return this;
            }

            /**
             * <p>The end time of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>1606482979000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the deployment task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1624343180000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the deployment task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1606482979000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the deployment task. You can use the ID to query the details and status of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>19975</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-job-user-0gvntn</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the deployment task.</p>
             * <ul>
             * <li><strong>cloud</strong>: multi-cloud deployment task.</li>
             * <li><strong>user</strong>: cloud service deployment task. This type of task does not support ECS instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The name of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>job-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cloud service included in the resources of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>NLB</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>Indicates whether the rollback worker is included. For example, if a cloud service involved in a deployment task has been rolled back, <strong>1</strong> is returned. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The rollback worker is not included.</li>
             * <li><strong>1</strong>: The rollback worker is included.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rollback(Integer rollback) {
                this.rollback = rollback;
                return this;
            }

            /**
             * <p>The time when the deployment task was scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1606482979000</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The start time of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>1606482979000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the deployment task. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong></li>
             * <li><strong>editing</strong></li>
             * <li><strong>scheduling</strong></li>
             * <li><strong>processing</strong></li>
             * <li><strong>error</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scheduling</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1666884372152785</p>
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
