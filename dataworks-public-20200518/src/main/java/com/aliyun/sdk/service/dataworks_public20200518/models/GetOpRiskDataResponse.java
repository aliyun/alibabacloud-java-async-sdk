// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpRiskDataResponse} extends {@link TeaModel}
 *
 * <p>GetOpRiskDataResponse</p>
 */
public class GetOpRiskDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOpRiskDataResponseBody body;

    private GetOpRiskDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOpRiskDataResponse create() {
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
    public GetOpRiskDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOpRiskDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOpRiskDataResponseBody body);

        @Override
        GetOpRiskDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOpRiskDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOpRiskDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOpRiskDataResponse response) {
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
        public Builder body(GetOpRiskDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOpRiskDataResponse build() {
            return new GetOpRiskDataResponse(this);
        } 

    } 

}
