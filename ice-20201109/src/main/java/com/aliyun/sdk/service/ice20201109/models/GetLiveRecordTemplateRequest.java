// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetLiveRecordTemplateRequest</p>
 */
public class GetLiveRecordTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private GetLiveRecordTemplateRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRecordTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetLiveRecordTemplateRequest, Builder> {
        private String jobId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveRecordTemplateRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The ID of the recording job. You can specify the JobId parameter to retrieve the snapshot of the template used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetLiveRecordTemplateRequest build() {
            return new GetLiveRecordTemplateRequest(this);
        } 

    } 

}
