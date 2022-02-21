// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagsBySwimmingLaneGroupIdResponse} extends {@link TeaModel}
 *
 * <p>GetTagsBySwimmingLaneGroupIdResponse</p>
 */
public class GetTagsBySwimmingLaneGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTagsBySwimmingLaneGroupIdResponseBody body;

    private GetTagsBySwimmingLaneGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTagsBySwimmingLaneGroupIdResponse create() {
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
    public GetTagsBySwimmingLaneGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTagsBySwimmingLaneGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTagsBySwimmingLaneGroupIdResponseBody body);

        @Override
        GetTagsBySwimmingLaneGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTagsBySwimmingLaneGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTagsBySwimmingLaneGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTagsBySwimmingLaneGroupIdResponse response) {
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
        public Builder body(GetTagsBySwimmingLaneGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTagsBySwimmingLaneGroupIdResponse build() {
            return new GetTagsBySwimmingLaneGroupIdResponse(this);
        } 

    } 

}
