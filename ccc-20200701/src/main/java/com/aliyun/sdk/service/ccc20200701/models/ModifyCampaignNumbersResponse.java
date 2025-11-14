// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ModifyCampaignNumbersResponse} extends {@link TeaModel}
 *
 * <p>ModifyCampaignNumbersResponse</p>
 */
public class ModifyCampaignNumbersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyCampaignNumbersResponseBody body;

    private ModifyCampaignNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyCampaignNumbersResponse create() {
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
    public ModifyCampaignNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCampaignNumbersResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyCampaignNumbersResponseBody body);

        @Override
        ModifyCampaignNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCampaignNumbersResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyCampaignNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCampaignNumbersResponse response) {
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
        public Builder body(ModifyCampaignNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCampaignNumbersResponse build() {
            return new ModifyCampaignNumbersResponse(this);
        } 

    } 

}
