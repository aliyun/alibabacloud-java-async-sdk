// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordDemandResponse} extends {@link TeaModel}
 *
 * <p>RecordDemandResponse</p>
 */
public class RecordDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecordDemandResponseBody body;

    private RecordDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecordDemandResponse create() {
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
    public RecordDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecordDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecordDemandResponseBody body);

        @Override
        RecordDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecordDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecordDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecordDemandResponse response) {
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
        public Builder body(RecordDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecordDemandResponse build() {
            return new RecordDemandResponse(this);
        } 

    } 

}
