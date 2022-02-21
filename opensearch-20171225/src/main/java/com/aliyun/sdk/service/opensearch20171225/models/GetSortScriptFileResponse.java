// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSortScriptFileResponse} extends {@link TeaModel}
 *
 * <p>GetSortScriptFileResponse</p>
 */
public class GetSortScriptFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSortScriptFileResponseBody body;

    private GetSortScriptFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSortScriptFileResponse create() {
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
    public GetSortScriptFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSortScriptFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSortScriptFileResponseBody body);

        @Override
        GetSortScriptFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSortScriptFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSortScriptFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSortScriptFileResponse response) {
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
        public Builder body(GetSortScriptFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSortScriptFileResponse build() {
            return new GetSortScriptFileResponse(this);
        } 

    } 

}
