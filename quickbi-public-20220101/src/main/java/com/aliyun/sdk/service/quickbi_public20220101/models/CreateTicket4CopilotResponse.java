// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTicket4CopilotResponse} extends {@link TeaModel}
 *
 * <p>CreateTicket4CopilotResponse</p>
 */
public class CreateTicket4CopilotResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateTicket4CopilotResponseBody body;

    private CreateTicket4CopilotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateTicket4CopilotResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public CreateTicket4CopilotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTicket4CopilotResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateTicket4CopilotResponseBody body);

        @Override
        CreateTicket4CopilotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTicket4CopilotResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateTicket4CopilotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTicket4CopilotResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(CreateTicket4CopilotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTicket4CopilotResponse build() {
            return new CreateTicket4CopilotResponse(this);
        } 

    } 

}
