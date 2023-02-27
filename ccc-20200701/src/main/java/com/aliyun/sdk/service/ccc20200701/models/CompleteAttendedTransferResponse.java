// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteAttendedTransferResponse} extends {@link TeaModel}
 *
 * <p>CompleteAttendedTransferResponse</p>
 */
public class CompleteAttendedTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompleteAttendedTransferResponseBody body;

    private CompleteAttendedTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompleteAttendedTransferResponse create() {
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
    public CompleteAttendedTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompleteAttendedTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompleteAttendedTransferResponseBody body);

        @Override
        CompleteAttendedTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompleteAttendedTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompleteAttendedTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompleteAttendedTransferResponse response) {
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
        public Builder body(CompleteAttendedTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompleteAttendedTransferResponse build() {
            return new CompleteAttendedTransferResponse(this);
        } 

    } 

}
