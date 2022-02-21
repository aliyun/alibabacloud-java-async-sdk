// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateTicketResponse} extends {@link TeaModel}
 *
 * <p>EvaluateTicketResponse</p>
 */
public class EvaluateTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EvaluateTicketResponseBody body;

    private EvaluateTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EvaluateTicketResponse create() {
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
    public EvaluateTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EvaluateTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EvaluateTicketResponseBody body);

        @Override
        EvaluateTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EvaluateTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EvaluateTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EvaluateTicketResponse response) {
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
        public Builder body(EvaluateTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EvaluateTicketResponse build() {
            return new EvaluateTicketResponse(this);
        } 

    } 

}
