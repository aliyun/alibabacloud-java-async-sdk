// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLaunchTemplateDataResponse} extends {@link TeaModel}
 *
 * <p>GetLaunchTemplateDataResponse</p>
 */
public class GetLaunchTemplateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLaunchTemplateDataResponseBody body;

    private GetLaunchTemplateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLaunchTemplateDataResponse create() {
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
    public GetLaunchTemplateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLaunchTemplateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLaunchTemplateDataResponseBody body);

        @Override
        GetLaunchTemplateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLaunchTemplateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLaunchTemplateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLaunchTemplateDataResponse response) {
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
        public Builder body(GetLaunchTemplateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLaunchTemplateDataResponse build() {
            return new GetLaunchTemplateDataResponse(this);
        } 

    } 

}
