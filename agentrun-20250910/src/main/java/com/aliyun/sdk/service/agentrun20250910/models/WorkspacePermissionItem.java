// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link WorkspacePermissionItem} extends {@link TeaModel}
 *
 * <p>WorkspacePermissionItem</p>
 */
public class WorkspacePermissionItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("allowed")
    private Boolean allowed;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private WorkspacePermissionItem(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.action = builder.action;
        this.allowed = builder.allowed;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspacePermissionItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return allowed
     */
    public Boolean getAllowed() {
        return this.allowed;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String action; 
        private Boolean allowed; 
        private String message; 

        private Builder() {
        } 

        private Builder(WorkspacePermissionItem model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.action = model.action;
            this.allowed = model.allowed;
            this.message = model.message;
        } 

        /**
         * <p>RAM 明确拒绝且可构造 detail 时返回；通过或非 RAM 拒绝场景省略</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>归一化后的 RAM action，始终含 agentrun: 前缀，如 agentrun:ListTemplates</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>RAM 判定通过为 true；workspace 不存在、非法/不支持 action、RAM SDK 报错等均为 false</p>
         */
        public Builder allowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }

        /**
         * <p>人类可读原因；通过时通常为空字符串</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public WorkspacePermissionItem build() {
            return new WorkspacePermissionItem(this);
        } 

    } 

}
