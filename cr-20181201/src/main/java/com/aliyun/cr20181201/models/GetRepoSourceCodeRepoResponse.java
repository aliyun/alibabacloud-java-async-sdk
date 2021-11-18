// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoSourceCodeRepoResponse} extends {@link TeaModel}
 *
 * <p>GetRepoSourceCodeRepoResponse</p>
 */
public class GetRepoSourceCodeRepoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoSourceCodeRepoResponseBody body;


    private GetRepoSourceCodeRepoResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSourceCodeRepoResponse create() {
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
    public GetRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoSourceCodeRepoResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoSourceCodeRepoResponse response) {
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
        public Builder body(GetRepoSourceCodeRepoResponseBody body) {
            this.body = body;
            return this;
        }

        public GetRepoSourceCodeRepoResponse build() {
            return new GetRepoSourceCodeRepoResponse(this);
        } 

    } 

}
