// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link GetXtraceTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetXtraceTokenResponseBody</p>
 */
public class GetXtraceTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GrpcEndpoint")
    private String grpcEndpoint;

    @com.aliyun.core.annotation.NameInMap("GrpcInternalEndpoint")
    private String grpcInternalEndpoint;

    @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @com.aliyun.core.annotation.NameInMap("HttpInternalEndpoint")
    private String httpInternalEndpoint;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetXtraceTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.grpcEndpoint = builder.grpcEndpoint;
        this.grpcInternalEndpoint = builder.grpcInternalEndpoint;
        this.httpEndpoint = builder.httpEndpoint;
        this.httpInternalEndpoint = builder.httpInternalEndpoint;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetXtraceTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return grpcEndpoint
     */
    public String getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    /**
     * @return grpcInternalEndpoint
     */
    public String getGrpcInternalEndpoint() {
        return this.grpcInternalEndpoint;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return httpInternalEndpoint
     */
    public String getHttpInternalEndpoint() {
        return this.httpInternalEndpoint;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String code; 
        private String grpcEndpoint; 
        private String grpcInternalEndpoint; 
        private String httpEndpoint; 
        private String httpInternalEndpoint; 
        private String message; 
        private String requestId; 
        private String token; 

        private Builder() {
        } 

        private Builder(GetXtraceTokenResponseBody model) {
            this.code = model.code;
            this.grpcEndpoint = model.grpcEndpoint;
            this.grpcInternalEndpoint = model.grpcInternalEndpoint;
            this.httpEndpoint = model.httpEndpoint;
            this.httpInternalEndpoint = model.httpInternalEndpoint;
            this.message = model.message;
            this.requestId = model.requestId;
            this.token = model.token;
        } 

        /**
         * <p>The internal error code. This parameter is returned only when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInputParams</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The gRPC endpoint used for uploading ARM traces.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://tracing-analysis-dc-hz.aliyuncs.com:8090">http://tracing-analysis-dc-hz.aliyuncs.com:8090</a></p>
         */
        public Builder grpcEndpoint(String grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }

        /**
         * <p>The internal gRPC endpoint used for uploading ARMS traces used by Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://tracing-analysis-dc-hz-internal.aliyuncs.com:8090">http://tracing-analysis-dc-hz-internal.aliyuncs.com:8090</a></p>
         */
        public Builder grpcInternalEndpoint(String grpcInternalEndpoint) {
            this.grpcInternalEndpoint = grpcInternalEndpoint;
            return this;
        }

        /**
         * <p>The endpoint used for uploading ARMS traces.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://tracing-analysis-dc-hz.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces">http://tracing-analysis-dc-hz.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces</a></p>
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * <p>The internal endpoint used for uploading ARMS traces used by Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://tracing-analysis-dc-hz-internal.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces">http://tracing-analysis-dc-hz-internal.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces</a></p>
         */
        public Builder httpInternalEndpoint(String httpInternalEndpoint) {
            this.httpInternalEndpoint = httpInternalEndpoint;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned only when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>get_xtrace_token: failed, ERROR: NoPermission</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The token used for uploading ARMS traces.</p>
         * 
         * <strong>example:</strong>
         * <p>h1abcw7@5abcb_h1abcw7@5abc01</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetXtraceTokenResponseBody build() {
            return new GetXtraceTokenResponseBody(this);
        } 

    } 

}
