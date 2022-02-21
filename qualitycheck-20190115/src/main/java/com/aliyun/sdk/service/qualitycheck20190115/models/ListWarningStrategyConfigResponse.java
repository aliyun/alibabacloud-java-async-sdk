// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWarningStrategyConfigResponse} extends {@link TeaModel}
 *
 * <p>ListWarningStrategyConfigResponse</p>
 */
public class ListWarningStrategyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWarningStrategyConfigResponseBody body;

    private ListWarningStrategyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWarningStrategyConfigResponse create() {
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
    public ListWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWarningStrategyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWarningStrategyConfigResponseBody body);

        @Override
        ListWarningStrategyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWarningStrategyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWarningStrategyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWarningStrategyConfigResponse response) {
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
        public Builder body(ListWarningStrategyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWarningStrategyConfigResponse build() {
            return new ListWarningStrategyConfigResponse(this);
        } 

    } 

}
