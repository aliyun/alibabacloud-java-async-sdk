// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetDashboardResponse} extends {@link TeaModel}
 *
 * <p>GetDashboardResponse</p>
 */
public class GetDashboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Dashboard body;

    private GetDashboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDashboardResponse create() {
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
    public Dashboard getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDashboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Dashboard body);

        @Override
        GetDashboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDashboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Dashboard body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDashboardResponse response) {
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
        public Builder body(Dashboard body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDashboardResponse build() {
            return new GetDashboardResponse(this);
        } 

    } 

}
