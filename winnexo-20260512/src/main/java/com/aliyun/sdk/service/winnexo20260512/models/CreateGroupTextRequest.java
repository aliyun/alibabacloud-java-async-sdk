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
 * {@link CreateGroupTextRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupTextRequest</p>
 */
public class CreateGroupTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textContent;

    private CreateGroupTextRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.sourceTags = builder.sourceTags;
        this.tenantId = builder.tenantId;
        this.textContent = builder.textContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupTextRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return textContent
     */
    public String getTextContent() {
        return this.textContent;
    }

    public static final class Builder extends Request.Builder<CreateGroupTextRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String groupId; 
        private String name; 
        private String sourceTags; 
        private String tenantId; 
        private String textContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupTextRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.name = request.name;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
            this.textContent = request.textContent;
        } 

        /**
         * <p>资料描述</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>当前空间物理目录ID；省略/root使用空间根，首次可能初始化根目录；引用目录不可写</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>协作空间 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>资料显示名；最终名称沿用Provider规则</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>项目资料</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>资料标签，JSON字符串列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>纯文本正文，不能全为空白；Provider沿用去首尾空白规则</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder textContent(String textContent) {
            this.putBodyParameter("textContent", textContent);
            this.textContent = textContent;
            return this;
        }

        @Override
        public CreateGroupTextRequest build() {
            return new CreateGroupTextRequest(this);
        } 

    } 

}
