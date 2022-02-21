// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartReleaseContentResponse} extends {@link TeaModel}
 *
 * <p>GetChartReleaseContentResponse</p>
 */
public class GetChartReleaseContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChartReleaseContentResponseBody body;

    private GetChartReleaseContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChartReleaseContentResponse create() {
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
    public GetChartReleaseContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChartReleaseContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChartReleaseContentResponseBody body);

        @Override
        GetChartReleaseContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChartReleaseContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChartReleaseContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChartReleaseContentResponse response) {
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
        public Builder body(GetChartReleaseContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChartReleaseContentResponse build() {
            return new GetChartReleaseContentResponse(this);
        } 

    } 

}
