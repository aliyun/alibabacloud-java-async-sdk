// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConstantsResponse} extends {@link TeaModel}
 *
 * <p>ListConstantsResponse</p>
 */
public class ListConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConstantsResponseBody body;

    private ListConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConstantsResponse create() {
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
    public ListConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConstantsResponseBody body);

        @Override
        ListConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConstantsResponse response) {
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
        public Builder body(ListConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConstantsResponse build() {
            return new ListConstantsResponse(this);
        } 

    } 

}
