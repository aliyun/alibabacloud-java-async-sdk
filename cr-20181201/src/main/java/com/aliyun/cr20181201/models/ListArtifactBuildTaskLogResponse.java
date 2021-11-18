// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListArtifactBuildTaskLogResponse} extends {@link TeaModel}
 *
 * <p>ListArtifactBuildTaskLogResponse</p>
 */
public class ListArtifactBuildTaskLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListArtifactBuildTaskLogResponseBody body;


    private ListArtifactBuildTaskLogResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactBuildTaskLogResponse create() {
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
    public ListArtifactBuildTaskLogResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListArtifactBuildTaskLogResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactBuildTaskLogResponse response) {
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
        public Builder body(ListArtifactBuildTaskLogResponseBody body) {
            this.body = body;
            return this;
        }

        public ListArtifactBuildTaskLogResponse build() {
            return new ListArtifactBuildTaskLogResponse(this);
        } 

    } 

}
