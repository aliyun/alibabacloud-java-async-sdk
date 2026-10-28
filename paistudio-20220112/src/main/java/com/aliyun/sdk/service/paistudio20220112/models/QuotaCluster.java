// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaCluster} extends {@link TeaModel}
 *
 * <p>QuotaCluster</p>
 */
public class QuotaCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSource> dataSources;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.Map<String, String> endpoints;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QuotaCluster(Builder builder) {
        this.clusterType = builder.clusterType;
        this.dataSources = builder.dataSources;
        this.endpoints = builder.endpoints;
        this.image = builder.image;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSource> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return endpoints
     */
    public java.util.Map<String, String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String clusterType; 
        private java.util.List<DataSource> dataSources; 
        private java.util.Map<String, String> endpoints; 
        private String image; 
        private String status; 

        private Builder() {
        } 

        private Builder(QuotaCluster model) {
            this.clusterType = model.clusterType;
            this.dataSources = model.dataSources;
            this.endpoints = model.endpoints;
            this.image = model.image;
            this.status = model.status;
        } 

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>RayCluster</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The datasource config.</p>
         */
        public Builder dataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The service access endpoints.</p>
         */
        public Builder endpoints(java.util.Map<String, String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The container image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai-training/kmeans:v1.0.0</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public QuotaCluster build() {
            return new QuotaCluster(this);
        } 

    } 

}
