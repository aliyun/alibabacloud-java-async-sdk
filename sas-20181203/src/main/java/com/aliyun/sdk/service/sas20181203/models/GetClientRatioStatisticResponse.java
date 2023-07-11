// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientRatioStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetClientRatioStatisticResponse</p>
 */
public class GetClientRatioStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClientRatioStatisticResponseBody body;

    private GetClientRatioStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClientRatioStatisticResponse create() {
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
    public GetClientRatioStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClientRatioStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClientRatioStatisticResponseBody body);

        @Override
        GetClientRatioStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClientRatioStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClientRatioStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClientRatioStatisticResponse response) {
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
        public Builder body(GetClientRatioStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClientRatioStatisticResponse build() {
            return new GetClientRatioStatisticResponse(this);
        } 

    } 

}
