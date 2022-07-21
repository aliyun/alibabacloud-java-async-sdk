// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodEventsResponse} extends {@link TeaModel}
 *
 * <p>GetPodEventsResponse</p>
 */
public class GetPodEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPodEventsResponseBody body;

    private GetPodEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPodEventsResponse create() {
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
    public GetPodEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPodEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPodEventsResponseBody body);

        @Override
        GetPodEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPodEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPodEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPodEventsResponse response) {
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
        public Builder body(GetPodEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPodEventsResponse build() {
            return new GetPodEventsResponse(this);
        } 

    } 

}
