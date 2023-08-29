// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwitchRegionDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSwitchRegionDetailResponse</p>
 */
public class GetSwitchRegionDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSwitchRegionDetailResponseBody body;

    private GetSwitchRegionDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSwitchRegionDetailResponse create() {
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
    public GetSwitchRegionDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSwitchRegionDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSwitchRegionDetailResponseBody body);

        @Override
        GetSwitchRegionDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSwitchRegionDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSwitchRegionDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSwitchRegionDetailResponse response) {
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
        public Builder body(GetSwitchRegionDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSwitchRegionDetailResponse build() {
            return new GetSwitchRegionDetailResponse(this);
        } 

    } 

}
