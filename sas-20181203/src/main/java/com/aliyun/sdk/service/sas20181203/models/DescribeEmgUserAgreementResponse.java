// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgUserAgreementResponse} extends {@link TeaModel}
 *
 * <p>DescribeEmgUserAgreementResponse</p>
 */
public class DescribeEmgUserAgreementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEmgUserAgreementResponseBody body;

    private DescribeEmgUserAgreementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEmgUserAgreementResponse create() {
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
    public DescribeEmgUserAgreementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEmgUserAgreementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEmgUserAgreementResponseBody body);

        @Override
        DescribeEmgUserAgreementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEmgUserAgreementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEmgUserAgreementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEmgUserAgreementResponse response) {
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
        public Builder body(DescribeEmgUserAgreementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEmgUserAgreementResponse build() {
            return new DescribeEmgUserAgreementResponse(this);
        } 

    } 

}
