// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHdfsCapacityStatisticInfoResponse} extends {@link TeaModel}
 *
 * <p>GetHdfsCapacityStatisticInfoResponse</p>
 */
public class GetHdfsCapacityStatisticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHdfsCapacityStatisticInfoResponseBody body;

    private GetHdfsCapacityStatisticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHdfsCapacityStatisticInfoResponse create() {
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
    public GetHdfsCapacityStatisticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHdfsCapacityStatisticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHdfsCapacityStatisticInfoResponseBody body);

        @Override
        GetHdfsCapacityStatisticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHdfsCapacityStatisticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHdfsCapacityStatisticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHdfsCapacityStatisticInfoResponse response) {
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
        public Builder body(GetHdfsCapacityStatisticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHdfsCapacityStatisticInfoResponse build() {
            return new GetHdfsCapacityStatisticInfoResponse(this);
        } 

    } 

}
