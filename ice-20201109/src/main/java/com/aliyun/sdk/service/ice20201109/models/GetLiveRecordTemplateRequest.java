// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetLiveRecordTemplateRequest</p>
 */
public class GetLiveRecordTemplateRequest extends Request {
    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * TemplateId.
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
