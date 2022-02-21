// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineMessageLogResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineMessageLogResponse</p>
 */
public class GetHotlineMessageLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineMessageLogResponseBody body;

    private GetHotlineMessageLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineMessageLogResponse create() {
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
    public GetHotlineMessageLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineMessageLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineMessageLogResponseBody body);

        @Override
        GetHotlineMessageLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineMessageLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineMessageLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineMessageLogResponse response) {
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
        public Builder body(GetHotlineMessageLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineMessageLogResponse build() {
            return new GetHotlineMessageLogResponse(this);
        } 

    } 

}
