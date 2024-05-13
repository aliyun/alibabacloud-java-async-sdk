// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateFileUrlByKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateFileUrlByKeyRequest</p>
 */
public class GenerateFileUrlByKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    private GenerateFileUrlByKeyRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.fileKey = builder.fileKey;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateFileUrlByKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GenerateFileUrlByKeyRequest, Builder> {
        private String agentKey; 
        private String fileKey; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GenerateFileUrlByKeyRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.fileKey = request.fileKey;
            this.fileName = request.fileName;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GenerateFileUrlByKeyRequest build() {
            return new GenerateFileUrlByKeyRequest(this);
        } 

    } 

}
