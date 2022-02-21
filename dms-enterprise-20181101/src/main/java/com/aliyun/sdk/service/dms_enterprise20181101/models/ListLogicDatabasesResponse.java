// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicDatabasesResponse} extends {@link TeaModel}
 *
 * <p>ListLogicDatabasesResponse</p>
 */
public class ListLogicDatabasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogicDatabasesResponseBody body;

    private ListLogicDatabasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogicDatabasesResponse create() {
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
    public ListLogicDatabasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogicDatabasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogicDatabasesResponseBody body);

        @Override
        ListLogicDatabasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogicDatabasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogicDatabasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogicDatabasesResponse response) {
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
        public Builder body(ListLogicDatabasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogicDatabasesResponse build() {
            return new ListLogicDatabasesResponse(this);
        } 

    } 

}
