// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UmountDirectoryResponse} extends {@link TeaModel}
 *
 * <p>UmountDirectoryResponse</p>
 */
public class UmountDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UmountDirectoryResponseBody body;

    private UmountDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UmountDirectoryResponse create() {
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
    public UmountDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UmountDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UmountDirectoryResponseBody body);

        @Override
        UmountDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UmountDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UmountDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UmountDirectoryResponse response) {
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
        public Builder body(UmountDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UmountDirectoryResponse build() {
            return new UmountDirectoryResponse(this);
        } 

    } 

}
