// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigClusterWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ConfigClusterWhitelistRequest</p>
 */
public class ConfigClusterWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private ConfigClusterWhitelistRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigClusterWhitelistRequest create() {
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
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<ConfigClusterWhitelistRequest, Builder> {
        private String clusterId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ConfigClusterWhitelistRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.whitelist = request.whitelist;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The IP address whitelist of the cluster.
         */
        public Builder whitelist(String whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public ConfigClusterWhitelistRequest build() {
            return new ConfigClusterWhitelistRequest(this);
        } 

    } 

}
