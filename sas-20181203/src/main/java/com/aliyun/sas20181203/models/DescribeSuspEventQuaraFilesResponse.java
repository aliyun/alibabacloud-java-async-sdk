// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSuspEventQuaraFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponse</p>
 */
public class DescribeSuspEventQuaraFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspEventQuaraFilesResponseBody body;


    private DescribeSuspEventQuaraFilesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesResponse create() {
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
    public DescribeSuspEventQuaraFilesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspEventQuaraFilesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventQuaraFilesResponse response) {
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
        public Builder body(DescribeSuspEventQuaraFilesResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeSuspEventQuaraFilesResponse build() {
            return new DescribeSuspEventQuaraFilesResponse(this);
        } 

    } 

}
