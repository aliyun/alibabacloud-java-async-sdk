// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterDeletionProtectionRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterDeletionProtectionRequest</p>
 */
public class ModifyClusterDeletionProtectionRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Protection")
    @Validation(required = true)
    private Boolean protection;

    private ModifyClusterDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.protection = builder.protection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterDeletionProtectionRequest create() {
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
     * @return protection
     */
    public Boolean getProtection() {
        return this.protection;
    }

    public static final class Builder extends Request.Builder<ModifyClusterDeletionProtectionRequest, Builder> {
        private String clusterId; 
        private Boolean protection; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterDeletionProtectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.protection = request.protection;
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
         * Protection.
         */
        public Builder protection(Boolean protection) {
            this.putQueryParameter("Protection", protection);
            this.protection = protection;
            return this;
        }

        @Override
        public ModifyClusterDeletionProtectionRequest build() {
            return new ModifyClusterDeletionProtectionRequest(this);
        } 

    } 

}
