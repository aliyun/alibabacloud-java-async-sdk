// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaScheduleResponse} extends {@link TeaModel}
 *
 * <p>GetQuotaScheduleResponse</p>
 */
public class GetQuotaScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQuotaScheduleResponseBody body;

    private GetQuotaScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQuotaScheduleResponse create() {
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
    public GetQuotaScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQuotaScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQuotaScheduleResponseBody body);

        @Override
        GetQuotaScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQuotaScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQuotaScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQuotaScheduleResponse response) {
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
        public Builder body(GetQuotaScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQuotaScheduleResponse build() {
            return new GetQuotaScheduleResponse(this);
        } 

    } 

}
