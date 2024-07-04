// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DeleteAuthorizationRequest</p>
 */
public class DeleteAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("authorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationId;

    private DeleteAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public static final class Builder extends Request.Builder<DeleteAuthorizationRequest, Builder> {
        private String authorizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAuthorizationRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
        } 

        /**
         * authorizationId.
         */
        public Builder authorizationId(String authorizationId) {
            this.putPathParameter("authorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        @Override
        public DeleteAuthorizationRequest build() {
            return new DeleteAuthorizationRequest(this);
        } 

    } 

}
