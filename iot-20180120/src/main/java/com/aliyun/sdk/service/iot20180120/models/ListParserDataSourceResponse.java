// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParserDataSourceResponse} extends {@link TeaModel}
 *
 * <p>ListParserDataSourceResponse</p>
 */
public class ListParserDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListParserDataSourceResponseBody body;

    private ListParserDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListParserDataSourceResponse create() {
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
    public ListParserDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListParserDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListParserDataSourceResponseBody body);

        @Override
        ListParserDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListParserDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListParserDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListParserDataSourceResponse response) {
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
        public Builder body(ListParserDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListParserDataSourceResponse build() {
            return new ListParserDataSourceResponse(this);
        } 

    } 

}
