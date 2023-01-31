// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyNumberDistrictInfoParsingResultResponse} extends {@link TeaModel}
 *
 * <p>ApplyNumberDistrictInfoParsingResultResponse</p>
 */
public class ApplyNumberDistrictInfoParsingResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyNumberDistrictInfoParsingResultResponseBody body;

    private ApplyNumberDistrictInfoParsingResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyNumberDistrictInfoParsingResultResponse create() {
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
    public ApplyNumberDistrictInfoParsingResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyNumberDistrictInfoParsingResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyNumberDistrictInfoParsingResultResponseBody body);

        @Override
        ApplyNumberDistrictInfoParsingResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyNumberDistrictInfoParsingResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyNumberDistrictInfoParsingResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyNumberDistrictInfoParsingResultResponse response) {
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
        public Builder body(ApplyNumberDistrictInfoParsingResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyNumberDistrictInfoParsingResultResponse build() {
            return new ApplyNumberDistrictInfoParsingResultResponse(this);
        } 

    } 

}
