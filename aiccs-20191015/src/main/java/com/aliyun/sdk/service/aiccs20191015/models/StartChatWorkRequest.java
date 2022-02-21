// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartChatWorkRequest} extends {@link RequestModel}
 *
 * <p>StartChatWorkRequest</p>
 */
public class StartChatWorkRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private StartChatWorkRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartChatWorkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StartChatWorkRequest, Builder> {
        private String accountName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartChatWorkRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.instanceId = response.instanceId;
        } 

        /**
         * accountName
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * instanceId
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StartChatWorkRequest build() {
            return new StartChatWorkRequest(this);
        } 

    } 

}
