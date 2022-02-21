// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexCurrentValueResponse} extends {@link TeaModel}
 *
 * <p>GetIndexCurrentValueResponse</p>
 */
public class GetIndexCurrentValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIndexCurrentValueResponseBody body;

    private GetIndexCurrentValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIndexCurrentValueResponse create() {
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
    public GetIndexCurrentValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIndexCurrentValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIndexCurrentValueResponseBody body);

        @Override
        GetIndexCurrentValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIndexCurrentValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIndexCurrentValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIndexCurrentValueResponse response) {
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
        public Builder body(GetIndexCurrentValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIndexCurrentValueResponse build() {
            return new GetIndexCurrentValueResponse(this);
        } 

    } 

}
