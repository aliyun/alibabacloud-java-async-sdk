// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneNumberIdentificationUrlResponse} extends {@link TeaModel}
 *
 * <p>GetPhoneNumberIdentificationUrlResponse</p>
 */
public class GetPhoneNumberIdentificationUrlResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetPhoneNumberIdentificationUrlResponseBody body;

    private GetPhoneNumberIdentificationUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPhoneNumberIdentificationUrlResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetPhoneNumberIdentificationUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPhoneNumberIdentificationUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPhoneNumberIdentificationUrlResponseBody body);

        @Override
        GetPhoneNumberIdentificationUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPhoneNumberIdentificationUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetPhoneNumberIdentificationUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPhoneNumberIdentificationUrlResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetPhoneNumberIdentificationUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPhoneNumberIdentificationUrlResponse build() {
            return new GetPhoneNumberIdentificationUrlResponse(this);
        } 

    } 

}
