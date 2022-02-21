// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrailResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrailResponse</p>
 */
public class UpdateTrailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTrailResponseBody body;

    private UpdateTrailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTrailResponse create() {
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
    public UpdateTrailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTrailResponseBody body);

        @Override
        UpdateTrailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTrailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrailResponse response) {
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
        public Builder body(UpdateTrailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrailResponse build() {
            return new UpdateTrailResponse(this);
        } 

    } 

}
