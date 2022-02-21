// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMixResponse} extends {@link TeaModel}
 *
 * <p>DescribeMixResponse</p>
 */
public class DescribeMixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMixResponseBody body;

    private DescribeMixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMixResponse create() {
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
    public DescribeMixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMixResponseBody body);

        @Override
        DescribeMixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMixResponse response) {
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
        public Builder body(DescribeMixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMixResponse build() {
            return new DescribeMixResponse(this);
        } 

    } 

}
