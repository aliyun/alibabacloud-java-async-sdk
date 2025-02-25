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
         * <p>The application ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query Spark application IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s202411071444hzdvk486d9d200****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the session that executes the code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sessionId(Long sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The unique ID of the code block in the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
