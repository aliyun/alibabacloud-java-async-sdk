// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetSqlConcurrencyControlKeywordsFromSqlTextRequest} extends {@link RequestModel}
 *
 * <p>GetSqlConcurrencyControlKeywordsFromSqlTextRequest</p>
 */
public class GetSqlConcurrencyControlKeywordsFromSqlTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlText;

    private GetSqlConcurrencyControlKeywordsFromSqlTextRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.sqlText = builder.sqlText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConcurrencyControlKeywordsFromSqlTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlText
     */
    public String getSqlText() {
        return this.sqlText;
    }

    public static final class Builder extends Request.Builder<GetSqlConcurrencyControlKeywordsFromSqlTextRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 
        private String sqlText; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.sqlText = request.sqlText;
        } 

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze5hpn2b99d2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The SQL statement based on which a throttling keyword string is to be generated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM test where name = &quot;das&quot;</p>
         */
        public Builder sqlText(String sqlText) {
            this.putQueryParameter("SqlText", sqlText);
            this.sqlText = sqlText;
            return this;
        }

        @Override
        public GetSqlConcurrencyControlKeywordsFromSqlTextRequest build() {
            return new GetSqlConcurrencyControlKeywordsFromSqlTextRequest(this);
        } 

    } 

}
