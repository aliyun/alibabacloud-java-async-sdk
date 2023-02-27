// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataChannelCredentialsResponse} extends {@link TeaModel}
 *
 * <p>GetDataChannelCredentialsResponse</p>
 */
public class GetDataChannelCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataChannelCredentialsResponseBody body;

    private GetDataChannelCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataChannelCredentialsResponse create() {
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
    public GetDataChannelCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataChannelCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataChannelCredentialsResponseBody body);

        @Override
        GetDataChannelCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataChannelCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataChannelCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataChannelCredentialsResponse response) {
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
        public Builder body(GetDataChannelCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataChannelCredentialsResponse build() {
            return new GetDataChannelCredentialsResponse(this);
        } 

    } 

}
