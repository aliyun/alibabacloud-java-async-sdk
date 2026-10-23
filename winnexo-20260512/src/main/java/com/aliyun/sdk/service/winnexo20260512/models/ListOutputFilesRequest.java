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
         * <p>The business ID used for exact filtering. The length is 1 to 128 characters. This value is derived from the businessId of the file registration or associated workflow instance.</p>
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
         * <p>The ID of the collaboration workspace. The length is 1 to 64 characters. This parameter is optional. If not specified, the personal outputs of the current user are queried. If specified, the real-time permissions of the workspace members and source resources are verified.</p>
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
         * <p>The output item type. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder itemType(String itemType) {
            this.putBodyParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The keyword used to match the output title or detail name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly operations</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the digital employee (operating object). Filters outputs by name.</p>
         * 
         * <strong>example:</strong>
         * <p>Business Analysis Assistant</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
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
         * <p>The number of items per page. Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The session ID used for exact filtering. The length is 1 to 128 characters. This parameter applies to regular sessions, skill sessions, and the executionId of task executions.</p>
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
         * <p>Specifies whether to display only shared outputs and output details.</p>
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
         * <p>The tags used for exact filtering. All specified tags must be matched simultaneously. You can specify up to 20 tags. Each tag must be a non-empty string of 1 to 128 characters. Tags are derived from file registrations or the variables.tags of associated instances.</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used. The identity and tenant permissions are determined by the gateway and backend authentication.</p>
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
