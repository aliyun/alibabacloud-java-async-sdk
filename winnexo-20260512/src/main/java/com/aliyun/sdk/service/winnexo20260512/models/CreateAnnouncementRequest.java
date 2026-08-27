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
 * {@link CreateAnnouncementRequest} extends {@link RequestModel}
 *
 * <p>CreateAnnouncementRequest</p>
 */
public class CreateAnnouncementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayPage")
    private String displayPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayType")
    private String displayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectiveEnd")
    private String effectiveEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectiveStart")
    private String effectiveStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("publishNow")
    private Boolean publishNow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetRoleCodes")
    private java.util.List<String> targetRoleCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetRoleMode")
    private String targetRoleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetTenantIds")
    private java.util.List<Long> targetTenantIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetTenantMode")
    private String targetTenantMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateAnnouncementRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.displayPage = builder.displayPage;
        this.displayType = builder.displayType;
        this.effectiveEnd = builder.effectiveEnd;
        this.effectiveStart = builder.effectiveStart;
        this.priority = builder.priority;
        this.publishNow = builder.publishNow;
        this.targetRoleCodes = builder.targetRoleCodes;
        this.targetRoleMode = builder.targetRoleMode;
        this.targetTenantIds = builder.targetTenantIds;
        this.targetTenantMode = builder.targetTenantMode;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnnouncementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return displayPage
     */
    public String getDisplayPage() {
        return this.displayPage;
    }

    /**
     * @return displayType
     */
    public String getDisplayType() {
        return this.displayType;
    }

    /**
     * @return effectiveEnd
     */
    public String getEffectiveEnd() {
        return this.effectiveEnd;
    }

    /**
     * @return effectiveStart
     */
    public String getEffectiveStart() {
        return this.effectiveStart;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return publishNow
     */
    public Boolean getPublishNow() {
        return this.publishNow;
    }

    /**
     * @return targetRoleCodes
     */
    public java.util.List<String> getTargetRoleCodes() {
        return this.targetRoleCodes;
    }

    /**
     * @return targetRoleMode
     */
    public String getTargetRoleMode() {
        return this.targetRoleMode;
    }

    /**
     * @return targetTenantIds
     */
    public java.util.List<Long> getTargetTenantIds() {
        return this.targetTenantIds;
    }

    /**
     * @return targetTenantMode
     */
    public String getTargetTenantMode() {
        return this.targetTenantMode;
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

    public static final class Builder extends Request.Builder<CreateAnnouncementRequest, Builder> {
        private String content; 
        private String displayPage; 
        private String displayType; 
        private String effectiveEnd; 
        private String effectiveStart; 
        private String priority; 
        private Boolean publishNow; 
        private java.util.List<String> targetRoleCodes; 
        private String targetRoleMode; 
        private java.util.List<Long> targetTenantIds; 
        private String targetTenantMode; 
        private String tenantId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnnouncementRequest request) {
            super(request);
            this.content = request.content;
            this.displayPage = request.displayPage;
            this.displayType = request.displayType;
            this.effectiveEnd = request.effectiveEnd;
            this.effectiveStart = request.effectiveStart;
            this.priority = request.priority;
            this.publishNow = request.publishNow;
            this.targetRoleCodes = request.targetRoleCodes;
            this.targetRoleMode = request.targetRoleMode;
            this.targetTenantIds = request.targetTenantIds;
            this.targetTenantMode = request.targetTenantMode;
            this.tenantId = request.tenantId;
            this.title = request.title;
        } 

        /**
         * <p>公告正文</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>系统将于今晚进行维护。</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>展示页面：ALL、FRONTEND、BACKEND</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder displayPage(String displayPage) {
            this.putBodyParameter("displayPage", displayPage);
            this.displayPage = displayPage;
            return this;
        }

        /**
         * <p>展示类型：POPUP、LIST、BANNER</p>
         * 
         * <strong>example:</strong>
         * <p>LIST</p>
         */
        public Builder displayType(String displayType) {
            this.putBodyParameter("displayType", displayType);
            this.displayType = displayType;
            return this;
        }

        /**
         * <p>带时区的 ISO8601 生效结束时间；不传表示永久有效</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21T14:00:00+08:00</p>
         */
        public Builder effectiveEnd(String effectiveEnd) {
            this.putBodyParameter("effectiveEnd", effectiveEnd);
            this.effectiveEnd = effectiveEnd;
            return this;
        }

        /**
         * <p>带时区的 ISO8601 生效开始时间；不传表示立即生效</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        public Builder effectiveStart(String effectiveStart) {
            this.putBodyParameter("effectiveStart", effectiveStart);
            this.effectiveStart = effectiveStart;
            return this;
        }

        /**
         * <p>公告重要性：URGENT、IMPORTANT、GENERAL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        public Builder priority(String priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>是否创建后立即发布</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder publishNow(Boolean publishNow) {
            this.putBodyParameter("publishNow", publishNow);
            this.publishNow = publishNow;
            return this;
        }

        /**
         * <p>指定系统角色 code 列表；targetRoleMode=SPECIFIED 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;SYSTEM_ADMIN&quot;]</p>
         */
        public Builder targetRoleCodes(java.util.List<String> targetRoleCodes) {
            String targetRoleCodesShrink = shrink(targetRoleCodes, "targetRoleCodes", "json");
            this.putBodyParameter("targetRoleCodes", targetRoleCodesShrink);
            this.targetRoleCodes = targetRoleCodes;
            return this;
        }

        /**
         * <p>目标角色范围：ALL、SPECIFIED</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetRoleMode(String targetRoleMode) {
            this.putBodyParameter("targetRoleMode", targetRoleMode);
            this.targetRoleMode = targetRoleMode;
            return this;
        }

        /**
         * <p>指定目标租户 ID 列表；targetTenantMode=SPECIFIED 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>[10000]</p>
         */
        public Builder targetTenantIds(java.util.List<Long> targetTenantIds) {
            String targetTenantIdsShrink = shrink(targetTenantIds, "targetTenantIds", "json");
            this.putBodyParameter("targetTenantIds", targetTenantIdsShrink);
            this.targetTenantIds = targetTenantIds;
            return this;
        }

        /**
         * <p>目标租户范围：ALL、SPECIFIED</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetTenantMode(String targetTenantMode) {
            this.putBodyParameter("targetTenantMode", targetTenantMode);
            this.targetTenantMode = targetTenantMode;
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
         * <p>公告标题</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>系统维护通知</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateAnnouncementRequest build() {
            return new CreateAnnouncementRequest(this);
        } 

    } 

}
