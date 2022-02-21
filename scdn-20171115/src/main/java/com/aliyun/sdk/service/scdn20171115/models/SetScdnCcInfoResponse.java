// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnCcInfoResponse} extends {@link TeaModel}
 *
 * <p>SetScdnCcInfoResponse</p>
 */
public class SetScdnCcInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetScdnCcInfoResponseBody body;

    private SetScdnCcInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetScdnCcInfoResponse create() {
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
    public SetScdnCcInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetScdnCcInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetScdnCcInfoResponseBody body);

        @Override
        SetScdnCcInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetScdnCcInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetScdnCcInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetScdnCcInfoResponse response) {
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
        public Builder body(SetScdnCcInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetScdnCcInfoResponse build() {
            return new SetScdnCcInfoResponse(this);
        } 

    } 

}
