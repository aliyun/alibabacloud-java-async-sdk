// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessagePageQueryByTopicResponse} extends {@link TeaModel}
 *
 * <p>OnsMessagePageQueryByTopicResponse</p>
 */
public class OnsMessagePageQueryByTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsMessagePageQueryByTopicResponseBody body;

    private OnsMessagePageQueryByTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsMessagePageQueryByTopicResponse create() {
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
    public OnsMessagePageQueryByTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessagePageQueryByTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsMessagePageQueryByTopicResponseBody body);

        @Override
        OnsMessagePageQueryByTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessagePageQueryByTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsMessagePageQueryByTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessagePageQueryByTopicResponse response) {
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
        public Builder body(OnsMessagePageQueryByTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessagePageQueryByTopicResponse build() {
            return new OnsMessagePageQueryByTopicResponse(this);
        } 

    } 

}
