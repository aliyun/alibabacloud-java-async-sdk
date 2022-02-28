// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAffectedMaliciousFileImagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAffectedMaliciousFileImagesResponse</p>
 */
public class DescribeAffectedMaliciousFileImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAffectedMaliciousFileImagesResponseBody body;

    private DescribeAffectedMaliciousFileImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAffectedMaliciousFileImagesResponse create() {
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
    public DescribeAffectedMaliciousFileImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAffectedMaliciousFileImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAffectedMaliciousFileImagesResponseBody body);

        @Override
        DescribeAffectedMaliciousFileImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAffectedMaliciousFileImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAffectedMaliciousFileImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAffectedMaliciousFileImagesResponse response) {
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
        public Builder body(DescribeAffectedMaliciousFileImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAffectedMaliciousFileImagesResponse build() {
            return new DescribeAffectedMaliciousFileImagesResponse(this);
        } 

    } 

}
