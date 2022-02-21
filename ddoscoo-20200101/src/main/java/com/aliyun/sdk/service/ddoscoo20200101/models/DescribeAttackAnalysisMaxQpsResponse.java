// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisMaxQpsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisMaxQpsResponse</p>
 */
public class DescribeAttackAnalysisMaxQpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAttackAnalysisMaxQpsResponseBody body;

    private DescribeAttackAnalysisMaxQpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAttackAnalysisMaxQpsResponse create() {
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
    public DescribeAttackAnalysisMaxQpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAttackAnalysisMaxQpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAttackAnalysisMaxQpsResponseBody body);

        @Override
        DescribeAttackAnalysisMaxQpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAttackAnalysisMaxQpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAttackAnalysisMaxQpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAttackAnalysisMaxQpsResponse response) {
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
        public Builder body(DescribeAttackAnalysisMaxQpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAttackAnalysisMaxQpsResponse build() {
            return new DescribeAttackAnalysisMaxQpsResponse(this);
        } 

    } 

}
