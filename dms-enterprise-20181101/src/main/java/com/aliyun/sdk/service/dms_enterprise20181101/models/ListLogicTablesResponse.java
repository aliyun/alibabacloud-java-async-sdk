// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicTablesResponse} extends {@link TeaModel}
 *
 * <p>ListLogicTablesResponse</p>
 */
public class ListLogicTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogicTablesResponseBody body;

    private ListLogicTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogicTablesResponse create() {
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
    public ListLogicTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogicTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogicTablesResponseBody body);

        @Override
        ListLogicTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogicTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogicTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogicTablesResponse response) {
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
        public Builder body(ListLogicTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogicTablesResponse build() {
            return new ListLogicTablesResponse(this);
        } 

    } 

}
