// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageScanNumInPeriodResponse} extends {@link TeaModel}
 *
 * <p>GetImageScanNumInPeriodResponse</p>
 */
public class GetImageScanNumInPeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageScanNumInPeriodResponseBody body;

    private GetImageScanNumInPeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageScanNumInPeriodResponse create() {
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
    public GetImageScanNumInPeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageScanNumInPeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageScanNumInPeriodResponseBody body);

        @Override
        GetImageScanNumInPeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageScanNumInPeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageScanNumInPeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageScanNumInPeriodResponse response) {
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
        public Builder body(GetImageScanNumInPeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageScanNumInPeriodResponse build() {
            return new GetImageScanNumInPeriodResponse(this);
        } 

    } 

}
