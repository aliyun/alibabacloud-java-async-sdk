// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAttendedTransferResponse} extends {@link TeaModel}
 *
 * <p>CancelAttendedTransferResponse</p>
 */
public class CancelAttendedTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelAttendedTransferResponseBody body;

    private CancelAttendedTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelAttendedTransferResponse create() {
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
    public CancelAttendedTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelAttendedTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelAttendedTransferResponseBody body);

        @Override
        CancelAttendedTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelAttendedTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelAttendedTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelAttendedTransferResponse response) {
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
        public Builder body(CancelAttendedTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelAttendedTransferResponse build() {
            return new CancelAttendedTransferResponse(this);
        } 

    } 

}
