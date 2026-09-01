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
 * {@link RetryKnowledgeBaseFilesRequest} extends {@link RequestModel}
 *
 * <p>RetryKnowledgeBaseFilesRequest</p>
 */
public class RetryKnowledgeBaseFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RetryKnowledgeBaseFilesRequest(Builder builder) {
        super(builder);
        this.fileIds = builder.fileIds;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryKnowledgeBaseFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileIds
     */
    public String getFileIds() {
        return this.fileIds;
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

    public static final class Builder extends Request.Builder<RetryKnowledgeBaseFilesRequest, Builder> {
        private String fileIds; 
        private String knowledgeBaseId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RetryKnowledgeBaseFilesRequest request) {
            super(request);
            this.fileIds = request.fileIds;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
         */
        public Builder fileIds(String fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
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
        public RetryKnowledgeBaseFilesRequest build() {
            return new RetryKnowledgeBaseFilesRequest(this);
        } 

    } 

}
