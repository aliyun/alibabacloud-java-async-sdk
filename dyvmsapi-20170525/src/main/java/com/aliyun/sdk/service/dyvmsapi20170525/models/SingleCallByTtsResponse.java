// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleCallByTtsResponse} extends {@link TeaModel}
 *
 * <p>SingleCallByTtsResponse</p>
 */
public class SingleCallByTtsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SingleCallByTtsResponseBody body;

    private SingleCallByTtsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SingleCallByTtsResponse create() {
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
    public SingleCallByTtsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleCallByTtsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SingleCallByTtsResponseBody body);

        @Override
        SingleCallByTtsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleCallByTtsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SingleCallByTtsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleCallByTtsResponse response) {
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
        public Builder body(SingleCallByTtsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleCallByTtsResponse build() {
            return new SingleCallByTtsResponse(this);
        } 

    } 

}
