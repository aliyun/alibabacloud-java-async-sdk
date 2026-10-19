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
 * {@link UpdateMemoryAutoExtractionSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryAutoExtractionSwitchRequest</p>
 */
public class UpdateMemoryAutoExtractionSwitchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clearExisting")
    private Boolean clearExisting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateMemoryAutoExtractionSwitchRequest(Builder builder) {
        super(builder);
        this.clearExisting = builder.clearExisting;
        this.enabled = builder.enabled;
        this.groupId = builder.groupId;
        this.ownerType = builder.ownerType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryAutoExtractionSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clearExisting
     */
    public Boolean getClearExisting() {
        return this.clearExisting;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryAutoExtractionSwitchRequest, Builder> {
        private Boolean clearExisting; 
        private Boolean enabled; 
        private String groupId; 
        private String ownerType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryAutoExtractionSwitchRequest request) {
            super(request);
            this.clearExisting = request.clearExisting;
            this.enabled = request.enabled;
            this.groupId = request.groupId;
            this.ownerType = request.ownerType;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>是否同时清空当前记忆范围内的全部自动记忆；开启或关闭时均可使用，不影响手动记忆；不传时为 false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder clearExisting(Boolean clearExisting) {
            this.putBodyParameter("clearExisting", clearExisting);
            this.clearExisting = clearExisting;
            return this;
        }

        /**
         * <p>目标开关状态；true 为开启自动记忆拾取，false 为关闭</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>写作协作空间 ID；ownerType 为 group 时必填，且当前鉴权用户须为该空间的活跃成员；ownerType 为 user 时不传</p>
         * 
         * <strong>example:</strong>
         * <p>cg_12345</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>记忆归属范围；user 为当前鉴权用户的个人记忆，group 为指定写作协作空间的记忆；不传时默认为 user</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        public Builder ownerType(String ownerType) {
            this.putBodyParameter("ownerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>租户 ID，查询参数；不传时使用调用方的默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateMemoryAutoExtractionSwitchRequest build() {
            return new UpdateMemoryAutoExtractionSwitchRequest(this);
        } 

    } 

}
