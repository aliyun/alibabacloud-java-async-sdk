// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityEntityResponse} extends {@link TeaModel}
 *
 * <p>GetQualityEntityResponse</p>
 */
public class GetQualityEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityEntityResponseBody body;

    private GetQualityEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityEntityResponse create() {
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
    public GetQualityEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityEntityResponseBody body);

        @Override
        GetQualityEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityEntityResponse response) {
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
        public Builder body(GetQualityEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityEntityResponse build() {
            return new GetQualityEntityResponse(this);
        } 

    } 

}
