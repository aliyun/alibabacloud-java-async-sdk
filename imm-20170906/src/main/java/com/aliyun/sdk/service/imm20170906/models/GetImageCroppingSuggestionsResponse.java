// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageCroppingSuggestionsResponse} extends {@link TeaModel}
 *
 * <p>GetImageCroppingSuggestionsResponse</p>
 */
public class GetImageCroppingSuggestionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageCroppingSuggestionsResponseBody body;

    private GetImageCroppingSuggestionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageCroppingSuggestionsResponse create() {
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
    public GetImageCroppingSuggestionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageCroppingSuggestionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageCroppingSuggestionsResponseBody body);

        @Override
        GetImageCroppingSuggestionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageCroppingSuggestionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageCroppingSuggestionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageCroppingSuggestionsResponse response) {
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
        public Builder body(GetImageCroppingSuggestionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageCroppingSuggestionsResponse build() {
            return new GetImageCroppingSuggestionsResponse(this);
        } 

    } 

}
