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
 * {@link GrantKnowledgeBaseRetrievalRequest} extends {@link RequestModel}
 *
 * <p>GrantKnowledgeBaseRetrievalRequest</p>
 */
public class GrantKnowledgeBaseRetrievalRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String principalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String principalType;

    private GrantKnowledgeBaseRetrievalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantKnowledgeBaseRetrievalRequest create() {
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
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<GrantKnowledgeBaseRetrievalRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(GrantKnowledgeBaseRetrievalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
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
         * <p>The knowledge base ID.</p>
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
         * <p>The DataWorks user ID of the target user. This is not the RAM UID or the caller identity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        public Builder principalId(String principalId) {
            this.putBodyParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The type of the principal that receives the share. This parameter is optional and defaults to USER. Currently, only USER is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public GrantKnowledgeBaseRetrievalRequest build() {
            return new GrantKnowledgeBaseRetrievalRequest(this);
        } 

    } 

}
