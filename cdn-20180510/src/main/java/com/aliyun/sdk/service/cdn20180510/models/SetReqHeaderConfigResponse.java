// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetReqHeaderConfigResponse} extends {@link TeaModel}
 *
 * <p>SetReqHeaderConfigResponse</p>
 */
public class SetReqHeaderConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetReqHeaderConfigResponseBody body;

    private SetReqHeaderConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetReqHeaderConfigResponse create() {
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
    public SetReqHeaderConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetReqHeaderConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetReqHeaderConfigResponseBody body);

        @Override
        SetReqHeaderConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetReqHeaderConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetReqHeaderConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetReqHeaderConfigResponse response) {
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
        public Builder body(SetReqHeaderConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetReqHeaderConfigResponse build() {
            return new SetReqHeaderConfigResponse(this);
        } 

    } 

}
