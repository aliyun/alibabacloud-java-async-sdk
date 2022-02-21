// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelMembersResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricChannelMembersResponse</p>
 */
public class DescribeFabricChannelMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricChannelMembersResponseBody body;

    private DescribeFabricChannelMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricChannelMembersResponse create() {
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
    public DescribeFabricChannelMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricChannelMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricChannelMembersResponseBody body);

        @Override
        DescribeFabricChannelMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricChannelMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricChannelMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricChannelMembersResponse response) {
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
        public Builder body(DescribeFabricChannelMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricChannelMembersResponse build() {
            return new DescribeFabricChannelMembersResponse(this);
        } 

    } 

}
