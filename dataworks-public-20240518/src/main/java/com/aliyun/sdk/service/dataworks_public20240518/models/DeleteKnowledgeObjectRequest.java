// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DeleteKnowledgeObjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteKnowledgeObjectRequest</p>
 */
public class DeleteKnowledgeObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeObjectId;

    private DeleteKnowledgeObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeObjectId = builder.knowledgeObjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeObjectRequest create() {
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
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeObjectId
     */
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    public static final class Builder extends Request.Builder<DeleteKnowledgeObjectRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private String knowledgeObjectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeObjectId = request.knowledgeObjectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the knowledge base to which the object belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The stable ID of the object to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>obj-document-001</p>
         */
        public Builder knowledgeObjectId(String knowledgeObjectId) {
            this.putBodyParameter("KnowledgeObjectId", knowledgeObjectId);
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }

        @Override
        public DeleteKnowledgeObjectRequest build() {
            return new DeleteKnowledgeObjectRequest(this);
        } 

    } 

}
