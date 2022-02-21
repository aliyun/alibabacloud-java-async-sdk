// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhysicalConnectionFeaturesResponse} extends {@link TeaModel}
 *
 * <p>ListPhysicalConnectionFeaturesResponse</p>
 */
public class ListPhysicalConnectionFeaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPhysicalConnectionFeaturesResponseBody body;

    private ListPhysicalConnectionFeaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPhysicalConnectionFeaturesResponse create() {
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
    public ListPhysicalConnectionFeaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPhysicalConnectionFeaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPhysicalConnectionFeaturesResponseBody body);

        @Override
        ListPhysicalConnectionFeaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPhysicalConnectionFeaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPhysicalConnectionFeaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPhysicalConnectionFeaturesResponse response) {
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
        public Builder body(ListPhysicalConnectionFeaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPhysicalConnectionFeaturesResponse build() {
            return new ListPhysicalConnectionFeaturesResponse(this);
        } 

    } 

}
