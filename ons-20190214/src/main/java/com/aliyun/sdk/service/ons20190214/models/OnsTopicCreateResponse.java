// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicCreateResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicCreateResponse</p>
 */
public class OnsTopicCreateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicCreateResponseBody body;

    private OnsTopicCreateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicCreateResponse create() {
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
    public OnsTopicCreateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicCreateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicCreateResponseBody body);

        @Override
        OnsTopicCreateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicCreateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicCreateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicCreateResponse response) {
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
        public Builder body(OnsTopicCreateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicCreateResponse build() {
            return new OnsTopicCreateResponse(this);
        } 

    } 

}
