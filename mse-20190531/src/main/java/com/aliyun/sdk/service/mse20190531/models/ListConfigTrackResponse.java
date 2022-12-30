// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigTrackResponse} extends {@link TeaModel}
 *
 * <p>ListConfigTrackResponse</p>
 */
public class ListConfigTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigTrackResponseBody body;

    private ListConfigTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigTrackResponse create() {
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
    public ListConfigTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigTrackResponseBody body);

        @Override
        ListConfigTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigTrackResponse response) {
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
        public Builder body(ListConfigTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigTrackResponse build() {
            return new ListConfigTrackResponse(this);
        } 

    } 

}
