// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link QueryRequestLogsRequest} extends {@link RequestModel}
 *
 * <p>QueryRequestLogsRequest</p>
 */
public class QueryRequestLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestLogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestLogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private QueryRequestLogsRequest(Builder builder) {
        super(builder);
        this.requestLogId = builder.requestLogId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRequestLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestLogId
     */
    public String getRequestLogId() {
        return this.requestLogId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<QueryRequestLogsRequest, Builder> {
        private String requestLogId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryRequestLogsRequest request) {
            super(request);
            this.requestLogId = request.requestLogId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the request log.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
         */
        public Builder requestLogId(String requestLogId) {
            this.putQueryParameter("RequestLogId", requestLogId);
            this.requestLogId = requestLogId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public QueryRequestLogsRequest build() {
            return new QueryRequestLogsRequest(this);
        } 

    } 

}
