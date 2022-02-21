// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceNameResponse} extends {@link TeaModel}
 *
 * <p>SetInstanceNameResponse</p>
 */
public class SetInstanceNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstanceNameResponseBody body;

    private SetInstanceNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstanceNameResponse create() {
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
    public SetInstanceNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstanceNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstanceNameResponseBody body);

        @Override
        SetInstanceNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstanceNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstanceNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstanceNameResponse response) {
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
        public Builder body(SetInstanceNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstanceNameResponse build() {
            return new SetInstanceNameResponse(this);
        } 

    } 

}
