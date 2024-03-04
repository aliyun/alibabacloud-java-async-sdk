// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadConfigRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadConfigRequest</p>
 */
public class GenerateUploadConfigRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("FileName")
    private String fileName;

    @Body
    @NameInMap("ParentDir")
    @Validation(required = true)
    private String parentDir;

    private GenerateUploadConfigRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.fileName = builder.fileName;
        this.parentDir = builder.parentDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadConfigRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return parentDir
     */
    public String getParentDir() {
        return this.parentDir;
    }

    public static final class Builder extends Request.Builder<GenerateUploadConfigRequest, Builder> {
        private String agentKey; 
        private String fileName; 
        private String parentDir; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadConfigRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.fileName = request.fileName;
            this.parentDir = request.parentDir;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * ParentDir.
         */
        public Builder parentDir(String parentDir) {
            this.putBodyParameter("ParentDir", parentDir);
            this.parentDir = parentDir;
            return this;
        }

        @Override
        public GenerateUploadConfigRequest build() {
            return new GenerateUploadConfigRequest(this);
        } 

    } 

}
