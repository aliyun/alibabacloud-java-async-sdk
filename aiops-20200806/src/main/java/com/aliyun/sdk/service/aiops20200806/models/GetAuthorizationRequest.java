// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>GetAuthorizationRequest</p>
 */
public class GetAuthorizationRequest extends Request {
    @Query
    @NameInMap("UserId")
    private String userId;

    private GetAuthorizationRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetAuthorizationRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthorizationRequest request) {
            super(request);
            this.userId = request.userId;
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
        public GetAuthorizationRequest build() {
            return new GetAuthorizationRequest(this);
        } 

    } 

}
