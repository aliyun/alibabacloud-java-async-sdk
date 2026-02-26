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
 * {@link Clip} extends {@link TeaModel}
 *
 * <p>Clip</p>
 */
public class Clip extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

    private Clip(Builder builder) {
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Clip create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timeRange
     */
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private java.util.List<Long> timeRange; 

        private Builder() {
        } 

        private Builder(Clip model) {
            this.timeRange = model.timeRange;
        } 

        /**
         * TimeRange.
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Clip build() {
            return new Clip(this);
        } 

    } 

}
