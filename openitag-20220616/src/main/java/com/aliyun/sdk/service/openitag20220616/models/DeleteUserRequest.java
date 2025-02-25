// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserRequest</p>
 */
public class DeleteUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteUserRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserRequest, Builder> {
        private String tenantId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.userId = request.userId;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putPathParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserRequest build() {
            return new DeleteUserRequest(this);
        } 

    } 

}
