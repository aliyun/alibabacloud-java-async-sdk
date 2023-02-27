// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CoachCallResponse} extends {@link TeaModel}
 *
 * <p>CoachCallResponse</p>
 */
public class CoachCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CoachCallResponseBody body;

    private CoachCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CoachCallResponse create() {
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
    public CoachCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CoachCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CoachCallResponseBody body);

        @Override
        CoachCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CoachCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CoachCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CoachCallResponse response) {
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
        public Builder body(CoachCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CoachCallResponse build() {
            return new CoachCallResponse(this);
        } 

    } 

}
