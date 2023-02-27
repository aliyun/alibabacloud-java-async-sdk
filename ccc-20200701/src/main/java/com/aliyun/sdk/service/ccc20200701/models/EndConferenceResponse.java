// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EndConferenceResponse} extends {@link TeaModel}
 *
 * <p>EndConferenceResponse</p>
 */
public class EndConferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EndConferenceResponseBody body;

    private EndConferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EndConferenceResponse create() {
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
    public EndConferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EndConferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EndConferenceResponseBody body);

        @Override
        EndConferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EndConferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EndConferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EndConferenceResponse response) {
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
        public Builder body(EndConferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EndConferenceResponse build() {
            return new EndConferenceResponse(this);
        } 

    } 

}
