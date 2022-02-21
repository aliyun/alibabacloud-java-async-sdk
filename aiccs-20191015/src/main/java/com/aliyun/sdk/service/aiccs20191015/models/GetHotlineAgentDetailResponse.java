// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineAgentDetailResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineAgentDetailResponse</p>
 */
public class GetHotlineAgentDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineAgentDetailResponseBody body;

    private GetHotlineAgentDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineAgentDetailResponse create() {
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
    public GetHotlineAgentDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineAgentDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineAgentDetailResponseBody body);

        @Override
        GetHotlineAgentDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineAgentDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineAgentDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineAgentDetailResponse response) {
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
        public Builder body(GetHotlineAgentDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineAgentDetailResponse build() {
            return new GetHotlineAgentDetailResponse(this);
        } 

    } 

}
