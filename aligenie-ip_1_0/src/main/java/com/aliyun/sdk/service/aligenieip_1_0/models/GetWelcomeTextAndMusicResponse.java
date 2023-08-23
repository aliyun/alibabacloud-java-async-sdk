// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWelcomeTextAndMusicResponse} extends {@link TeaModel}
 *
 * <p>GetWelcomeTextAndMusicResponse</p>
 */
public class GetWelcomeTextAndMusicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWelcomeTextAndMusicResponseBody body;

    private GetWelcomeTextAndMusicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWelcomeTextAndMusicResponse create() {
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
    public GetWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWelcomeTextAndMusicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWelcomeTextAndMusicResponseBody body);

        @Override
        GetWelcomeTextAndMusicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWelcomeTextAndMusicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWelcomeTextAndMusicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWelcomeTextAndMusicResponse response) {
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
        public Builder body(GetWelcomeTextAndMusicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWelcomeTextAndMusicResponse build() {
            return new GetWelcomeTextAndMusicResponse(this);
        } 

    } 

}
