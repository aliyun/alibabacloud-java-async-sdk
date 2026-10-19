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
 * {@link ListOutputFilesRequest} extends {@link RequestModel}
 *
 * <p>ListOutputFilesRequest</p>
 */
public class ListOutputFilesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemType")
    private String itemType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sharedOnly")
    private Boolean sharedOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListOutputFilesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.itemType = builder.itemType;
        this.keyword = builder.keyword;
        this.operatingObjectName = builder.operatingObjectName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sessionId = builder.sessionId;
        this.sharedOnly = builder.sharedOnly;
        this.tags = builder.tags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutputFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sharedOnly
     */
    public Boolean getSharedOnly() {
        return this.sharedOnly;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListOutputFilesRequest, Builder> {
        private String bizId; 
        private String collaborationGroupId; 
        private String itemType; 
        private String keyword; 
        private String operatingObjectName; 
        private Long page; 
        private Long pageSize; 
        private String sessionId; 
        private Boolean sharedOnly; 
        private java.util.List<String> tags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListOutputFilesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.collaborationGroupId = request.collaborationGroupId;
            this.itemType = request.itemType;
            this.keyword = request.keyword;
            this.operatingObjectName = request.operatingObjectName;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sessionId = request.sessionId;
            this.sharedOnly = request.sharedOnly;
            this.tags = request.tags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>精确业务编号，来自文件登记或工作流实例关联</p>
         * 
         * <strong>example:</strong>
         * <p>REQ-20261012-001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>可选协作空间 ID；未传保持当前用户个人产出范围</p>
         * 
         * <strong>example:</strong>
         * <p>cg_123e4567-e89b-42d3-a456-426614174001</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The type of the output item. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>ppt</p>
         */
        public Builder itemType(String itemType) {
            this.putBodyParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The keyword for searching. Matches the output title or item name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the digital employee (operating object). Used to filter results by name.</p>
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
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of items per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>精确会话 ID，覆盖普通会话、技能会话与任务 executionId</p>
         * 
         * <strong>example:</strong>
         * <p>session_123e4567-e89b-42d3-a456-426614174008</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Specifies whether to display only outputs and output items with sharing enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder sharedOnly(Boolean sharedOnly) {
            this.putBodyParameter("sharedOnly", sharedOnly);
            this.sharedOnly = sharedOnly;
            return this;
        }

        /**
         * <p>全部匹配的标签列表，来自文件登记或实例 variables.tags</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly by using --tenant-id.</p>
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
        public ListOutputFilesRequest build() {
            return new ListOutputFilesRequest(this);
        } 

    } 

}
