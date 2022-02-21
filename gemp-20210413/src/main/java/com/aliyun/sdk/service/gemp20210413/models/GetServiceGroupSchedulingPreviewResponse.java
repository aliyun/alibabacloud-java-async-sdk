// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingPreviewResponse} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSchedulingPreviewResponse</p>
 */
public class GetServiceGroupSchedulingPreviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceGroupSchedulingPreviewResponseBody body;

    private GetServiceGroupSchedulingPreviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceGroupSchedulingPreviewResponse create() {
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
    public GetServiceGroupSchedulingPreviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceGroupSchedulingPreviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceGroupSchedulingPreviewResponseBody body);

        @Override
        GetServiceGroupSchedulingPreviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceGroupSchedulingPreviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceGroupSchedulingPreviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceGroupSchedulingPreviewResponse response) {
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
        public Builder body(GetServiceGroupSchedulingPreviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceGroupSchedulingPreviewResponse build() {
            return new GetServiceGroupSchedulingPreviewResponse(this);
        } 

    } 

}
