// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeControlPolicyRequest</p>
 */
public class DescribeControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclAction")
    private String aclAction;

    @Query
    @NameInMap("AclUuid")
    private String aclUuid;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private String currentPage;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Destination")
    private String destination;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Proto")
    private String proto;

    @Query
    @NameInMap("Release")
    private String release;

    @Query
    @NameInMap("RepeatType")
    private String repeatType;

    @Query
    @NameInMap("Source")
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
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * *   **accept**: allows the traffic.
         * *   **drop**: denies the traffic.
         * *   **log**: monitors the traffic.
         * 
         * >  If you do not specify this parameter, access control policies of all action types are queried.
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * The unique ID of the access control policy.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The description of the access control policy. Fuzzy match is supported.
         * <p>
         * 
         * >  If you do not specify this parameter, access control policies that have descriptions are queried.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the DestinationType parameter.
         * <p>
         * 
         * *   If DestinationType is set to `net`, the value of Destination must be a CIDR block. Example: 10.0.3.0/24.
         * *   If DestinationType is set to `domain`, the value of Destination must be a domain name. Example: aliyun.
         * *   If DestinationType is set to `group`, the value of Destination must be the name of an address book. Example: db_group.
         * *   If DestinationType is set to `location`, the value of Destination must be a location. Example: beijing.
         * 
         * >  If you do not specify this parameter, access control policies of all destination address types are queried.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * The direction of the traffic to which the access control policy applies. Valid values:
         * <p>
         * 
         * *   **in**: inbound traffic
         * *   **out**: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The IP version of the address in the access control policy. Valid values:
         * <p>
         * 
         * *   **4**: IPv4 (default)
         * *   **6**: IPv6
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
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
         * The number of entries to return on each page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the protocol in the access control policy. Valid values:
         * <p>
         * 
         * * **TCP**
         * * **UDP**
         * * **ICMP**
         * * **ANY**: all types of protocols
         * 
         * >  If you do not specify this parameter, access control policies of all protocol types are queried.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
         * <p>
         * 
         * *   **true**: The access control policy is enabled.
         * *   **false**: The access control policy is disabled.
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * RepeatType.
         */
        public Builder repeatType(String repeatType) {
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * The source address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the SourceType parameter.
         * <p>
         * 
         * *   If SourceType is set to `net`, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.
         * *   If SourceType is set to `group`, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.
         * *   If SourceType is set to `location`, the value of Source must be a location. Example: beijing.
         * 
         * >  If you do not specify this parameter, access control policies of all source address types are queried.
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
