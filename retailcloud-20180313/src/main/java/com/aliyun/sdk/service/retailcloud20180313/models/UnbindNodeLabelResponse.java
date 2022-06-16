// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindNodeLabelResponse} extends {@link TeaModel}
 *
 * <p>UnbindNodeLabelResponse</p>
 */
public class UnbindNodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindNodeLabelResponseBody body;

    private UnbindNodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindNodeLabelResponse create() {
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
    public UnbindNodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindNodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindNodeLabelResponseBody body);

        @Override
        UnbindNodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindNodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindNodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindNodeLabelResponse response) {
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
        public Builder body(UnbindNodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindNodeLabelResponse build() {
            return new UnbindNodeLabelResponse(this);
        } 

    } 

}
