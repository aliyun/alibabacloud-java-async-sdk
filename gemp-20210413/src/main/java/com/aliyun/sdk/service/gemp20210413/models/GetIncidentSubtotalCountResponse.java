// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentSubtotalCountResponse} extends {@link TeaModel}
 *
 * <p>GetIncidentSubtotalCountResponse</p>
 */
public class GetIncidentSubtotalCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIncidentSubtotalCountResponseBody body;

    private GetIncidentSubtotalCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIncidentSubtotalCountResponse create() {
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
    public GetIncidentSubtotalCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIncidentSubtotalCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIncidentSubtotalCountResponseBody body);

        @Override
        GetIncidentSubtotalCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIncidentSubtotalCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIncidentSubtotalCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIncidentSubtotalCountResponse response) {
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
        public Builder body(GetIncidentSubtotalCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIncidentSubtotalCountResponse build() {
            return new GetIncidentSubtotalCountResponse(this);
        } 

    } 

}
