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
 * {@link DatasetConfig} extends {@link TeaModel}
 *
 * <p>DatasetConfig</p>
 */
public class DatasetConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Insights")
    private InsightsConfig insights;

    @com.aliyun.core.annotation.NameInMap("SmartCluster")
    private SmartClusterConfig smartCluster;

    private DatasetConfig(Builder builder) {
        this.insights = builder.insights;
        this.smartCluster = builder.smartCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insights
     */
    public InsightsConfig getInsights() {
        return this.insights;
    }

    /**
     * @return smartCluster
     */
    public SmartClusterConfig getSmartCluster() {
        return this.smartCluster;
    }

    public static final class Builder {
        private InsightsConfig insights; 
        private SmartClusterConfig smartCluster; 

        private Builder() {
        } 

        private Builder(DatasetConfig model) {
            this.insights = model.insights;
            this.smartCluster = model.smartCluster;
        } 

        /**
         * Insights.
         */
        public Builder insights(InsightsConfig insights) {
            this.insights = insights;
            return this;
        }

        /**
         * SmartCluster.
         */
        public Builder smartCluster(SmartClusterConfig smartCluster) {
            this.smartCluster = smartCluster;
            return this;
        }

        public DatasetConfig build() {
            return new DatasetConfig(this);
        } 

    } 

}
