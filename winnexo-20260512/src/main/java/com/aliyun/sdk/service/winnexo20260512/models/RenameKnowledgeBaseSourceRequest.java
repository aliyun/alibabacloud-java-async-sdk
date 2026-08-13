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
 * {@link RenameKnowledgeBaseSourceRequest} extends {@link RequestModel}
 *
 * <p>RenameKnowledgeBaseSourceRequest</p>
 */
public class RenameKnowledgeBaseSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("newName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RenameKnowledgeBaseSourceRequest(Builder builder) {
        super(builder);
        this.newName = builder.newName;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameKnowledgeBaseSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RenameKnowledgeBaseSourceRequest, Builder> {
        private String newName; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RenameKnowledgeBaseSourceRequest request) {
            super(request);
            this.newName = request.newName;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>新的数据源名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder newName(String newName) {
            this.putBodyParameter("newName", newName);
            this.newName = newName;
            return this;
        }

        /**
         * <p>数据源 ID（租户内唯一）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
        public RenameKnowledgeBaseSourceRequest build() {
            return new RenameKnowledgeBaseSourceRequest(this);
        } 

    } 

}
