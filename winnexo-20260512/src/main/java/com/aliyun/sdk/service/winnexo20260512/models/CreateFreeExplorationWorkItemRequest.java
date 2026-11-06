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
 * {@link CreateFreeExplorationWorkItemRequest} extends {@link RequestModel}
 *
 * <p>CreateFreeExplorationWorkItemRequest</p>
 */
public class CreateFreeExplorationWorkItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> agentNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberUserIds")
    private java.util.List<Long> memberUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibility")
    private String visibility;

    private CreateFreeExplorationWorkItemRequest(Builder builder) {
        super(builder);
        this.agentNames = builder.agentNames;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.memberUserIds = builder.memberUserIds;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFreeExplorationWorkItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentNames
     */
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return memberUserIds
     */
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<CreateFreeExplorationWorkItemRequest, Builder> {
        private java.util.List<String> agentNames; 
        private String collaborationGroupId; 
        private java.util.List<Long> memberUserIds; 
        private String tenantId; 
        private String title; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateFreeExplorationWorkItemRequest request) {
            super(request);
            this.agentNames = request.agentNames;
            this.collaborationGroupId = request.collaborationGroupId;
            this.memberUserIds = request.memberUserIds;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.visibility = request.visibility;
        } 

        /**
         * <p>空间内数字员工技术名称，1–5 个，不可重复</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sales-agent&quot;]</p>
         */
        public Builder agentNames(java.util.List<String> agentNames) {
            String agentNamesShrink = shrink(agentNames, "agentNames", "json");
            this.putBodyParameter("agentNames", agentNamesShrink);
            this.agentNames = agentNames;
            return this;
        }

        /**
         * <p>协作空间 ID；调用者须为有效成员</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>协作档至少一个创建人以外的有效空间成员；最多 1000 人；私密和公开档忽略；创建人始终加入</p>
         * 
         * <strong>example:</strong>
         * <p>[43]</p>
         */
        public Builder memberUserIds(java.util.List<Long> memberUserIds) {
            String memberUserIdsShrink = shrink(memberUserIds, "memberUserIds", "json");
            this.putBodyParameter("memberUserIds", memberUserIdsShrink);
            this.memberUserIds = memberUserIds;
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
         * <p>自由探索工作项标题，去首尾空格后 1–200 字符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>调查销售机会</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>可见范围：PRIVATE 私密；COLLABORATIVE 指定成员协作；PUBLIC 空间内公开</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateFreeExplorationWorkItemRequest build() {
            return new CreateFreeExplorationWorkItemRequest(this);
        } 

    } 

}
