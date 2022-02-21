// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaAlarmResponse} extends {@link TeaModel}
 *
 * <p>UpdateQuotaAlarmResponse</p>
 */
public class UpdateQuotaAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQuotaAlarmResponseBody body;

    private UpdateQuotaAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQuotaAlarmResponse create() {
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
    public UpdateQuotaAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQuotaAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQuotaAlarmResponseBody body);

        @Override
        UpdateQuotaAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQuotaAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQuotaAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQuotaAlarmResponse response) {
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
        public Builder body(UpdateQuotaAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQuotaAlarmResponse build() {
            return new UpdateQuotaAlarmResponse(this);
        } 

    } 

}
