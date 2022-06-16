// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindGroupResponse} extends {@link TeaModel}
 *
 * <p>UnbindGroupResponse</p>
 */
public class UnbindGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindGroupResponseBody body;

    private UnbindGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindGroupResponse create() {
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
    public UnbindGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindGroupResponseBody body);

        @Override
        UnbindGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindGroupResponse response) {
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
        public Builder body(UnbindGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindGroupResponse build() {
            return new UnbindGroupResponse(this);
        } 

    } 

}
