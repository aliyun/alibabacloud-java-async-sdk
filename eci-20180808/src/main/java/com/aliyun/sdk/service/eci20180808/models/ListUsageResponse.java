// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsageResponse} extends {@link TeaModel}
 *
 * <p>ListUsageResponse</p>
 */
public class ListUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsageResponseBody body;

    private ListUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsageResponse create() {
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
    public ListUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsageResponseBody body);

        @Override
        ListUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsageResponse response) {
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
        public Builder body(ListUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsageResponse build() {
            return new ListUsageResponse(this);
        } 

    } 

}
