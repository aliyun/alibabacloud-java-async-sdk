// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParserDataSourceResponse} extends {@link TeaModel}
 *
 * <p>GetParserDataSourceResponse</p>
 */
public class GetParserDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetParserDataSourceResponseBody body;

    private GetParserDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetParserDataSourceResponse create() {
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
    public GetParserDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetParserDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetParserDataSourceResponseBody body);

        @Override
        GetParserDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetParserDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetParserDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetParserDataSourceResponse response) {
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
        public Builder body(GetParserDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetParserDataSourceResponse build() {
            return new GetParserDataSourceResponse(this);
        } 

    } 

}
