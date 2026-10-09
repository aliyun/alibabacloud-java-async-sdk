// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyDnsFirewallPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDnsFirewallPolicyRequest</p>
 */
public class ModifyDnsFirewallPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Release")
    private String release;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ModifyDnsFirewallPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.description = builder.description;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.lang = builder.lang;
        this.priority = builder.priority;
        this.release = builder.release;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDnsFirewallPolicyRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyDnsFirewallPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private String description; 
        private String destination; 
        private String destinationType; 
        private String lang; 
        private String priority; 
        private String release; 
        private String source; 
        private String sourceIp; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDnsFirewallPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.description = request.description;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.lang = request.lang;
            this.priority = request.priority;
            this.release = request.release;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The action that the access control policy performs on traffic in Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: deny the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * <p>The unique ID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df22****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The description of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination address in the access control policy.</p>
         * <ul>
         * <li>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> is a destination CIDR block. Example: 1.2.3.4/24.</li>
         * <li>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> is the name of a destination address book. Example: db_group.</li>
         * <li>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> is a destination domain name. Example: *.aliyuncs.com.</li>
         * <li>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> is a destination area. For more information about area positional encoding, see the following sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db_group</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The type of the destination address in the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: destination CIDR block</li>
         * <li><strong>group</strong>: destination address book</li>
         * <li><strong>domain</strong>: destination domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The policy priority of the access control policy before the modification.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Specifies whether to enable the access control policy. The policy is enabled by default after it is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the access control policy.</li>
         * <li><strong>false</strong>: disables the access control policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: source CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: source address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyDnsFirewallPolicyRequest build() {
            return new ModifyDnsFirewallPolicyRequest(this);
        } 

    } 

}
