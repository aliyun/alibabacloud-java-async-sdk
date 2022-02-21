// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesResponse} extends {@link TeaModel}
 *
 * <p>ListImagesResponse</p>
 */
public class ListImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListImagesResponseBody body;

    private ListImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListImagesResponse create() {
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
    public ListImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListImagesResponseBody body);

        @Override
        ListImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListImagesResponse response) {
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
        public Builder body(ListImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListImagesResponse build() {
            return new ListImagesResponse(this);
        } 

    } 

}
