// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplatesResponse</p>
 */
public class DescribeLaunchTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLaunchTemplatesResponseBody body;

    private DescribeLaunchTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLaunchTemplatesResponse create() {
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
    public DescribeLaunchTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLaunchTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLaunchTemplatesResponseBody body);

        @Override
        DescribeLaunchTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLaunchTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLaunchTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLaunchTemplatesResponse response) {
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
        public Builder body(DescribeLaunchTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLaunchTemplatesResponse build() {
            return new DescribeLaunchTemplatesResponse(this);
        } 

    } 

}
