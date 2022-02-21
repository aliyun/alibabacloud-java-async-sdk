// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckNumberAvaliableRequest} extends {@link RequestModel}
 *
 * <p>CheckNumberAvaliableRequest</p>
 */
public class CheckNumberAvaliableRequest extends Request {
    @Query
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Query
    @NameInMap("Caller")
    private String caller;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CheckNumberAvaliableRequest(Builder builder) {
        super(builder);
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckNumberAvaliableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CheckNumberAvaliableRequest, Builder> {
        private String callee; 
        private String caller; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CheckNumberAvaliableRequest response) {
            super(response);
            this.callee = response.callee;
            this.caller = response.caller;
            this.instanceId = response.instanceId;
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
        public CheckNumberAvaliableRequest build() {
            return new CheckNumberAvaliableRequest(this);
        } 

    } 

}
