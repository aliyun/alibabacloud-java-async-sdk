// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillGroupRequest</p>
 */
public class CreateSkillGroupRequest extends Request {
    @Query
    @NameInMap("AllowPrivateOutboundNumber")
    private Boolean allowPrivateOutboundNumber;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OutboundPhoneNumberId")
    private java.util.List < String > outboundPhoneNumberId;

    @Query
    @NameInMap("RoutingStrategy")
    private String routingStrategy;

    @Query
    @NameInMap("SkillLevel")
    private java.util.List < Integer > skillLevel;

    @Query
    @NameInMap("UserId")
    private java.util.List < String > userId;

    private CreateSkillGroupRequest(Builder builder) {
        super(builder);
        this.allowPrivateOutboundNumber = builder.allowPrivateOutboundNumber;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.outboundPhoneNumberId = builder.outboundPhoneNumberId;
        this.routingStrategy = builder.routingStrategy;
        this.skillLevel = builder.skillLevel;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillGroupRequest create() {
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
    public java.util.List < String > getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }

    /**
     * @return routingStrategy
     */
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * @return skillLevel
     */
    public java.util.List < Integer > getSkillLevel() {
        return this.skillLevel;
    }

    /**
     * @return userId
     */
    public java.util.List < String > getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateSkillGroupRequest, Builder> {
        private Boolean allowPrivateOutboundNumber; 
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.List < String > outboundPhoneNumberId; 
        private String routingStrategy; 
        private java.util.List < Integer > skillLevel; 
        private java.util.List < String > userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillGroupRequest response) {
            super(response);
            this.allowPrivateOutboundNumber = response.allowPrivateOutboundNumber;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.outboundPhoneNumberId = response.outboundPhoneNumberId;
            this.routingStrategy = response.routingStrategy;
            this.skillLevel = response.skillLevel;
            this.userId = response.userId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OutboundPhoneNumberId.
         */
        public Builder outboundPhoneNumberId(java.util.List < String > outboundPhoneNumberId) {
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
         * SkillLevel.
         */
        public Builder skillLevel(java.util.List < Integer > skillLevel) {
            this.putQueryParameter("SkillLevel", skillLevel);
            this.skillLevel = skillLevel;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(java.util.List < String > userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateSkillGroupRequest build() {
            return new CreateSkillGroupRequest(this);
        } 

    } 

}
