// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSearchCodePreviewResponse} extends {@link TeaModel}
 *
 * <p>GetSearchCodePreviewResponse</p>
 */
public class GetSearchCodePreviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSearchCodePreviewResponseBody body;

    private GetSearchCodePreviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSearchCodePreviewResponse create() {
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
    public GetSearchCodePreviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSearchCodePreviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSearchCodePreviewResponseBody body);

        @Override
        GetSearchCodePreviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSearchCodePreviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSearchCodePreviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSearchCodePreviewResponse response) {
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
        public Builder body(GetSearchCodePreviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSearchCodePreviewResponse build() {
            return new GetSearchCodePreviewResponse(this);
        } 

    } 

}
