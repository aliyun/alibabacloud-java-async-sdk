// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentJobRequest</p>
 */
public class CreateDeploymentJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    private Long scheduleTime;

    private CreateDeploymentJobRequest(Builder builder) {
        super(builder);
        this.certIds = builder.certIds;
        this.contactIds = builder.contactIds;
        this.jobType = builder.jobType;
        this.name = builder.name;
        this.resourceIds = builder.resourceIds;
        this.scheduleTime = builder.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIds
     */
    public String getCertIds() {
        return this.certIds;
    }

    /**
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
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
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return scheduleTime
     */
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public static final class Builder extends Request.Builder<CreateDeploymentJobRequest, Builder> {
        private String certIds; 
        private String contactIds; 
        private String jobType; 
        private String name; 
        private String resourceIds; 
        private Long scheduleTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentJobRequest request) {
            super(request);
            this.certIds = request.certIds;
            this.contactIds = request.contactIds;
            this.jobType = request.jobType;
            this.name = request.name;
            this.resourceIds = request.resourceIds;
            this.scheduleTime = request.scheduleTime;
        } 

        /**
         * The certificate IDs.
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
            return this;
        }

        /**
         * The contact IDs.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * The type of the task.
         * <p>
         * 
         * Valid values:
         * 
         * *   cloud
         * *   user
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * The name of the deployment task.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The resource IDs.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The time when the task was scheduled.
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        @Override
        public CreateDeploymentJobRequest build() {
            return new CreateDeploymentJobRequest(this);
        } 

    } 

}
