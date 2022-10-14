// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRolesToUserResponse} extends {@link TeaModel}
 *
 * <p>GrantRolesToUserResponse</p>
 */
public class GrantRolesToUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantRolesToUserResponseBody body;

    private GrantRolesToUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantRolesToUserResponse create() {
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
    public GrantRolesToUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantRolesToUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantRolesToUserResponseBody body);

        @Override
        GrantRolesToUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantRolesToUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantRolesToUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantRolesToUserResponse response) {
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
        public Builder body(GrantRolesToUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantRolesToUserResponse build() {
            return new GrantRolesToUserResponse(this);
        } 

    } 

}
