// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillGroupRequest</p>
 */
public class ModifySkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowPrivateOutboundNumber")
    private Boolean allowPrivateOutboundNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundPhoneNumberId")
    private java.util.List<String> outboundPhoneNumberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
    private String routingStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevel")
    private java.util.List<Integer> skillLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private java.util.List<String> userId;

    private ModifySkillGroupRequest(Builder builder) {
        super(builder);
        this.allowPrivateOutboundNumber = builder.allowPrivateOutboundNumber;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.outboundPhoneNumberId = builder.outboundPhoneNumberId;
        this.routingStrategy = builder.routingStrategy;
        this.skillGroupId = builder.skillGroupId;
        this.skillLevel = builder.skillLevel;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySkillGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowPrivateOutboundNumber
     */
    public Boolean getAllowPrivateOutboundNumber() {
        return this.allowPrivateOutboundNumber;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outboundPhoneNumberId
     */
    public java.util.List<String> getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }

    /**
     * @return routingStrategy
     */
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillLevel
     */
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

    /**
     * @return userId
     */
    public java.util.List<String> getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ModifySkillGroupRequest, Builder> {
        private Boolean allowPrivateOutboundNumber; 
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.List<String> outboundPhoneNumberId; 
        private String routingStrategy; 
        private String skillGroupId; 
        private java.util.List<Integer> skillLevel; 
        private java.util.List<String> userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillGroupRequest request) {
            super(request);
            this.allowPrivateOutboundNumber = request.allowPrivateOutboundNumber;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.outboundPhoneNumberId = request.outboundPhoneNumberId;
            this.routingStrategy = request.routingStrategy;
            this.skillGroupId = request.skillGroupId;
            this.skillLevel = request.skillLevel;
            this.userId = request.userId;
        } 

        /**
         * AllowPrivateOutboundNumber.
         */
        public Builder allowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
            this.putQueryParameter("AllowPrivateOutboundNumber", allowPrivateOutboundNumber);
            this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OutboundPhoneNumberId.
         */
        public Builder outboundPhoneNumberId(java.util.List<String> outboundPhoneNumberId) {
            this.putQueryParameter("OutboundPhoneNumberId", outboundPhoneNumberId);
            this.outboundPhoneNumberId = outboundPhoneNumberId;
            return this;
        }

        /**
         * RoutingStrategy.
         */
        public Builder routingStrategy(String routingStrategy) {
            this.putQueryParameter("RoutingStrategy", routingStrategy);
            this.routingStrategy = routingStrategy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillLevel.
         */
        public Builder skillLevel(java.util.List<Integer> skillLevel) {
            this.putQueryParameter("SkillLevel", skillLevel);
            this.skillLevel = skillLevel;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(java.util.List<String> userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ModifySkillGroupRequest build() {
            return new ModifySkillGroupRequest(this);
        } 

    } 

}
