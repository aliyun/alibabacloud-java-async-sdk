// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutonomousNotifyEventsInRangeResponse} extends {@link TeaModel}
 *
 * <p>GetAutonomousNotifyEventsInRangeResponse</p>
 */
public class GetAutonomousNotifyEventsInRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAutonomousNotifyEventsInRangeResponseBody body;

    private GetAutonomousNotifyEventsInRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAutonomousNotifyEventsInRangeResponse create() {
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
    public GetAutonomousNotifyEventsInRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutonomousNotifyEventsInRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAutonomousNotifyEventsInRangeResponseBody body);

        @Override
        GetAutonomousNotifyEventsInRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutonomousNotifyEventsInRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAutonomousNotifyEventsInRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutonomousNotifyEventsInRangeResponse response) {
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
        public Builder body(GetAutonomousNotifyEventsInRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventsInRangeResponse build() {
            return new GetAutonomousNotifyEventsInRangeResponse(this);
        } 

    } 

}
