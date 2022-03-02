// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListPartsResponse} extends {@link TeaModel}
 *
 * <p>ListPartsResponse</p>
 */
public class ListPartsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPartsResponseBody body;

    private ListPartsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPartsResponse create() {
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
    public ListPartsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPartsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPartsResponseBody body);

        @Override
        ListPartsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPartsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPartsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPartsResponse response) {
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
        public Builder body(ListPartsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPartsResponse build() {
            return new ListPartsResponse(this);
        } 

    } 

}
