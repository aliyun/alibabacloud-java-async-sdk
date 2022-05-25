// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>GetOrganizationalUnitResponse</p>
 */
public class GetOrganizationalUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrganizationalUnitResponseBody body;

    private GetOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrganizationalUnitResponse create() {
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
    public GetOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrganizationalUnitResponseBody body);

        @Override
        GetOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrganizationalUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrganizationalUnitResponse response) {
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
        public Builder body(GetOrganizationalUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrganizationalUnitResponse build() {
            return new GetOrganizationalUnitResponse(this);
        } 

    } 

}
