// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterTimedEventResponse} extends {@link TeaModel}
 *
 * <p>SetCasterTimedEventResponse</p>
 */
public class SetCasterTimedEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCasterTimedEventResponseBody body;

    private SetCasterTimedEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCasterTimedEventResponse create() {
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
    public SetCasterTimedEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCasterTimedEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCasterTimedEventResponseBody body);

        @Override
        SetCasterTimedEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCasterTimedEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCasterTimedEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCasterTimedEventResponse response) {
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
        public Builder body(SetCasterTimedEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCasterTimedEventResponse build() {
            return new SetCasterTimedEventResponse(this);
        } 

    } 

}
