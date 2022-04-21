// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateIpFromConnectionPoolResponse} extends {@link TeaModel}
 *
 * <p>DissociateIpFromConnectionPoolResponse</p>
 */
public class DissociateIpFromConnectionPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateIpFromConnectionPoolResponseBody body;

    private DissociateIpFromConnectionPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateIpFromConnectionPoolResponse create() {
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
    public DissociateIpFromConnectionPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateIpFromConnectionPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateIpFromConnectionPoolResponseBody body);

        @Override
        DissociateIpFromConnectionPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateIpFromConnectionPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateIpFromConnectionPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateIpFromConnectionPoolResponse response) {
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
        public Builder body(DissociateIpFromConnectionPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateIpFromConnectionPoolResponse build() {
            return new DissociateIpFromConnectionPoolResponse(this);
        } 

    } 

}
