// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveStreamMonitorResponse} extends {@link TeaModel}
 *
 * <p>CreateLiveStreamMonitorResponse</p>
 */
public class CreateLiveStreamMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLiveStreamMonitorResponseBody body;

    private CreateLiveStreamMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLiveStreamMonitorResponse create() {
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
    public CreateLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLiveStreamMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLiveStreamMonitorResponseBody body);

        @Override
        CreateLiveStreamMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLiveStreamMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLiveStreamMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLiveStreamMonitorResponse response) {
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
        public Builder body(CreateLiveStreamMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLiveStreamMonitorResponse build() {
            return new CreateLiveStreamMonitorResponse(this);
        } 

    } 

}
