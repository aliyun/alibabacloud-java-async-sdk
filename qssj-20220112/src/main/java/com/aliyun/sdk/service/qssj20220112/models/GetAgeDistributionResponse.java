// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgeDistributionResponse} extends {@link TeaModel}
 *
 * <p>GetAgeDistributionResponse</p>
 */
public class GetAgeDistributionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgeDistributionResponseBody body;

    private GetAgeDistributionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgeDistributionResponse create() {
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
    public GetAgeDistributionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgeDistributionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgeDistributionResponseBody body);

        @Override
        GetAgeDistributionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgeDistributionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgeDistributionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgeDistributionResponse response) {
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
        public Builder body(GetAgeDistributionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgeDistributionResponse build() {
            return new GetAgeDistributionResponse(this);
        } 

    } 

}
