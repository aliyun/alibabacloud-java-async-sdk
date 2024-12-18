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
 * {@link CancelSparkReplStatementRequest} extends {@link RequestModel}
 *
 * <p>CancelSparkReplStatementRequest</p>
 */
public class CancelSparkReplStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private Long sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatementId")
    private Long statementId;

    private CancelSparkReplStatementRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.sessionId = builder.sessionId;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSparkReplStatementRequest create() {
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
     * @return sessionId
     */
    public Long getSessionId() {
        return this.sessionId;
    }

    /**
     * @return statementId
     */
    public Long getStatementId() {
        return this.statementId;
    }

    public static final class Builder extends Request.Builder<CancelSparkReplStatementRequest, Builder> {
        private String appId; 
        private Long sessionId; 
        private Long statementId; 

        private Builder() {
            super();
        } 

        private Builder(CancelSparkReplStatementRequest request) {
            super(request);
            this.appId = request.appId;
            this.sessionId = request.sessionId;
            this.statementId = request.statementId;
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
         * SessionId.
         */
        public Builder sessionId(Long sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * StatementId.
         */
        public Builder statementId(Long statementId) {
            this.putBodyParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        @Override
        public CancelSparkReplStatementRequest build() {
            return new CancelSparkReplStatementRequest(this);
        } 

    } 

}
