// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMountTargetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeMountTargetsResponse</p>
 */
public class DescribeMountTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMountTargetsResponseBody body;

    private DescribeMountTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMountTargetsResponse create() {
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
    public DescribeMountTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMountTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMountTargetsResponseBody body);

        @Override
        DescribeMountTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMountTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMountTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMountTargetsResponse response) {
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
        public Builder body(DescribeMountTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMountTargetsResponse build() {
            return new DescribeMountTargetsResponse(this);
        } 

    } 

}
