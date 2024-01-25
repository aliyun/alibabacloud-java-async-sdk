// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationRequest</p>
 */
public class UpdateAuthorizationRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserId")
    private String userId;

    private UpdateAuthorizationRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationRequest, Builder> {
        private String type; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationRequest request) {
            super(request);
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateAuthorizationRequest build() {
            return new UpdateAuthorizationRequest(this);
        } 

    } 

}
