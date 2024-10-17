// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpgradeAndroidInstanceGroupRequest</p>
 */
public class UpgradeAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncreaseNumberOfInstance")
    private Integer increaseNumberOfInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    private UpgradeAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.increaseNumberOfInstance = builder.increaseNumberOfInstance;
        this.instanceGroupId = builder.instanceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAndroidInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return increaseNumberOfInstance
     */
    public Integer getIncreaseNumberOfInstance() {
        return this.increaseNumberOfInstance;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public static final class Builder extends Request.Builder<UpgradeAndroidInstanceGroupRequest, Builder> {
        private Boolean autoPay; 
        private Integer increaseNumberOfInstance; 
        private String instanceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeAndroidInstanceGroupRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.increaseNumberOfInstance = request.increaseNumberOfInstance;
            this.instanceGroupId = request.instanceGroupId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * IncreaseNumberOfInstance.
         */
        public Builder increaseNumberOfInstance(Integer increaseNumberOfInstance) {
            this.putQueryParameter("IncreaseNumberOfInstance", increaseNumberOfInstance);
            this.increaseNumberOfInstance = increaseNumberOfInstance;
            return this;
        }

        /**
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        @Override
        public UpgradeAndroidInstanceGroupRequest build() {
            return new UpgradeAndroidInstanceGroupRequest(this);
        } 

    } 

}
