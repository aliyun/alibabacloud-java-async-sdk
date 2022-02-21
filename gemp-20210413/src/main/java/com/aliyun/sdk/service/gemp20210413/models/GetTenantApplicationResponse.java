// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantApplicationResponse} extends {@link TeaModel}
 *
 * <p>GetTenantApplicationResponse</p>
 */
public class GetTenantApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTenantApplicationResponseBody body;

    private GetTenantApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTenantApplicationResponse create() {
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
    public GetTenantApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTenantApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTenantApplicationResponseBody body);

        @Override
        GetTenantApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTenantApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTenantApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTenantApplicationResponse response) {
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
        public Builder body(GetTenantApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTenantApplicationResponse build() {
            return new GetTenantApplicationResponse(this);
        } 

    } 

}
