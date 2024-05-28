// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineEmasArtifactUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineEmasArtifactUrlRequest</p>
 */
public class GetPipelineEmasArtifactUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("emasJobInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String emasJobInstanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("md5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String md5;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineRunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceConnectionId;

    private GetPipelineEmasArtifactUrlRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.emasJobInstanceId = builder.emasJobInstanceId;
        this.md5 = builder.md5;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
        this.serviceConnectionId = builder.serviceConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineEmasArtifactUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return emasJobInstanceId
     */
    public String getEmasJobInstanceId() {
        return this.emasJobInstanceId;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return serviceConnectionId
     */
    public Long getServiceConnectionId() {
        return this.serviceConnectionId;
    }

    public static final class Builder extends Request.Builder<GetPipelineEmasArtifactUrlRequest, Builder> {
        private String organizationId; 
        private String emasJobInstanceId; 
        private String md5; 
        private Long pipelineId; 
        private Long pipelineRunId; 
        private Long serviceConnectionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineEmasArtifactUrlRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.emasJobInstanceId = request.emasJobInstanceId;
            this.md5 = request.md5;
            this.pipelineId = request.pipelineId;
            this.pipelineRunId = request.pipelineRunId;
            this.serviceConnectionId = request.serviceConnectionId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * emasJobInstanceId.
         */
        public Builder emasJobInstanceId(String emasJobInstanceId) {
            this.putPathParameter("emasJobInstanceId", emasJobInstanceId);
            this.emasJobInstanceId = emasJobInstanceId;
            return this;
        }

        /**
         * md5.
         */
        public Builder md5(String md5) {
            this.putPathParameter("md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * pipelineRunId.
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.putPathParameter("pipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * serviceConnectionId.
         */
        public Builder serviceConnectionId(Long serviceConnectionId) {
            this.putQueryParameter("serviceConnectionId", serviceConnectionId);
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }

        @Override
        public GetPipelineEmasArtifactUrlRequest build() {
            return new GetPipelineEmasArtifactUrlRequest(this);
        } 

    } 

}
