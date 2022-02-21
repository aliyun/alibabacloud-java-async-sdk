// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseUserPermssionsResponse} extends {@link TeaModel}
 *
 * <p>ListDatabaseUserPermssionsResponse</p>
 */
public class ListDatabaseUserPermssionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDatabaseUserPermssionsResponseBody body;

    private ListDatabaseUserPermssionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDatabaseUserPermssionsResponse create() {
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
    public ListDatabaseUserPermssionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDatabaseUserPermssionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDatabaseUserPermssionsResponseBody body);

        @Override
        ListDatabaseUserPermssionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDatabaseUserPermssionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDatabaseUserPermssionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDatabaseUserPermssionsResponse response) {
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
        public Builder body(ListDatabaseUserPermssionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDatabaseUserPermssionsResponse build() {
            return new ListDatabaseUserPermssionsResponse(this);
        } 

    } 

}
