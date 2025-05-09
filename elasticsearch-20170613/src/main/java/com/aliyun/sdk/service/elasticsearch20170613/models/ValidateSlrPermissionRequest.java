// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ValidateSlrPermissionRequest} extends {@link RequestModel}
 *
 * <p>ValidateSlrPermissionRequest</p>
 */
public class ValidateSlrPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rolename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rolename;

    private ValidateSlrPermissionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.rolename = builder.rolename;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateSlrPermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return rolename
     */
    public String getRolename() {
        return this.rolename;
    }

    public static final class Builder extends Request.Builder<ValidateSlrPermissionRequest, Builder> {
        private String clientToken; 
        private String rolename; 

        private Builder() {
            super();
        } 

        private Builder(ValidateSlrPermissionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.rolename = request.rolename;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForElasticsearchCollector</p>
         */
        public Builder rolename(String rolename) {
            this.putQueryParameter("rolename", rolename);
            this.rolename = rolename;
            return this;
        }

        @Override
        public ValidateSlrPermissionRequest build() {
            return new ValidateSlrPermissionRequest(this);
        } 

    } 

}
