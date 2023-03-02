// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSPhaseInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeMPCoSPhaseInfoResponse</p>
 */
public class DescribeMPCoSPhaseInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMPCoSPhaseInfoResponseBody body;

    private DescribeMPCoSPhaseInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMPCoSPhaseInfoResponse create() {
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
    public DescribeMPCoSPhaseInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMPCoSPhaseInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMPCoSPhaseInfoResponseBody body);

        @Override
        DescribeMPCoSPhaseInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMPCoSPhaseInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMPCoSPhaseInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMPCoSPhaseInfoResponse response) {
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
        public Builder body(DescribeMPCoSPhaseInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMPCoSPhaseInfoResponse build() {
            return new DescribeMPCoSPhaseInfoResponse(this);
        } 

    } 

}
