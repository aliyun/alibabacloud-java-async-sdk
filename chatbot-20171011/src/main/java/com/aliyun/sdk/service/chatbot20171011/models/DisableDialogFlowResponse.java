// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDialogFlowResponse} extends {@link TeaModel}
 *
 * <p>DisableDialogFlowResponse</p>
 */
public class DisableDialogFlowResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DisableDialogFlowResponseBody body;

    private DisableDialogFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DisableDialogFlowResponse create() {
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
    public DisableDialogFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDialogFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DisableDialogFlowResponseBody body);

        @Override
        DisableDialogFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDialogFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DisableDialogFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDialogFlowResponse response) {
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
        public Builder body(DisableDialogFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDialogFlowResponse build() {
            return new DisableDialogFlowResponse(this);
        } 

    } 

}
