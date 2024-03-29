// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesResponse} extends {@link TeaModel}
 *
 * <p>ListCustomImagesResponse</p>
 */
public class ListCustomImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomImagesResponseBody body;

    private ListCustomImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomImagesResponse create() {
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
    public ListCustomImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomImagesResponseBody body);

        @Override
        ListCustomImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomImagesResponse response) {
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
        public Builder body(ListCustomImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomImagesResponse build() {
            return new ListCustomImagesResponse(this);
        } 

    } 

}
