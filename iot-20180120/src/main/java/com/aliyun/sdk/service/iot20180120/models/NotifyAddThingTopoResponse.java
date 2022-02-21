// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyAddThingTopoResponse} extends {@link TeaModel}
 *
 * <p>NotifyAddThingTopoResponse</p>
 */
public class NotifyAddThingTopoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NotifyAddThingTopoResponseBody body;

    private NotifyAddThingTopoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static NotifyAddThingTopoResponse create() {
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
    public NotifyAddThingTopoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<NotifyAddThingTopoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(NotifyAddThingTopoResponseBody body);

        @Override
        NotifyAddThingTopoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<NotifyAddThingTopoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private NotifyAddThingTopoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(NotifyAddThingTopoResponse response) {
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
        public Builder body(NotifyAddThingTopoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public NotifyAddThingTopoResponse build() {
            return new NotifyAddThingTopoResponse(this);
        } 

    } 

}
