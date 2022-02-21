// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeliveryHistoryJobResponse} extends {@link TeaModel}
 *
 * <p>GetDeliveryHistoryJobResponse</p>
 */
public class GetDeliveryHistoryJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeliveryHistoryJobResponseBody body;

    private GetDeliveryHistoryJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeliveryHistoryJobResponse create() {
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
    public GetDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeliveryHistoryJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeliveryHistoryJobResponseBody body);

        @Override
        GetDeliveryHistoryJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeliveryHistoryJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeliveryHistoryJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeliveryHistoryJobResponse response) {
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
        public Builder body(GetDeliveryHistoryJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeliveryHistoryJobResponse build() {
            return new GetDeliveryHistoryJobResponse(this);
        } 

    } 

}
