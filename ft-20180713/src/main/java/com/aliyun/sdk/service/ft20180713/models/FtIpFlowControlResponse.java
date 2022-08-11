// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtIpFlowControlResponse} extends {@link TeaModel}
 *
 * <p>FtIpFlowControlResponse</p>
 */
public class FtIpFlowControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtIpFlowControlResponseBody body;

    private FtIpFlowControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtIpFlowControlResponse create() {
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
    public FtIpFlowControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtIpFlowControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtIpFlowControlResponseBody body);

        @Override
        FtIpFlowControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtIpFlowControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtIpFlowControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtIpFlowControlResponse response) {
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
        public Builder body(FtIpFlowControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtIpFlowControlResponse build() {
            return new FtIpFlowControlResponse(this);
        } 

    } 

}
