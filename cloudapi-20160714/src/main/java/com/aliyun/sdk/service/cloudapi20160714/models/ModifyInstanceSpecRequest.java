// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyAction")
    private String modifyAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipWaitSwitch")
    private Boolean skipWaitSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether payment is automatically made during renewal. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: Automatic payment is enabled. Make sure that your Alibaba Cloud account has adequate balance.</li>
         * <li><strong>False</strong>: Automatic payment is disabled. You have to manually pay in the console. Log on to the console. In the upper-right corner, choose <strong>Expenses &gt; User Center</strong>. In the left-side navigation pane, click <strong>Orders</strong>. On the page that appears, find your order and complete the payment.</li>
         * </ul>
         * <p>Default value: <strong>False</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-cn-v6419k43xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The specifications of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.s1.small</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>Specifies whether to upgrade or downgrade the instance. Valid values:</p>
         * <ul>
         * <li><strong>UPGRADE</strong></li>
         * <li><strong>DOWNGRADE</strong></li>
         * </ul>
         * <p>Default value: <strong>UPGRADE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder modifyAction(String modifyAction) {
            this.putQueryParameter("ModifyAction", modifyAction);
            this.modifyAction = modifyAction;
            return this;
        }

        /**
         * <p>Specifies whether to skip the Waiting for Traffic Switchover state. During the upgrade or downgrade, a new outbound IP address may be added to the API Gateway instance. The Waiting for Traffic Switchover state is used to remind users of adding the new outbound IP address to the whitelist. If you set the SkipWaitSwitch parameter to true, the instance does not enter the Waiting for Traffic Switchover state when a new outbound IP address is available. Instead, the system sends internal messages to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipWaitSwitch(Boolean skipWaitSwitch) {
            this.putQueryParameter("SkipWaitSwitch", skipWaitSwitch);
            this.skipWaitSwitch = skipWaitSwitch;
            return this;
        }

        /**
         * <p>The password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b5845042-2f2f-4e96-bd5c-36c6e5c2a68c</p>
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
