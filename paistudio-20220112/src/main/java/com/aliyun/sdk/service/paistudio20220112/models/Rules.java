// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link Rules} extends {@link TeaModel}
 *
 * <p>Rules</p>
 */
public class Rules extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Scheduling")
    private SchedulingRule scheduling;

    private Rules(Builder builder) {
        this.scheduling = builder.scheduling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Rules create() {
        return builder().build();
    }

    /**
     * @return scheduling
     */
    public SchedulingRule getScheduling() {
        return this.scheduling;
    }

    public static final class Builder {
        private SchedulingRule scheduling; 

        /**
         * Scheduling.
         */
        public Builder scheduling(SchedulingRule scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Rules build() {
            return new Rules(this);
        } 

    } 

}
