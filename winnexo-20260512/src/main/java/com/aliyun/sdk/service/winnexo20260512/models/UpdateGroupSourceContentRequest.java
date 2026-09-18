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
 * {@link UpdateGroupSourceContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupSourceContentRequest</p>
 */
public class UpdateGroupSourceContentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forceSync")
    private Boolean forceSync;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateGroupSourceContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.forceSync = builder.forceSync;
        this.groupId = builder.groupId;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupSourceContentRequest create() {
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
     * @return forceSync
     */
    public Boolean getForceSync() {
        return this.forceSync;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<UpdateGroupSourceContentRequest, Builder> {
        private String content; 
        private Boolean forceSync; 
        private String groupId; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupSourceContentRequest request) {
            super(request);
            this.content = request.content;
            this.forceSync = request.forceSync;
            this.groupId = request.groupId;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>更新后的完整正文，可为空字符串；TEXT 存储时去首尾空白；支持 TEXT/本地 txt、md FILE，已有 skip_parse 资料沿用免解析与本地文件扩展名规则</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>更新后的正文</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>是否等待解析完成；默认 false 异步受理，true 同步等待，网关超时 300000ms</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceSync(Boolean forceSync) {
            this.putBodyParameter("forceSync", forceSync);
            this.forceSync = forceSync;
            return this;
        }

        /**
         * <p>资料所属协作空间 ID</p>
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
         * <p>当前空间物理 GROUP 资料 ID；引用资料只读</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>source_example</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
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

        @Override
        public UpdateGroupSourceContentRequest build() {
            return new UpdateGroupSourceContentRequest(this);
        } 

    } 

}
