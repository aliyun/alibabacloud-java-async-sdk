// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RegisterKnowledgeBaseFileRequest} extends {@link RequestModel}
 *
 * <p>RegisterKnowledgeBaseFileRequest</p>
 */
public class RegisterKnowledgeBaseFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RegisterKnowledgeBaseFileRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterKnowledgeBaseFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RegisterKnowledgeBaseFileRequest, Builder> {
        private String filePath; 
        private String knowledgeBaseId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterKnowledgeBaseFileRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The OSS object key of the uploaded file, excluding the oss://BucketName/ prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-2ze123456789abcd/pkb-2ze123456789abcd/example.pdf</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-2ze123456789abcd</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The ID of the region where the knowledge base resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RegisterKnowledgeBaseFileRequest build() {
            return new RegisterKnowledgeBaseFileRequest(this);
        } 

    } 

}
