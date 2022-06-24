// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateByAppForRegionResponse} extends {@link TeaModel}
 *
 * <p>SdkGenerateByAppForRegionResponse</p>
 */
public class SdkGenerateByAppForRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkGenerateByAppForRegionResponseBody body;

    private SdkGenerateByAppForRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkGenerateByAppForRegionResponse create() {
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
    public SdkGenerateByAppForRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkGenerateByAppForRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkGenerateByAppForRegionResponseBody body);

        @Override
        SdkGenerateByAppForRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkGenerateByAppForRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkGenerateByAppForRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkGenerateByAppForRegionResponse response) {
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
        public Builder body(SdkGenerateByAppForRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkGenerateByAppForRegionResponse build() {
            return new SdkGenerateByAppForRegionResponse(this);
        } 

    } 

}
