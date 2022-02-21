// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSqlConcurrencyControlRequest} extends {@link RequestModel}
 *
 * <p>DisableSqlConcurrencyControlRequest</p>
 */
public class DisableSqlConcurrencyControlRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ItemId")
    @Validation(required = true)
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

        private Builder(DisableSqlConcurrencyControlRequest response) {
            super(response);
            this.consoleContext = response.consoleContext;
            this.instanceId = response.instanceId;
            this.itemId = response.itemId;
        } 

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemId.
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
