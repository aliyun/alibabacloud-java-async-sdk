// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicListResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicListResponse</p>
 */
public class OnsTopicListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicListResponseBody body;

    private OnsTopicListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicListResponse create() {
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
    public OnsTopicListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicListResponseBody body);

        @Override
        OnsTopicListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicListResponse response) {
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
        public Builder body(OnsTopicListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicListResponse build() {
            return new OnsTopicListResponse(this);
        } 

    } 

}
