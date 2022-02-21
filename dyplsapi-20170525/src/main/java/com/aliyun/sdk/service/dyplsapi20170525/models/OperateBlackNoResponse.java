// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateBlackNoResponse} extends {@link TeaModel}
 *
 * <p>OperateBlackNoResponse</p>
 */
public class OperateBlackNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateBlackNoResponseBody body;

    private OperateBlackNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateBlackNoResponse create() {
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
    public OperateBlackNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateBlackNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateBlackNoResponseBody body);

        @Override
        OperateBlackNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateBlackNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateBlackNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateBlackNoResponse response) {
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
        public Builder body(OperateBlackNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateBlackNoResponse build() {
            return new OperateBlackNoResponse(this);
        } 

    } 

}
