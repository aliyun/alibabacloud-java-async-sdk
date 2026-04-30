// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link EnablePolarClawPluginResponse} extends {@link TeaModel}
 *
 * <p>EnablePolarClawPluginResponse</p>
 */
public class EnablePolarClawPluginResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnablePolarClawPluginResponseBody body;

    private EnablePolarClawPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnablePolarClawPluginResponse create() {
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
    public EnablePolarClawPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnablePolarClawPluginResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnablePolarClawPluginResponseBody body);

        @Override
        EnablePolarClawPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnablePolarClawPluginResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnablePolarClawPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnablePolarClawPluginResponse response) {
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
        public Builder body(EnablePolarClawPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnablePolarClawPluginResponse build() {
            return new EnablePolarClawPluginResponse(this);
        } 

    } 

}
