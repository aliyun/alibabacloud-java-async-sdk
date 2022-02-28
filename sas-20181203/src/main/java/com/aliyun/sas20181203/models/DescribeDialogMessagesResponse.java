// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogMessagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDialogMessagesResponse</p>
 */
public class DescribeDialogMessagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDialogMessagesResponseBody body;

    private DescribeDialogMessagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDialogMessagesResponse create() {
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
    public DescribeDialogMessagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDialogMessagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDialogMessagesResponseBody body);

        @Override
        DescribeDialogMessagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDialogMessagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDialogMessagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDialogMessagesResponse response) {
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
        public Builder body(DescribeDialogMessagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDialogMessagesResponse build() {
            return new DescribeDialogMessagesResponse(this);
        } 

    } 

}
