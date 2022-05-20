// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicAttributesResponse} extends {@link TeaModel}
 *
 * <p>GetTopicAttributesResponse</p>
 */
public class GetTopicAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTopicAttributesResponseBody body;

    private GetTopicAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTopicAttributesResponse create() {
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
    public GetTopicAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTopicAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTopicAttributesResponseBody body);

        @Override
        GetTopicAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTopicAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTopicAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTopicAttributesResponse response) {
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
        public Builder body(GetTopicAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTopicAttributesResponse build() {
            return new GetTopicAttributesResponse(this);
        } 

    } 

}
