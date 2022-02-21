// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingResponse} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSchedulingResponse</p>
 */
public class GetServiceGroupSchedulingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceGroupSchedulingResponseBody body;

    private GetServiceGroupSchedulingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceGroupSchedulingResponse create() {
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
    public GetServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceGroupSchedulingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceGroupSchedulingResponseBody body);

        @Override
        GetServiceGroupSchedulingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceGroupSchedulingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceGroupSchedulingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceGroupSchedulingResponse response) {
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
        public Builder body(GetServiceGroupSchedulingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceGroupSchedulingResponse build() {
            return new GetServiceGroupSchedulingResponse(this);
        } 

    } 

}
