// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link ConditionalRule} extends {@link TeaModel}
 *
 * <p>ConditionalRule</p>
 */
public class ConditionalRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filter")
    private EventFilter filter;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Float sampleRate;

    private ConditionalRule(Builder builder) {
        this.filter = builder.filter;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.operator = builder.operator;
        this.sampleRate = builder.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionalRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public EventFilter getFilter() {
        return this.filter;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return sampleRate
     */
    public Float getSampleRate() {
        return this.sampleRate;
    }

    public static final class Builder {
        private EventFilter filter; 
        private String modifyTime; 
        private String name; 
        private String operator; 
        private Float sampleRate; 

        private Builder() {
        } 

        private Builder(ConditionalRule model) {
            this.filter = model.filter;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.operator = model.operator;
            this.sampleRate = model.sampleRate;
        } 

        /**
         * Filter.
         */
        public Builder filter(EventFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public ConditionalRule build() {
            return new ConditionalRule(this);
        } 

    } 

}
