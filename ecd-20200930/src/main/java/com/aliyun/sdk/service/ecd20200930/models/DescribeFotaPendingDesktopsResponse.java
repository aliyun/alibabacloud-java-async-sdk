// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaPendingDesktopsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFotaPendingDesktopsResponse</p>
 */
public class DescribeFotaPendingDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFotaPendingDesktopsResponseBody body;

    private DescribeFotaPendingDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFotaPendingDesktopsResponse create() {
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
    public DescribeFotaPendingDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFotaPendingDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFotaPendingDesktopsResponseBody body);

        @Override
        DescribeFotaPendingDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFotaPendingDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFotaPendingDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFotaPendingDesktopsResponse response) {
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
        public Builder body(DescribeFotaPendingDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFotaPendingDesktopsResponse build() {
            return new DescribeFotaPendingDesktopsResponse(this);
        } 

    } 

}
