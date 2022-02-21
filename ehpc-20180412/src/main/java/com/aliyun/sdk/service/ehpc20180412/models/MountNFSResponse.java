// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MountNFSResponse} extends {@link TeaModel}
 *
 * <p>MountNFSResponse</p>
 */
public class MountNFSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MountNFSResponseBody body;

    private MountNFSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MountNFSResponse create() {
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
    public MountNFSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MountNFSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MountNFSResponseBody body);

        @Override
        MountNFSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MountNFSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MountNFSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MountNFSResponse response) {
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
        public Builder body(MountNFSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MountNFSResponse build() {
            return new MountNFSResponse(this);
        } 

    } 

}
