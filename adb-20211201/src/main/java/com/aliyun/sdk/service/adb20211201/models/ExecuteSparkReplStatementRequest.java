// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ExecuteSparkReplStatementRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSparkReplStatementRequest</p>
 */
public class ExecuteSparkReplStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sessionId;

    private ExecuteSparkReplStatementRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.code = builder.code;
        this.codeType = builder.codeType;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSparkReplStatementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @return sessionId
     */
    public Long getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ExecuteSparkReplStatementRequest, Builder> {
        private String appId; 
        private String code; 
        private String codeType; 
        private Long sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSparkReplStatementRequest request) {
            super(request);
            this.appId = request.appId;
            this.code = request.code;
            this.codeType = request.codeType;
            this.sessionId = request.sessionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>print(1+1)</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON</p>
         */
        public Builder codeType(String codeType) {
            this.putBodyParameter("CodeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder sessionId(Long sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ExecuteSparkReplStatementRequest build() {
            return new ExecuteSparkReplStatementRequest(this);
        } 

    } 

}
