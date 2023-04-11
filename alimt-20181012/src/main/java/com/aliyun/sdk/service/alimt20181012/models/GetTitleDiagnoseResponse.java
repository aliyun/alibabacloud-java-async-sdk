// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTitleDiagnoseResponse} extends {@link TeaModel}
 *
 * <p>GetTitleDiagnoseResponse</p>
 */
public class GetTitleDiagnoseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTitleDiagnoseResponseBody body;

    private GetTitleDiagnoseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTitleDiagnoseResponse create() {
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
    public GetTitleDiagnoseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTitleDiagnoseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTitleDiagnoseResponseBody body);

        @Override
        GetTitleDiagnoseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTitleDiagnoseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTitleDiagnoseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTitleDiagnoseResponse response) {
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
        public Builder body(GetTitleDiagnoseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTitleDiagnoseResponse build() {
            return new GetTitleDiagnoseResponse(this);
        } 

    } 

}
