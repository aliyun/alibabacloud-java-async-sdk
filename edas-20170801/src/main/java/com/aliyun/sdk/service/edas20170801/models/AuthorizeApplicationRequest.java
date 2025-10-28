// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link AuthorizeApplicationRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeApplicationRequest</p>
 */
public class AuthorizeApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the application. You can specify multiple IDs. Separate multiple IDs with semicolons (;). If you leave this parameter empty, the permissions on the application are revoked.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5fdf50e8-<em><strong><strong>;696-</strong></strong></em>*</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The ID of the RAM user to be authorized. The value of the parameter is in the <code>sub-account name@primary account UID</code> format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test@133434434****</p>
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
