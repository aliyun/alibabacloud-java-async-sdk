// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeatureViewConfigValue} extends {@link TeaModel}
 *
 * <p>FeatureViewConfigValue</p>
 */
public class FeatureViewConfigValue extends TeaModel {
    @NameInMap("Partitions")
    private java.util.Map < String, FeatureViewConfigValuePartitionsValue > partitions;

    @NameInMap("EventTime")
    private String eventTime;

    @NameInMap("Equal")
    private Boolean equal;

    private FeatureViewConfigValue(Builder builder) {
        this.partitions = builder.partitions;
        this.eventTime = builder.eventTime;
        this.equal = builder.equal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeatureViewConfigValue create() {
        return builder().build();
    }

    /**
     * @return partitions
     */
    public java.util.Map < String, FeatureViewConfigValuePartitionsValue > getPartitions() {
        return this.partitions;
    }

    /**
     * @return eventTime
     */
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * @return equal
     */
    public Boolean getEqual() {
        return this.equal;
    }

    public static final class Builder {
        private java.util.Map < String, FeatureViewConfigValuePartitionsValue > partitions; 
        private String eventTime; 
        private Boolean equal; 

        /**
         * Partitions.
         */
        public Builder partitions(java.util.Map < String, FeatureViewConfigValuePartitionsValue > partitions) {
            this.partitions = partitions;
            return this;
        }

        /**
         * EventTime.
         */
        public Builder eventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Equal.
         */
        public Builder equal(Boolean equal) {
            this.equal = equal;
            return this;
        }

        public FeatureViewConfigValue build() {
            return new FeatureViewConfigValue(this);
        } 

    } 

}
