// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotAttackStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetHoneypotAttackStatisticsResponse</p>
 */
public class GetHoneypotAttackStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHoneypotAttackStatisticsResponseBody body;

    private GetHoneypotAttackStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHoneypotAttackStatisticsResponse create() {
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
    public GetHoneypotAttackStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHoneypotAttackStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHoneypotAttackStatisticsResponseBody body);

        @Override
        GetHoneypotAttackStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHoneypotAttackStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHoneypotAttackStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHoneypotAttackStatisticsResponse response) {
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
        public Builder body(GetHoneypotAttackStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHoneypotAttackStatisticsResponse build() {
            return new GetHoneypotAttackStatisticsResponse(this);
        } 

    } 

}
