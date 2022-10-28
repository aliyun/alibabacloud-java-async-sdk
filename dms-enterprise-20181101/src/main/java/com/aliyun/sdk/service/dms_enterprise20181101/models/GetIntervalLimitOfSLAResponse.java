// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntervalLimitOfSLAResponse} extends {@link TeaModel}
 *
 * <p>GetIntervalLimitOfSLAResponse</p>
 */
public class GetIntervalLimitOfSLAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIntervalLimitOfSLAResponseBody body;

    private GetIntervalLimitOfSLAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIntervalLimitOfSLAResponse create() {
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
    public GetIntervalLimitOfSLAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIntervalLimitOfSLAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIntervalLimitOfSLAResponseBody body);

        @Override
        GetIntervalLimitOfSLAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIntervalLimitOfSLAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIntervalLimitOfSLAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIntervalLimitOfSLAResponse response) {
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
        public Builder body(GetIntervalLimitOfSLAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIntervalLimitOfSLAResponse build() {
            return new GetIntervalLimitOfSLAResponse(this);
        } 

    } 

}
