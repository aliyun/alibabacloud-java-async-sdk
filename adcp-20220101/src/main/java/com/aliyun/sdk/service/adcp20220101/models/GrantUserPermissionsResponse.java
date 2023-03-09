// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionsResponse} extends {@link TeaModel}
 *
 * <p>GrantUserPermissionsResponse</p>
 */
public class GrantUserPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantUserPermissionsResponseBody body;

    private GrantUserPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantUserPermissionsResponse create() {
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
    public GrantUserPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantUserPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantUserPermissionsResponseBody body);

        @Override
        GrantUserPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantUserPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantUserPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantUserPermissionsResponse response) {
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
        public Builder body(GrantUserPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantUserPermissionsResponse build() {
            return new GrantUserPermissionsResponse(this);
        } 

    } 

}
