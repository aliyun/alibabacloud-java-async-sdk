// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPropertyScheduleConfigResponse} extends {@link TeaModel}
 *
 * <p>GetPropertyScheduleConfigResponse</p>
 */
public class GetPropertyScheduleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPropertyScheduleConfigResponseBody body;

    private GetPropertyScheduleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPropertyScheduleConfigResponse create() {
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
    public GetPropertyScheduleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPropertyScheduleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPropertyScheduleConfigResponseBody body);

        @Override
        GetPropertyScheduleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPropertyScheduleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPropertyScheduleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPropertyScheduleConfigResponse response) {
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
        public Builder body(GetPropertyScheduleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPropertyScheduleConfigResponse build() {
            return new GetPropertyScheduleConfigResponse(this);
        } 

    } 

}
