// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PollUserStatusResponse} extends {@link TeaModel}
 *
 * <p>PollUserStatusResponse</p>
 */
public class PollUserStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PollUserStatusResponseBody body;

    private PollUserStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PollUserStatusResponse create() {
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
    public PollUserStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PollUserStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PollUserStatusResponseBody body);

        @Override
        PollUserStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PollUserStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PollUserStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PollUserStatusResponse response) {
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
        public Builder body(PollUserStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PollUserStatusResponse build() {
            return new PollUserStatusResponse(this);
        } 

    } 

}
