// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParserResponse} extends {@link TeaModel}
 *
 * <p>GetParserResponse</p>
 */
public class GetParserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetParserResponseBody body;

    private GetParserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetParserResponse create() {
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
    public GetParserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetParserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetParserResponseBody body);

        @Override
        GetParserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetParserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetParserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetParserResponse response) {
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
        public Builder body(GetParserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetParserResponse build() {
            return new GetParserResponse(this);
        } 

    } 

}
