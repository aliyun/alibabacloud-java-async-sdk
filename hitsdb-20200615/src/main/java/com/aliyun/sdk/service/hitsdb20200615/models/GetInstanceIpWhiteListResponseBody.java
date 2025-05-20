// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetInstanceIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceIpWhiteListResponseBody</p>
 */
public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List<GroupList> groupList;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List<String> ipList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceIpWhiteListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.groupList = builder.groupList;
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceIpWhiteListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return groupList
     */
    public java.util.List<GroupList> getGroupList() {
        return this.groupList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<GroupList> groupList; 
        private String instanceId; 
        private java.util.List<String> ipList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceIpWhiteListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.groupList = model.groupList;
            this.instanceId = model.instanceId;
            this.ipList = model.ipList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The details about the IP address whitelists.</p>
         */
        public Builder groupList(java.util.List<GroupList> groupList) {
            this.groupList = groupList;
            return this;
        }

        /**
         * <p>The ID of the Lindorm instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1z3506imz2f****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of IP addresses in the whitelist of the instance.</p>
         */
        public Builder ipList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1D1F6F4D-9203-53E7-84E9-5376B4657E63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceIpWhiteListResponseBody build() {
            return new GetInstanceIpWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceIpWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceIpWhiteListResponseBody</p>
     */
    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIpList")
        private String securityIpList;

        private GroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.securityIpList = builder.securityIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return securityIpList
         */
        public String getSecurityIpList() {
            return this.securityIpList;
        }

        public static final class Builder {
            private String groupName; 
            private String securityIpList; 

            private Builder() {
            } 

            private Builder(GroupList model) {
                this.groupName = model.groupName;
                this.securityIpList = model.securityIpList;
            } 

            /**
             * <p>The name of the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder securityIpList(String securityIpList) {
                this.securityIpList = securityIpList;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
}
