// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectFullVerifyResultResponse} extends {@link TeaModel}
 *
 * <p>ListProjectFullVerifyResultResponse</p>
 */
public class ListProjectFullVerifyResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectFullVerifyResultResponseBody body;

    private ListProjectFullVerifyResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectFullVerifyResultResponse create() {
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
    public ListProjectFullVerifyResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectFullVerifyResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectFullVerifyResultResponseBody body);

        @Override
        ListProjectFullVerifyResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectFullVerifyResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectFullVerifyResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectFullVerifyResultResponse response) {
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
        public Builder body(ListProjectFullVerifyResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectFullVerifyResultResponse build() {
            return new ListProjectFullVerifyResultResponse(this);
        } 

    } 

}
