// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeQualityProjectStatusResponse} extends {@link TeaModel}
 *
 * <p>ChangeQualityProjectStatusResponse</p>
 */
public class ChangeQualityProjectStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeQualityProjectStatusResponseBody body;

    private ChangeQualityProjectStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeQualityProjectStatusResponse create() {
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
    public ChangeQualityProjectStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeQualityProjectStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeQualityProjectStatusResponseBody body);

        @Override
        ChangeQualityProjectStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeQualityProjectStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeQualityProjectStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeQualityProjectStatusResponse response) {
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
        public Builder body(ChangeQualityProjectStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeQualityProjectStatusResponse build() {
            return new ChangeQualityProjectStatusResponse(this);
        } 

    } 

}
