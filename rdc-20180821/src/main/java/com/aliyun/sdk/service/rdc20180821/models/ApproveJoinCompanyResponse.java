// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveJoinCompanyResponse} extends {@link TeaModel}
 *
 * <p>ApproveJoinCompanyResponse</p>
 */
public class ApproveJoinCompanyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveJoinCompanyResponseBody body;

    private ApproveJoinCompanyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveJoinCompanyResponse create() {
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
    public ApproveJoinCompanyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveJoinCompanyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveJoinCompanyResponseBody body);

        @Override
        ApproveJoinCompanyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveJoinCompanyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveJoinCompanyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveJoinCompanyResponse response) {
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
        public Builder body(ApproveJoinCompanyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveJoinCompanyResponse build() {
            return new ApproveJoinCompanyResponse(this);
        } 

    } 

}
