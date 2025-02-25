// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpWhitelistRequest</p>
 */
public class ModifyIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    private String ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifyIpWhitelistRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.ipList = request.ipList;
            this.ipVersion = request.ipVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1uoihlf82e8****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_01</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
