// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAudioFileResponse} extends {@link TeaModel}
 *
 * <p>GetAudioFileResponse</p>
 */
public class GetAudioFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAudioFileResponseBody body;

    private GetAudioFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAudioFileResponse create() {
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
    public GetAudioFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAudioFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAudioFileResponseBody body);

        @Override
        GetAudioFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAudioFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAudioFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAudioFileResponse response) {
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
        public Builder body(GetAudioFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAudioFileResponse build() {
            return new GetAudioFileResponse(this);
        } 

    } 

}
