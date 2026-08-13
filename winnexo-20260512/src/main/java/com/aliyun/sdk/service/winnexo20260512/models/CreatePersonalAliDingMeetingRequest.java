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
 * {@link CreatePersonalAliDingMeetingRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalAliDingMeetingRequest</p>
 */
public class CreatePersonalAliDingMeetingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shanjiUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shanjiUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalAliDingMeetingRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
        this.notes = builder.notes;
        this.operatingObjectName = builder.operatingObjectName;
        this.shanjiUrl = builder.shanjiUrl;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalAliDingMeetingRequest create() {
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
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return shanjiUrl
     */
    public String getShanjiUrl() {
        return this.shanjiUrl;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalAliDingMeetingRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String name; 
        private String notes; 
        private String operatingObjectName; 
        private String shanjiUrl; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalAliDingMeetingRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.name = request.name;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.shanjiUrl = request.shanjiUrl;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>controll service user</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人目录 ID；不传时自动绑定到当前数字员工默认根目录，传入时必须是当前用户在当前数字员工下的已有个人目录</p>
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
         * <p>资源显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-toolset-3dcef7ca-31b9-4d1c-8692-1ef03099cad3</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>会议笔记内容（可选），会参与辅助分析</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>原始的闪记链接（必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder shanjiUrl(String shanjiUrl) {
            this.putBodyParameter("shanjiUrl", shanjiUrl);
            this.shanjiUrl = shanjiUrl;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>549003315603714</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalAliDingMeetingRequest build() {
            return new CreatePersonalAliDingMeetingRequest(this);
        } 

    } 

}
