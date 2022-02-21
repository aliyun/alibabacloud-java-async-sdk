// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerImagesResponse} extends {@link TeaModel}
 *
 * <p>ListContainerImagesResponse</p>
 */
public class ListContainerImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListContainerImagesResponseBody body;

    private ListContainerImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListContainerImagesResponse create() {
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
    public ListContainerImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListContainerImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListContainerImagesResponseBody body);

        @Override
        ListContainerImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListContainerImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListContainerImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListContainerImagesResponse response) {
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
        public Builder body(ListContainerImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListContainerImagesResponse build() {
            return new ListContainerImagesResponse(this);
        } 

    } 

}
