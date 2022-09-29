// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrackListResponse} extends {@link TeaModel}
 *
 * <p>GetTrackListResponse</p>
 */
public class GetTrackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrackListResponseBody body;

    private GetTrackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrackListResponse create() {
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
    public GetTrackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrackListResponseBody body);

        @Override
        GetTrackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrackListResponse response) {
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
        public Builder body(GetTrackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrackListResponse build() {
            return new GetTrackListResponse(this);
        } 

    } 

}
