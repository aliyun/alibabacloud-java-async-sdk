// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CreatePlayingListOAuth2Response} extends {@link TeaModel}
 *
 * <p>CreatePlayingListOAuth2Response</p>
 */
public class CreatePlayingListOAuth2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePlayingListOAuth2ResponseBody body;

    private CreatePlayingListOAuth2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePlayingListOAuth2Response create() {
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
    public CreatePlayingListOAuth2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePlayingListOAuth2Response, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePlayingListOAuth2ResponseBody body);

        @Override
        CreatePlayingListOAuth2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePlayingListOAuth2Response, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreatePlayingListOAuth2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePlayingListOAuth2Response response) {
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
        public Builder body(CreatePlayingListOAuth2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePlayingListOAuth2Response build() {
            return new CreatePlayingListOAuth2Response(this);
        } 

    } 

}
