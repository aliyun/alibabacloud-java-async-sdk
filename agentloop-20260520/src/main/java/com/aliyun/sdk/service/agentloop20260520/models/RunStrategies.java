// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link RunStrategies} extends {@link TeaModel}
 *
 * <p>RunStrategies</p>
 */
public class RunStrategies extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backfill")
    private BackfillStrategy backfill;

    @com.aliyun.core.annotation.NameInMap("continuous")
    private ContinuousStrategy continuous;

    private RunStrategies(Builder builder) {
        this.backfill = builder.backfill;
        this.continuous = builder.continuous;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunStrategies create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backfill
     */
    public BackfillStrategy getBackfill() {
        return this.backfill;
    }

    /**
     * @return continuous
     */
    public ContinuousStrategy getContinuous() {
        return this.continuous;
    }

    public static final class Builder {
        private BackfillStrategy backfill; 
        private ContinuousStrategy continuous; 

        private Builder() {
        } 

        private Builder(RunStrategies model) {
            this.backfill = model.backfill;
            this.continuous = model.continuous;
        } 

        /**
         * backfill.
         */
        public Builder backfill(BackfillStrategy backfill) {
            this.backfill = backfill;
            return this;
        }

        /**
         * continuous.
         */
        public Builder continuous(ContinuousStrategy continuous) {
            this.continuous = continuous;
            return this;
        }

        public RunStrategies build() {
            return new RunStrategies(this);
        } 

    } 

}
