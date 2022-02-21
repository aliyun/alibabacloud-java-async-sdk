// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

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
    @NameInMap("IpList")
    @Validation(required = true)
    private String ipList;

    private ModifyIpWhitelistRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ipList = builder.ipList;
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
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    public static final class Builder extends Request.Builder<ModifyIpWhitelistRequest, Builder> {
        private String clusterId; 
        private String ipList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpWhitelistRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.ipList = response.ipList;
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
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        @Override
        public ModifyIpWhitelistRequest build() {
            return new ModifyIpWhitelistRequest(this);
        } 

    } 

}
