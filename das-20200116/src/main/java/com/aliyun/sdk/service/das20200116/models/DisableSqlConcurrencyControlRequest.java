// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the throttling rule that is applied to the instance. You can call the [GetRunningSqlConcurrencyControlRules](~~223538~~) operation to query the ID.
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
