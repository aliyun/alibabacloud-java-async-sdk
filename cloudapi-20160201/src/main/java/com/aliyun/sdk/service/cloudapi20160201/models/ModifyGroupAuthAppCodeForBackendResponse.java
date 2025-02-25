// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupAuthAppCodeForBackendResponse} extends {@link TeaModel}
 *
 * <p>ModifyGroupAuthAppCodeForBackendResponse</p>
 */
public class ModifyGroupAuthAppCodeForBackendResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyGroupAuthAppCodeForBackendResponseBody body;

    private ModifyGroupAuthAppCodeForBackendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyGroupAuthAppCodeForBackendResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ModifyGroupAuthAppCodeForBackendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGroupAuthAppCodeForBackendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyGroupAuthAppCodeForBackendResponseBody body);

        @Override
        ModifyGroupAuthAppCodeForBackendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGroupAuthAppCodeForBackendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyGroupAuthAppCodeForBackendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGroupAuthAppCodeForBackendResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ModifyGroupAuthAppCodeForBackendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGroupAuthAppCodeForBackendResponse build() {
            return new ModifyGroupAuthAppCodeForBackendResponse(this);
        } 

    } 

}
