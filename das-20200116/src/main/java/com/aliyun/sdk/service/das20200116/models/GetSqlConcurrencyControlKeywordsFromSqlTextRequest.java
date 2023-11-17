// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlConcurrencyControlKeywordsFromSqlTextRequest} extends {@link RequestModel}
 *
 * <p>GetSqlConcurrencyControlKeywordsFromSqlTextRequest</p>
 */
public class GetSqlConcurrencyControlKeywordsFromSqlTextRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SqlText")
    @Validation(required = true)
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
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The SQL statement based on which a throttling keyword string is to be generated.
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
