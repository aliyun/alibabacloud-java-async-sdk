// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSchedulerInfoResponse} extends {@link TeaModel}
 *
 * <p>GetSchedulerInfoResponse</p>
 */
public class GetSchedulerInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSchedulerInfoResponseBody body;

    private GetSchedulerInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSchedulerInfoResponse create() {
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
    public GetSchedulerInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSchedulerInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSchedulerInfoResponseBody body);

        @Override
        GetSchedulerInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSchedulerInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSchedulerInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSchedulerInfoResponse response) {
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
        public Builder body(GetSchedulerInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSchedulerInfoResponse build() {
            return new GetSchedulerInfoResponse(this);
        } 

    } 

}
