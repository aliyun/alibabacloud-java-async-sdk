// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeploymentJobRequest</p>
 */
public class UpdateDeploymentJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    private String certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIds")
    private String contactIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    private Long scheduleTime;

    private UpdateDeploymentJobRequest(Builder builder) {
        super(builder);
        this.certIds = builder.certIds;
        this.contactIds = builder.contactIds;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.resourceIds = builder.resourceIds;
        this.scheduleTime = builder.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeploymentJobRequest create() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
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

    public static final class Builder extends Request.Builder<UpdateDeploymentJobRequest, Builder> {
        private String certIds; 
        private String contactIds; 
        private Long jobId; 
        private String name; 
        private String resourceIds; 
        private Long scheduleTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeploymentJobRequest request) {
            super(request);
            this.certIds = request.certIds;
            this.contactIds = request.contactIds;
            this.jobId = request.jobId;
            this.name = request.name;
            this.resourceIds = request.resourceIds;
            this.scheduleTime = request.scheduleTime;
        } 

        /**
         * <p>The ID of the certificate. Separate multiple certificate IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the ID of a certificate from the <strong>CertificateId</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>9957285,12067351,12304338,12342649</p>
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
            return this;
        }

        /**
         * <p>The ID of the contact. Separate multiple contact IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712221.html">ListContact</a> operation to obtain the ID of a contact from the <strong>ContactId</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>9957285,12067351,12304338,12342649</p>
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the JobId parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the cloud resource. Separate multiple resource IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a> operation to obtain the ID of a cloud resource from the <strong>Id</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>9957285,12067351,12304338,12342649</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The time when the task starts. The value is a UNIX timestamp. If you do not specify this parameter, the system immediately starts the task after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1606482979000</p>
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        @Override
        public UpdateDeploymentJobRequest build() {
            return new UpdateDeploymentJobRequest(this);
        } 

    } 

}
