// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentResponse} extends {@link TeaModel}
 *
 * <p>CreateIncidentResponse</p>
 */
public class CreateIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIncidentResponseBody body;

    private CreateIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIncidentResponse create() {
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
    public CreateIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIncidentResponseBody body);

        @Override
        CreateIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIncidentResponse response) {
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
        public Builder body(CreateIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIncidentResponse build() {
            return new CreateIncidentResponse(this);
        } 

    } 

}
