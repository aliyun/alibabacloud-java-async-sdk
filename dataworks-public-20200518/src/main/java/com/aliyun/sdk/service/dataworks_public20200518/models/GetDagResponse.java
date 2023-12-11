// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDagResponse} extends {@link TeaModel}
 *
 * <p>GetDagResponse</p>
 */
public class GetDagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDagResponseBody body;

    private GetDagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDagResponse create() {
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
    public GetDagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDagResponseBody body);

        @Override
        GetDagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDagResponse response) {
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
        public Builder body(GetDagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDagResponse build() {
            return new GetDagResponse(this);
        } 

    } 

}
