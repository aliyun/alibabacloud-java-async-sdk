// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitLiveEditingResponse} extends {@link TeaModel}
 *
 * <p>SubmitLiveEditingResponse</p>
 */
public class SubmitLiveEditingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitLiveEditingResponseBody body;

    private SubmitLiveEditingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitLiveEditingResponse create() {
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
    public SubmitLiveEditingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitLiveEditingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitLiveEditingResponseBody body);

        @Override
        SubmitLiveEditingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitLiveEditingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitLiveEditingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitLiveEditingResponse response) {
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
        public Builder body(SubmitLiveEditingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitLiveEditingResponse build() {
            return new SubmitLiveEditingResponse(this);
        } 

    } 

}
