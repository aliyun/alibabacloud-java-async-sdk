// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportFeaturesResponse} extends {@link TeaModel}
 *
 * <p>ListSupportFeaturesResponse</p>
 */
public class ListSupportFeaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSupportFeaturesResponseBody body;

    private ListSupportFeaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSupportFeaturesResponse create() {
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
    public ListSupportFeaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSupportFeaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSupportFeaturesResponseBody body);

        @Override
        ListSupportFeaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSupportFeaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSupportFeaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSupportFeaturesResponse response) {
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
        public Builder body(ListSupportFeaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSupportFeaturesResponse build() {
            return new ListSupportFeaturesResponse(this);
        } 

    } 

}
