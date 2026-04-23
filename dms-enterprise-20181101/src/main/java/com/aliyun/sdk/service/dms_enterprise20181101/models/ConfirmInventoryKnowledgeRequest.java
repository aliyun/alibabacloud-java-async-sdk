// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ConfirmInventoryKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>ConfirmInventoryKnowledgeRequest</p>
 */
public class ConfirmInventoryKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeType;

    private ConfirmInventoryKnowledgeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.jobId = builder.jobId;
        this.knowledgeType = builder.knowledgeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmInventoryKnowledgeRequest create() {
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
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return knowledgeType
     */
    public String getKnowledgeType() {
        return this.knowledgeType;
    }

    public static final class Builder extends Request.Builder<ConfirmInventoryKnowledgeRequest, Builder> {
        private String regionId; 
        private Long entityId; 
        private Long jobId; 
        private String knowledgeType; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmInventoryKnowledgeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.jobId = request.jobId;
            this.knowledgeType = request.knowledgeType;
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
         * <p>2001</p>
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder knowledgeType(String knowledgeType) {
            this.putQueryParameter("KnowledgeType", knowledgeType);
            this.knowledgeType = knowledgeType;
            return this;
        }

        @Override
        public ConfirmInventoryKnowledgeRequest build() {
            return new ConfirmInventoryKnowledgeRequest(this);
        } 

    } 

}
