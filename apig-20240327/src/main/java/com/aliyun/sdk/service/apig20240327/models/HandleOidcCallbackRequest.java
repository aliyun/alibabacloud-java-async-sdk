// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HandleOidcCallbackRequest} extends {@link RequestModel}
 *
 * <p>HandleOidcCallbackRequest</p>
 */
public class HandleOidcCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private HandleOidcCallbackRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleOidcCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<HandleOidcCallbackRequest, Builder> {
        private String code; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(HandleOidcCallbackRequest request) {
            super(request);
            this.code = request.code;
            this.state = request.state;
        } 

        /**
         * <p>The code parameter carried in the OIDC callback request.</p>
         * 
         * <strong>example:</strong>
         * <p>code-xxxxxxxx</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The state parameter carried in the OIDC callback request.</p>
         * 
         * <strong>example:</strong>
         * <p>state-xxxxxxxx</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public HandleOidcCallbackRequest build() {
            return new HandleOidcCallbackRequest(this);
        } 

    } 

}
