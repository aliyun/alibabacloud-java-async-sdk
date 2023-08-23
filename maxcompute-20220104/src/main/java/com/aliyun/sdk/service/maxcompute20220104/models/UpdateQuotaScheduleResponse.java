// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaScheduleResponse} extends {@link TeaModel}
 *
 * <p>UpdateQuotaScheduleResponse</p>
 */
public class UpdateQuotaScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQuotaScheduleResponseBody body;

    private UpdateQuotaScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQuotaScheduleResponse create() {
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
    public UpdateQuotaScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQuotaScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQuotaScheduleResponseBody body);

        @Override
        UpdateQuotaScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQuotaScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQuotaScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQuotaScheduleResponse response) {
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
        public Builder body(UpdateQuotaScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQuotaScheduleResponse build() {
            return new UpdateQuotaScheduleResponse(this);
        } 

    } 

}
