// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryDataCountResponse} extends {@link TeaModel}
 *
 * <p>GetHistoryDataCountResponse</p>
 */
public class GetHistoryDataCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoryDataCountResponseBody body;

    private GetHistoryDataCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistoryDataCountResponse create() {
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
    public GetHistoryDataCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoryDataCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoryDataCountResponseBody body);

        @Override
        GetHistoryDataCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoryDataCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoryDataCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoryDataCountResponse response) {
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
        public Builder body(GetHistoryDataCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoryDataCountResponse build() {
            return new GetHistoryDataCountResponse(this);
        } 

    } 

}
