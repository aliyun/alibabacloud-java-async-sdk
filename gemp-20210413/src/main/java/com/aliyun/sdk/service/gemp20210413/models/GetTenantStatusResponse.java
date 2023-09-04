// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantStatusResponse} extends {@link TeaModel}
 *
 * <p>GetTenantStatusResponse</p>
 */
public class GetTenantStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTenantStatusResponseBody body;

    private GetTenantStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTenantStatusResponse create() {
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
    public GetTenantStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTenantStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTenantStatusResponseBody body);

        @Override
        GetTenantStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTenantStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTenantStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTenantStatusResponse response) {
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
        public Builder body(GetTenantStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTenantStatusResponse build() {
            return new GetTenantStatusResponse(this);
        } 

    } 

}
