// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSchedulePeriodResponse} extends {@link TeaModel}
 *
 * <p>UpdateSchedulePeriodResponse</p>
 */
public class UpdateSchedulePeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSchedulePeriodResponseBody body;

    private UpdateSchedulePeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSchedulePeriodResponse create() {
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
    public UpdateSchedulePeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSchedulePeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSchedulePeriodResponseBody body);

        @Override
        UpdateSchedulePeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSchedulePeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSchedulePeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSchedulePeriodResponse response) {
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
        public Builder body(UpdateSchedulePeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSchedulePeriodResponse build() {
            return new UpdateSchedulePeriodResponse(this);
        } 

    } 

}
