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
 * {@link CreateKnowledgeBaseDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseDirectoryRequest</p>
 */
public class CreateKnowledgeBaseDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateKnowledgeBaseDirectoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseDirectoryRequest create() {
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

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseDirectoryRequest, Builder> {
        private String description; 
        private String name; 
        private String parentDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.parentDirectoryId = request.parentDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>分类描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>recorder function</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>分类名称（企业知识库目录名称）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oklabs_tongyici</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>父分类 ID；不传时新分类挂在企业知识库根目录下，传入时必须是当前租户下已存在的企业知识库目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>wd-lxykjnnw4lyl9eq</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putBodyParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>692318833855074</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateKnowledgeBaseDirectoryRequest build() {
            return new CreateKnowledgeBaseDirectoryRequest(this);
        } 

    } 

}
