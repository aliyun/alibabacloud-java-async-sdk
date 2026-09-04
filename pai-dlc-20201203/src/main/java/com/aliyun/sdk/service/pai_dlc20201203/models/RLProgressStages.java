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
 * {@link RLProgressStages} extends {@link TeaModel}
 *
 * <p>RLProgressStages</p>
 */
public class RLProgressStages extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentIndex")
    private Integer currentIndex;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("Stages")
    private java.util.List<RLProgressStage> stages;

    @com.aliyun.core.annotation.NameInMap("StepDone")
    private Boolean stepDone;

    private RLProgressStages(Builder builder) {
        this.currentIndex = builder.currentIndex;
        this.mode = builder.mode;
        this.stages = builder.stages;
        this.stepDone = builder.stepDone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressStages create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentIndex
     */
    public Integer getCurrentIndex() {
        return this.currentIndex;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return stages
     */
    public java.util.List<RLProgressStage> getStages() {
        return this.stages;
    }

    /**
     * @return stepDone
     */
    public Boolean getStepDone() {
        return this.stepDone;
    }

    public static final class Builder {
        private Integer currentIndex; 
        private String mode; 
        private java.util.List<RLProgressStage> stages; 
        private Boolean stepDone; 

        private Builder() {
        } 

        private Builder(RLProgressStages model) {
            this.currentIndex = model.currentIndex;
            this.mode = model.mode;
            this.stages = model.stages;
            this.stepDone = model.stepDone;
        } 

        /**
         * <p>当前所处阶段的下标</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder currentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }

        /**
         * <p>disagg / colocate / 空串</p>
         * 
         * <strong>example:</strong>
         * <p>colocate</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>阶段列表，按流水线顺序</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;generation&quot;,&quot;Label&quot;:&quot;生成&quot;,&quot;Marker&quot;:&quot;start/end generation&quot;,&quot;Optional&quot;:false,&quot;Status&quot;:&quot;done&quot;,&quot;StartTime&quot;:1787474487,&quot;EndTime&quot;:1787474487,&quot;Duration&quot;:0.483}]</p>
         */
        public Builder stages(java.util.List<RLProgressStage> stages) {
            this.stages = stages;
            return this;
        }

        /**
         * <p>本 step 的阶段流水线是否已走完</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stepDone(Boolean stepDone) {
            this.stepDone = stepDone;
            return this;
        }

        public RLProgressStages build() {
            return new RLProgressStages(this);
        } 

    } 

}
