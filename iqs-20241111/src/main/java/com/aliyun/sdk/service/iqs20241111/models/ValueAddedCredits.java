// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ValueAddedCredits} extends {@link TeaModel}
 *
 * <p>ValueAddedCredits</p>
 */
public class ValueAddedCredits extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advanced")
    private Integer advanced;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Integer summary;

    private ValueAddedCredits(Builder builder) {
        this.advanced = builder.advanced;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValueAddedCredits create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advanced
     */
    public Integer getAdvanced() {
        return this.advanced;
    }

    /**
     * @return summary
     */
    public Integer getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private Integer advanced; 
        private Integer summary; 

        private Builder() {
        } 

        private Builder(ValueAddedCredits model) {
            this.advanced = model.advanced;
            this.summary = model.summary;
        } 

        /**
         * advanced.
         */
        public Builder advanced(Integer advanced) {
            this.advanced = advanced;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(Integer summary) {
            this.summary = summary;
            return this;
        }

        public ValueAddedCredits build() {
            return new ValueAddedCredits(this);
        } 

    } 

}
