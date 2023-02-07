// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCallRequest} extends {@link RequestModel}
 *
 * <p>StartCallRequest</p>
 */
public class StartCallRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Body
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private StartCallRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCallRequest create() {
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
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StartCallRequest, Builder> {
        private String accountName; 
        private String callee; 
        private String caller; 
        private String clientToken; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartCallRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.callee = request.callee;
            this.caller = request.caller;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putBodyParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putBodyParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StartCallRequest build() {
            return new StartCallRequest(this);
        } 

    } 

}
