// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcPrefixListResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcPrefixListResponse</p>
 */
public class CreateVpcPrefixListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcPrefixListResponseBody body;

    private CreateVpcPrefixListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcPrefixListResponse create() {
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
    public CreateVpcPrefixListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcPrefixListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcPrefixListResponseBody body);

        @Override
        CreateVpcPrefixListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcPrefixListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcPrefixListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcPrefixListResponse response) {
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
        public Builder body(CreateVpcPrefixListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcPrefixListResponse build() {
            return new CreateVpcPrefixListResponse(this);
        } 

    } 

}
