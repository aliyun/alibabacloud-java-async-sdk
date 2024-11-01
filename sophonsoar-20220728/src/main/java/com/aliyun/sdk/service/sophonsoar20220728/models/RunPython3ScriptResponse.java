// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunPython3ScriptResponse} extends {@link TeaModel}
 *
 * <p>RunPython3ScriptResponse</p>
 */
public class RunPython3ScriptResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RunPython3ScriptResponseBody body;

    private RunPython3ScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RunPython3ScriptResponse create() {
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
    public RunPython3ScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunPython3ScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RunPython3ScriptResponseBody body);

        @Override
        RunPython3ScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunPython3ScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RunPython3ScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunPython3ScriptResponse response) {
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
        public Builder body(RunPython3ScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunPython3ScriptResponse build() {
            return new RunPython3ScriptResponse(this);
        } 

    } 

}
