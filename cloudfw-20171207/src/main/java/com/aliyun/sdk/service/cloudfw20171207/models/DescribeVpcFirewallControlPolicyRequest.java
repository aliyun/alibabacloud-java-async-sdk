// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallControlPolicyRequest</p>
 */
public class DescribeVpcFirewallControlPolicyRequest extends Request {
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
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

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

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.currentPage = builder.currentPage;
        this.description = builder.description;
        this.destination = builder.destination;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallControlPolicyRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
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

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private String currentPage; 
        private String description; 
        private String destination; 
        private String lang; 
        private String memberUid; 
        private String pageSize; 
        private String proto; 
        private String release; 
        private String repeatType; 
        private String source; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.currentPage = request.currentPage;
            this.description = request.description;
            this.destination = request.destination;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatType = request.repeatType;
            this.source = request.source;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * *   **accept**: allows the traffic.
         * *   **drop**: blocks the traffic.
         * *   **log**: monitors the traffic.
         * 
         * > If you do not specify this parameter, access control policies are queried based on all actions.
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
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The description of the access control policy. Fuzzy match is supported.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination address in the access control policy. Fuzzy match is supported.
         * <p>
         * 
         * > The value of this parameter can be a CIDR block or an address book name.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * The language of the content within the request and response.
         * <p>
         * 
         * Valid values:
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
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 50.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The protocol type in the access control policy. Valid values:
         * <p>
         * 
         * *   **TCP**
         * *   **UDP**
         * *   **ICMP**
         * *   **ANY**: all protocol types
         * 
         * > If you do not specify this parameter, access control policies of all protocol types are queried.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * Specifies whether the access control policy is enabled. By default, an access control policy is enabled after the policy is created. Valid values:
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
         * The source address in the access control policy. Fuzzy match is supported.
         * <p>
         * 
         * > The value of this parameter can be a CIDR block or an address book name.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The instance ID of the VPC firewall. Valid values:
         * <p>
         * 
         * *   If the VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.
         * *   If the VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.
         * 
         * > You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the ID.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallControlPolicyRequest build() {
            return new DescribeVpcFirewallControlPolicyRequest(this);
        } 

    } 

}
