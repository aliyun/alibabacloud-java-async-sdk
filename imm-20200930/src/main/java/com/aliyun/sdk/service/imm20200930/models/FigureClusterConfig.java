// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link FigureClusterConfig} extends {@link TeaModel}
 *
 * <p>FigureClusterConfig</p>
 */
public class FigureClusterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoClustering")
    private Boolean autoClustering;

    @com.aliyun.core.annotation.NameInMap("AutoGenerate")
    private Boolean autoGenerate;

    @com.aliyun.core.annotation.NameInMap("EnabledFeatures")
    private java.util.List<String> enabledFeatures;

    @com.aliyun.core.annotation.NameInMap("MinEntityCount")
    private Long minEntityCount;

    private FigureClusterConfig(Builder builder) {
        this.autoClustering = builder.autoClustering;
        this.autoGenerate = builder.autoGenerate;
        this.enabledFeatures = builder.enabledFeatures;
        this.minEntityCount = builder.minEntityCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FigureClusterConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoClustering
     */
    public Boolean getAutoClustering() {
        return this.autoClustering;
    }

    /**
     * @return autoGenerate
     */
    public Boolean getAutoGenerate() {
        return this.autoGenerate;
    }

    /**
     * @return enabledFeatures
     */
    public java.util.List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }

    /**
     * @return minEntityCount
     */
    public Long getMinEntityCount() {
        return this.minEntityCount;
    }

    public static final class Builder {
        private Boolean autoClustering; 
        private Boolean autoGenerate; 
        private java.util.List<String> enabledFeatures; 
        private Long minEntityCount; 

        private Builder() {
        } 

        private Builder(FigureClusterConfig model) {
            this.autoClustering = model.autoClustering;
            this.autoGenerate = model.autoGenerate;
            this.enabledFeatures = model.enabledFeatures;
            this.minEntityCount = model.minEntityCount;
        } 

        /**
         * <p>Specifies whether to allow IMM to perform classification tasks on files in the dataset. Default value: False.</p>
         */
        public Builder autoClustering(Boolean autoClustering) {
            this.autoClustering = autoClustering;
            return this;
        }

        /**
         * <p>Indicates whether IMM is allowed to perform automatic creation of new groups. Default value: False.</p>
         */
        public Builder autoGenerate(Boolean autoGenerate) {
            this.autoGenerate = autoGenerate;
            return this;
        }

        /**
         * <p>The features supported by figure clustering.</p>
         */
        public Builder enabledFeatures(java.util.List<String> enabledFeatures) {
            this.enabledFeatures = enabledFeatures;
            return this;
        }

        /**
         * <p>The minimum threshold for the number of entities when automatic generation of new groups is allowed. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder minEntityCount(Long minEntityCount) {
            this.minEntityCount = minEntityCount;
            return this;
        }

        public FigureClusterConfig build() {
            return new FigureClusterConfig(this);
        } 

    } 

}
