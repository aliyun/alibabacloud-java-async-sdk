// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDcdnIpaDomainResponse} extends {@link TeaModel}
 *
 * <p>StopDcdnIpaDomainResponse</p>
 */
public class StopDcdnIpaDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDcdnIpaDomainResponseBody body;

    private StopDcdnIpaDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDcdnIpaDomainResponse create() {
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
    public StopDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDcdnIpaDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDcdnIpaDomainResponseBody body);

        @Override
        StopDcdnIpaDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDcdnIpaDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDcdnIpaDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDcdnIpaDomainResponse response) {
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
        public Builder body(StopDcdnIpaDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDcdnIpaDomainResponse build() {
            return new StopDcdnIpaDomainResponse(this);
        } 

    } 

}
