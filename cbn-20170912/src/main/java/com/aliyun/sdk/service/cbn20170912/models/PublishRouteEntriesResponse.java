// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishRouteEntriesResponse} extends {@link TeaModel}
 *
 * <p>PublishRouteEntriesResponse</p>
 */
public class PublishRouteEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishRouteEntriesResponseBody body;

    private PublishRouteEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishRouteEntriesResponse create() {
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
    public PublishRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishRouteEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishRouteEntriesResponseBody body);

        @Override
        PublishRouteEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishRouteEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishRouteEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishRouteEntriesResponse response) {
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
        public Builder body(PublishRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishRouteEntriesResponse build() {
            return new PublishRouteEntriesResponse(this);
        } 

    } 

}
