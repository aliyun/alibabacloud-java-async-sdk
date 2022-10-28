// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDAGVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListDAGVersionsResponse</p>
 */
public class ListDAGVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDAGVersionsResponseBody body;

    private ListDAGVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDAGVersionsResponse create() {
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
    public ListDAGVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDAGVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDAGVersionsResponseBody body);

        @Override
        ListDAGVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDAGVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDAGVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDAGVersionsResponse response) {
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
        public Builder body(ListDAGVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDAGVersionsResponse build() {
            return new ListDAGVersionsResponse(this);
        } 

    } 

}
