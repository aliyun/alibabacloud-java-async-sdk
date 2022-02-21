// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLDAPConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateLDAPConfigResponse</p>
 */
public class CreateLDAPConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLDAPConfigResponseBody body;

    private CreateLDAPConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLDAPConfigResponse create() {
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
    public CreateLDAPConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLDAPConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLDAPConfigResponseBody body);

        @Override
        CreateLDAPConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLDAPConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLDAPConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLDAPConfigResponse response) {
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
        public Builder body(CreateLDAPConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLDAPConfigResponse build() {
            return new CreateLDAPConfigResponse(this);
        } 

    } 

}
