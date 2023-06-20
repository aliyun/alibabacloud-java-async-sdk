// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackCurrentProjectNodeResponse} extends {@link TeaModel}
 *
 * <p>RollbackCurrentProjectNodeResponse</p>
 */
public class RollbackCurrentProjectNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackCurrentProjectNodeResponseBody body;

    private RollbackCurrentProjectNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackCurrentProjectNodeResponse create() {
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
    public RollbackCurrentProjectNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackCurrentProjectNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackCurrentProjectNodeResponseBody body);

        @Override
        RollbackCurrentProjectNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackCurrentProjectNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackCurrentProjectNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackCurrentProjectNodeResponse response) {
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
        public Builder body(RollbackCurrentProjectNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackCurrentProjectNodeResponse build() {
            return new RollbackCurrentProjectNodeResponse(this);
        } 

    } 

}
