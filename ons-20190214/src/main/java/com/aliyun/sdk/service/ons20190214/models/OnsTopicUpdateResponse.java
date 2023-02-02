// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicUpdateResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicUpdateResponse</p>
 */
public class OnsTopicUpdateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicUpdateResponseBody body;

    private OnsTopicUpdateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicUpdateResponse create() {
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
    public OnsTopicUpdateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicUpdateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicUpdateResponseBody body);

        @Override
        OnsTopicUpdateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicUpdateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicUpdateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicUpdateResponse response) {
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
        public Builder body(OnsTopicUpdateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicUpdateResponse build() {
            return new OnsTopicUpdateResponse(this);
        } 

    } 

}
