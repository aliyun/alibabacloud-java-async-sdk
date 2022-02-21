// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVbrToVpconnResponse} extends {@link TeaModel}
 *
 * <p>AttachVbrToVpconnResponse</p>
 */
public class AttachVbrToVpconnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachVbrToVpconnResponseBody body;

    private AttachVbrToVpconnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachVbrToVpconnResponse create() {
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
    public AttachVbrToVpconnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachVbrToVpconnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachVbrToVpconnResponseBody body);

        @Override
        AttachVbrToVpconnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachVbrToVpconnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachVbrToVpconnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachVbrToVpconnResponse response) {
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
        public Builder body(AttachVbrToVpconnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachVbrToVpconnResponse build() {
            return new AttachVbrToVpconnResponse(this);
        } 

    } 

}
