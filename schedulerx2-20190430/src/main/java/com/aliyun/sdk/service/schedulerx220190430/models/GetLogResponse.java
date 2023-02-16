// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogResponse} extends {@link TeaModel}
 *
 * <p>GetLogResponse</p>
 */
public class GetLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLogResponseBody body;

    private GetLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogResponse create() {
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
    public GetLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLogResponseBody body);

        @Override
        GetLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogResponse response) {
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
        public Builder body(GetLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogResponse build() {
            return new GetLogResponse(this);
        } 

    } 

}
