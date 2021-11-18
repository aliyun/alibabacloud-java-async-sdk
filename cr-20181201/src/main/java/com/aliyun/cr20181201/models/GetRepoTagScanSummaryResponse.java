// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoTagScanSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanSummaryResponse</p>
 */
public class GetRepoTagScanSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoTagScanSummaryResponseBody body;


    private GetRepoTagScanSummaryResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanSummaryResponse create() {
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
    public GetRepoTagScanSummaryResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoTagScanSummaryResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagScanSummaryResponse response) {
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
        public Builder body(GetRepoTagScanSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        public GetRepoTagScanSummaryResponse build() {
            return new GetRepoTagScanSummaryResponse(this);
        } 

    } 

}
