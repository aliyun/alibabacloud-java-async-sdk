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
 * {@link DisableAllSqlConcurrencyControlRulesRequest} extends {@link RequestModel}
 *
 * <p>DisableAllSqlConcurrencyControlRulesRequest</p>
 */
public class DisableAllSqlConcurrencyControlRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DisableAllSqlConcurrencyControlRulesRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAllSqlConcurrencyControlRulesRequest create() {
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

    public static final class Builder extends Request.Builder<DisableAllSqlConcurrencyControlRulesRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableAllSqlConcurrencyControlRulesRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
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
         * <blockquote>
         * <p> You must specify this parameter only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DisableAllSqlConcurrencyControlRulesRequest build() {
            return new DisableAllSqlConcurrencyControlRulesRequest(this);
        } 

    } 

}
