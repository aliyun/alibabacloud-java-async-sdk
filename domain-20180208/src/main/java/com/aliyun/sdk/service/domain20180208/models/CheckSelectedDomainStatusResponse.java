// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSelectedDomainStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckSelectedDomainStatusResponse</p>
 */
public class CheckSelectedDomainStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckSelectedDomainStatusResponseBody body;

    private CheckSelectedDomainStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckSelectedDomainStatusResponse create() {
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
    public CheckSelectedDomainStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckSelectedDomainStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckSelectedDomainStatusResponseBody body);

        @Override
        CheckSelectedDomainStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckSelectedDomainStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckSelectedDomainStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckSelectedDomainStatusResponse response) {
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
        public Builder body(CheckSelectedDomainStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckSelectedDomainStatusResponse build() {
            return new CheckSelectedDomainStatusResponse(this);
        } 

    } 

}
