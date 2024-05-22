// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceInternetPortRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceInternetPortRequest</p>
 */
public class DeleteDeviceInternetPortRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DeleteDeviceInternetPortRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.natType = builder.natType;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceInternetPortRequest create() {
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
     * @return natType
     */
    public String getNatType() {
        return this.natType;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteDeviceInternetPortRequest, Builder> {
        private String instanceId; 
        private String natType; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceInternetPortRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.natType = request.natType;
            this.ruleId = request.ruleId;
        } 

        /**
         * The ID of the instance. You can specify the ID of the server or container.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the NAT gateway. The value must be of the enumerated data type. Valid values:
         * <p>
         * 
         * *   SNAT
         * *   DNAT
         */
        public Builder natType(String natType) {
            this.putQueryParameter("NatType", natType);
            this.natType = natType;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteDeviceInternetPortRequest build() {
            return new DeleteDeviceInternetPortRequest(this);
        } 

    } 

}
