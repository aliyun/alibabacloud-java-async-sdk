// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceIpWhiteListResponseBody</p>
 */
public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    @NameInMap("GroupList")
    private java.util.List < GroupList> groupList;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IpList")
    private java.util.List < String > ipList;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceIpWhiteListResponseBody(Builder builder) {
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

    /**
     * @return groupList
     */
    public java.util.List < GroupList> getGroupList() {
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
    public java.util.List < String > getIpList() {
        return this.ipList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GroupList> groupList; 
        private String instanceId; 
        private java.util.List < String > ipList; 
        private String requestId; 

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List < GroupList> groupList) {
            this.groupList = groupList;
            return this;
        }

        /**
         * The ID of the Lindorm instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpList.
         */
        public Builder ipList(java.util.List < String > ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceIpWhiteListResponseBody build() {
            return new GetInstanceIpWhiteListResponseBody(this);
        } 

    } 

    public static class GroupList extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("SecurityIpList")
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

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * SecurityIpList.
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
