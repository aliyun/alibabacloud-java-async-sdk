// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentJobRequest</p>
 */
public class CreateDeploymentJobRequest extends Request {
    @Query
    @NameInMap("CertIds")
    @Validation(required = true)
    private String certIds;

    @Query
    @NameInMap("ContactIds")
    @Validation(required = true)
    private String contactIds;

    @Query
    @NameInMap("JobType")
    @Validation(required = true)
    private String jobType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private String resourceIds;

    @Query
    @NameInMap("ScheduleTime")
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
         * CertIds.
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
            return this;
        }

        /**
         * ContactIds.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ScheduleTime.
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
