// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiscardEditingContactFlowResponse} extends {@link TeaModel}
 *
 * <p>DiscardEditingContactFlowResponse</p>
 */
public class DiscardEditingContactFlowResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DiscardEditingContactFlowResponseBody body;

    private DiscardEditingContactFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DiscardEditingContactFlowResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DiscardEditingContactFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DiscardEditingContactFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DiscardEditingContactFlowResponseBody body);

        @Override
        DiscardEditingContactFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DiscardEditingContactFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DiscardEditingContactFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DiscardEditingContactFlowResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DiscardEditingContactFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DiscardEditingContactFlowResponse build() {
            return new DiscardEditingContactFlowResponse(this);
        } 

    } 

}
