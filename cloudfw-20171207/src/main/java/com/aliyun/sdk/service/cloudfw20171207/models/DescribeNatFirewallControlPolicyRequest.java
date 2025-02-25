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
 * {@link DescribeNatFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallControlPolicyRequest</p>
 */
public class DescribeNatFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proto")
    private String proto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Release")
    private String release;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatType")
    private String repeatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DescribeNatFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.currentPage = builder.currentPage;
        this.description = builder.description;
        this.destination = builder.destination;
        this.direction = builder.direction;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.pageSize = builder.pageSize;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallControlPolicyRequest create() {
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
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
     * @return repeatType
     */
    public String getRepeatType() {
        return this.repeatType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private String currentPage; 
        private String description; 
        private String destination; 
        private String direction; 
        private String lang; 
        private String natGatewayId; 
        private String pageSize; 
        private String proto; 
        private String release; 
        private String repeatType; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.currentPage = request.currentPage;
            this.description = request.description;
            this.destination = request.destination;
            this.direction = request.direction;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.pageSize = request.pageSize;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatType = request.repeatType;
            this.source = request.source;
        } 

        /**
         * <p>The action that Cloud Firewall performs on the traffic.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: denies the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * <p>The UUID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>303f0697-2a21-4e43-b142-4a77adf7b358</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The description of the access control policy. Fuzzy match is supported.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the descriptions of all policies are queried.</p>
         * </blockquote>
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
         * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the DestinationType parameter.</p>
         * <ul>
         * <li>If DestinationType is set to <code>net</code>, the value of Destination must be a CIDR block. Example: 10.0.3.0/24.</li>
         * <li>If DestinationType is set to <code>domain</code>, the value of Destination must be a domain name. Example: aliyun.</li>
         * <li>If DestinationType is set to <code>group</code>, the value of Destination must be the name of an address book. Example: db_group.</li>
         * <li>If DestinationType is set to <code>location</code>, the value of Destination is a location. For more information about location codes, see <a href="https://help.aliyun.com/document_detail/474128.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all types of destination addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x/32</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The ID of the NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxxxxx</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the protocol in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * <li><strong>ANY</strong>: all types of protocols</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, access control policies of all protocol types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong> (default): The policy always takes effect.</li>
         * <li><strong>None</strong>: The policy takes effect only once.</li>
         * <li><strong>Daily</strong>: The policy takes effect on a daily basis.</li>
         * <li><strong>Weekly</strong>: The policy takes effect on a weekly basis.</li>
         * <li><strong>Monthly</strong>: The policy takes effect on a monthly basis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permanent</p>
         */
        public Builder repeatType(String repeatType) {
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * <p>The source address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the SourceType parameter.</p>
         * <ul>
         * <li>If SourceType is set to <code>net</code>, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If SourceType is set to <code>group</code>, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.</li>
         * <li>If SourceType is set to <code>location</code>, the value of Source must be a location. Example: beijing.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all types of source addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1/32</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribeNatFirewallControlPolicyRequest build() {
            return new DescribeNatFirewallControlPolicyRequest(this);
        } 

    } 

}
