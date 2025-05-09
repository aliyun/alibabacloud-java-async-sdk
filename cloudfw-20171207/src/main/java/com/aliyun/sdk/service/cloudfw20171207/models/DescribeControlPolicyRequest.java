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
 * {@link DescribeControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeControlPolicyRequest</p>
 */
public class DescribeControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private DescribeControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.currentPage = builder.currentPage;
        this.description = builder.description;
        this.destination = builder.destination;
        this.direction = builder.direction;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPolicyRequest create() {
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<DescribeControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private String currentPage; 
        private String description; 
        private String destination; 
        private String direction; 
        private String ipVersion; 
        private String lang; 
        private String pageSize; 
        private String proto; 
        private String release; 
        private String repeatType; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribeControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.currentPage = request.currentPage;
            this.description = request.description;
            this.destination = request.destination;
            this.direction = request.direction;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatType = request.repeatType;
            this.source = request.source;
        } 

        /**
         * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: denies the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, access control policies of all action types are queried.</p>
         * </blockquote>
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
         * <p>The unique ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Default value: 1.</p>
         * <p>This parameter is required.</p>
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
         * <p> If you do not specify this parameter, access control policies that have descriptions are queried.</p>
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
         * <li>If you set DestinationType to <code>net</code>, the value of Destination is a CIDR block. Example: 10.0.3.0/24.</li>
         * <li>If you set DestinationType to <code>domain</code>, the value of Destination is a domain name. Example: aliyun.</li>
         * <li>If you set DestinationType to <code>group</code>, the value of Destination is the name of an address book. Example: db_group.</li>
         * <li>If you set DestinationType to <code>location</code>, the value of Destination is the name of a location. For more information about location codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, access control policies of all destination address types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The direction of the traffic to which the access control policies apply. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound.</li>
         * <li><strong>out</strong>: outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The IP version of the address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4 (default)</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
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
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
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
         * <p> If you do not specify this parameter, access control policies of all protocol types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The access control policy is enabled.</li>
         * <li><strong>false</strong>: The access control policy is disabled.</li>
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
         * <li><strong>None</strong>: The policy takes effect for only once.</li>
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
         * <p>The source address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the SourceType parameter.</p>
         * <ul>
         * <li>If SourceType is set to <code>net</code>, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If SourceType is set to <code>group</code>, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.</li>
         * <li>If SourceType is set to <code>location</code>, the value of Source must be a location. Example: beijing.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, access control policies of all source address types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribeControlPolicyRequest build() {
            return new DescribeControlPolicyRequest(this);
        } 

    } 

}
