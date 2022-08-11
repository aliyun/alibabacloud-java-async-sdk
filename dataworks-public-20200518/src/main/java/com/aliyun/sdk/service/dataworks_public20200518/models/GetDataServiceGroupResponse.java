// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>GetDataServiceGroupResponse</p>
 */
public class GetDataServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataServiceGroupResponseBody body;

    private GetDataServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataServiceGroupResponse create() {
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
    public GetDataServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataServiceGroupResponseBody body);

        @Override
        GetDataServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataServiceGroupResponse response) {
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
        public Builder body(GetDataServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataServiceGroupResponse build() {
            return new GetDataServiceGroupResponse(this);
        } 

    } 

}
