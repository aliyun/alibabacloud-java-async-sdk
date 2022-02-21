// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRtsLiveStreamTranscodeResponse} extends {@link TeaModel}
 *
 * <p>AddRtsLiveStreamTranscodeResponse</p>
 */
public class AddRtsLiveStreamTranscodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRtsLiveStreamTranscodeResponseBody body;

    private AddRtsLiveStreamTranscodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRtsLiveStreamTranscodeResponse create() {
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
    public AddRtsLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRtsLiveStreamTranscodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRtsLiveStreamTranscodeResponseBody body);

        @Override
        AddRtsLiveStreamTranscodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRtsLiveStreamTranscodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRtsLiveStreamTranscodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRtsLiveStreamTranscodeResponse response) {
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
        public Builder body(AddRtsLiveStreamTranscodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRtsLiveStreamTranscodeResponse build() {
            return new AddRtsLiveStreamTranscodeResponse(this);
        } 

    } 

}
