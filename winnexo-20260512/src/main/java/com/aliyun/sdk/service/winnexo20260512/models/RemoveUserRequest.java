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
 * {@link RemoveUserRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserRequest</p>
 */
public class RemoveUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("wnUserId")
    private String wnUserId;

    private RemoveUserRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder extends Request.Builder<RemoveUserRequest, Builder> {
        private String tenantId; 
        private String wnUserId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.wnUserId = request.wnUserId;
        } 

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>目标用户ID（WINNEXO 平台用户ID）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.putQueryParameter("wnUserId", wnUserId);
            this.wnUserId = wnUserId;
            return this;
        }

        @Override
        public RemoveUserRequest build() {
            return new RemoveUserRequest(this);
        } 

    } 

}
