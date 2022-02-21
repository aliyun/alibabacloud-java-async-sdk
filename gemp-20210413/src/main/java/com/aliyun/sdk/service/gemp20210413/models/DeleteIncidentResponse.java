// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIncidentResponse} extends {@link TeaModel}
 *
 * <p>DeleteIncidentResponse</p>
 */
public class DeleteIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIncidentResponseBody body;

    private DeleteIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIncidentResponse create() {
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
    public DeleteIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIncidentResponseBody body);

        @Override
        DeleteIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIncidentResponse response) {
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
        public Builder body(DeleteIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIncidentResponse build() {
            return new DeleteIncidentResponse(this);
        } 

    } 

}
