// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Constraints} extends {@link TeaModel}
 *
 * <p>Constraints</p>
 */
public class Constraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    private Constraints(Builder builder) {
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Constraints create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    public static final class Builder {
        private Long beginTime; 
        private Long endTime; 

        private Builder() {
        } 

        private Builder(Constraints model) {
            this.beginTime = model.beginTime;
            this.endTime = model.endTime;
        } 

        /**
         * <p>Start of the query time window (Unix milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1717200000000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>End of the query time window (Unix milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1717200000000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        public Constraints build() {
            return new Constraints(this);
        } 

    } 

}
