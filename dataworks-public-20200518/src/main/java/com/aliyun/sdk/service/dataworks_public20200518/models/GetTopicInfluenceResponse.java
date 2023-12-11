// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicInfluenceResponse} extends {@link TeaModel}
 *
 * <p>GetTopicInfluenceResponse</p>
 */
public class GetTopicInfluenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTopicInfluenceResponseBody body;

    private GetTopicInfluenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTopicInfluenceResponse create() {
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
    public GetTopicInfluenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTopicInfluenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTopicInfluenceResponseBody body);

        @Override
        GetTopicInfluenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTopicInfluenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTopicInfluenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTopicInfluenceResponse response) {
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
        public Builder body(GetTopicInfluenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTopicInfluenceResponse build() {
            return new GetTopicInfluenceResponse(this);
        } 

    } 

}
