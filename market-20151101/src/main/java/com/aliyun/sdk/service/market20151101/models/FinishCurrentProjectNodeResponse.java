// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishCurrentProjectNodeResponse} extends {@link TeaModel}
 *
 * <p>FinishCurrentProjectNodeResponse</p>
 */
public class FinishCurrentProjectNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FinishCurrentProjectNodeResponseBody body;

    private FinishCurrentProjectNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FinishCurrentProjectNodeResponse create() {
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
    public FinishCurrentProjectNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FinishCurrentProjectNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FinishCurrentProjectNodeResponseBody body);

        @Override
        FinishCurrentProjectNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FinishCurrentProjectNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FinishCurrentProjectNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FinishCurrentProjectNodeResponse response) {
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
        public Builder body(FinishCurrentProjectNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FinishCurrentProjectNodeResponse build() {
            return new FinishCurrentProjectNodeResponse(this);
        } 

    } 

}
