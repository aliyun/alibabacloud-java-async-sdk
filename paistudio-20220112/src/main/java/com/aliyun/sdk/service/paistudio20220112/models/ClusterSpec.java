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
 * {@link ClusterSpec} extends {@link TeaModel}
 *
 * <p>ClusterSpec</p>
 */
public class ClusterSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSource> dataSources;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    private ClusterSpec(Builder builder) {
        this.clusterType = builder.clusterType;
        this.dataSources = builder.dataSources;
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterSpec create() {
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
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder {
        private String clusterType; 
        private java.util.List<DataSource> dataSources; 
        private String image; 

        private Builder() {
        } 

        private Builder(ClusterSpec model) {
            this.clusterType = model.clusterType;
            this.dataSources = model.dataSources;
            this.image = model.image;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public ClusterSpec build() {
            return new ClusterSpec(this);
        } 

    } 

}
