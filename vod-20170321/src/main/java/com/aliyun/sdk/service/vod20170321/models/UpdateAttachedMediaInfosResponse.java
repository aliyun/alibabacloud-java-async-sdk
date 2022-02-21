// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAttachedMediaInfosResponse} extends {@link TeaModel}
 *
 * <p>UpdateAttachedMediaInfosResponse</p>
 */
public class UpdateAttachedMediaInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAttachedMediaInfosResponseBody body;

    private UpdateAttachedMediaInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAttachedMediaInfosResponse create() {
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
    public UpdateAttachedMediaInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAttachedMediaInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAttachedMediaInfosResponseBody body);

        @Override
        UpdateAttachedMediaInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAttachedMediaInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAttachedMediaInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAttachedMediaInfosResponse response) {
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
        public Builder body(UpdateAttachedMediaInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAttachedMediaInfosResponse build() {
            return new UpdateAttachedMediaInfosResponse(this);
        } 

    } 

}
