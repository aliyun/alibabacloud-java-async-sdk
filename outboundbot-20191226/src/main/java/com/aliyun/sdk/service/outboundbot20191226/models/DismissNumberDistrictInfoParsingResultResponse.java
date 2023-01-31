// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DismissNumberDistrictInfoParsingResultResponse} extends {@link TeaModel}
 *
 * <p>DismissNumberDistrictInfoParsingResultResponse</p>
 */
public class DismissNumberDistrictInfoParsingResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DismissNumberDistrictInfoParsingResultResponseBody body;

    private DismissNumberDistrictInfoParsingResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DismissNumberDistrictInfoParsingResultResponse create() {
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
    public DismissNumberDistrictInfoParsingResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DismissNumberDistrictInfoParsingResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DismissNumberDistrictInfoParsingResultResponseBody body);

        @Override
        DismissNumberDistrictInfoParsingResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DismissNumberDistrictInfoParsingResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DismissNumberDistrictInfoParsingResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DismissNumberDistrictInfoParsingResultResponse response) {
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
        public Builder body(DismissNumberDistrictInfoParsingResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DismissNumberDistrictInfoParsingResultResponse build() {
            return new DismissNumberDistrictInfoParsingResultResponse(this);
        } 

    } 

}
