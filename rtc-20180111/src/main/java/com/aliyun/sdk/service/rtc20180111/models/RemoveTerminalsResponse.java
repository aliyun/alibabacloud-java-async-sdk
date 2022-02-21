// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTerminalsResponse} extends {@link TeaModel}
 *
 * <p>RemoveTerminalsResponse</p>
 */
public class RemoveTerminalsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTerminalsResponseBody body;

    private RemoveTerminalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTerminalsResponse create() {
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
    public RemoveTerminalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTerminalsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTerminalsResponseBody body);

        @Override
        RemoveTerminalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTerminalsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTerminalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTerminalsResponse response) {
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
        public Builder body(RemoveTerminalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTerminalsResponse build() {
            return new RemoveTerminalsResponse(this);
        } 

    } 

}
