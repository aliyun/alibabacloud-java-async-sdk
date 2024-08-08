// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMemberBasicInfoResponse} extends {@link TeaModel}
 *
 * <p>AddMemberBasicInfoResponse</p>
 */
public class AddMemberBasicInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddMemberBasicInfoResponseBody body;

    private AddMemberBasicInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddMemberBasicInfoResponse create() {
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
    public AddMemberBasicInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMemberBasicInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddMemberBasicInfoResponseBody body);

        @Override
        AddMemberBasicInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMemberBasicInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddMemberBasicInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMemberBasicInfoResponse response) {
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
        public Builder body(AddMemberBasicInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMemberBasicInfoResponse build() {
            return new AddMemberBasicInfoResponse(this);
        } 

    } 

}
