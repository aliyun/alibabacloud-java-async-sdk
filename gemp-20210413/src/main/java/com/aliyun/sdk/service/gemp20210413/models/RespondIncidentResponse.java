// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RespondIncidentResponse} extends {@link TeaModel}
 *
 * <p>RespondIncidentResponse</p>
 */
public class RespondIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RespondIncidentResponseBody body;

    private RespondIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RespondIncidentResponse create() {
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
    public RespondIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RespondIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RespondIncidentResponseBody body);

        @Override
        RespondIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RespondIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RespondIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RespondIncidentResponse response) {
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
        public Builder body(RespondIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RespondIncidentResponse build() {
            return new RespondIncidentResponse(this);
        } 

    } 

}
