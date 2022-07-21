// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopParserResponse} extends {@link TeaModel}
 *
 * <p>StopParserResponse</p>
 */
public class StopParserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopParserResponseBody body;

    private StopParserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopParserResponse create() {
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
    public StopParserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopParserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopParserResponseBody body);

        @Override
        StopParserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopParserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopParserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopParserResponse response) {
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
        public Builder body(StopParserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopParserResponse build() {
            return new StopParserResponse(this);
        } 

    } 

}
