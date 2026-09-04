// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLFlowMilestoneCount} extends {@link TeaModel}
 *
 * <p>RLFlowMilestoneCount</p>
 */
public class RLFlowMilestoneCount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Milestone")
    private String milestone;

    private RLFlowMilestoneCount(Builder builder) {
        this.count = builder.count;
        this.milestone = builder.milestone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowMilestoneCount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return milestone
     */
    public String getMilestone() {
        return this.milestone;
    }

    public static final class Builder {
        private Integer count; 
        private String milestone; 

        private Builder() {
        } 

        private Builder(RLFlowMilestoneCount model) {
            this.count = model.count;
            this.milestone = model.milestone;
        } 

        /**
         * <p>停留在该里程碑的在途轨迹数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>里程碑，取值同 Stuck[].Milestone</p>
         * 
         * <strong>example:</strong>
         * <p>生成中</p>
         */
        public Builder milestone(String milestone) {
            this.milestone = milestone;
            return this;
        }

        public RLFlowMilestoneCount build() {
            return new RLFlowMilestoneCount(this);
        } 

    } 

}
