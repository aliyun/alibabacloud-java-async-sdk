// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLevelPermissionRuleUsersResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataLevelPermissionRuleUsersResponse</p>
 */
public class DeleteDataLevelPermissionRuleUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataLevelPermissionRuleUsersResponseBody body;

    private DeleteDataLevelPermissionRuleUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataLevelPermissionRuleUsersResponse create() {
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
    public DeleteDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataLevelPermissionRuleUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataLevelPermissionRuleUsersResponseBody body);

        @Override
        DeleteDataLevelPermissionRuleUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataLevelPermissionRuleUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataLevelPermissionRuleUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataLevelPermissionRuleUsersResponse response) {
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
        public Builder body(DeleteDataLevelPermissionRuleUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataLevelPermissionRuleUsersResponse build() {
            return new DeleteDataLevelPermissionRuleUsersResponse(this);
        } 

    } 

}
