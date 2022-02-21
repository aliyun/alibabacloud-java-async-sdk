// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetastoreMigrationsResponse} extends {@link TeaModel}
 *
 * <p>ListMetastoreMigrationsResponse</p>
 */
public class ListMetastoreMigrationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMetastoreMigrationsResponseBody body;

    private ListMetastoreMigrationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMetastoreMigrationsResponse create() {
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
    public ListMetastoreMigrationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMetastoreMigrationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMetastoreMigrationsResponseBody body);

        @Override
        ListMetastoreMigrationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMetastoreMigrationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMetastoreMigrationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMetastoreMigrationsResponse response) {
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
        public Builder body(ListMetastoreMigrationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMetastoreMigrationsResponse build() {
            return new ListMetastoreMigrationsResponse(this);
        } 

    } 

}
