// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindNodeLabelResponse} extends {@link TeaModel}
 *
 * <p>BindNodeLabelResponse</p>
 */
public class BindNodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindNodeLabelResponseBody body;

    private BindNodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindNodeLabelResponse create() {
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
    public BindNodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindNodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindNodeLabelResponseBody body);

        @Override
        BindNodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindNodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindNodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindNodeLabelResponse response) {
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
        public Builder body(BindNodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindNodeLabelResponse build() {
            return new BindNodeLabelResponse(this);
        } 

    } 

}
