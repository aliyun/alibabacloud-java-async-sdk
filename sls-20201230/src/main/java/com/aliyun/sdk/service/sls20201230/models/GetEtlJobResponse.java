// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetEtlJobResponse} extends {@link TeaModel}
 *
 * <p>GetEtlJobResponse</p>
 */
public class GetEtlJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EtlJob body;

    private GetEtlJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEtlJobResponse create() {
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
    public EtlJob getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEtlJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EtlJob body);

        @Override
        GetEtlJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEtlJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EtlJob body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEtlJobResponse response) {
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
        public Builder body(EtlJob body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEtlJobResponse build() {
            return new GetEtlJobResponse(this);
        } 

    } 

}
