// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateOrUpdateAssetGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateAssetGroupResponse</p>
 */
public class CreateOrUpdateAssetGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateAssetGroupResponseBody body;


    private CreateOrUpdateAssetGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAssetGroupResponse create() {
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
    public CreateOrUpdateAssetGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateAssetGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateAssetGroupResponse response) {
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
        public Builder body(CreateOrUpdateAssetGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public CreateOrUpdateAssetGroupResponse build() {
            return new CreateOrUpdateAssetGroupResponse(this);
        } 

    } 

}
