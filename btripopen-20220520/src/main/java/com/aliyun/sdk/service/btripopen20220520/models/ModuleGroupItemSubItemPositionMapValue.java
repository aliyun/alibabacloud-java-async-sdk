// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleGroupItemSubItemPositionMapValue} extends {@link TeaModel}
 *
 * <p>ModuleGroupItemSubItemPositionMapValue</p>
 */
public class ModuleGroupItemSubItemPositionMapValue extends TeaModel {
    @NameInMap("journey_index")
    private Integer journeyIndex;

    @NameInMap("segment_index")
    private Integer segmentIndex;

    private ModuleGroupItemSubItemPositionMapValue(Builder builder) {
        this.journeyIndex = builder.journeyIndex;
        this.segmentIndex = builder.segmentIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleGroupItemSubItemPositionMapValue create() {
        return builder().build();
    }

    /**
     * @return journeyIndex
     */
    public Integer getJourneyIndex() {
        return this.journeyIndex;
    }

    /**
     * @return segmentIndex
     */
    public Integer getSegmentIndex() {
        return this.segmentIndex;
    }

    public static final class Builder {
        private Integer journeyIndex; 
        private Integer segmentIndex; 

        /**
         * journey_index.
         */
        public Builder journeyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }

        /**
         * segment_index.
         */
        public Builder segmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }

        public ModuleGroupItemSubItemPositionMapValue build() {
            return new ModuleGroupItemSubItemPositionMapValue(this);
        } 

    } 

}
