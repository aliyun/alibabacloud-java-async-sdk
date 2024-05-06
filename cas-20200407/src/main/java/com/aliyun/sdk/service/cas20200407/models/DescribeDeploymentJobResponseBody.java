// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentJobResponseBody</p>
 */
public class DescribeDeploymentJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasContacts")
    private java.util.List < CasContacts> casContacts;

    @com.aliyun.core.annotation.NameInMap("CertDomain")
    private String certDomain;

    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private DescribeDeploymentJobResponseBody(Builder builder) {
        this.casContacts = builder.casContacts;
        this.certDomain = builder.certDomain;
        this.certType = builder.certType;
        this.config = builder.config;
        this.del = builder.del;
        this.endTime = builder.endTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.jobType = builder.jobType;
        this.name = builder.name;
        this.productName = builder.productName;
        this.requestId = builder.requestId;
        this.rollback = builder.rollback;
        this.scheduleTime = builder.scheduleTime;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return casContacts
     */
    public java.util.List < CasContacts> getCasContacts() {
        return this.casContacts;
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
     * @return config
     */
    public String getConfig() {
        return this.config;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < CasContacts> casContacts; 
        private String certDomain; 
        private String certType; 
        private String config; 
        private Integer del; 
        private String endTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String instanceId; 
        private String jobType; 
        private String name; 
        private String productName; 
        private String requestId; 
        private Integer rollback; 
        private String scheduleTime; 
        private String startTime; 
        private String status; 
        private Long userId; 

        /**
         * CasContacts.
         */
        public Builder casContacts(java.util.List < CasContacts> casContacts) {
            this.casContacts = casContacts;
            return this;
        }

        /**
         * CertDomain.
         */
        public Builder certDomain(String certDomain) {
            this.certDomain = certDomain;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.certType = certType;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Del.
         */
        public Builder del(Integer del) {
            this.del = del;
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
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
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
         * Rollback.
         */
        public Builder rollback(Integer rollback) {
            this.rollback = rollback;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public DescribeDeploymentJobResponseBody build() {
            return new DescribeDeploymentJobResponseBody(this);
        } 

    } 

    public static class CasContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CasContacts(Builder builder) {
            this.email = builder.email;
            this.id = builder.id;
            this.mobile = builder.mobile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CasContacts create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String email; 
            private String id; 
            private String mobile; 
            private String name; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CasContacts build() {
                return new CasContacts(this);
            } 

        } 

    }
}
