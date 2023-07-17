// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomIncidentsResponse} extends {@link TeaModel}
 *
 * <p>SendCustomIncidentsResponse</p>
 */
public class SendCustomIncidentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCustomIncidentsResponseBody body;

    private SendCustomIncidentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCustomIncidentsResponse create() {
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
    public SendCustomIncidentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCustomIncidentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCustomIncidentsResponseBody body);

        @Override
        SendCustomIncidentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCustomIncidentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCustomIncidentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCustomIncidentsResponse response) {
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
        public Builder body(SendCustomIncidentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCustomIncidentsResponse build() {
            return new SendCustomIncidentsResponse(this);
        } 

    } 

}
