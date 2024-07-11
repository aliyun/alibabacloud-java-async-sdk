// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeMinorVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMinorVersionRequest</p>
 */
public class UpgradeMinorVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    private String components;

    private UpgradeMinorVersionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.components = builder.components;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMinorVersionRequest create() {
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
     * @return components
     */
    public String getComponents() {
        return this.components;
    }

    public static final class Builder extends Request.Builder<UpgradeMinorVersionRequest, Builder> {
        private String clusterId; 
        private String components; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMinorVersionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.components = request.components;
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
         * Components.
         */
        public Builder components(String components) {
            this.putQueryParameter("Components", components);
            this.components = components;
            return this;
        }

        @Override
        public UpgradeMinorVersionRequest build() {
            return new UpgradeMinorVersionRequest(this);
        } 

    } 

}
