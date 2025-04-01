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
 * {@link DisableSqlConcurrencyControlRequest} extends {@link RequestModel}
 *
 * <p>DisableSqlConcurrencyControlRequest</p>
 */
public class DisableSqlConcurrencyControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    private DisableSqlConcurrencyControlRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableSqlConcurrencyControlRequest create() {
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
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    public static final class Builder extends Request.Builder<DisableSqlConcurrencyControlRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 
        private Long itemId; 

        private Builder() {
            super();
        } 

        private Builder(DisableSqlConcurrencyControlRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.itemId = request.itemId;
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
         * <p> The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
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

        /**
         * <p>The ID of the throttling rule that is applied to the instance. You can call the <a href="https://help.aliyun.com/document_detail/223538.html">GetRunningSqlConcurrencyControlRules</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public DisableSqlConcurrencyControlRequest build() {
            return new DisableSqlConcurrencyControlRequest(this);
        } 

    } 

}
