// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMtsUserResourcePackageResponse} extends {@link TeaModel}
 *
 * <p>DescribeMtsUserResourcePackageResponse</p>
 */
public class DescribeMtsUserResourcePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMtsUserResourcePackageResponseBody body;

    private DescribeMtsUserResourcePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMtsUserResourcePackageResponse create() {
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
    public DescribeMtsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMtsUserResourcePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMtsUserResourcePackageResponseBody body);

        @Override
        DescribeMtsUserResourcePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMtsUserResourcePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMtsUserResourcePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMtsUserResourcePackageResponse response) {
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
        public Builder body(DescribeMtsUserResourcePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMtsUserResourcePackageResponse build() {
            return new DescribeMtsUserResourcePackageResponse(this);
        } 

    } 

}
