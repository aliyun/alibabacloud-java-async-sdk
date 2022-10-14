// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionsResponse} extends {@link TeaModel}
 *
 * <p>GrantPermissionsResponse</p>
 */
public class GrantPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantPermissionsResponseBody body;

    private GrantPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantPermissionsResponse create() {
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
    public GrantPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantPermissionsResponseBody body);

        @Override
        GrantPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantPermissionsResponse response) {
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
        public Builder body(GrantPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantPermissionsResponse build() {
            return new GrantPermissionsResponse(this);
        } 

    } 

}
