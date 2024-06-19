// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecContainerCommandResponse} extends {@link TeaModel}
 *
 * <p>ExecContainerCommandResponse</p>
 */
public class ExecContainerCommandResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExecContainerCommandResponseBody body;

    private ExecContainerCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExecContainerCommandResponse create() {
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
    public ExecContainerCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecContainerCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExecContainerCommandResponseBody body);

        @Override
        ExecContainerCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecContainerCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ExecContainerCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecContainerCommandResponse response) {
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
        public Builder body(ExecContainerCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecContainerCommandResponse build() {
            return new ExecContainerCommandResponse(this);
        } 

    } 

}
