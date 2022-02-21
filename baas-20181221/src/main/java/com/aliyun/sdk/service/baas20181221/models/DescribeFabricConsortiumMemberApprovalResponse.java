// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumMemberApprovalResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumMemberApprovalResponse</p>
 */
public class DescribeFabricConsortiumMemberApprovalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricConsortiumMemberApprovalResponseBody body;

    private DescribeFabricConsortiumMemberApprovalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumMemberApprovalResponse create() {
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
    public DescribeFabricConsortiumMemberApprovalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumMemberApprovalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricConsortiumMemberApprovalResponseBody body);

        @Override
        DescribeFabricConsortiumMemberApprovalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumMemberApprovalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricConsortiumMemberApprovalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumMemberApprovalResponse response) {
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
        public Builder body(DescribeFabricConsortiumMemberApprovalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumMemberApprovalResponse build() {
            return new DescribeFabricConsortiumMemberApprovalResponse(this);
        } 

    } 

}
