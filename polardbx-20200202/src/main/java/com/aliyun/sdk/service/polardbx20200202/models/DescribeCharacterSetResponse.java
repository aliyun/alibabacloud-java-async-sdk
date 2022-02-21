// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCharacterSetResponse} extends {@link TeaModel}
 *
 * <p>DescribeCharacterSetResponse</p>
 */
public class DescribeCharacterSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCharacterSetResponseBody body;

    private DescribeCharacterSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCharacterSetResponse create() {
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
    public DescribeCharacterSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCharacterSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCharacterSetResponseBody body);

        @Override
        DescribeCharacterSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCharacterSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCharacterSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCharacterSetResponse response) {
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
        public Builder body(DescribeCharacterSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCharacterSetResponse build() {
            return new DescribeCharacterSetResponse(this);
        } 

    } 

}
