// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MountDirectoryResponse} extends {@link TeaModel}
 *
 * <p>MountDirectoryResponse</p>
 */
public class MountDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MountDirectoryResponseBody body;

    private MountDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MountDirectoryResponse create() {
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
    public MountDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MountDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MountDirectoryResponseBody body);

        @Override
        MountDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MountDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MountDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MountDirectoryResponse response) {
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
        public Builder body(MountDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MountDirectoryResponse build() {
            return new MountDirectoryResponse(this);
        } 

    } 

}
