// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMseIncidentResponse} extends {@link TeaModel}
 *
 * <p>SendMseIncidentResponse</p>
 */
public class SendMseIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMseIncidentResponseBody body;

    private SendMseIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMseIncidentResponse create() {
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
    public SendMseIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMseIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMseIncidentResponseBody body);

        @Override
        SendMseIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMseIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMseIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMseIncidentResponse response) {
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
        public Builder body(SendMseIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMseIncidentResponse build() {
            return new SendMseIncidentResponse(this);
        } 

    } 

}
