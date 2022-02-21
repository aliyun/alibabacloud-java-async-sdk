// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAxnTrackNoResponse} extends {@link TeaModel}
 *
 * <p>AddAxnTrackNoResponse</p>
 */
public class AddAxnTrackNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAxnTrackNoResponseBody body;

    private AddAxnTrackNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAxnTrackNoResponse create() {
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
    public AddAxnTrackNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAxnTrackNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAxnTrackNoResponseBody body);

        @Override
        AddAxnTrackNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAxnTrackNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAxnTrackNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAxnTrackNoResponse response) {
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
        public Builder body(AddAxnTrackNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAxnTrackNoResponse build() {
            return new AddAxnTrackNoResponse(this);
        } 

    } 

}
