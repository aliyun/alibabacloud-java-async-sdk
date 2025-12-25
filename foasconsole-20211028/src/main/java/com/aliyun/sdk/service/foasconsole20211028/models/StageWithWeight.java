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
 * {@link StageWithWeight} extends {@link TeaModel}
 *
 * <p>StageWithWeight</p>
 */
public class StageWithWeight extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("StepIndex")
    private Integer stepIndex;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private StageWithWeight(Builder builder) {
        this.stepIndex = builder.stepIndex;
        this.stepName = builder.stepName;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StageWithWeight create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stepIndex
     */
    public Integer getStepIndex() {
        return this.stepIndex;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private Integer stepIndex; 
        private String stepName; 
        private Integer weight; 

        private Builder() {
        } 

        private Builder(StageWithWeight model) {
            this.stepIndex = model.stepIndex;
            this.stepName = model.stepName;
            this.weight = model.weight;
        } 

        /**
         * StepIndex.
         */
        public Builder stepIndex(Integer stepIndex) {
            this.stepIndex = stepIndex;
            return this;
        }

        /**
         * StepName.
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public StageWithWeight build() {
            return new StageWithWeight(this);
        } 

    } 

}
