// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelTaskResponse</p>
 */
public class CancelTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Task body;

    private CancelTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelTaskResponse create() {
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
    public Task getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Task body);

        @Override
        CancelTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Task body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelTaskResponse response) {
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
        public Builder body(Task body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelTaskResponse build() {
            return new CancelTaskResponse(this);
        } 

    } 

}
