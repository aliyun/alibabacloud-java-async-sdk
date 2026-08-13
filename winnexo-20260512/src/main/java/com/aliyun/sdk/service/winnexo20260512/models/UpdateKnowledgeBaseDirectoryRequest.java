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
 * {@link UpdateKnowledgeBaseDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseDirectoryRequest</p>
 */
public class UpdateKnowledgeBaseDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateKnowledgeBaseDirectoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseDirectoryRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String name; 
        private String parentDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.name = request.name;
            this.parentDirectoryId = request.parentDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>新分类描述；不传表示不更新</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>待修改的分类 ID（必传）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>新分类名称；不传表示不更新</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>新父分类 ID；不传表示不移动，传入时必须是当前租户下已存在的企业知识库目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleParentDirectoryId</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putBodyParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseDirectoryRequest build() {
            return new UpdateKnowledgeBaseDirectoryRequest(this);
        } 

    } 

}
