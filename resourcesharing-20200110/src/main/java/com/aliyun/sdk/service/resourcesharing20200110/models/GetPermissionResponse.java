// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionResponse} extends {@link TeaModel}
 *
 * <p>GetPermissionResponse</p>
 */
public class GetPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPermissionResponseBody body;

    private GetPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPermissionResponse create() {
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
    public GetPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPermissionResponseBody body);

        @Override
        GetPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPermissionResponse response) {
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
        public Builder body(GetPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPermissionResponse build() {
            return new GetPermissionResponse(this);
        } 

    } 

}
