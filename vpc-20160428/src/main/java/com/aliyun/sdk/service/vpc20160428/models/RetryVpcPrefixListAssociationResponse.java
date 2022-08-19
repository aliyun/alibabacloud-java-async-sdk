// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryVpcPrefixListAssociationResponse} extends {@link TeaModel}
 *
 * <p>RetryVpcPrefixListAssociationResponse</p>
 */
public class RetryVpcPrefixListAssociationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryVpcPrefixListAssociationResponseBody body;

    private RetryVpcPrefixListAssociationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryVpcPrefixListAssociationResponse create() {
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
    public RetryVpcPrefixListAssociationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryVpcPrefixListAssociationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryVpcPrefixListAssociationResponseBody body);

        @Override
        RetryVpcPrefixListAssociationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryVpcPrefixListAssociationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryVpcPrefixListAssociationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryVpcPrefixListAssociationResponse response) {
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
        public Builder body(RetryVpcPrefixListAssociationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryVpcPrefixListAssociationResponse build() {
            return new RetryVpcPrefixListAssociationResponse(this);
        } 

    } 

}
