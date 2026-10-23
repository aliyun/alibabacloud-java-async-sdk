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
 * {@link CountTodosRequest} extends {@link RequestModel}
 *
 * <p>CountTodosRequest</p>
 */
public class CountTodosRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CountTodosRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountTodosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CountTodosRequest, Builder> {
        private String collaborationGroupId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CountTodosRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The collaboration workspace ID. This parameter is optional and used for filtering. If this parameter is not specified, all workspaces are included.</p>
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
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
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
        public CountTodosRequest build() {
            return new CountTodosRequest(this);
        } 

    } 

}
