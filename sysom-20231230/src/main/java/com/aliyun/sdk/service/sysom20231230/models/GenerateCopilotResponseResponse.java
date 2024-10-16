// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateCopilotResponseResponse} extends {@link TeaModel}
 *
 * <p>GenerateCopilotResponseResponse</p>
 */
public class GenerateCopilotResponseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GenerateCopilotResponseResponseBody body;

    private GenerateCopilotResponseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateCopilotResponseResponse create() {
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
    public GenerateCopilotResponseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateCopilotResponseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateCopilotResponseResponseBody body);

        @Override
        GenerateCopilotResponseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateCopilotResponseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GenerateCopilotResponseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateCopilotResponseResponse response) {
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
        public Builder body(GenerateCopilotResponseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateCopilotResponseResponse build() {
            return new GenerateCopilotResponseResponse(this);
        } 

    } 

}
