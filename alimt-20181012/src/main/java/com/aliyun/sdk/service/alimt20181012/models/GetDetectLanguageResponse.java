// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDetectLanguageResponse} extends {@link TeaModel}
 *
 * <p>GetDetectLanguageResponse</p>
 */
public class GetDetectLanguageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDetectLanguageResponseBody body;

    private GetDetectLanguageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDetectLanguageResponse create() {
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
    public GetDetectLanguageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDetectLanguageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDetectLanguageResponseBody body);

        @Override
        GetDetectLanguageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDetectLanguageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDetectLanguageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDetectLanguageResponse response) {
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
        public Builder body(GetDetectLanguageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDetectLanguageResponse build() {
            return new GetDetectLanguageResponse(this);
        } 

    } 

}
