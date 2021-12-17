// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficMarkingPolicyResponse</p>
 */
public class DeleteTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrafficMarkingPolicyResponseBody body;


    private DeleteTrafficMarkingPolicyResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrafficMarkingPolicyResponse create() {
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
    public DeleteTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrafficMarkingPolicyResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrafficMarkingPolicyResponse response) {
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
        public Builder body(DeleteTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteTrafficMarkingPolicyResponse build() {
            return new DeleteTrafficMarkingPolicyResponse(this);
        } 

    } 

}
