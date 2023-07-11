// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTrailResponse} extends {@link TeaModel}
 *
 * <p>GetServiceTrailResponse</p>
 */
public class GetServiceTrailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceTrailResponseBody body;

    private GetServiceTrailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceTrailResponse create() {
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
    public GetServiceTrailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceTrailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceTrailResponseBody body);

        @Override
        GetServiceTrailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceTrailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceTrailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceTrailResponse response) {
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
        public Builder body(GetServiceTrailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceTrailResponse build() {
            return new GetServiceTrailResponse(this);
        } 

    } 

}
