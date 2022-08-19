// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcPrefixListAssociationsResponse} extends {@link TeaModel}
 *
 * <p>GetVpcPrefixListAssociationsResponse</p>
 */
public class GetVpcPrefixListAssociationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVpcPrefixListAssociationsResponseBody body;

    private GetVpcPrefixListAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVpcPrefixListAssociationsResponse create() {
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
    public GetVpcPrefixListAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVpcPrefixListAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVpcPrefixListAssociationsResponseBody body);

        @Override
        GetVpcPrefixListAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVpcPrefixListAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVpcPrefixListAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVpcPrefixListAssociationsResponse response) {
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
        public Builder body(GetVpcPrefixListAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVpcPrefixListAssociationsResponse build() {
            return new GetVpcPrefixListAssociationsResponse(this);
        } 

    } 

}
