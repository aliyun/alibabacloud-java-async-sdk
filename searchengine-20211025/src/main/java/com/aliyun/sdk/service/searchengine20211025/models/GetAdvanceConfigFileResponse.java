// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvanceConfigFileResponse} extends {@link TeaModel}
 *
 * <p>GetAdvanceConfigFileResponse</p>
 */
public class GetAdvanceConfigFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAdvanceConfigFileResponseBody body;

    private GetAdvanceConfigFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAdvanceConfigFileResponse create() {
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
    public GetAdvanceConfigFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAdvanceConfigFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAdvanceConfigFileResponseBody body);

        @Override
        GetAdvanceConfigFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAdvanceConfigFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAdvanceConfigFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAdvanceConfigFileResponse response) {
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
        public Builder body(GetAdvanceConfigFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAdvanceConfigFileResponse build() {
            return new GetAdvanceConfigFileResponse(this);
        } 

    } 

}
