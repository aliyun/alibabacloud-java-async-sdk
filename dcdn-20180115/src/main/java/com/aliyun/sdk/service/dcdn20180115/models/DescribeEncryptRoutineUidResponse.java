// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptRoutineUidResponse} extends {@link TeaModel}
 *
 * <p>DescribeEncryptRoutineUidResponse</p>
 */
public class DescribeEncryptRoutineUidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEncryptRoutineUidResponseBody body;

    private DescribeEncryptRoutineUidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEncryptRoutineUidResponse create() {
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
    public DescribeEncryptRoutineUidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEncryptRoutineUidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEncryptRoutineUidResponseBody body);

        @Override
        DescribeEncryptRoutineUidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEncryptRoutineUidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEncryptRoutineUidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEncryptRoutineUidResponse response) {
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
        public Builder body(DescribeEncryptRoutineUidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEncryptRoutineUidResponse build() {
            return new DescribeEncryptRoutineUidResponse(this);
        } 

    } 

}
