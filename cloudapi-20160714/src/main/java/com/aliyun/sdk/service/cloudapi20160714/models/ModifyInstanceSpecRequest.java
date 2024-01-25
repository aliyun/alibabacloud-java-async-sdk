// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceSpec")
    @Validation(required = true)
    private String instanceSpec;

    @Query
    @NameInMap("ModifyAction")
    private String modifyAction;

    @Query
    @NameInMap("SkipWaitSwitch")
    private Boolean skipWaitSwitch;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.instanceId = builder.instanceId;
        this.instanceSpec = builder.instanceSpec;
        this.modifyAction = builder.modifyAction;
        this.skipWaitSwitch = builder.skipWaitSwitch;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return modifyAction
     */
    public String getModifyAction() {
        return this.modifyAction;
    }

    /**
     * @return skipWaitSwitch
     */
    public Boolean getSkipWaitSwitch() {
        return this.skipWaitSwitch;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private Boolean autoPay; 
        private String instanceId; 
        private String instanceSpec; 
        private String modifyAction; 
        private Boolean skipWaitSwitch; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.instanceId = request.instanceId;
            this.instanceSpec = request.instanceSpec;
            this.modifyAction = request.modifyAction;
            this.skipWaitSwitch = request.skipWaitSwitch;
            this.token = request.token;
        } 

        /**
         * Specifies whether payment is automatically made during renewal. Valid values:
         * <p>
         * 
         * *   **True**: Automatic payment is enabled. Make sure that your Alibaba Cloud account has adequate balance.
         * *   **False**: Automatic payment is disabled. You have to manually pay in the console. Log on to the console. In the upper-right corner, choose **Expenses > User Center**. In the left-side navigation pane, click **Orders**. On the page that appears, find your order and complete the payment.
         * 
         * Default value: **False**.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The specifications of the instance.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * Specifies whether to upgrade or downgrade the instance. Valid values:
         * <p>
         * 
         * *   **UPGRADE**
         * *   **DOWNGRADE**
         * 
         * Default value: **UPGRADE**.
         */
        public Builder modifyAction(String modifyAction) {
            this.putQueryParameter("ModifyAction", modifyAction);
            this.modifyAction = modifyAction;
            return this;
        }

        /**
         * Specifies whether to skip the Waiting for Traffic Switchover state. During the upgrade or downgrade, a new outbound IP address may be added to the API Gateway instance. The Waiting for Traffic Switchover state is used to remind users of adding the new outbound IP address to the whitelist. If you set the SkipWaitSwitch parameter to true, the instance does not enter the Waiting for Traffic Switchover state when a new outbound IP address is available. Instead, the system sends internal messages to the user.
         */
        public Builder skipWaitSwitch(Boolean skipWaitSwitch) {
            this.putQueryParameter("SkipWaitSwitch", skipWaitSwitch);
            this.skipWaitSwitch = skipWaitSwitch;
            return this;
        }

        /**
         * The password.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

}
