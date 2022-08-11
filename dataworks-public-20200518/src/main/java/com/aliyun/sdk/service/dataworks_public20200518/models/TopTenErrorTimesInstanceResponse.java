// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TopTenErrorTimesInstanceResponse} extends {@link TeaModel}
 *
 * <p>TopTenErrorTimesInstanceResponse</p>
 */
public class TopTenErrorTimesInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TopTenErrorTimesInstanceResponseBody body;

    private TopTenErrorTimesInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TopTenErrorTimesInstanceResponse create() {
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
    public TopTenErrorTimesInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TopTenErrorTimesInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TopTenErrorTimesInstanceResponseBody body);

        @Override
        TopTenErrorTimesInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TopTenErrorTimesInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TopTenErrorTimesInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TopTenErrorTimesInstanceResponse response) {
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
        public Builder body(TopTenErrorTimesInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TopTenErrorTimesInstanceResponse build() {
            return new TopTenErrorTimesInstanceResponse(this);
        } 

    } 

}
