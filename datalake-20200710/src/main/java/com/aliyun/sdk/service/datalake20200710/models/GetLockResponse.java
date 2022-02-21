// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLockResponse} extends {@link TeaModel}
 *
 * <p>GetLockResponse</p>
 */
public class GetLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLockResponseBody body;

    private GetLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLockResponse create() {
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
    public GetLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLockResponseBody body);

        @Override
        GetLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLockResponse response) {
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
        public Builder body(GetLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLockResponse build() {
            return new GetLockResponse(this);
        } 

    } 

}
