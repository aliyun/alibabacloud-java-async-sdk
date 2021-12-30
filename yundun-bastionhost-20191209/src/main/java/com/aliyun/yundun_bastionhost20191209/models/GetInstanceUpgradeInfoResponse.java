// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceUpgradeInfoResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceUpgradeInfoResponse</p>
 */
public class GetInstanceUpgradeInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceUpgradeInfoResponseBody body;


    private GetInstanceUpgradeInfoResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUpgradeInfoResponse create() {
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
    public GetInstanceUpgradeInfoResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceUpgradeInfoResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceUpgradeInfoResponse response) {
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
        public Builder body(GetInstanceUpgradeInfoResponseBody body) {
            this.body = body;
            return this;
        }

        public GetInstanceUpgradeInfoResponse build() {
            return new GetInstanceUpgradeInfoResponse(this);
        } 

    } 

}
