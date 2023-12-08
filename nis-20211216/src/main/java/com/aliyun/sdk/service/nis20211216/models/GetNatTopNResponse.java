// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatTopNResponse} extends {@link TeaModel}
 *
 * <p>GetNatTopNResponse</p>
 */
public class GetNatTopNResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNatTopNResponseBody body;

    private GetNatTopNResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNatTopNResponse create() {
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
    public GetNatTopNResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNatTopNResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNatTopNResponseBody body);

        @Override
        GetNatTopNResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNatTopNResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNatTopNResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNatTopNResponse response) {
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
        public Builder body(GetNatTopNResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNatTopNResponse build() {
            return new GetNatTopNResponse(this);
        } 

    } 

}
