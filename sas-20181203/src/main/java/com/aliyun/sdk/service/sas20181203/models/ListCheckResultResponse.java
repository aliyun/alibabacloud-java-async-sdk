// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckResultResponse} extends {@link TeaModel}
 *
 * <p>ListCheckResultResponse</p>
 */
public class ListCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckResultResponseBody body;

    private ListCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckResultResponse create() {
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
    public ListCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckResultResponseBody body);

        @Override
        ListCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckResultResponse response) {
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
        public Builder body(ListCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckResultResponse build() {
            return new ListCheckResultResponse(this);
        } 

    } 

}
