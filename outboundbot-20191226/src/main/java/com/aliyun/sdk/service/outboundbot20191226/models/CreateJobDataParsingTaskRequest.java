// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateJobDataParsingTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateJobDataParsingTaskRequest</p>
 */
public class CreateJobDataParsingTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3865dc3-40fa-4afd-9fe4-dc7cda305a24</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
