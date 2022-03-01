// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueCreateStackResponse} extends {@link TeaModel}
 *
 * <p>ContinueCreateStackResponse</p>
 */
public class ContinueCreateStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinueCreateStackResponseBody body;

    private ContinueCreateStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinueCreateStackResponse create() {
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
    public ContinueCreateStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinueCreateStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinueCreateStackResponseBody body);

        @Override
        ContinueCreateStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinueCreateStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinueCreateStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinueCreateStackResponse response) {
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
        public Builder body(ContinueCreateStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinueCreateStackResponse build() {
            return new ContinueCreateStackResponse(this);
        } 

    } 

}
