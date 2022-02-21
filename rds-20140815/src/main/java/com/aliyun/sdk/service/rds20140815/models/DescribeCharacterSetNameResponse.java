// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCharacterSetNameResponse} extends {@link TeaModel}
 *
 * <p>DescribeCharacterSetNameResponse</p>
 */
public class DescribeCharacterSetNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCharacterSetNameResponseBody body;

    private DescribeCharacterSetNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCharacterSetNameResponse create() {
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
    public DescribeCharacterSetNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCharacterSetNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCharacterSetNameResponseBody body);

        @Override
        DescribeCharacterSetNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCharacterSetNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCharacterSetNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCharacterSetNameResponse response) {
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
        public Builder body(DescribeCharacterSetNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCharacterSetNameResponse build() {
            return new DescribeCharacterSetNameResponse(this);
        } 

    } 

}
