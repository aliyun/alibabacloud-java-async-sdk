// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadDetailsResponse} extends {@link TeaModel}
 *
 * <p>GetUploadDetailsResponse</p>
 */
public class GetUploadDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUploadDetailsResponseBody body;

    private GetUploadDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUploadDetailsResponse create() {
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
    public GetUploadDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUploadDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUploadDetailsResponseBody body);

        @Override
        GetUploadDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUploadDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUploadDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUploadDetailsResponse response) {
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
        public Builder body(GetUploadDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUploadDetailsResponse build() {
            return new GetUploadDetailsResponse(this);
        } 

    } 

}
