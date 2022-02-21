// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniQosGroupInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeEniQosGroupInfoResponse</p>
 */
public class DescribeEniQosGroupInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEniQosGroupInfoResponseBody body;

    private DescribeEniQosGroupInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEniQosGroupInfoResponse create() {
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
    public DescribeEniQosGroupInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEniQosGroupInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEniQosGroupInfoResponseBody body);

        @Override
        DescribeEniQosGroupInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEniQosGroupInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEniQosGroupInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEniQosGroupInfoResponse response) {
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
        public Builder body(DescribeEniQosGroupInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEniQosGroupInfoResponse build() {
            return new DescribeEniQosGroupInfoResponse(this);
        } 

    } 

}
