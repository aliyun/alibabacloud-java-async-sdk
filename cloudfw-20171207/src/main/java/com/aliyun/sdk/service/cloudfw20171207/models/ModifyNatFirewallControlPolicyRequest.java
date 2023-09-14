// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNatFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatFirewallControlPolicyRequest</p>
 */
public class ModifyNatFirewallControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclAction")
    @Validation(required = true)
    private String aclAction;

    @Query
    @NameInMap("AclUuid")
    @Validation(required = true)
    private String aclUuid;

    @Query
    @NameInMap("ApplicationNameList")
    private java.util.List < String > applicationNameList;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DestPort")
    private String destPort;

    @Query
    @NameInMap("DestPortGroup")
    private String destPortGroup;

    @Query
    @NameInMap("DestPortType")
    private String destPortType;

    @Query
    @NameInMap("Destination")
    @Validation(required = true)
    private String destination;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("DomainResolveType")
    private String domainResolveType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("Proto")
    @Validation(required = true)
    private String proto;

    @Query
    @NameInMap("Release")
    private String release;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private ModifyNatFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.applicationNameList = builder.applicationNameList;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.domainResolveType = builder.domainResolveType;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.proto = builder.proto;
        this.release = builder.release;
        this.source = builder.source;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatFirewallControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclAction
     */
    public String getAclAction() {
        return this.aclAction;
    }

    /**
     * @return aclUuid
     */
    public String getAclUuid() {
        return this.aclUuid;
    }

    /**
     * @return applicationNameList
     */
    public java.util.List < String > getApplicationNameList() {
        return this.applicationNameList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destPort
     */
    public String getDestPort() {
        return this.destPort;
    }

    /**
     * @return destPortGroup
     */
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    /**
     * @return destPortType
     */
    public String getDestPortType() {
        return this.destPortType;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return domainResolveType
     */
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return release
     */
    public String getRelease() {
        return this.release;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyNatFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private java.util.List < String > applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String domainResolveType; 
        private String lang; 
        private String natGatewayId; 
        private String proto; 
        private String release; 
        private String source; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.applicationNameList = request.applicationNameList;
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.domainResolveType = request.domainResolveType;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.proto = request.proto;
            this.release = request.release;
            this.source = request.source;
            this.sourceType = request.sourceType;
        } 

        /**
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * *   **accept**: allows the traffic.
         * *   **drop**: denies the traffic.
         * *   **log**: monitors the traffic.
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * The UUID of the access control policy.
         * <p>
         * 
         * To modify the configurations of an access control policy, you must provide the UUID of the policy. You can call the DescribeNatFirewallControlPolicy operation to query the UUIDs of access control policies.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder applicationNameList(java.util.List < String > applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * The description of the access control policy. Fuzzy match is supported.
         * <p>
         * 
         * > If you do not specify this parameter, the descriptions of all policies are queried.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination port in the access control policy.
         * <p>
         * 
         * > If **DestPortType** is set to `port`, you must specify this parameter.
         */
        public Builder destPort(String destPort) {
            this.putQueryParameter("DestPort", destPort);
            this.destPort = destPort;
            return this;
        }

        /**
         * The name of the destination port address book in the access control policy.
         */
        public Builder destPortGroup(String destPortGroup) {
            this.putQueryParameter("DestPortGroup", destPortGroup);
            this.destPortGroup = destPortGroup;
            return this;
        }

        /**
         * The type of the destination port in the access control policy. Valid values:
         * <p>
         * 
         * *   **port**: port
         * *   **group**: port address book
         */
        public Builder destPortType(String destPortType) {
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * The destination address in the access control policy.
         * <p>
         * 
         * *   If **DestinationType** is set to net, the value of **Destination** is a CIDR block. Example: 1.2.3.4/24
         * *   If **DestinationType** is set to group, the value of **Destination** is an address book. Example: db_group
         * *   If **DestinationType** is set to domain, the value of **Destination** is a domain name. Example: \*.aliyuncs.com
         * *   If **DestinationType** is set to location, the value of **Destination** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * The type of the destination address in the access control policy. Valid values:
         * <p>
         * 
         * *   **net**: CIDR block
         * *   **group**: address book
         * *   **domain**: domain name
         * *   **location**
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The domain name resolution method of the access control policy. By default, an access control policy is enabled after it is created. Valid values:
         * <p>
         * 
         * *   **0**: Fully qualified domain name (FQDN)-based resolution
         * *   **1**: Domain Name System (DNS)-based dynamic resolution
         * *   **2**: FQDN and DNS-based dynamic resolution
         */
        public Builder domainResolveType(String domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The protocol type supported by the access control policy. Valid values:
         * <p>
         * 
         * *   **ANY**
         * *   **TCP**
         * *   **UDP**
         * *   **ICMP**
         * 
         * > The value **ANY** indicates all types of protocols.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * The status of the access control policy. Valid values:
         * <p>
         * 
         * *   true: enabled
         * *   false: disabled
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * The source address in the access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   If **SourceType** is set to `net`, the value of Source is a CIDR block.
         * 
         *     Example: 10.2.4.0/24
         * 
         * *   If **SourceType** is set to `group`, the value of this parameter is an address book.
         * 
         *     Example: db_group
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The type of the source address in the access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   **net**: CIDR block
         * *   **group**: address book
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyNatFirewallControlPolicyRequest build() {
            return new ModifyNatFirewallControlPolicyRequest(this);
        } 

    } 

}
