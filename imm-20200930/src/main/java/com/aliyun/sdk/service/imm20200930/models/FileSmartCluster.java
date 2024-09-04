// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileSmartCluster} extends {@link TeaModel}
 *
 * <p>FileSmartCluster</p>
 */
public class FileSmartCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Similarity")
    private Float similarity;

    @com.aliyun.core.annotation.NameInMap("SmartClusterId")
    private String smartClusterId;

    private FileSmartCluster(Builder builder) {
        this.similarity = builder.similarity;
        this.smartClusterId = builder.smartClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileSmartCluster create() {
        return builder().build();
    }

    /**
     * @return similarity
     */
    public Float getSimilarity() {
        return this.similarity;
    }

    /**
     * @return smartClusterId
     */
    public String getSmartClusterId() {
        return this.smartClusterId;
    }

    public static final class Builder {
        private Float similarity; 
        private String smartClusterId; 

        /**
         * Similarity.
         */
        public Builder similarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }

        /**
         * SmartClusterId.
         */
        public Builder smartClusterId(String smartClusterId) {
            this.smartClusterId = smartClusterId;
            return this;
        }

        public FileSmartCluster build() {
            return new FileSmartCluster(this);
        } 

    } 

}
