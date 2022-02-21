// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesResponse} extends {@link TeaModel}
 *
 * <p>ListTagValuesResponse</p>
 */
public class ListTagValuesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagValuesResponseBody body;

    private ListTagValuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTagValuesResponse create() {
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
    public ListTagValuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagValuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTagValuesResponseBody body);

        @Override
        ListTagValuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagValuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTagValuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagValuesResponse response) {
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
        public Builder body(ListTagValuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagValuesResponse build() {
            return new ListTagValuesResponse(this);
        } 

    } 

}
