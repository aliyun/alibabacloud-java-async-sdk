// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySolutionDeviceGroupPageResponse} extends {@link TeaModel}
 *
 * <p>QuerySolutionDeviceGroupPageResponse</p>
 */
public class QuerySolutionDeviceGroupPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySolutionDeviceGroupPageResponseBody body;

    private QuerySolutionDeviceGroupPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySolutionDeviceGroupPageResponse create() {
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
    public QuerySolutionDeviceGroupPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySolutionDeviceGroupPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySolutionDeviceGroupPageResponseBody body);

        @Override
        QuerySolutionDeviceGroupPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySolutionDeviceGroupPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySolutionDeviceGroupPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySolutionDeviceGroupPageResponse response) {
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
        public Builder body(QuerySolutionDeviceGroupPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySolutionDeviceGroupPageResponse build() {
            return new QuerySolutionDeviceGroupPageResponse(this);
        } 

    } 

}
