// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcCompetitorsResponse} extends {@link TeaModel}
 *
 * <p>GetOcCompetitorsResponse</p>
 */
public class GetOcCompetitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcCompetitorsResponseBody body;

    private GetOcCompetitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcCompetitorsResponse create() {
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
    public GetOcCompetitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcCompetitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcCompetitorsResponseBody body);

        @Override
        GetOcCompetitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcCompetitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcCompetitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcCompetitorsResponse response) {
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
        public Builder body(GetOcCompetitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcCompetitorsResponse build() {
            return new GetOcCompetitorsResponse(this);
        } 

    } 

}
