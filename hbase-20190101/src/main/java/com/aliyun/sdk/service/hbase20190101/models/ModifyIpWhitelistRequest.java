// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpWhitelistRequest</p>
 */
public class ModifyIpWhitelistRequest extends Request {
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
    private String ipVersion;

    private ModifyIpWhitelistRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.ipList = builder.ipList;
        this.ipVersion = builder.ipVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpWhitelistRequest create() {
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
    public String getIpVersion() {
        return this.ipVersion;
    }

    public static final class Builder extends Request.Builder<ModifyIpWhitelistRequest, Builder> {
        private String clusterId; 
        private String groupName; 
        private String ipList; 
        private String ipVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpWhitelistRequest response) {
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
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        @Override
        public ModifyIpWhitelistRequest build() {
            return new ModifyIpWhitelistRequest(this);
        } 

    } 

}
