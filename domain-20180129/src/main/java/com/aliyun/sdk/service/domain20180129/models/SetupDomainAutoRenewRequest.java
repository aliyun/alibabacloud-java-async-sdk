// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupDomainAutoRenewRequest} extends {@link RequestModel}
 *
 * <p>SetupDomainAutoRenewRequest</p>
 */
public class SetupDomainAutoRenewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    private SetupDomainAutoRenewRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupDomainAutoRenewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<SetupDomainAutoRenewRequest, Builder> {
        private String instanceId; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(SetupDomainAutoRenewRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operation = request.operation;
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
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public SetupDomainAutoRenewRequest build() {
            return new SetupDomainAutoRenewRequest(this);
        } 

    } 

}
