// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetHoneypotStatisticsResponse</p>
 */
public class GetHoneypotStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHoneypotStatisticsResponseBody body;

    private GetHoneypotStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHoneypotStatisticsResponse create() {
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
    public GetHoneypotStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHoneypotStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHoneypotStatisticsResponseBody body);

        @Override
        GetHoneypotStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHoneypotStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHoneypotStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHoneypotStatisticsResponse response) {
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
        public Builder body(GetHoneypotStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHoneypotStatisticsResponse build() {
            return new GetHoneypotStatisticsResponse(this);
        } 

    } 

}
