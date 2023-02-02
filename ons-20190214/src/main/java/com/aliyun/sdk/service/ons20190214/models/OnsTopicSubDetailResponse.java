// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicSubDetailResponse} extends {@link TeaModel}
 *
 * <p>OnsTopicSubDetailResponse</p>
 */
public class OnsTopicSubDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTopicSubDetailResponseBody body;

    private OnsTopicSubDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTopicSubDetailResponse create() {
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
    public OnsTopicSubDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTopicSubDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTopicSubDetailResponseBody body);

        @Override
        OnsTopicSubDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTopicSubDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTopicSubDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTopicSubDetailResponse response) {
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
        public Builder body(OnsTopicSubDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTopicSubDetailResponse build() {
            return new OnsTopicSubDetailResponse(this);
        } 

    } 

}
