// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryOrFilePropertiesResponse} extends {@link TeaModel}
 *
 * <p>GetDirectoryOrFilePropertiesResponse</p>
 */
public class GetDirectoryOrFilePropertiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectoryOrFilePropertiesResponseBody body;

    private GetDirectoryOrFilePropertiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDirectoryOrFilePropertiesResponse create() {
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
    public GetDirectoryOrFilePropertiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDirectoryOrFilePropertiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDirectoryOrFilePropertiesResponseBody body);

        @Override
        GetDirectoryOrFilePropertiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDirectoryOrFilePropertiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectoryOrFilePropertiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDirectoryOrFilePropertiesResponse response) {
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
        public Builder body(GetDirectoryOrFilePropertiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDirectoryOrFilePropertiesResponse build() {
            return new GetDirectoryOrFilePropertiesResponse(this);
        } 

    } 

}
