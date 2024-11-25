// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserVpcAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserVpcAuthorizationRequest</p>
 */
public class DeleteUserVpcAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizedUserId;

    private DeleteUserVpcAuthorizationRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.authorizedUserId = builder.authorizedUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserVpcAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return authorizedUserId
     */
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public static final class Builder extends Request.Builder<DeleteUserVpcAuthorizationRequest, Builder> {
        private String authType; 
        private Long authorizedUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserVpcAuthorizationRequest request) {
            super(request);
            this.authType = request.authType;
            this.authorizedUserId = request.authorizedUserId;
        } 

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li>NORMAL: general authorization</li>
         * <li>NORMAL: cloud service-related authorization</li>
         * </ul>
         * <p>Default value: NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        @Override
        public DeleteUserVpcAuthorizationRequest build() {
            return new DeleteUserVpcAuthorizationRequest(this);
        } 

    } 

}
