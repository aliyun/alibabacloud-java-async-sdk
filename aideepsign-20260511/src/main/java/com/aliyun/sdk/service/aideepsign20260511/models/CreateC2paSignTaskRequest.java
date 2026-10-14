// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateC2paSignTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateC2paSignTaskRequest</p>
 */
public class CreateC2paSignTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareAgent")
    private String softwareAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private CreateC2paSignTaskRequest(Builder builder) {
        super(builder);
        this.fileUrl = builder.fileUrl;
        this.softwareAgent = builder.softwareAgent;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateC2paSignTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return softwareAgent
     */
    public String getSoftwareAgent() {
        return this.softwareAgent;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateC2paSignTaskRequest, Builder> {
        private String fileUrl; 
        private String softwareAgent; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateC2paSignTaskRequest request) {
            super(request);
            this.fileUrl = request.fileUrl;
            this.softwareAgent = request.softwareAgent;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The absolute HTTP or HTTPS URL of the file to be signed. The URL can be up to 4,096 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/photo.png?token=xxx">https://example.com/images/photo.png?token=xxx</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>Not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Qwen ImageGen</p>
         */
        public Builder softwareAgent(String softwareAgent) {
            this.putQueryParameter("SoftwareAgent", softwareAgent);
            this.softwareAgent = softwareAgent;
            return this;
        }

        /**
         * <p>Not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>trainedAlgorithmicMedia</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateC2paSignTaskRequest build() {
            return new CreateC2paSignTaskRequest(this);
        } 

    } 

}
