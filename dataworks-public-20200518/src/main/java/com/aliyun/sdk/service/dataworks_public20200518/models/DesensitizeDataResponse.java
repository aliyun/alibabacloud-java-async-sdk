// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesensitizeDataResponse} extends {@link TeaModel}
 *
 * <p>DesensitizeDataResponse</p>
 */
public class DesensitizeDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DesensitizeDataResponseBody body;

    private DesensitizeDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DesensitizeDataResponse create() {
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
    public DesensitizeDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DesensitizeDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DesensitizeDataResponseBody body);

        @Override
        DesensitizeDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DesensitizeDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DesensitizeDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DesensitizeDataResponse response) {
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
        public Builder body(DesensitizeDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DesensitizeDataResponse build() {
            return new DesensitizeDataResponse(this);
        } 

    } 

}
