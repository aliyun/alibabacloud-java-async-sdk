// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupResponse</p>
 */
public class DescribeGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Group body;

    private DescribeGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupResponse create() {
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
    public Group getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Group body);

        @Override
        DescribeGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Group body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupResponse response) {
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
        public Builder body(Group body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupResponse build() {
            return new DescribeGroupResponse(this);
        } 

    } 

}
