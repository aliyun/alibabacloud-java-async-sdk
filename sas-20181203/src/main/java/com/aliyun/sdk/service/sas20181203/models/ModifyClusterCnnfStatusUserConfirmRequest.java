// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyClusterCnnfStatusUserConfirmRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterCnnfStatusUserConfirmRequest</p>
 */
public class ModifyClusterCnnfStatusUserConfirmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private java.util.List<String> clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserConfirm")
    private Boolean userConfirm;

    private ModifyClusterCnnfStatusUserConfirmRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.userConfirm = builder.userConfirm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterCnnfStatusUserConfirmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return userConfirm
     */
    public Boolean getUserConfirm() {
        return this.userConfirm;
    }

    public static final class Builder extends Request.Builder<ModifyClusterCnnfStatusUserConfirmRequest, Builder> {
        private java.util.List<String> clusterIds; 
        private Boolean userConfirm; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterCnnfStatusUserConfirmRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.userConfirm = request.userConfirm;
        } 

        /**
         * <p>The cluster IDs.</p>
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>Specifies whether to fix the blocking status of the cluster. Valid values:</p>
         * <ul>
         * <li>true: yes</li>
         * <li>false: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder userConfirm(Boolean userConfirm) {
            this.putQueryParameter("UserConfirm", userConfirm);
            this.userConfirm = userConfirm;
            return this;
        }

        @Override
        public ModifyClusterCnnfStatusUserConfirmRequest build() {
            return new ModifyClusterCnnfStatusUserConfirmRequest(this);
        } 

    } 

}
