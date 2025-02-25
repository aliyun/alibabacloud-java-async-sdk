// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupDnsAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupDnsAuthorizationRuleRequest</p>
 */
public class UpdateGroupDnsAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationIp")
    private String destinationIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDNSIp")
    private String sourceDNSIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorGroupId;

    private UpdateGroupDnsAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.authorizationRuleId = builder.authorizationRuleId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationIp = builder.destinationIp;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.sourceDNSIp = builder.sourceDNSIp;
        this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupDnsAuthorizationRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationIp
     */
    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceDNSIp
     */
    public String getSourceDNSIp() {
        return this.sourceDNSIp;
    }

    /**
     * @return wirelessCloudConnectorGroupId
     */
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateGroupDnsAuthorizationRuleRequest, Builder> {
        private String authorizationRuleId; 
        private String clientToken; 
        private String description; 
        private String destinationIp; 
        private Boolean dryRun; 
        private String name; 
        private String sourceDNSIp; 
        private String wirelessCloudConnectorGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupDnsAuthorizationRuleRequest request) {
            super(request);
            this.authorizationRuleId = request.authorizationRuleId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationIp = request.destinationIp;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.sourceDNSIp = request.sourceDNSIp;
            this.wirelessCloudConnectorGroupId = request.wirelessCloudConnectorGroupId;
        } 

        /**
         * AuthorizationRuleId.
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.putQueryParameter("AuthorizationRuleId", authorizationRuleId);
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * DestinationIp.
         */
        public Builder destinationIp(String destinationIp) {
            this.putQueryParameter("DestinationIp", destinationIp);
            this.destinationIp = destinationIp;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * SourceDNSIp.
         */
        public Builder sourceDNSIp(String sourceDNSIp) {
            this.putQueryParameter("SourceDNSIp", sourceDNSIp);
            this.sourceDNSIp = sourceDNSIp;
            return this;
        }

        /**
         * WirelessCloudConnectorGroupId.
         */
        public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }

        @Override
        public UpdateGroupDnsAuthorizationRuleRequest build() {
            return new UpdateGroupDnsAuthorizationRuleRequest(this);
        } 

    } 

}
