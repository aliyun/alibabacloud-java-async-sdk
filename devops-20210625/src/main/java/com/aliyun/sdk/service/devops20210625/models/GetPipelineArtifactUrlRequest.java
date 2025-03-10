// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetPipelineArtifactUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineArtifactUrlRequest</p>
 */
public class GetPipelineArtifactUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1000)
    private String filePath;

    private GetPipelineArtifactUrlRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineArtifactUrlRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<GetPipelineArtifactUrlRequest, Builder> {
        private String organizationId; 
        private String fileName; 
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineArtifactUrlRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.tgz</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/test/test.tgz</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public GetPipelineArtifactUrlRequest build() {
            return new GetPipelineArtifactUrlRequest(this);
        } 

    } 

}
