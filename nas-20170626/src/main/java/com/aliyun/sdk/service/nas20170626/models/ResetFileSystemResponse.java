// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetFileSystemResponse} extends {@link TeaModel}
 *
 * <p>ResetFileSystemResponse</p>
 */
public class ResetFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetFileSystemResponseBody body;

    private ResetFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetFileSystemResponse create() {
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
    public ResetFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetFileSystemResponseBody body);

        @Override
        ResetFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetFileSystemResponse response) {
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
        public Builder body(ResetFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetFileSystemResponse build() {
            return new ResetFileSystemResponse(this);
        } 

    } 

}
