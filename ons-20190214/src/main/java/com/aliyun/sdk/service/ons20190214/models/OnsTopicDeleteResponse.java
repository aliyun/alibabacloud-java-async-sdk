// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicDeleteResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicDeleteResponse</p>
 */
public class OnsTopicDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicDeleteResponseBody body;

    private OnsTopicDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicDeleteResponse create() {
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
    public OnsTopicDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicDeleteResponseBody body);

        @Override
        OnsTopicDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicDeleteResponse response) {
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
        public Builder body(OnsTopicDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicDeleteResponse build() {
            return new OnsTopicDeleteResponse(this);
        } 

    } 

}
