// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ADClockResponse} extends {@link TeaModel}
 *
 * <p>ADClockResponse</p>
 */
public class ADClockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ADClockResponseBody body;

    private ADClockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ADClockResponse create() {
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
    public ADClockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ADClockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ADClockResponseBody body);

        @Override
        ADClockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ADClockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ADClockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ADClockResponse response) {
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
        public Builder body(ADClockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ADClockResponse build() {
            return new ADClockResponse(this);
        } 

    } 

}
