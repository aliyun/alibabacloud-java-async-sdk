// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetIncidentStatisticsResponse</p>
 */
public class GetIncidentStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIncidentStatisticsResponseBody body;

    private GetIncidentStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIncidentStatisticsResponse create() {
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
    public GetIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIncidentStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIncidentStatisticsResponseBody body);

        @Override
        GetIncidentStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIncidentStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIncidentStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIncidentStatisticsResponse response) {
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
        public Builder body(GetIncidentStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIncidentStatisticsResponse build() {
            return new GetIncidentStatisticsResponse(this);
        } 

    } 

}
