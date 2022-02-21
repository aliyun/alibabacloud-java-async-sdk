// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceInspectionsResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceInspectionsResponse</p>
 */
public class GetInstanceInspectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceInspectionsResponseBody body;

    private GetInstanceInspectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceInspectionsResponse create() {
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
    public GetInstanceInspectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceInspectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceInspectionsResponseBody body);

        @Override
        GetInstanceInspectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceInspectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceInspectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceInspectionsResponse response) {
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
        public Builder body(GetInstanceInspectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceInspectionsResponse build() {
            return new GetInstanceInspectionsResponse(this);
        } 

    } 

}
