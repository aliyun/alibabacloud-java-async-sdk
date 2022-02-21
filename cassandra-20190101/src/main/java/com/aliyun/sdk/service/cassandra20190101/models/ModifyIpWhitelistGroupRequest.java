// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhitelistGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpWhitelistGroupRequest</p>
 */
public class ModifyIpWhitelistGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("IpList")
    private String ipList;

    @Query
    @NameInMap("IpVersion")
    @Validation(required = true)
    private Integer ipVersion;

    private ModifyIpWhitelistGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.ipList = builder.ipList;
        this.ipVersion = builder.ipVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpWhitelistGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public static final class Builder extends Request.Builder<ModifyIpWhitelistGroupRequest, Builder> {
        private String clusterId; 
        private String groupName; 
        private String ipList; 
        private Integer ipVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpWhitelistGroupRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.groupName = response.groupName;
            this.ipList = response.ipList;
            this.ipVersion = response.ipVersion;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        @Override
        public ModifyIpWhitelistGroupRequest build() {
            return new ModifyIpWhitelistGroupRequest(this);
        } 

    } 

}
