// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmbAclResponse} extends {@link TeaModel}
 *
 * <p>DescribeSmbAclResponse</p>
 */
public class DescribeSmbAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSmbAclResponseBody body;

    private DescribeSmbAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSmbAclResponse create() {
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
    public DescribeSmbAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSmbAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSmbAclResponseBody body);

        @Override
        DescribeSmbAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSmbAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSmbAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSmbAclResponse response) {
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
        public Builder body(DescribeSmbAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSmbAclResponse build() {
            return new DescribeSmbAclResponse(this);
        } 

    } 

}
