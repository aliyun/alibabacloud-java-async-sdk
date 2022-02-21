// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindImagesResponse} extends {@link TeaModel}
 *
 * <p>FindImagesResponse</p>
 */
public class FindImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindImagesResponseBody body;

    private FindImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindImagesResponse create() {
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
    public FindImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindImagesResponseBody body);

        @Override
        FindImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindImagesResponse response) {
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
        public Builder body(FindImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindImagesResponse build() {
            return new FindImagesResponse(this);
        } 

    } 

}
