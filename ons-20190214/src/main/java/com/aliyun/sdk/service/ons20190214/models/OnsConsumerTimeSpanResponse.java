// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerTimeSpanResponse} extends {@link TeaModel}
 *
 * <p>OnsConsumerTimeSpanResponse</p>
 */
public class OnsConsumerTimeSpanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsConsumerTimeSpanResponseBody body;

    private OnsConsumerTimeSpanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsConsumerTimeSpanResponse create() {
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
    public OnsConsumerTimeSpanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsConsumerTimeSpanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsConsumerTimeSpanResponseBody body);

        @Override
        OnsConsumerTimeSpanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsConsumerTimeSpanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsConsumerTimeSpanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsConsumerTimeSpanResponse response) {
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
        public Builder body(OnsConsumerTimeSpanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsConsumerTimeSpanResponse build() {
            return new OnsConsumerTimeSpanResponse(this);
        } 

    } 

}
