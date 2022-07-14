// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInternetPortRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceInternetPortRequest</p>
 */
public class GetDeviceInternetPortRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NatType")
    @Validation(required = true)
    private String natType;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    private GetDeviceInternetPortRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.natType = builder.natType;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceInternetPortRequest create() {
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

    public static final class Builder extends Request.Builder<GetDeviceInternetPortRequest, Builder> {
        private String instanceId; 
        private String natType; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceInternetPortRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.natType = request.natType;
            this.ruleId = request.ruleId;
        } 

        /**
         * A short description of struct
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NatType.
         */
        public Builder natType(String natType) {
            this.putQueryParameter("NatType", natType);
            this.natType = natType;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetDeviceInternetPortRequest build() {
            return new GetDeviceInternetPortRequest(this);
        } 

    } 

}
