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
 * {@link EnableTokenRequest} extends {@link RequestModel}
 *
 * <p>EnableTokenRequest</p>
 */
public class EnableTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnUserId")
    private String wnUserId;

    private EnableTokenRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableTokenRequest create() {
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

    public static final class Builder extends Request.Builder<EnableTokenRequest, Builder> {
        private String tenantId; 
        private String wnUserId; 

        private Builder() {
            super();
        } 

        private Builder(EnableTokenRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.wnUserId = request.wnUserId;
        } 

        /**
         * <p>The ID of the effective tenant.</p>
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
         * <p>The ID of the target user (WINNEXO platform user ID). If this parameter is left empty, the operation is performed on the caller. Administrators can specify another user\&quot;s ID to perform the operation on behalf of that user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.putBodyParameter("wnUserId", wnUserId);
            this.wnUserId = wnUserId;
            return this;
        }

        @Override
        public EnableTokenRequest build() {
            return new EnableTokenRequest(this);
        } 

    } 

}
