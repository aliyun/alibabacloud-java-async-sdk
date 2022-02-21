// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentResponse} extends {@link TeaModel}
 *
 * <p>GetIncidentResponse</p>
 */
public class GetIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIncidentResponseBody body;

    private GetIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIncidentResponse create() {
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
    public GetIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIncidentResponseBody body);

        @Override
        GetIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIncidentResponse response) {
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
        public Builder body(GetIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIncidentResponse build() {
            return new GetIncidentResponse(this);
        } 

    } 

}
