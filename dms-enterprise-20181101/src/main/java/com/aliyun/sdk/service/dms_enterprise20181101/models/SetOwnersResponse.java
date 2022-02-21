// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOwnersResponse} extends {@link TeaModel}
 *
 * <p>SetOwnersResponse</p>
 */
public class SetOwnersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetOwnersResponseBody body;

    private SetOwnersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetOwnersResponse create() {
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
    public SetOwnersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetOwnersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetOwnersResponseBody body);

        @Override
        SetOwnersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetOwnersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetOwnersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetOwnersResponse response) {
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
        public Builder body(SetOwnersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetOwnersResponse build() {
            return new SetOwnersResponse(this);
        } 

    } 

}
