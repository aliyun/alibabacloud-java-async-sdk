// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDasProServiceUsageResponse} extends {@link TeaModel}
 *
 * <p>GetDasProServiceUsageResponse</p>
 */
public class GetDasProServiceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDasProServiceUsageResponseBody body;

    private GetDasProServiceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDasProServiceUsageResponse create() {
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
    public GetDasProServiceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDasProServiceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDasProServiceUsageResponseBody body);

        @Override
        GetDasProServiceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDasProServiceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDasProServiceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDasProServiceUsageResponse response) {
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
        public Builder body(GetDasProServiceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDasProServiceUsageResponse build() {
            return new GetDasProServiceUsageResponse(this);
        } 

    } 

}
