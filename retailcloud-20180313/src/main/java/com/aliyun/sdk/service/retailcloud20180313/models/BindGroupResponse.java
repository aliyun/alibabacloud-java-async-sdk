// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindGroupResponse} extends {@link TeaModel}
 *
 * <p>BindGroupResponse</p>
 */
public class BindGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindGroupResponseBody body;

    private BindGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindGroupResponse create() {
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
    public BindGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindGroupResponseBody body);

        @Override
        BindGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindGroupResponse response) {
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
        public Builder body(BindGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindGroupResponse build() {
            return new BindGroupResponse(this);
        } 

    } 

}
