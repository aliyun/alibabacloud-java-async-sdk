// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GenerateUploadConfigRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadConfigRequest</p>
 */
public class GenerateUploadConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentDir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentDir;

    private GenerateUploadConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String agentKey; 
        private String fileName; 
        private String parentDir; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.fileName = request.fileName;
            this.parentDir = request.parentDir;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>datasetUpload</p>
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
