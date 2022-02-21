// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetResourceStatisticsResponse</p>
 */
public class GetResourceStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceStatisticsResponseBody body;

    private GetResourceStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceStatisticsResponse create() {
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
    public GetResourceStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceStatisticsResponseBody body);

        @Override
        GetResourceStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceStatisticsResponse response) {
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
        public Builder body(GetResourceStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceStatisticsResponse build() {
            return new GetResourceStatisticsResponse(this);
        } 

    } 

}
