// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQosUsageStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetQosUsageStatisticResponse</p>
 */
public class GetQosUsageStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQosUsageStatisticResponseBody body;

    private GetQosUsageStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQosUsageStatisticResponse create() {
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
    public GetQosUsageStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQosUsageStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQosUsageStatisticResponseBody body);

        @Override
        GetQosUsageStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQosUsageStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQosUsageStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQosUsageStatisticResponse response) {
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
        public Builder body(GetQosUsageStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQosUsageStatisticResponse build() {
            return new GetQosUsageStatisticResponse(this);
        } 

    } 

}
