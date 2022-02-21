// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>GetEmonMonitorDataResponse</p>
 */
public class GetEmonMonitorDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEmonMonitorDataResponseBody body;

    private GetEmonMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEmonMonitorDataResponse create() {
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
    public GetEmonMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmonMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEmonMonitorDataResponseBody body);

        @Override
        GetEmonMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmonMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEmonMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmonMonitorDataResponse response) {
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
        public Builder body(GetEmonMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmonMonitorDataResponse build() {
            return new GetEmonMonitorDataResponse(this);
        } 

    } 

}
