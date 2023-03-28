// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterLogsResponse} extends {@link TeaModel}
 *
 * <p>GetJMeterLogsResponse</p>
 */
public class GetJMeterLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJMeterLogsResponseBody body;

    private GetJMeterLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJMeterLogsResponse create() {
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
    public GetJMeterLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJMeterLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJMeterLogsResponseBody body);

        @Override
        GetJMeterLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJMeterLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJMeterLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJMeterLogsResponse response) {
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
        public Builder body(GetJMeterLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJMeterLogsResponse build() {
            return new GetJMeterLogsResponse(this);
        } 

    } 

}
