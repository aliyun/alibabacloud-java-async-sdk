// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnDDoSInfoResponse} extends {@link TeaModel}
 *
 * <p>SetScdnDDoSInfoResponse</p>
 */
public class SetScdnDDoSInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetScdnDDoSInfoResponseBody body;

    private SetScdnDDoSInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetScdnDDoSInfoResponse create() {
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
    public SetScdnDDoSInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetScdnDDoSInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetScdnDDoSInfoResponseBody body);

        @Override
        SetScdnDDoSInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetScdnDDoSInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetScdnDDoSInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetScdnDDoSInfoResponse response) {
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
        public Builder body(SetScdnDDoSInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetScdnDDoSInfoResponse build() {
            return new SetScdnDDoSInfoResponse(this);
        } 

    } 

}
