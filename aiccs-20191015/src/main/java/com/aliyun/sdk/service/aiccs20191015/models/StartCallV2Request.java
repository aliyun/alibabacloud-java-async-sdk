// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCallV2Request} extends {@link RequestModel}
 *
 * <p>StartCallV2Request</p>
 */
public class StartCallV2Request extends Request {
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
    @NameInMap("CallerType")
    @Validation(required = true)
    private Integer callerType;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private StartCallV2Request(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.callerType = builder.callerType;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCallV2Request create() {
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
     * @return callerType
     */
    public Integer getCallerType() {
        return this.callerType;
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

    public static final class Builder extends Request.Builder<StartCallV2Request, Builder> {
        private String accountName; 
        private String callee; 
        private String caller; 
        private Integer callerType; 
        private String clientToken; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartCallV2Request response) {
            super(response);
            this.accountName = response.accountName;
            this.callee = response.callee;
            this.caller = response.caller;
            this.callerType = response.callerType;
            this.clientToken = response.clientToken;
            this.instanceId = response.instanceId;
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
         * CallerType.
         */
        public Builder callerType(Integer callerType) {
            this.putBodyParameter("CallerType", callerType);
            this.callerType = callerType;
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
        public StartCallV2Request build() {
            return new StartCallV2Request(this);
        } 

    } 

}
