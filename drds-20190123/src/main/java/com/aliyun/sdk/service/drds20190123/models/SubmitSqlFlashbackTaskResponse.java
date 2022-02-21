// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSqlFlashbackTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitSqlFlashbackTaskResponse</p>
 */
public class SubmitSqlFlashbackTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSqlFlashbackTaskResponseBody body;

    private SubmitSqlFlashbackTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSqlFlashbackTaskResponse create() {
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
    public SubmitSqlFlashbackTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSqlFlashbackTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSqlFlashbackTaskResponseBody body);

        @Override
        SubmitSqlFlashbackTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSqlFlashbackTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSqlFlashbackTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSqlFlashbackTaskResponse response) {
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
        public Builder body(SubmitSqlFlashbackTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSqlFlashbackTaskResponse build() {
            return new SubmitSqlFlashbackTaskResponse(this);
        } 

    } 

}
