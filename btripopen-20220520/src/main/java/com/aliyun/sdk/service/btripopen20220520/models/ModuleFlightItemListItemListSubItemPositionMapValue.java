// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleFlightItemListItemListSubItemPositionMapValue} extends {@link TeaModel}
 *
 * <p>ModuleFlightItemListItemListSubItemPositionMapValue</p>
 */
public class ModuleFlightItemListItemListSubItemPositionMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("journey_index")
    private Integer journeyIndex;

    @com.aliyun.core.annotation.NameInMap("segment_index")
    private Integer segmentIndex;

    private ModuleFlightItemListItemListSubItemPositionMapValue(Builder builder) {
        this.journeyIndex = builder.journeyIndex;
        this.segmentIndex = builder.segmentIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleFlightItemListItemListSubItemPositionMapValue create() {
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

        public ModuleFlightItemListItemListSubItemPositionMapValue build() {
            return new ModuleFlightItemListItemListSubItemPositionMapValue(this);
        } 

    } 

}
