// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateEdgeTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeTranscodeJobRequest</p>
 */
public class UpdateEdgeTranscodeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamInput")
    private String streamInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamOutput")
    private String streamOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private UpdateEdgeTranscodeJobRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamInput = builder.streamInput;
        this.streamOutput = builder.streamOutput;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeTranscodeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return streamInput
     */
    public String getStreamInput() {
        return this.streamInput;
    }

    /**
     * @return streamOutput
     */
    public String getStreamOutput() {
        return this.streamOutput;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeTranscodeJobRequest, Builder> {
        private String clusterId; 
        private String jobId; 
        private String name; 
        private Long ownerId; 
        private String regionId; 
        private String streamInput; 
        private String streamOutput; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeTranscodeJobRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobId = request.jobId;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamInput = request.streamInput;
            this.streamOutput = request.streamOutput;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The ID of the data center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3b-4d18-395c-8106-ff21a6</strong></strong></strong></p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the edge transcoding task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The URL of the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://mydomain/app/stream1</p>
         */
        public Builder streamInput(String streamInput) {
            this.putQueryParameter("StreamInput", streamInput);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * <p>The URL of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://testdomain/app/stream2</p>
         */
        public Builder streamOutput(String streamOutput) {
            this.putQueryParameter("StreamOutput", streamOutput);
            this.streamOutput = streamOutput;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateEdgeTranscodeJobRequest build() {
            return new UpdateEdgeTranscodeJobRequest(this);
        } 

    } 

}
