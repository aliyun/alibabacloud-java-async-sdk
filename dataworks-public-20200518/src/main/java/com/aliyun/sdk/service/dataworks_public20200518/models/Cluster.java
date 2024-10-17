// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Cluster} extends {@link TeaModel}
 *
 * <p>Cluster</p>
 */
public class Cluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterBizId;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long clusterId;

    private Cluster(Builder builder) {
        this.clusterBizId = builder.clusterBizId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Cluster create() {
        return builder().build();
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    public static final class Builder {
        private String clusterBizId; 
        private Long clusterId; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-d8a7523****</p>
         */
        public Builder clusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder clusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Cluster build() {
            return new Cluster(this);
        } 

    } 

}
