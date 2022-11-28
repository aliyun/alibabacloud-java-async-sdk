// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZkTrackResponse} extends {@link TeaModel}
 *
 * <p>ListZkTrackResponse</p>
 */
public class ListZkTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListZkTrackResponseBody body;

    private ListZkTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListZkTrackResponse create() {
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
    public ListZkTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListZkTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListZkTrackResponseBody body);

        @Override
        ListZkTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListZkTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListZkTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListZkTrackResponse response) {
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
        public Builder body(ListZkTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListZkTrackResponse build() {
            return new ListZkTrackResponse(this);
        } 

    } 

}
