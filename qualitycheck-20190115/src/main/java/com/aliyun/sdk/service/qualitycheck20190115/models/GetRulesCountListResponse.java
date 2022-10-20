// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRulesCountListResponse} extends {@link TeaModel}
 *
 * <p>GetRulesCountListResponse</p>
 */
public class GetRulesCountListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRulesCountListResponseBody body;

    private GetRulesCountListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRulesCountListResponse create() {
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
    public GetRulesCountListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRulesCountListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRulesCountListResponseBody body);

        @Override
        GetRulesCountListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRulesCountListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRulesCountListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRulesCountListResponse response) {
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
        public Builder body(GetRulesCountListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRulesCountListResponse build() {
            return new GetRulesCountListResponse(this);
        } 

    } 

}
