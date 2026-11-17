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
 * {@link RemoveKnowledgeBaseAdministratorRequest} extends {@link RequestModel}
 *
 * <p>RemoveKnowledgeBaseAdministratorRequest</p>
 */
public class RemoveKnowledgeBaseAdministratorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdministratorUserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String administratorUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String knowledgeBaseId;

    private RemoveKnowledgeBaseAdministratorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.administratorUserId = builder.administratorUserId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveKnowledgeBaseAdministratorRequest create() {
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
     * @return administratorUserId
     */
    public String getAdministratorUserId() {
        return this.administratorUserId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public static final class Builder extends Request.Builder<RemoveKnowledgeBaseAdministratorRequest, Builder> {
        private String regionId; 
        private String administratorUserId; 
        private String knowledgeBaseId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveKnowledgeBaseAdministratorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.administratorUserId = request.administratorUserId;
            this.knowledgeBaseId = request.knowledgeBaseId;
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
         * <p>The DataWorks user ID of the administrator to be removed. This is not the identity of the caller.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        public Builder administratorUserId(String administratorUserId) {
            this.putBodyParameter("AdministratorUserId", administratorUserId);
            this.administratorUserId = administratorUserId;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
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

        @Override
        public RemoveKnowledgeBaseAdministratorRequest build() {
            return new RemoveKnowledgeBaseAdministratorRequest(this);
        } 

    } 

}
