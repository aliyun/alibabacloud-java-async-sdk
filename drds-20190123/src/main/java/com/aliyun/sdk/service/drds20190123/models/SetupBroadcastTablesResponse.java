// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupBroadcastTablesResponse} extends {@link TeaModel}
 *
 * <p>SetupBroadcastTablesResponse</p>
 */
public class SetupBroadcastTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetupBroadcastTablesResponseBody body;

    private SetupBroadcastTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetupBroadcastTablesResponse create() {
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
    public SetupBroadcastTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupBroadcastTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetupBroadcastTablesResponseBody body);

        @Override
        SetupBroadcastTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupBroadcastTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetupBroadcastTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupBroadcastTablesResponse response) {
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
        public Builder body(SetupBroadcastTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupBroadcastTablesResponse build() {
            return new SetupBroadcastTablesResponse(this);
        } 

    } 

}
