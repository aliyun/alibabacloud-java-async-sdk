// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttachedMediaInfoResponse} extends {@link TeaModel}
 *
 * <p>GetAttachedMediaInfoResponse</p>
 */
public class GetAttachedMediaInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAttachedMediaInfoResponseBody body;

    private GetAttachedMediaInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAttachedMediaInfoResponse create() {
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
    public GetAttachedMediaInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAttachedMediaInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAttachedMediaInfoResponseBody body);

        @Override
        GetAttachedMediaInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAttachedMediaInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAttachedMediaInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAttachedMediaInfoResponse response) {
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
        public Builder body(GetAttachedMediaInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAttachedMediaInfoResponse build() {
            return new GetAttachedMediaInfoResponse(this);
        } 

    } 

}
