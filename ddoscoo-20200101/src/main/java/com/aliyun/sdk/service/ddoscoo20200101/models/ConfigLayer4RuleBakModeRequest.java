// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RuleBakModeRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleBakModeRequest</p>
 */
public class ConfigLayer4RuleBakModeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BakMode")
    @Validation(required = true)
    private String bakMode;

    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    private ConfigLayer4RuleBakModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bakMode = builder.bakMode;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RuleBakModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bakMode
     */
    public String getBakMode() {
        return this.bakMode;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RuleBakModeRequest, Builder> {
        private String regionId; 
        private String bakMode; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleBakModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bakMode = request.bakMode;
            this.listeners = request.listeners;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The mode that you want to use to forward service traffic. Valid values:
         * <p>
         * 
         * *   **0**: the default mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin IP address that you specified when you created the port forwarding rule. You can call the [CreateNetworkRules](~~157482~~) operation to create a port forwarding rule.
         * *   **1**: the origin redundancy mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary or secondary origin servers. You can call the [ConfigLayer4RulePolicy](~~312684~~) operation to configure IP addresses.
         */
        public Builder bakMode(String bakMode) {
            this.putQueryParameter("BakMode", bakMode);
            this.bakMode = bakMode;
            return this;
        }

        /**
         * The port forwarding rule that you want to manage.
         * <p>
         * 
         * This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.
         * 
         * > You can call the [DescribeNetworkRules](~~157484~~) to query existing port forwarding rules.
         * 
         * Each port forwarding rule contains the following fields:
         * 
         * *   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.
         * *   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.
         * *   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public ConfigLayer4RuleBakModeRequest build() {
            return new ConfigLayer4RuleBakModeRequest(this);
        } 

    } 

}
