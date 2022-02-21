// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentSubtotalResponse} extends {@link TeaModel}
 *
 * <p>CreateIncidentSubtotalResponse</p>
 */
public class CreateIncidentSubtotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIncidentSubtotalResponseBody body;

    private CreateIncidentSubtotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIncidentSubtotalResponse create() {
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
    public CreateIncidentSubtotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIncidentSubtotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIncidentSubtotalResponseBody body);

        @Override
        CreateIncidentSubtotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIncidentSubtotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIncidentSubtotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIncidentSubtotalResponse response) {
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
        public Builder body(CreateIncidentSubtotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIncidentSubtotalResponse build() {
            return new CreateIncidentSubtotalResponse(this);
        } 

    } 

}
