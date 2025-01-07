// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ModuleItemListSubItemPositionMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListSubItemPositionMapValue</p>
 */
public class ModuleItemListSubItemPositionMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("journey_index")
    private Integer journeyIndex;

    @com.aliyun.core.annotation.NameInMap("segment_index")
    private Integer segmentIndex;

    private ModuleItemListSubItemPositionMapValue(Builder builder) {
        this.journeyIndex = builder.journeyIndex;
        this.segmentIndex = builder.segmentIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListSubItemPositionMapValue create() {
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

        public ModuleItemListSubItemPositionMapValue build() {
            return new ModuleItemListSubItemPositionMapValue(this);
        } 

    } 

}
