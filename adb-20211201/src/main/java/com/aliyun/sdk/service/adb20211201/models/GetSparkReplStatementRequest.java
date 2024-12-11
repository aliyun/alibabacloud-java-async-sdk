// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkReplStatementRequest} extends {@link RequestModel}
 *
 * <p>GetSparkReplStatementRequest</p>
 */
public class GetSparkReplStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private Long sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatementId")
    private Long statementId;

    private GetSparkReplStatementRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.sessionId = builder.sessionId;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkReplStatementRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkReplStatementRequest, Builder> {
        private String appId; 
        private Long sessionId; 
        private Long statementId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkReplStatementRequest request) {
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
        public GetSparkReplStatementRequest build() {
            return new GetSparkReplStatementRequest(this);
        } 

    } 

}
