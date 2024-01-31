// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCheckCreateOrderForDeleteDBNodesResponse} extends {@link TeaModel}
 *
 * <p>PreCheckCreateOrderForDeleteDBNodesResponse</p>
 */
public class PreCheckCreateOrderForDeleteDBNodesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PreCheckCreateOrderForDeleteDBNodesResponseBody body;

    private PreCheckCreateOrderForDeleteDBNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PreCheckCreateOrderForDeleteDBNodesResponse create() {
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
    public PreCheckCreateOrderForDeleteDBNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreCheckCreateOrderForDeleteDBNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PreCheckCreateOrderForDeleteDBNodesResponseBody body);

        @Override
        PreCheckCreateOrderForDeleteDBNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreCheckCreateOrderForDeleteDBNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PreCheckCreateOrderForDeleteDBNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreCheckCreateOrderForDeleteDBNodesResponse response) {
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
        public Builder body(PreCheckCreateOrderForDeleteDBNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreCheckCreateOrderForDeleteDBNodesResponse build() {
            return new PreCheckCreateOrderForDeleteDBNodesResponse(this);
        } 

    } 

}
