// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConferenceResponse} extends {@link TeaModel}
 *
 * <p>GetConferenceResponse</p>
 */
public class GetConferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConferenceResponseBody body;

    private GetConferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConferenceResponse create() {
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
    public GetConferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConferenceResponseBody body);

        @Override
        GetConferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConferenceResponse response) {
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
        public Builder body(GetConferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConferenceResponse build() {
            return new GetConferenceResponse(this);
        } 

    } 

}
