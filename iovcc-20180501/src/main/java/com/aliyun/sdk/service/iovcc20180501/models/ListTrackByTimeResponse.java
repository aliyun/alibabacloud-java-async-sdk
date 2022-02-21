// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrackByTimeResponse} extends {@link TeaModel}
 *
 * <p>ListTrackByTimeResponse</p>
 */
public class ListTrackByTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrackByTimeResponseBody body;

    private ListTrackByTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrackByTimeResponse create() {
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
    public ListTrackByTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrackByTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrackByTimeResponseBody body);

        @Override
        ListTrackByTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrackByTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrackByTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrackByTimeResponse response) {
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
        public Builder body(ListTrackByTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrackByTimeResponse build() {
            return new ListTrackByTimeResponse(this);
        } 

    } 

}
