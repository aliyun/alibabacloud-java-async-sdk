// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageQuerySpeechBroadcastHourResponse} extends {@link TeaModel}
 *
 * <p>PageQuerySpeechBroadcastHourResponse</p>
 */
public class PageQuerySpeechBroadcastHourResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageQuerySpeechBroadcastHourResponseBody body;

    private PageQuerySpeechBroadcastHourResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageQuerySpeechBroadcastHourResponse create() {
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
    public PageQuerySpeechBroadcastHourResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageQuerySpeechBroadcastHourResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageQuerySpeechBroadcastHourResponseBody body);

        @Override
        PageQuerySpeechBroadcastHourResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageQuerySpeechBroadcastHourResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageQuerySpeechBroadcastHourResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageQuerySpeechBroadcastHourResponse response) {
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
        public Builder body(PageQuerySpeechBroadcastHourResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageQuerySpeechBroadcastHourResponse build() {
            return new PageQuerySpeechBroadcastHourResponse(this);
        } 

    } 

}
