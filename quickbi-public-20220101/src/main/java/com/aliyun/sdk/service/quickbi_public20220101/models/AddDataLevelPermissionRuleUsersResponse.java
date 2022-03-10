// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataLevelPermissionRuleUsersResponse} extends {@link TeaModel}
 *
 * <p>AddDataLevelPermissionRuleUsersResponse</p>
 */
public class AddDataLevelPermissionRuleUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDataLevelPermissionRuleUsersResponseBody body;

    private AddDataLevelPermissionRuleUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDataLevelPermissionRuleUsersResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public AddDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDataLevelPermissionRuleUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDataLevelPermissionRuleUsersResponseBody body);

        @Override
        AddDataLevelPermissionRuleUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDataLevelPermissionRuleUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDataLevelPermissionRuleUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDataLevelPermissionRuleUsersResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AddDataLevelPermissionRuleUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDataLevelPermissionRuleUsersResponse build() {
            return new AddDataLevelPermissionRuleUsersResponse(this);
        } 

    } 

}
