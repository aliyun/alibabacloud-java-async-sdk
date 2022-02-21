// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonGrafanaAlertsResponse} extends {@link TeaModel}
 *
 * <p>GetEmonGrafanaAlertsResponse</p>
 */
public class GetEmonGrafanaAlertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEmonGrafanaAlertsResponseBody body;

    private GetEmonGrafanaAlertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEmonGrafanaAlertsResponse create() {
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
    public GetEmonGrafanaAlertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmonGrafanaAlertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEmonGrafanaAlertsResponseBody body);

        @Override
        GetEmonGrafanaAlertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmonGrafanaAlertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEmonGrafanaAlertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmonGrafanaAlertsResponse response) {
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
        public Builder body(GetEmonGrafanaAlertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmonGrafanaAlertsResponse build() {
            return new GetEmonGrafanaAlertsResponse(this);
        } 

    } 

}
