// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupPersonSchedulingResponse} extends {@link TeaModel}
 *
 * <p>GetServiceGroupPersonSchedulingResponse</p>
 */
public class GetServiceGroupPersonSchedulingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceGroupPersonSchedulingResponseBody body;

    private GetServiceGroupPersonSchedulingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceGroupPersonSchedulingResponse create() {
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
    public GetServiceGroupPersonSchedulingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceGroupPersonSchedulingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceGroupPersonSchedulingResponseBody body);

        @Override
        GetServiceGroupPersonSchedulingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceGroupPersonSchedulingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceGroupPersonSchedulingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceGroupPersonSchedulingResponse response) {
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
        public Builder body(GetServiceGroupPersonSchedulingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceGroupPersonSchedulingResponse build() {
            return new GetServiceGroupPersonSchedulingResponse(this);
        } 

    } 

}
