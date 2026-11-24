// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AuthReportInterval} extends {@link TeaModel}
 *
 * <p>AuthReportInterval</p>
 */
public class AuthReportInterval extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TimeUnit")
    private String timeUnit;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Long value;

    private AuthReportInterval(Builder builder) {
        this.timeUnit = builder.timeUnit;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthReportInterval create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @return value
     */
    public Long getValue() {
        return this.value;
    }

    public static final class Builder {
        private String timeUnit; 
        private Long value; 

        private Builder() {
        } 

        private Builder(AuthReportInterval model) {
            this.timeUnit = model.timeUnit;
            this.value = model.value;
        } 

        /**
         * <p>The unit of the effective recovery duration. Valid values:</p>
         * <ul>
         * <li><strong>Minute</strong>: Minutes.</li>
         * <li><strong>Hour</strong>: Hours.</li>
         * <li><strong>Day</strong>: Days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Minute</p>
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * <p>The numeric value of the effective recovery duration. The unit is specified by TimeUnit. A non-zero value must be at least 1.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder value(Long value) {
            this.value = value;
            return this;
        }

        public AuthReportInterval build() {
            return new AuthReportInterval(this);
        } 

    } 

}
