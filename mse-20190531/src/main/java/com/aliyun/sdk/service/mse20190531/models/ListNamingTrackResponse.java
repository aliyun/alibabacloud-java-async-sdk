// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamingTrackResponse} extends {@link TeaModel}
 *
 * <p>ListNamingTrackResponse</p>
 */
public class ListNamingTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNamingTrackResponseBody body;

    private ListNamingTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNamingTrackResponse create() {
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
    public ListNamingTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNamingTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNamingTrackResponseBody body);

        @Override
        ListNamingTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNamingTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNamingTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNamingTrackResponse response) {
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
        public Builder body(ListNamingTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNamingTrackResponse build() {
            return new ListNamingTrackResponse(this);
        } 

    } 

}
