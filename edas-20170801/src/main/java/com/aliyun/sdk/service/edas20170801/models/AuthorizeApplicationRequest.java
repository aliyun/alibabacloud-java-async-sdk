// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeApplicationRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeApplicationRequest</p>
 */
public class AuthorizeApplicationRequest extends Request {
    @Query
    @NameInMap("AppIds")
    @Validation(required = true)
    private String appIds;

    @Query
    @NameInMap("TargetUserId")
    @Validation(required = true)
    private String targetUserId;

    private AuthorizeApplicationRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<AuthorizeApplicationRequest, Builder> {
        private String appIds; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeApplicationRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * The ID of the application. You can specify multiple IDs. Separate multiple IDs with semicolons (;). If you leave this parameter empty, the permissions on the application are revoked.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * The ID of the RAM user to be authorized. The value of the parameter is in the `sub-account name@primary account UID` format.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public AuthorizeApplicationRequest build() {
            return new AuthorizeApplicationRequest(this);
        } 

    } 

}
