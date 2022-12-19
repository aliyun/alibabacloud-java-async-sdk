// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyStrategyTargetRequest</p>
 */
public class ModifyStrategyTargetRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ModifyStrategyTargetRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sourceIp = builder.sourceIp;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStrategyTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyStrategyTargetRequest, Builder> {
        private String config; 
        private String sourceIp; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStrategyTargetRequest request) {
            super(request);
            this.config = request.config;
            this.sourceIp = request.sourceIp;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * The ID of the baseline check policy. The ID is returned after the policy is created. The value of this parameter is in the JSON format and contains the following field:
         * <p>
         * 
         * *   **strategyId**: the ID of the policy
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The information about the asset group to which the policy is applied. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **TargetType**: the type of the asset to which the policy is applied. Set the value to **groupId**, which indicates that the policy is applied to an asset group.
         * 
         * *   **BindUuidCount**: the number of servers to which the policy is applied.
         * 
         * *   **Target**: the ID of the asset group.
         * 
         * *   **Flag**: the operation that you want to perform on the asset group. Valid values:
         * 
         *     *   **del**: removes the asset group from the policy.
         *     *   **add**: adds the asset group to the policy.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The configuration type. Set the value to **hc_strategy**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyStrategyTargetRequest build() {
            return new ModifyStrategyTargetRequest(this);
        } 

    } 

}
