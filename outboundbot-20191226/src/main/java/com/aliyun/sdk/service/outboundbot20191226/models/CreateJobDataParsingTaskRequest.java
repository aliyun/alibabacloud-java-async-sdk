// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobDataParsingTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateJobDataParsingTaskRequest</p>
 */
public class CreateJobDataParsingTaskRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobFilePath")
    @Validation(required = true)
    private String jobFilePath;

    private CreateJobDataParsingTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobFilePath = builder.jobFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobDataParsingTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobFilePath
     */
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    public static final class Builder extends Request.Builder<CreateJobDataParsingTaskRequest, Builder> {
        private String instanceId; 
        private String jobFilePath; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobDataParsingTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobFilePath = request.jobFilePath;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobFilePath.
         */
        public Builder jobFilePath(String jobFilePath) {
            this.putQueryParameter("JobFilePath", jobFilePath);
            this.jobFilePath = jobFilePath;
            return this;
        }

        @Override
        public CreateJobDataParsingTaskRequest build() {
            return new CreateJobDataParsingTaskRequest(this);
        } 

    } 

}
