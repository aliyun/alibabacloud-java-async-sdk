// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPrivacyCallRequest} extends {@link RequestModel}
 *
 * <p>StartPrivacyCallRequest</p>
 */
public class StartPrivacyCallRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private StartPrivacyCallRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPrivacyCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StartPrivacyCallRequest, Builder> {
        private String appId; 
        private String callee; 
        private String caller; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartPrivacyCallRequest request) {
            super(request);
            this.appId = request.appId;
            this.callee = request.callee;
            this.caller = request.caller;
            this.instanceId = request.instanceId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
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

        @Override
        public StartPrivacyCallRequest build() {
            return new StartPrivacyCallRequest(this);
        } 

    } 

}
