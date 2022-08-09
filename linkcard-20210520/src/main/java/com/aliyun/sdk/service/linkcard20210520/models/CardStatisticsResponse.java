// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CardStatisticsResponse} extends {@link TeaModel}
 *
 * <p>CardStatisticsResponse</p>
 */
public class CardStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CardStatisticsResponseBody body;

    private CardStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CardStatisticsResponse create() {
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
    public CardStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CardStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CardStatisticsResponseBody body);

        @Override
        CardStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CardStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CardStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CardStatisticsResponse response) {
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
        public Builder body(CardStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CardStatisticsResponse build() {
            return new CardStatisticsResponse(this);
        } 

    } 

}
