// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeToutiaoLivePublishResponse} extends {@link TeaModel}
 *
 * <p>DescribeToutiaoLivePublishResponse</p>
 */
public class DescribeToutiaoLivePublishResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeToutiaoLivePublishResponseBody body;

    private DescribeToutiaoLivePublishResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeToutiaoLivePublishResponse create() {
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
    public DescribeToutiaoLivePublishResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeToutiaoLivePublishResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeToutiaoLivePublishResponseBody body);

        @Override
        DescribeToutiaoLivePublishResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeToutiaoLivePublishResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeToutiaoLivePublishResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeToutiaoLivePublishResponse response) {
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
        public Builder body(DescribeToutiaoLivePublishResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeToutiaoLivePublishResponse build() {
            return new DescribeToutiaoLivePublishResponse(this);
        } 

    } 

}
