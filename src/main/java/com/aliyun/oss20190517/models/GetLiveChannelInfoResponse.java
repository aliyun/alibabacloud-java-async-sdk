// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelInfoResponse} extends {@link TeaModel}
 *
 * <p>GetLiveChannelInfoResponse</p>
 */
public class GetLiveChannelInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveChannelInfoResponseBody body;


    private GetLiveChannelInfoResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelInfoResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public GetLiveChannelInfoResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveChannelInfoResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveChannelInfoResponse response) {
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
        public Builder body(GetLiveChannelInfoResponseBody body) {
            this.body = body;
            return this;
        }

        public GetLiveChannelInfoResponse build() {
            return new GetLiveChannelInfoResponse(this);
        } 

    } 

}
