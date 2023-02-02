// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsRegionListResponse} extends {@link TeaModel}
 *
 * <p>OnsRegionListResponse</p>
 */
public class OnsRegionListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsRegionListResponseBody body;

    private OnsRegionListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsRegionListResponse create() {
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
    public OnsRegionListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsRegionListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsRegionListResponseBody body);

        @Override
        OnsRegionListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsRegionListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsRegionListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsRegionListResponse response) {
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
        public Builder body(OnsRegionListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsRegionListResponse build() {
            return new OnsRegionListResponse(this);
        } 

    } 

}
