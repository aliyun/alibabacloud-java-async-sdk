// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link DateSummary} extends {@link TeaModel}
 *
 * <p>DateSummary</p>
 */
public class DateSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    @com.aliyun.core.annotation.NameInMap("value")
    private Long value;

    private DateSummary(Builder builder) {
        this.date = builder.date;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DateSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return value
     */
    public Long getValue() {
        return this.value;
    }

    public static final class Builder {
        private String date; 
        private Long value; 

        private Builder() {
        } 

        private Builder(DateSummary model) {
            this.date = model.date;
            this.value = model.value;
        } 

        /**
         * date.
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * <p>Metric value at corresponding date</p>
         */
        public Builder value(Long value) {
            this.value = value;
            return this;
        }

        public DateSummary build() {
            return new DateSummary(this);
        } 

    } 

}
