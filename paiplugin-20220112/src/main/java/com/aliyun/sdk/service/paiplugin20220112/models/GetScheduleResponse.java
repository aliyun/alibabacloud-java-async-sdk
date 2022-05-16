// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScheduleResponse} extends {@link TeaModel}
 *
 * <p>GetScheduleResponse</p>
 */
public class GetScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScheduleResponseBody body;

    private GetScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScheduleResponse create() {
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
    public GetScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScheduleResponseBody body);

        @Override
        GetScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScheduleResponse response) {
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
        public Builder body(GetScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScheduleResponse build() {
            return new GetScheduleResponse(this);
        } 

    } 

}
