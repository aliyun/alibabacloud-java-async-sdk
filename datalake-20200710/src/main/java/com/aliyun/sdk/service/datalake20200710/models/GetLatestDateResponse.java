// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLatestDateResponse} extends {@link TeaModel}
 *
 * <p>GetLatestDateResponse</p>
 */
public class GetLatestDateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private GetLatestDateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static GetLatestDateResponse create() {
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

    public interface Builder extends Response.Builder<GetLatestDateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        GetLatestDateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLatestDateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLatestDateResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public GetLatestDateResponse build() {
            return new GetLatestDateResponse(this);
        } 

    } 

}
