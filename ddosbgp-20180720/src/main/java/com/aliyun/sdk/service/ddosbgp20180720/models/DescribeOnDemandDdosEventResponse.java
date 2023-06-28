// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnDemandDdosEventResponse} extends {@link TeaModel}
 *
 * <p>DescribeOnDemandDdosEventResponse</p>
 */
public class DescribeOnDemandDdosEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOnDemandDdosEventResponseBody body;

    private DescribeOnDemandDdosEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOnDemandDdosEventResponse create() {
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
    public DescribeOnDemandDdosEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOnDemandDdosEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOnDemandDdosEventResponseBody body);

        @Override
        DescribeOnDemandDdosEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOnDemandDdosEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOnDemandDdosEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOnDemandDdosEventResponse response) {
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
        public Builder body(DescribeOnDemandDdosEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOnDemandDdosEventResponse build() {
            return new DescribeOnDemandDdosEventResponse(this);
        } 

    } 

}
