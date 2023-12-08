// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckModifyConfigNeedRestartResponse} extends {@link TeaModel}
 *
 * <p>CheckModifyConfigNeedRestartResponse</p>
 */
public class CheckModifyConfigNeedRestartResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckModifyConfigNeedRestartResponseBody body;

    private CheckModifyConfigNeedRestartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckModifyConfigNeedRestartResponse create() {
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
    public CheckModifyConfigNeedRestartResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckModifyConfigNeedRestartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckModifyConfigNeedRestartResponseBody body);

        @Override
        CheckModifyConfigNeedRestartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckModifyConfigNeedRestartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckModifyConfigNeedRestartResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckModifyConfigNeedRestartResponse response) {
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
        public Builder body(CheckModifyConfigNeedRestartResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckModifyConfigNeedRestartResponse build() {
            return new CheckModifyConfigNeedRestartResponse(this);
        } 

    } 

}
