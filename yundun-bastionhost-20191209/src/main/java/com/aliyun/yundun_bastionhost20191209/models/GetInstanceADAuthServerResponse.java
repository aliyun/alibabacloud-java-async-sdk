// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceADAuthServerResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceADAuthServerResponse</p>
 */
public class GetInstanceADAuthServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceADAuthServerResponseBody body;


    private GetInstanceADAuthServerResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceADAuthServerResponse create() {
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
    public GetInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceADAuthServerResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceADAuthServerResponse response) {
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
        public Builder body(GetInstanceADAuthServerResponseBody body) {
            this.body = body;
            return this;
        }

        public GetInstanceADAuthServerResponse build() {
            return new GetInstanceADAuthServerResponse(this);
        } 

    } 

}
