// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link ClusterState} extends {@link TeaModel}
 *
 * <p>ClusterState</p>
 */
public class ClusterState extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterStage")
    private ClusterStage clusterStage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    private ClusterState(Builder builder) {
        this.clusterStage = builder.clusterStage;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterState create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterStage
     */
    public ClusterStage getClusterStage() {
        return this.clusterStage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    public static final class Builder {
        private ClusterStage clusterStage; 
        private String status; 
        private String subStatus; 

        private Builder() {
        } 

        private Builder(ClusterState model) {
            this.clusterStage = model.clusterStage;
            this.status = model.status;
            this.subStatus = model.subStatus;
        } 

        /**
         * ClusterStage.
         */
        public Builder clusterStage(ClusterStage clusterStage) {
            this.clusterStage = clusterStage;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public ClusterState build() {
            return new ClusterState(this);
        } 

    } 

}
