// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateSlrPermissionRequest} extends {@link RequestModel}
 *
 * <p>ValidateSlrPermissionRequest</p>
 */
public class ValidateSlrPermissionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("rolename")
    @Validation(required = true)
    private String rolename;

    private ValidateSlrPermissionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.body = builder.body;
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return rolename
     */
    public String getRolename() {
        return this.rolename;
    }

    public static final class Builder extends Request.Builder<ValidateSlrPermissionRequest, Builder> {
        private String clientToken; 
        private String body; 
        private String rolename; 

        private Builder() {
            super();
        } 

        private Builder(ValidateSlrPermissionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.body = request.body;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * rolename.
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
