// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckInstanceResultResponse} extends {@link TeaModel}
 *
 * <p>ListCheckInstanceResultResponse</p>
 */
public class ListCheckInstanceResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckInstanceResultResponseBody body;

    private ListCheckInstanceResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckInstanceResultResponse create() {
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
    public ListCheckInstanceResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckInstanceResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckInstanceResultResponseBody body);

        @Override
        ListCheckInstanceResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckInstanceResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckInstanceResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckInstanceResultResponse response) {
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
        public Builder body(ListCheckInstanceResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckInstanceResultResponse build() {
            return new ListCheckInstanceResultResponse(this);
        } 

    } 

}
