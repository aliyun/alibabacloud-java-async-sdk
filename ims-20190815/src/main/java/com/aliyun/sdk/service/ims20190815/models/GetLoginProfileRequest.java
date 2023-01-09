// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginProfileRequest} extends {@link RequestModel}
 *
 * <p>GetLoginProfileRequest</p>
 */
public class GetLoginProfileRequest extends Request {
    @Query
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
    private String userPrincipalName;

    private GetLoginProfileRequest(Builder builder) {
        super(builder);
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<GetLoginProfileRequest, Builder> {
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginProfileRequest request) {
            super(request);
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public GetLoginProfileRequest build() {
            return new GetLoginProfileRequest(this);
        } 

    } 

}
