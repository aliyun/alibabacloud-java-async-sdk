// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaAlarmResponse} extends {@link TeaModel}
 *
 * <p>DeleteQuotaAlarmResponse</p>
 */
public class DeleteQuotaAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQuotaAlarmResponseBody body;

    private DeleteQuotaAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQuotaAlarmResponse create() {
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
    public DeleteQuotaAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQuotaAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQuotaAlarmResponseBody body);

        @Override
        DeleteQuotaAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQuotaAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQuotaAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQuotaAlarmResponse response) {
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
        public Builder body(DeleteQuotaAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQuotaAlarmResponse build() {
            return new DeleteQuotaAlarmResponse(this);
        } 

    } 

}
