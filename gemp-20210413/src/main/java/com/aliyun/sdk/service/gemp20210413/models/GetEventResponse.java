// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventResponse} extends {@link TeaModel}
 *
 * <p>GetEventResponse</p>
 */
public class GetEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEventResponseBody body;

    private GetEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEventResponse create() {
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
    public GetEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEventResponseBody body);

        @Override
        GetEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEventResponse response) {
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
        public Builder body(GetEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEventResponse build() {
            return new GetEventResponse(this);
        } 

    } 

}
