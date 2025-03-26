// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PersonalizedTextToImageQueryImageAssetResponse} extends {@link TeaModel}
 *
 * <p>PersonalizedTextToImageQueryImageAssetResponse</p>
 */
public class PersonalizedTextToImageQueryImageAssetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private Object body;

    private PersonalizedTextToImageQueryImageAssetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PersonalizedTextToImageQueryImageAssetResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public Object getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PersonalizedTextToImageQueryImageAssetResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(Object body);

        @Override
        PersonalizedTextToImageQueryImageAssetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PersonalizedTextToImageQueryImageAssetResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private Object body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PersonalizedTextToImageQueryImageAssetResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        @Override
        public PersonalizedTextToImageQueryImageAssetResponse build() {
            return new PersonalizedTextToImageQueryImageAssetResponse(this);
        } 

    } 

}
