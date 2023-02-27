// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchToConferenceResponse} extends {@link TeaModel}
 *
 * <p>SwitchToConferenceResponse</p>
 */
public class SwitchToConferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchToConferenceResponseBody body;

    private SwitchToConferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchToConferenceResponse create() {
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
    public SwitchToConferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchToConferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchToConferenceResponseBody body);

        @Override
        SwitchToConferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchToConferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchToConferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchToConferenceResponse response) {
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
        public Builder body(SwitchToConferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchToConferenceResponse build() {
            return new SwitchToConferenceResponse(this);
        } 

    } 

}
