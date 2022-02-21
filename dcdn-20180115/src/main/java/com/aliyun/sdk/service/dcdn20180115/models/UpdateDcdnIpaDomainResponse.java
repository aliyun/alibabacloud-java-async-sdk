// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnIpaDomainResponse} extends {@link TeaModel}
 *
 * <p>UpdateDcdnIpaDomainResponse</p>
 */
public class UpdateDcdnIpaDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDcdnIpaDomainResponseBody body;

    private UpdateDcdnIpaDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDcdnIpaDomainResponse create() {
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
    public UpdateDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDcdnIpaDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDcdnIpaDomainResponseBody body);

        @Override
        UpdateDcdnIpaDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDcdnIpaDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDcdnIpaDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDcdnIpaDomainResponse response) {
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
        public Builder body(UpdateDcdnIpaDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDcdnIpaDomainResponse build() {
            return new UpdateDcdnIpaDomainResponse(this);
        } 

    } 

}
