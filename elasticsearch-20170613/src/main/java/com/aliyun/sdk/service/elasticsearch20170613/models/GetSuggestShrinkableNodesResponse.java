// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuggestShrinkableNodesResponse} extends {@link TeaModel}
 *
 * <p>GetSuggestShrinkableNodesResponse</p>
 */
public class GetSuggestShrinkableNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSuggestShrinkableNodesResponseBody body;

    private GetSuggestShrinkableNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSuggestShrinkableNodesResponse create() {
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
    public GetSuggestShrinkableNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSuggestShrinkableNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSuggestShrinkableNodesResponseBody body);

        @Override
        GetSuggestShrinkableNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSuggestShrinkableNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSuggestShrinkableNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSuggestShrinkableNodesResponse response) {
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
        public Builder body(GetSuggestShrinkableNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSuggestShrinkableNodesResponse build() {
            return new GetSuggestShrinkableNodesResponse(this);
        } 

    } 

}
