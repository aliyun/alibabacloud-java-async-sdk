// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParserDestinationResponse} extends {@link TeaModel}
 *
 * <p>ListParserDestinationResponse</p>
 */
public class ListParserDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListParserDestinationResponseBody body;

    private ListParserDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListParserDestinationResponse create() {
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
    public ListParserDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListParserDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListParserDestinationResponseBody body);

        @Override
        ListParserDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListParserDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListParserDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListParserDestinationResponse response) {
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
        public Builder body(ListParserDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListParserDestinationResponse build() {
            return new ListParserDestinationResponse(this);
        } 

    } 

}
