// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetTemplateParameterConstraintsResponse} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponse</p>
 */
public class GetTemplateParameterConstraintsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTemplateParameterConstraintsResponseBody body;


    private GetTemplateParameterConstraintsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateParameterConstraintsResponse create() {
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
    public GetTemplateParameterConstraintsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetTemplateParameterConstraintsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateParameterConstraintsResponse response) {
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
        public Builder body(GetTemplateParameterConstraintsResponseBody body) {
            this.body = body;
            return this;
        }

        public GetTemplateParameterConstraintsResponse build() {
            return new GetTemplateParameterConstraintsResponse(this);
        } 

    } 

}
