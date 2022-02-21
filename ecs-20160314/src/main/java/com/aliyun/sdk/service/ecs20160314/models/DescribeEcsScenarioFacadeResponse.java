// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcsScenarioFacadeResponse} extends {@link TeaModel}
 *
 * <p>DescribeEcsScenarioFacadeResponse</p>
 */
public class DescribeEcsScenarioFacadeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEcsScenarioFacadeResponseBody body;

    private DescribeEcsScenarioFacadeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEcsScenarioFacadeResponse create() {
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
    public DescribeEcsScenarioFacadeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEcsScenarioFacadeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEcsScenarioFacadeResponseBody body);

        @Override
        DescribeEcsScenarioFacadeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEcsScenarioFacadeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEcsScenarioFacadeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEcsScenarioFacadeResponse response) {
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
        public Builder body(DescribeEcsScenarioFacadeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEcsScenarioFacadeResponse build() {
            return new DescribeEcsScenarioFacadeResponse(this);
        } 

    } 

}
