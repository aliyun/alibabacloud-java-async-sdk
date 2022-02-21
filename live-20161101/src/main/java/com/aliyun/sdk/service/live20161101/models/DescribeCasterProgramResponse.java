// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterProgramResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterProgramResponse</p>
 */
public class DescribeCasterProgramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterProgramResponseBody body;

    private DescribeCasterProgramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterProgramResponse create() {
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
    public DescribeCasterProgramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterProgramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterProgramResponseBody body);

        @Override
        DescribeCasterProgramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterProgramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterProgramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterProgramResponse response) {
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
        public Builder body(DescribeCasterProgramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterProgramResponse build() {
            return new DescribeCasterProgramResponse(this);
        } 

    } 

}
