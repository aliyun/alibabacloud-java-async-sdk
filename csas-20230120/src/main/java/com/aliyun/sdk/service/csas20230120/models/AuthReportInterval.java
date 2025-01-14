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

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * Value.
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
