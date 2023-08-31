// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcrImageTagsResponse} extends {@link TeaModel}
 *
 * <p>ListAcrImageTagsResponse</p>
 */
public class ListAcrImageTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAcrImageTagsResponseBody body;

    private ListAcrImageTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAcrImageTagsResponse create() {
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
    public ListAcrImageTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAcrImageTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAcrImageTagsResponseBody body);

        @Override
        ListAcrImageTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAcrImageTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAcrImageTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAcrImageTagsResponse response) {
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
        public Builder body(ListAcrImageTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAcrImageTagsResponse build() {
            return new ListAcrImageTagsResponse(this);
        } 

    } 

}
