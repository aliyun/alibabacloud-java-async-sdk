// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicStatusResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicStatusResponse</p>
 */
public class OnsTopicStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicStatusResponseBody body;

    private OnsTopicStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicStatusResponse create() {
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
    public OnsTopicStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicStatusResponseBody body);

        @Override
        OnsTopicStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicStatusResponse response) {
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
        public Builder body(OnsTopicStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicStatusResponse build() {
            return new OnsTopicStatusResponse(this);
        } 

    } 

}
