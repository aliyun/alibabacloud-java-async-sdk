// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseResponse} extends {@link TeaModel}
 *
 * <p>GetDatabaseResponse</p>
 */
public class GetDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDatabaseResponseBody body;

    private GetDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDatabaseResponse create() {
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
    public GetDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDatabaseResponseBody body);

        @Override
        GetDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDatabaseResponse response) {
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
        public Builder body(GetDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDatabaseResponse build() {
            return new GetDatabaseResponse(this);
        } 

    } 

}
