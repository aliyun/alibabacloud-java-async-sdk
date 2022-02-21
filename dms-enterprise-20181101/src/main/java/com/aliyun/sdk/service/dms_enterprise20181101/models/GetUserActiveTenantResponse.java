// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserActiveTenantResponse} extends {@link TeaModel}
 *
 * <p>GetUserActiveTenantResponse</p>
 */
public class GetUserActiveTenantResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserActiveTenantResponseBody body;

    private GetUserActiveTenantResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserActiveTenantResponse create() {
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
    public GetUserActiveTenantResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserActiveTenantResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserActiveTenantResponseBody body);

        @Override
        GetUserActiveTenantResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserActiveTenantResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserActiveTenantResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserActiveTenantResponse response) {
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
        public Builder body(GetUserActiveTenantResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserActiveTenantResponse build() {
            return new GetUserActiveTenantResponse(this);
        } 

    } 

}
