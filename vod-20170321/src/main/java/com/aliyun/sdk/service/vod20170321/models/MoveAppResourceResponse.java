// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAppResourceResponse} extends {@link TeaModel}
 *
 * <p>MoveAppResourceResponse</p>
 */
public class MoveAppResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveAppResourceResponseBody body;

    private MoveAppResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveAppResourceResponse create() {
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
    public MoveAppResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveAppResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveAppResourceResponseBody body);

        @Override
        MoveAppResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveAppResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveAppResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveAppResourceResponse response) {
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
        public Builder body(MoveAppResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveAppResourceResponse build() {
            return new MoveAppResourceResponse(this);
        } 

    } 

}
