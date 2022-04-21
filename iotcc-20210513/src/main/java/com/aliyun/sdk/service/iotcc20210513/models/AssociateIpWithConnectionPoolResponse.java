// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateIpWithConnectionPoolResponse} extends {@link TeaModel}
 *
 * <p>AssociateIpWithConnectionPoolResponse</p>
 */
public class AssociateIpWithConnectionPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateIpWithConnectionPoolResponseBody body;

    private AssociateIpWithConnectionPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateIpWithConnectionPoolResponse create() {
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
    public AssociateIpWithConnectionPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateIpWithConnectionPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateIpWithConnectionPoolResponseBody body);

        @Override
        AssociateIpWithConnectionPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateIpWithConnectionPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateIpWithConnectionPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateIpWithConnectionPoolResponse response) {
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
        public Builder body(AssociateIpWithConnectionPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateIpWithConnectionPoolResponse build() {
            return new AssociateIpWithConnectionPoolResponse(this);
        } 

    } 

}
