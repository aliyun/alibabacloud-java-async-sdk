// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link MoveKnowledgeBaseResourceRequest} extends {@link RequestModel}
 *
 * <p>MoveKnowledgeBaseResourceRequest</p>
 */
public class MoveKnowledgeBaseResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledgeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDirectoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private MoveKnowledgeBaseResourceRequest(Builder builder) {
        super(builder);
        this.knowledgeId = builder.knowledgeId;
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.targetDirectoryId = builder.targetDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveKnowledgeBaseResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeId
     */
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return sourceDirectoryId
     */
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<MoveKnowledgeBaseResourceRequest, Builder> {
        private String knowledgeId; 
        private String sourceDirectoryId; 
        private String sourceId; 
        private String targetDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(MoveKnowledgeBaseResourceRequest request) {
            super(request);
            this.knowledgeId = request.knowledgeId;
            this.sourceDirectoryId = request.sourceDirectoryId;
            this.sourceId = request.sourceId;
            this.targetDirectoryId = request.targetDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目标知识库 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleKnowledgeId</p>
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putBodyParameter("knowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>源目录 ID（资源当前所在的企业知识库目录）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceDirectoryId</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.putBodyParameter("sourceDirectoryId", sourceDirectoryId);
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>待移动的资源 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000627</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>目标目录 ID（资源即将移动到的企业知识库目录）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTargetDirectoryId</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.putBodyParameter("targetDirectoryId", targetDirectoryId);
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>1729094555111072</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public MoveKnowledgeBaseResourceRequest build() {
            return new MoveKnowledgeBaseResourceRequest(this);
        } 

    } 

}
