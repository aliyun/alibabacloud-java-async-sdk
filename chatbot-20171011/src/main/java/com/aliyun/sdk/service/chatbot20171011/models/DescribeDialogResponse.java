// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogResponse} extends {@link TeaModel}
 *
 * <p>DescribeDialogResponse</p>
 */
public class DescribeDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDialogResponseBody body;

    private DescribeDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDialogResponse create() {
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
    public DescribeDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDialogResponseBody body);

        @Override
        DescribeDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDialogResponse response) {
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
        public Builder body(DescribeDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDialogResponse build() {
            return new DescribeDialogResponse(this);
        } 

    } 

}
