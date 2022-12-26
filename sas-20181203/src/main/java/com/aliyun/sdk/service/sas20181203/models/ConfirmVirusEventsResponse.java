// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmVirusEventsResponse} extends {@link TeaModel}
 *
 * <p>ConfirmVirusEventsResponse</p>
 */
public class ConfirmVirusEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmVirusEventsResponseBody body;

    private ConfirmVirusEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmVirusEventsResponse create() {
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
    public ConfirmVirusEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmVirusEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmVirusEventsResponseBody body);

        @Override
        ConfirmVirusEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmVirusEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmVirusEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmVirusEventsResponse response) {
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
        public Builder body(ConfirmVirusEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmVirusEventsResponse build() {
            return new ConfirmVirusEventsResponse(this);
        } 

    } 

}
