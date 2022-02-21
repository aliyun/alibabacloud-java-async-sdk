// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseLiveShiftResponse} extends {@link TeaModel}
 *
 * <p>CloseLiveShiftResponse</p>
 */
public class CloseLiveShiftResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseLiveShiftResponseBody body;

    private CloseLiveShiftResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseLiveShiftResponse create() {
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
    public CloseLiveShiftResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseLiveShiftResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseLiveShiftResponseBody body);

        @Override
        CloseLiveShiftResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseLiveShiftResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseLiveShiftResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseLiveShiftResponse response) {
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
        public Builder body(CloseLiveShiftResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseLiveShiftResponse build() {
            return new CloseLiveShiftResponse(this);
        } 

    } 

}
