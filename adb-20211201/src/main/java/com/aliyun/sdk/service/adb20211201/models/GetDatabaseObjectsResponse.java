// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseObjectsResponse} extends {@link TeaModel}
 *
 * <p>GetDatabaseObjectsResponse</p>
 */
public class GetDatabaseObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDatabaseObjectsResponseBody body;

    private GetDatabaseObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDatabaseObjectsResponse create() {
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
    public GetDatabaseObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDatabaseObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDatabaseObjectsResponseBody body);

        @Override
        GetDatabaseObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDatabaseObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDatabaseObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDatabaseObjectsResponse response) {
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
        public Builder body(GetDatabaseObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDatabaseObjectsResponse build() {
            return new GetDatabaseObjectsResponse(this);
        } 

    } 

}
