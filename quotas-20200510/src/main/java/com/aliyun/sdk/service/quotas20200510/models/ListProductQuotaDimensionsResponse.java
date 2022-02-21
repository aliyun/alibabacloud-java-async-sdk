// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductQuotaDimensionsResponse} extends {@link TeaModel}
 *
 * <p>ListProductQuotaDimensionsResponse</p>
 */
public class ListProductQuotaDimensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductQuotaDimensionsResponseBody body;

    private ListProductQuotaDimensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductQuotaDimensionsResponse create() {
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
    public ListProductQuotaDimensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductQuotaDimensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductQuotaDimensionsResponseBody body);

        @Override
        ListProductQuotaDimensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductQuotaDimensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductQuotaDimensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductQuotaDimensionsResponse response) {
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
        public Builder body(ListProductQuotaDimensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductQuotaDimensionsResponse build() {
            return new ListProductQuotaDimensionsResponse(this);
        } 

    } 

}
