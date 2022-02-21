// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DropProjectResponse} extends {@link TeaModel}
 *
 * <p>DropProjectResponse</p>
 */
public class DropProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DropProjectResponseBody body;

    private DropProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DropProjectResponse create() {
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
    public DropProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DropProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DropProjectResponseBody body);

        @Override
        DropProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DropProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DropProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DropProjectResponse response) {
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
        public Builder body(DropProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DropProjectResponse build() {
            return new DropProjectResponse(this);
        } 

    } 

}
