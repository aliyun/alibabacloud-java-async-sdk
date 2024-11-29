// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddIPv6TranslatorAclListEntryResponse} extends {@link TeaModel}
 *
 * <p>AddIPv6TranslatorAclListEntryResponse</p>
 */
public class AddIPv6TranslatorAclListEntryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddIPv6TranslatorAclListEntryResponseBody body;

    private AddIPv6TranslatorAclListEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddIPv6TranslatorAclListEntryResponse create() {
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
    public AddIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIPv6TranslatorAclListEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddIPv6TranslatorAclListEntryResponseBody body);

        @Override
        AddIPv6TranslatorAclListEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIPv6TranslatorAclListEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddIPv6TranslatorAclListEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIPv6TranslatorAclListEntryResponse response) {
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
        public Builder body(AddIPv6TranslatorAclListEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIPv6TranslatorAclListEntryResponse build() {
            return new AddIPv6TranslatorAclListEntryResponse(this);
        } 

    } 

}
