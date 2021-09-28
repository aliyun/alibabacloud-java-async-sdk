// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetLiveChannelHistoryResponse</p>
 */
public class GetLiveChannelHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveChannelHistoryResponseBody body;


    private GetLiveChannelHistoryResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelHistoryResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > headers() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetLiveChannelHistoryResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveChannelHistoryResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveChannelHistoryResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(GetLiveChannelHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        public GetLiveChannelHistoryResponse build() {
            return new GetLiveChannelHistoryResponse(this);
        } 

    } 

}
