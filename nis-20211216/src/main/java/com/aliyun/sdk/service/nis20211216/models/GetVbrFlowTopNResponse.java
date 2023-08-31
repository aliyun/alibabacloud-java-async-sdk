// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVbrFlowTopNResponse} extends {@link TeaModel}
 *
 * <p>GetVbrFlowTopNResponse</p>
 */
public class GetVbrFlowTopNResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVbrFlowTopNResponseBody body;

    private GetVbrFlowTopNResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVbrFlowTopNResponse create() {
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
    public GetVbrFlowTopNResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVbrFlowTopNResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVbrFlowTopNResponseBody body);

        @Override
        GetVbrFlowTopNResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVbrFlowTopNResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVbrFlowTopNResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVbrFlowTopNResponse response) {
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
        public Builder body(GetVbrFlowTopNResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVbrFlowTopNResponse build() {
            return new GetVbrFlowTopNResponse(this);
        } 

    } 

}
