// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishIncidentResponse} extends {@link TeaModel}
 *
 * <p>FinishIncidentResponse</p>
 */
public class FinishIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FinishIncidentResponseBody body;

    private FinishIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FinishIncidentResponse create() {
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
    public FinishIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FinishIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FinishIncidentResponseBody body);

        @Override
        FinishIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FinishIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FinishIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FinishIncidentResponse response) {
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
        public Builder body(FinishIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FinishIncidentResponse build() {
            return new FinishIncidentResponse(this);
        } 

    } 

}
