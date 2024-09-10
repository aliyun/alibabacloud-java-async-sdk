// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPostPayModuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyPostPayModuleSwitchRequest</p>
 */
public class ModifyPostPayModuleSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPayInstanceId")
    private String postPayInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
    private String postPayModuleSwitch;

    private ModifyPostPayModuleSwitchRequest(Builder builder) {
        super(builder);
        this.postPayInstanceId = builder.postPayInstanceId;
        this.postPayModuleSwitch = builder.postPayModuleSwitch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPostPayModuleSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return postPayInstanceId
     */
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    /**
     * @return postPayModuleSwitch
     */
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    public static final class Builder extends Request.Builder<ModifyPostPayModuleSwitchRequest, Builder> {
        private String postPayInstanceId; 
        private String postPayModuleSwitch; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPostPayModuleSwitchRequest request) {
            super(request);
            this.postPayInstanceId = request.postPayInstanceId;
            this.postPayModuleSwitch = request.postPayModuleSwitch;
        } 

        /**
         * The ID of the pay-as-you-go instance. This parameter is required.
         * <p>
         * 
         * >  You can call the [DescribeVersionConfig](~DescribeVersionConfig~) operation to obtain the ID.
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.putQueryParameter("PostPayInstanceId", postPayInstanceId);
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * The switch status of the pay-as-you-go module. The value is a JSON string. Valid values:
         * <p>
         * 
         * *   Key:
         * 
         *     *   **VUL**: vulnerability fixing module
         *     *   **CSPM**: cloud service configuration check module
         *     *   **AGENTLESS**: agentless detection module
         *     *   **SERVERLESS**: serverless asset module
         * 
         * *   Value: A value of 0 specifies disabled. A value of 1 specifies enabled.
         * 
         * >  If you do not specify a value for a module, the original value of the module is retained.
         */
        public Builder postPayModuleSwitch(String postPayModuleSwitch) {
            this.putQueryParameter("PostPayModuleSwitch", postPayModuleSwitch);
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }

        @Override
        public ModifyPostPayModuleSwitchRequest build() {
            return new ModifyPostPayModuleSwitchRequest(this);
        } 

    } 

}
