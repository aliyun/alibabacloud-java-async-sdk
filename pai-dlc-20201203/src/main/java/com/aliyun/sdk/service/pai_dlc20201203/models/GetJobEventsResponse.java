// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobEventsResponse} extends {@link TeaModel}
 *
 * <p>GetJobEventsResponse</p>
 */
public class GetJobEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobEventsResponseBody body;

    private GetJobEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobEventsResponse create() {
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
    public GetJobEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobEventsResponseBody body);

        @Override
        GetJobEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobEventsResponse response) {
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
        public Builder body(GetJobEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobEventsResponse build() {
            return new GetJobEventsResponse(this);
        } 

    } 

}
