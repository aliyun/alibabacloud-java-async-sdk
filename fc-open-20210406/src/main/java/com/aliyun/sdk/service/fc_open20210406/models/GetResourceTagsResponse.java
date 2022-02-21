// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTagsResponse} extends {@link TeaModel}
 *
 * <p>GetResourceTagsResponse</p>
 */
public class GetResourceTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceTagsResponseBody body;

    private GetResourceTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceTagsResponse create() {
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
    public GetResourceTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceTagsResponseBody body);

        @Override
        GetResourceTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceTagsResponse response) {
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
        public Builder body(GetResourceTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceTagsResponse build() {
            return new GetResourceTagsResponse(this);
        } 

    } 

}
