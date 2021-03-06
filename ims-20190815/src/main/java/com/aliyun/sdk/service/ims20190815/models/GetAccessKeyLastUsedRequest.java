// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedRequest</p>
 */
public class GetAccessKeyLastUsedRequest extends Request {
    @Query
    @NameInMap("UserAccessKeyId")
    @Validation(required = true)
    private String userAccessKeyId;

    @Query
    @NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private GetAccessKeyLastUsedRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedRequest, Builder> {
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedRequest response) {
            super(response);
            this.userAccessKeyId = response.userAccessKeyId;
            this.userPrincipalName = response.userPrincipalName;
        } 

        /**
         * UserAccessKeyId.
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
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
        public GetAccessKeyLastUsedRequest build() {
            return new GetAccessKeyLastUsedRequest(this);
        } 

    } 

}
